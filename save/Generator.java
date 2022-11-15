package pset3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.*;

// Class that generates random tests (with no assertions).
public class Generator {

    // Create the AccountTest class, complete with a number of randomly generated test methods.
    public static String generateAccountTest(Random r, int numTests) {
        StringBuilder result = new StringBuilder();
        result.append("public class AccountTest {\n");
        for (int i = 0; i < numTests; i++) {
            result.append("    @Test\n");
            result.append("    public void test" + i + "() {\n");
            result.append(generateTestBodyForAccount(r));
            result.append("    }\n");
        }
        result.append("}\n");
        return result.toString();
    }

    // You should write this method that generates a random test body for class Account.
    // Don't worry about identation.
    public static String generateTestBodyForAccount(Random r) {
        // The test body that you should generate corresponds in its
        //   simplest form to this grammar:
        // 
        //     testBody ::= constructor methodCall+
        //     constructor ::= "Account" variable " = new Account();"
        //     methodCall ::= callDep | callWit | callGet
        //     callDep ::= variable ".deposit(" int ");"
        //     callWit ::= variable ".withdraw(" int ");"
        //     callGet ::= variable ".getBalance();"
        //     variable ::= ... some variable name ...
        //     int ::= ... some integer value ...

        // You should generate at least one method call and at most 10 method calls in your test body.

        // ...
    	StringBuilder result = new StringBuilder();
    	
    	String[] variables = {"account", "x", "y", "z", "anAccount"}; //possible random variable names
    	String variable = variables[Math.abs(r.nextInt() % 5)]; //select a random variable name
    	
    	result.append("	Account " + variable + " = new Account();\n"); //make instance of Account
    	int numberOfMethodCalls = Math.abs(r.nextInt() % 10) + 1; //1-10 method calls
    	for (int i = 0; i < numberOfMethodCalls; i++) {
    		int methodSelection = Math.abs(r.nextInt() % 3); //select random method
    		switch (methodSelection) {
    		case 0: //callDep
    			result.append("	" + variable + ".deposit(" + r.nextInt() + ");\n");
    			break;
    		case 1: //callWit
    			result.append("	" + variable + ".withdraw(" + r.nextInt() + ");\n");
    			break;
    		case 2: //callGet
    			result.append("	" + variable + ".getBalance();\n");
    			break;
    		}
    	}
    	return result.toString();
    }

    // Create a test class, complete with a number of randomly generated test methods.
    // The name of the test class should be the name of the class with "Test" at the end.
    // The given className is not fully-qualified (so it does not include the package structure),
    //   but it will be in the same pset3 package.
    public static String generateTest(Random r, int numTests, String className) {
        // This method should invoke generateTestBody.

        // ...
    	//disable here
    	PrintStream p = System.out;
    	PrintStream trash = new PrintStream(OutputStream.nullOutputStream());
    	System.setOut(trash);
        StringBuilder result = new StringBuilder();
        result.append("public class " + className + "Test {\n");
        for (int i = 0; i < numTests; i++) {
            result.append("    @Test\n");
            result.append("    public void test" + i + "() {\n");
            result.append(generateTestBody(r, className));
            result.append("    }\n");
        }
        result.append("}\n");
        //enable here
        System.setOut(p);
        return result.toString();
    }

	// You should write this method that generates random tests for a general class.
	// The given className is not fully-qualified (so it does not include the package structure),
    //   but it will be in the same pset3 package.
    // The corresponding class will only have a no-argument constructor.
    // Don't worry about indentation.
	public static String generateTestBody(Random r, String className) {
        // The test body that you generate will be similar to generateTestBodyForAccount.
        // Namely, first construct an instance of the given class, then invoke public methods
        //   declared within the class.
        // All method parameters will only be of the following types:
        //  int, long, float, double, boolean, String

        // You should generate at least one method call and at most 10 method calls in your test body.

        // ...
		String concatClassName = "pset3." + className;
		Constructor[] ctorlist = null;
		Method[] methlist = null;
		Class thisClass = null;
		try {
			thisClass = Class.forName(concatClassName);
			methlist = thisClass.getDeclaredMethods(); 
			//sort methlist
			sortMethodsByName(methlist);
			//remove non-public methods
			ArrayList<Method> ms = new ArrayList<>();
			for (int i = 0; i < methlist.length; i++) {
				int mod = methlist[i].getModifiers();
				if (Modifier.isPublic(mod)) {
					ms.add(methlist[i]);
				}
			}
			Method[] publicMethList = new Method[ms.size()];
			for (int i = 0; i < ms.size(); i++) {
				publicMethList[i] = ms.get(i);
			}
			methlist = publicMethList;
			//list of constructors
			ctorlist = thisClass.getDeclaredConstructors();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		String simpleClassName = thisClass.getSimpleName(); //name of the class without package
		StringBuilder testBody = new StringBuilder(); //test body
		//get constructor, assuming only one no argument constructor
		Constructor con = ctorlist[0]; 
		//pick a name for the object
		String instanceName = getRandomString(3, r, true);
		//use the constructor
		testBody.append("		" + simpleClassName + " " + instanceName + " = new " + simpleClassName + "();\n");
		Object testObject = null;
		try {
			testObject = thisClass.newInstance(); //create mock object
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		//add method calls
		int numberOfMethodCalls = Math.abs(r.nextInt() % 10) + 1; //number of methods for this test
		int methodsCalled = 0;
		while (methodsCalled < numberOfMethodCalls) { //choose a methodcall or assertion
			ArrayList<String> parameterFields = new ArrayList<String>(); //fill this in with parameter fields
			Object returnValue = null; //fill this with return value of method
			//select a random method
			Method selectedMethod = methlist[Math.abs(r.nextInt() % methlist.length)];
			//get its parameters
			Class[] parameters = selectedMethod.getParameterTypes();
			Object[] arglist = new Object[parameters.length];
			//fill in parameter fields
			for (int j = 0; j < parameters.length; j++) {
				Class parameterType = parameters[j];
				//get string representation of one filled in parameter and add it to parameter fields
				String stringParameter = null;
				if (parameterType == int.class) {
					int parameter = r.nextInt();
					stringParameter = Integer.toString(parameter); //random integer
					arglist[j] = parameter;
				} else if (parameterType == long.class) {
					long parameter = r.nextLong() % Integer.MAX_VALUE;
					stringParameter = Long.toString(parameter) + "l"; 
					arglist[j] = parameter;
				} else if (parameterType == float.class) {
					float parameter = r.nextFloat();
					stringParameter = Float.toString(parameter) + "f"; //random float
					arglist[j] = parameter;
				} else if (parameterType == double.class) {
					double parameter = r.nextDouble();
					stringParameter = Double.toString(parameter); //random double
					arglist[j] = parameter;
				} else if (parameterType == boolean.class) {
					boolean parameter = r.nextBoolean();
					stringParameter = Boolean.toString(parameter);
					arglist[j] = parameter;
				} else if (parameterType == String.class) {
					String randomString = getRandomString(10, r, false);
					stringParameter = "\"" + randomString + "\"";
					arglist[j] = randomString;
				} else { //this should never happen
					System.err.println("Unsupported type!");
					System.exit(1); //exit with program crash, error code 1
				}
				parameterFields.add(stringParameter); //this is written to testBody
			}
			//convert arrayList of parameter strings to single comma separated string
			String parameterFieldsString = parameterFields.toString().replace("[", "").replace("]", "");
			//add another method call
			String methodCall = "		" + instanceName + "." + selectedMethod.getName() + "("
					+ parameterFieldsString + ");\n";
			//or invoke this method on testObject for regression testing
			try {
				returnValue = selectedMethod.invoke(testObject, arglist);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			int assertionOrMethod = Math.abs(r.nextInt() % 10);
			if (assertionOrMethod <= 6 || selectedMethod.getReturnType() == void.class) { 
				//70% chance for method call, or method call if the return type is void
				testBody.append(methodCall);
				methodsCalled++;
			} else { //30% chance for assertion
				if (returnValue instanceof Boolean) {
					if (returnValue.equals(true)){ //assertTrue
						testBody.append("		assertTrue(" + methodCall.strip().replaceAll(";", "") + ");\n");
					} else { //assertFalse
						testBody.append("		assertFalse(" + methodCall.strip().replaceAll(";", "") + ");\n");
					}
				} else if (returnValue instanceof String) { //assertEquals for String
					testBody.append("		assertEquals(\"" + returnValue + "\", " + 
					methodCall.strip().replaceAll(";", "") + ");\n");
				} else { //assertEquals for others
					testBody.append("		assertEquals(" + returnValue + ", " + 
					methodCall.strip().replaceAll(";", "") + ");\n");
				}
			}
		}
        return testBody.toString();
    }
	
	/**
	 * 
	 * @param MAX_LEN maximum length of the random string
	 * @param r a random number generator
	 * @return a random string
	 */
	public static String getRandomString(int MAX_LEN, Random r, boolean isVarName) {
		String validChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String[] varNames = {"Var", "x", "y", "z", "variable"};
		StringBuilder s = new StringBuilder();
		int stringLen = Math.abs(r.nextInt() % MAX_LEN) + 1; //length of String to be generated
		if (isVarName == true) {
			return varNames[Math.abs(r.nextInt() % varNames.length)];
		}
		for (int i = 0; i < stringLen; i++) {
			char randChar = validChars.charAt(Math.abs(r.nextInt() % validChars.length()));
			s.append(randChar);
		}
		return s.toString();
	}
	
	/**
	 * 
	 * @param m array of methods to be sorted using insertion sort
	 */
	public static void sortMethodsByName(Method[] m) {
		int i, j;
		for (i = 1; i < m.length; i++) {
			Method insert = m[i];
			for (j = i; j > 0; j--) {
				if (insert.getName().compareTo(m[j - 1].getName()) < 0) {
					break;
				} else {
					m[j] = m[j - 1];
				}
			}
			m[j] = insert;
		}
		return;
	}

    // The random seed is provided on the command line.
    // It should be the only source of randomness, i.e., for the same input, your code should always produce
    //   the same tests, but for different inputs, the code produces (mostly) different tests.
    public static void main(String[] args) {
        if (args == null || (args.length != 2 && args.length != 3)) {
            help();
        }
        long seed = 0;
        int numTests = 0;
        try {
            seed = Long.parseLong(args[0]);
            numTests = Integer.parseInt(args[1]);
        } catch (Exception ex) {
            help();
        }
        if (numTests < 1) {
            System.out.println("Need at least one test!");
            System.exit(1);
        }
        Random r = new Random(seed);

        // This simple example illustrates the use of your method.
        // The result should be a class that compiles.
        // The class will be in package pset3.
        System.out.println("package pset3;");
        System.out.println("import org.junit.Test;");
        System.out.println("import static org.junit.Assert.*;");
        if (args.length < 3) { // Default case is AccountTest
            System.out.println(generateAccountTest(r, numTests));
        } else {
            System.out.println(generateTest(r, numTests, args[2]));
        }
    }

    private static void help() {
        System.out.println("Usage: java " + Generator.class.getName() +
            " <random seed (any long int)> <number of tests (any int) <name of class to test (OPTIONAL)>");
        System.exit(1);
    }
}

package pset3;

/**Spam Class**/
public class C1 {
	static int totalscrews = 0;
	long numTimesMethodCalled;
	private int priv = 5;
	int stuff = 5;

    public C1() {
    	this.numTimesMethodCalled = 0;
    }

    public long screw(String s, int i) {
    	for (int x = 0; x < 10; x++) {
    		System.out.println(s + "!");
    		System.out.println(i);
    	}
    	this.numTimesMethodCalled++;
    	totalscrews++;
    	return this.numTimesMethodCalled;
    }
    
    public boolean changeMaritalStatus(boolean b) {
    	System.out.println(b);
    	this.numTimesMethodCalled++;
    	return b;
    }
    
    public long changeMethodCallCount(long l) {
    	this.numTimesMethodCalled = l;
    	return l;
    }
    
    public boolean reset() {
    	this.numTimesMethodCalled = 0;
    	this.priv++;
    	return true;
    }
    
    public float floatyFloat(float f) {
    	System.out.println("I am a floaty float " + f);
    	this.numTimesMethodCalled++;
    	return f;
    }
    
    public double doublyDouble(double d) {
    	System.out.println("I am a doubly double " + d);
    	this.numTimesMethodCalled++;
    	this.stuff += 2;
    	return d;
    }
    
    private void doesntexist() {
    	System.out.println("Doesn't exist");
    }
    
    public int rainbow(int a, double b, long c, float d, String e, boolean f) {
    	return (int)(a + b + c+ d + e.length());
    }
    
    public boolean compare(int a, int b) {
    	if (a > b) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
    public String advancedCompare(float c, float d) {
    	if (c < d) {
    		return "c less than d!";
    	} else {
    		return "c greater than d!";
    	}
    }
    
    public void laugh() {
    	System.out.println("Laugh");
    }
    
    public int mask(int a, double b) {
    	int sum = a + (int) b;
    	return a - sum + (int) Math.abs(b) + stuff;
    }
    
    public double bigSum(int a, double b, double c, float f) {
    	return a + b + c + f;
    }
    
    public long compose() {
    	long val = priv + stuff + this.numTimesMethodCalled;
    	return val % 10;
    }
    
    @Override
    public String toString() {
    	return "Some generic spam";
    }
}

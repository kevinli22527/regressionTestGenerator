package pset3;

/**Spam Class**/
public class C1 {
	long numTimesMethodCalled;

    public C1() {
    	this.numTimesMethodCalled = 0;
    }

    public long screw(String s, int i) {
    	for (int x = 0; x < 10; x++) {
    		System.out.println(s + "!");
    		System.out.println(i);
    	}
    	this.numTimesMethodCalled++;
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
    	return d;
    }
    
    @Override
    public String toString() {
    	return "Some generic spam";
    }
}

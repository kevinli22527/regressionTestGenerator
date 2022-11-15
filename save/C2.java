package pset3;

/**
 * Calculator
 * @author kevin
 *
 */
public class C2 {
	String name;

    public C2() {
        this.name = "Calculator";
    }
    
    public int add(int a, int b) {
    	return a + b;
    }
    
    public int subtract(int a, int b) {
    	return a - b;
    }
    
    public double multiply(double a, double b) {
    	return a * b;
    }
    
    public long divide(long a, long b) {
    	return a / b;
    }
    
    @Override
    public String toString() {
    	return this.name;
    }
}

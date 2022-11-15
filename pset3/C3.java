package pset3;

import java.util.Random;

/**
 * test class 3
 * @author kevin
 *
 */
public class C3 {
	static int staticky = 0;
	int lastVal = 0;
	int firstVal = 0;
	int middleVal = 0;
	Random r;
    public C3() {
    	r = new Random(60);
    }
    /*
    public void add() {
    	return;
    }
    
    public void shoot() {
    	System.out.println("Shoot");
    }
    
    public void stab() {
    	System.out.println("Stab");
    }
    
    public void bomb() {
    	System.out.println("Bomb");
    	return;
    }
    */
    public String zap() {
    	if (this.r.nextInt() > 60) {
    		return "ZAP!";
    	} else {
    		return "BZZZZZZZ!";
    	}
    }
    
    public static int pop() {
    	return -1;
    }
    
    @Override
    public String toString() {
    	return "Aloha";
    }
}

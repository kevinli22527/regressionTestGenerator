package pset3;
/*
 * Please write any code that you think might expose a bug in JIT
 * (Java just-in-time compiler). Feel free to search online for
 * inspiration or simply be creative. Even simple things might lead to
 * unexpected bugs.
 *
 * Feel free to use any (up to) Java 11 feature.
 *
 * Keep in mind that m() is the method where the execution of your
 * code starts.
 *
 * Please modify this file (T.java) only. Do NOT add any new
 * files.
 */

import sketchy.annotation.Entry;
import static sketchy.Sketchy.*;

/* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
/* YOUR CODE BELOW */

/* add any class/enum/interface you want */

public class T {

    /* add any (static) field or (static) method */
	static int s = 5;
	static int p = -10;
	
	static {
		reg("s", s);
		reg("p", p);
	}

    @Entry
    public static int m() {
        /* IMPLEMENT */
    	int x = intVal().eval(); reg("x", x);
        int y = intVal().eval(); reg("y", y);
        int range = intVal(-5, 100).eval();
        int[] arr = {1, -5, x, 6, y}; reg("arr", arr);
        int c = arithmetic(intId(), intId(), MOD).eval();
        boolean a = logic(relation(intId(), intId(), LE), relation(intId(), intId(), GE), OR).eval(); 
        boolean b = logic(true, false, AND).eval(); 
        if (relation(intVal(), intVal(), GT, LT, EQ, LE, NE).eval()) {
        	b = true;
        }
        for (int i = 0; i < arr.length; i++) {
        	if (relation(intId(), intId(), GT, LT, EQ).eval()) {
        		x = arithmetic(intId(), intId(), ADD, SUB, MUL, DIV, MOD).eval();
        		reg("x", x);
        		if (relation(intId(), intId(), GE).eval()) {
        			arr[i] += x;
        			reg("arr", arr);
        		}
        	}
        }
        if (relation(intId(), intId(), GT, LT).eval()) {
            s += intId().eval(); reg("s", s);
        } else {
            s += intId().eval(); reg("s", s);
        }
        return s;
    }
}

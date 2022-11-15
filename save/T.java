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
	
	static {
		reg("s", s);
	}

    @Entry
    public static int m() {
        /* IMPLEMENT */
    	int x = intVal().eval(); reg("x", x);
        int y = intVal().eval(); reg("y", y);
        if (relation(intId(), intId(), GT, LT).eval()) {
            s += intId().eval(); reg("s", s);
        } else {
            s += intId().eval(); reg("s", s);
        }
        return s;
    }
}

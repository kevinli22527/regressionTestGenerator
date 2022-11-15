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
import org.csutil.Util;

/* >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> */
/* YOUR CODE BELOW */
/* add any class/enum/interface you want */
public class TGen5 {

    /* add any (static) field or (static) method */
    static int s = 5;

    static int p = -10;

    static {
    }

    public static int m() {
        /* IMPLEMENT */
        int x = -1576812231;
        int y = -1040947237;
        int range = 92;
        int[] arr = { 1, -5, x, 6, y };
        int c = (arr[0] % s);
        boolean a = ((arr[0] <= x) || (p >= y));
        boolean b = (true && false);
        if ((-1648349684 < 1649115590)) {
            b = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[2] > y)) {
                x = arithmetic(intId(), intId(), ADD, SUB, MUL, DIV, MOD).eval(9);
                if (relation(intId(), intId(), GE).eval(10)) {
                    arr[i] += x;
                }
            }
        }
        if ((x > arr[0])) {
            s += intId().eval(13);
        } else {
            s += y;
        }
        return s;
    }

    public static long main0(String[] args) {
        int N = 100000;
        if (args.length > 0) {
            N = Math.min(Integer.parseInt(args[0]), N);
        }
        long result = 0L;
        for (int i = 0; i < N; ++i) {
            result += m();
        }
        return Util.hash(TGen5.class, result);
    }

    public static void main(String[] args) {
        System.out.println(main0(args));
    }
}

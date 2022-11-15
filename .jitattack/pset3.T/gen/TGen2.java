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
public class TGen2 {

    /* add any (static) field or (static) method */
    static int s = 5;

    static int p = -10;

    static {
    }

    public static int m() {
        /* IMPLEMENT */
        int x = -1074144810;
        int y = -297936814;
        int range = 29;
        int[] arr = { 1, -5, x, 6, y };
        int c = (arr[0] % p);
        boolean a = ((arr[0] <= y) || (arr[1] >= x));
        boolean b = (true && false);
        if ((-1771985870 != 1177562329)) {
            b = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[0] < arr[4])) {
                x = arithmetic(intId(), intId(), ADD, SUB, MUL, DIV, MOD).eval(9);
                if (relation(intId(), intId(), GE).eval(10)) {
                    arr[i] += x;
                }
            }
        }
        if ((arr[1] < arr[2])) {
            s += intId().eval(13);
        } else {
            s += x;
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
        return Util.hash(TGen2.class, result);
    }

    public static void main(String[] args) {
        System.out.println(main0(args));
    }
}

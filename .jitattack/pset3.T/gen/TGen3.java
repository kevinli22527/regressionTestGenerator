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
public class TGen3 {

    /* add any (static) field or (static) method */
    static int s = 5;

    static int p = -10;

    static {
    }

    public static int m() {
        /* IMPLEMENT */
        int x = 134940315;
        int y = 1359496886;
        int range = 94;
        int[] arr = { 1, -5, x, 6, y };
        int c = (arr[1] % arr[4]);
        boolean a = ((arr[4] <= arr[3]) || (arr[0] >= y));
        boolean b = (true && false);
        if ((1252655105 != 942853202)) {
            b = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[1] < arr[1])) {
                x = arithmetic(intId(), intId(), ADD, SUB, MUL, DIV, MOD).eval(9);
                if (relation(intId(), intId(), GE).eval(10)) {
                    arr[i] += x;
                }
            }
        }
        if ((y > s)) {
            s += arr[1];
        } else {
            s += intId().eval(12);
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
        return Util.hash(TGen3.class, result);
    }

    public static void main(String[] args) {
        System.out.println(main0(args));
    }
}

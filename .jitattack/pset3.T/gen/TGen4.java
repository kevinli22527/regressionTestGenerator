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
public class TGen4 {

    /* add any (static) field or (static) method */
    static int s = 5;

    static int p = -10;

    static {
    }

    public static int m() {
        /* IMPLEMENT */
        int x = 1547282906;
        int y = 1873820859;
        int range = 48;
        int[] arr = { 1, -5, x, 6, y };
        int c = (arr[1] % arr[1]);
        boolean a = ((x <= arr[2]) || (p >= arr[1]));
        boolean b = (true && false);
        if ((-713539077 <= -907893807)) {
            b = true;
        }
        for (int i = 0; i < arr.length; i++) {
            if ((arr[3] > s)) {
                x = (y % s);
                if ((arr[2] >= y)) {
                    arr[i] += x;
                }
            }
        }
        if ((arr[4] > arr[0])) {
            s += p;
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
        return Util.hash(TGen4.class, result);
    }

    public static void main(String[] args) {
        System.out.println(main0(args));
    }
}

package pset3;
import org.junit.Test;
import static org.junit.Assert.*;
public class C3Test {
    @Test
    public void test0() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.toString();
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.zap();
    }
    @Test
    public void test1() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test2() {
		C3 z = new C3();
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test3() {
		C3 x = new C3();
		x.zap();
		x.toString();
		x.pop();
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.pop();
		x.toString();
		x.toString();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
    }
    @Test
    public void test4() {
		C3 y = new C3();
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test5() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test6() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.pop();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test7() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.pop();
		z.pop();
		z.zap();
    }
    @Test
    public void test8() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test9() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		variable.zap();
		variable.zap();
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test10() {
		C3 y = new C3();
		y.zap();
    }
    @Test
    public void test11() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test12() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.toString();
		y.toString();
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test13() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.toString();
		x.zap();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.pop();
		x.zap();
		x.toString();
		x.zap();
    }
    @Test
    public void test14() {
		C3 x = new C3();
		x.pop();
		x.zap();
		x.toString();
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		x.zap();
    }
    @Test
    public void test15() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals(-1, x.pop());
		x.zap();
		x.pop();
		x.pop();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("ZAP!", x.zap());
		assertEquals(-1, x.pop());
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		x.pop();
    }
    @Test
    public void test16() {
		C3 y = new C3();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.toString();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test17() {
		C3 x = new C3();
		x.toString();
		x.pop();
    }
    @Test
    public void test18() {
		C3 x = new C3();
		x.zap();
		x.zap();
    }
    @Test
    public void test19() {
		C3 z = new C3();
		z.toString();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
		z.pop();
		z.toString();
    }
    @Test
    public void test20() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.zap();
    }
    @Test
    public void test21() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.zap();
		Var.zap();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test22() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
    }
    @Test
    public void test23() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.zap();
    }
    @Test
    public void test24() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		y.toString();
		y.zap();
    }
    @Test
    public void test25() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test26() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.toString();
		y.toString();
		y.zap();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test27() {
		C3 x = new C3();
		x.pop();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.toString();
		x.zap();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test28() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.zap();
		variable.pop();
		variable.pop();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
    }
    @Test
    public void test29() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test30() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.pop();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test31() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test32() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test33() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		variable.toString();
		variable.zap();
		variable.zap();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test34() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test35() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
		x.zap();
		x.pop();
    }
    @Test
    public void test36() {
		C3 z = new C3();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test37() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.zap();
		x.toString();
		x.pop();
		x.toString();
		x.pop();
		x.pop();
		x.pop();
		x.pop();
    }
    @Test
    public void test38() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test39() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test40() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.toString();
		x.zap();
    }
    @Test
    public void test41() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test42() {
		C3 Var = new C3();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test43() {
		C3 Var = new C3();
		Var.zap();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.toString();
    }
    @Test
    public void test44() {
		C3 variable = new C3();
		variable.pop();
    }
    @Test
    public void test45() {
		C3 x = new C3();
		x.toString();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.toString();
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.pop();
    }
    @Test
    public void test46() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test47() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.pop();
		z.zap();
    }
    @Test
    public void test48() {
		C3 z = new C3();
		z.zap();
		z.toString();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
    }
    @Test
    public void test49() {
		C3 y = new C3();
		y.toString();
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.zap();
		y.pop();
    }
    @Test
    public void test50() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.toString();
		Var.pop();
		Var.toString();
		Var.pop();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test51() {
		C3 x = new C3();
		x.pop();
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		x.pop();
    }
    @Test
    public void test52() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.zap();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.toString();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test53() {
		C3 x = new C3();
		x.pop();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
		x.zap();
    }
    @Test
    public void test54() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test55() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.zap();
		x.toString();
    }
    @Test
    public void test56() {
		C3 y = new C3();
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test57() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
    }
    @Test
    public void test58() {
		C3 y = new C3();
		y.zap();
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test59() {
		C3 y = new C3();
		y.toString();
		y.pop();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.toString();
    }
    @Test
    public void test60() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test61() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test62() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test63() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test64() {
		C3 x = new C3();
		x.toString();
		x.zap();
    }
    @Test
    public void test65() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.pop();
		assertEquals(-1, y.pop());
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		y.pop();
    }
    @Test
    public void test66() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test67() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.toString();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test68() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
    }
    @Test
    public void test69() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test70() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.pop();
		y.toString();
		y.toString();
		y.pop();
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.zap();
		y.zap();
    }
    @Test
    public void test71() {
		C3 z = new C3();
		z.zap();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		z.toString();
		z.zap();
		z.zap();
    }
    @Test
    public void test72() {
		C3 z = new C3();
		z.zap();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
    }
    @Test
    public void test73() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test74() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.toString();
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.zap();
    }
    @Test
    public void test75() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.zap();
		x.toString();
		x.toString();
    }
    @Test
    public void test76() {
		C3 x = new C3();
		x.toString();
		x.zap();
		x.toString();
		assertEquals("ZAP!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
		x.toString();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
    }
    @Test
    public void test77() {
		C3 z = new C3();
		z.toString();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
    }
    @Test
    public void test78() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		x.pop();
		x.toString();
		x.zap();
		x.zap();
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
    }
    @Test
    public void test79() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.zap();
    }
    @Test
    public void test80() {
		C3 x = new C3();
		x.zap();
    }
    @Test
    public void test81() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test82() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.pop();
		x.toString();
		x.pop();
		x.toString();
		x.pop();
		x.pop();
		x.zap();
    }
    @Test
    public void test83() {
		C3 z = new C3();
		z.pop();
		z.zap();
    }
    @Test
    public void test84() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.toString();
		y.zap();
		y.zap();
		y.toString();
		y.toString();
    }
    @Test
    public void test85() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
    }
    @Test
    public void test86() {
		C3 z = new C3();
		z.toString();
    }
    @Test
    public void test87() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test88() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		z.pop();
		z.zap();
    }
    @Test
    public void test89() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("ZAP!", Var.zap());
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test90() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test91() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals("ZAP!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
    }
    @Test
    public void test92() {
		C3 z = new C3();
		z.toString();
		z.pop();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
		z.zap();
		z.toString();
		z.toString();
		z.pop();
    }
    @Test
    public void test93() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.toString();
    }
    @Test
    public void test94() {
		C3 y = new C3();
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		y.zap();
    }
    @Test
    public void test95() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.pop();
    }
    @Test
    public void test96() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test97() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test98() {
		C3 z = new C3();
		z.pop();
		z.pop();
    }
    @Test
    public void test99() {
		C3 z = new C3();
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
    }
    @Test
    public void test100() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
		Var.pop();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test101() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test102() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.toString();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.pop();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test103() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test104() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
    }
    @Test
    public void test105() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
    }
    @Test
    public void test106() {
		C3 x = new C3();
		x.zap();
    }
    @Test
    public void test107() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test108() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		variable.toString();
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.toString();
    }
    @Test
    public void test109() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test110() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.zap();
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.pop();
		z.zap();
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.pop();
    }
    @Test
    public void test111() {
		C3 y = new C3();
		y.pop();
		y.zap();
		y.pop();
		y.pop();
		y.toString();
		y.zap();
		y.toString();
		y.zap();
    }
    @Test
    public void test112() {
		C3 y = new C3();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test113() {
		C3 y = new C3();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.zap();
		y.pop();
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test114() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
    }
    @Test
    public void test115() {
		C3 z = new C3();
		z.zap();
		z.zap();
		z.zap();
		z.zap();
    }
    @Test
    public void test116() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test117() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.toString();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test118() {
		C3 y = new C3();
		y.toString();
		y.pop();
		y.pop();
		y.zap();
		y.toString();
		y.zap();
		y.toString();
		y.pop();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
    }
    @Test
    public void test119() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test120() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.toString();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test121() {
		C3 y = new C3();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
    }
    @Test
    public void test122() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.zap();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.toString();
    }
    @Test
    public void test123() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test124() {
		C3 Var = new C3();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.pop();
    }
    @Test
    public void test125() {
		C3 z = new C3();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.pop();
    }
    @Test
    public void test126() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test127() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test128() {
		C3 y = new C3();
		y.toString();
		y.toString();
    }
    @Test
    public void test129() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.zap();
		y.pop();
		y.pop();
		y.pop();
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test130() {
		C3 Var = new C3();
		Var.zap();
		Var.zap();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.toString();
    }
    @Test
    public void test131() {
		C3 y = new C3();
		y.pop();
		y.zap();
		y.pop();
		y.toString();
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.toString();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.toString();
    }
    @Test
    public void test132() {
		C3 x = new C3();
		x.pop();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.toString();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
		x.toString();
    }
    @Test
    public void test133() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test134() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test135() {
		C3 y = new C3();
		y.pop();
		y.pop();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test136() {
		C3 z = new C3();
		z.toString();
		z.toString();
    }
    @Test
    public void test137() {
		C3 Var = new C3();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test138() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.pop();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals("ZAP!", variable.zap());
		variable.zap();
    }
    @Test
    public void test139() {
		C3 x = new C3();
		x.zap();
		x.zap();
    }
    @Test
    public void test140() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.toString();
		x.zap();
		x.zap();
		x.pop();
    }
    @Test
    public void test141() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.pop();
    }
    @Test
    public void test142() {
		C3 z = new C3();
		z.toString();
		z.pop();
		z.pop();
		z.toString();
    }
    @Test
    public void test143() {
		C3 y = new C3();
		y.pop();
		y.zap();
		y.toString();
		y.pop();
    }
    @Test
    public void test144() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.pop();
		x.zap();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		x.zap();
    }
    @Test
    public void test145() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test146() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.pop();
		z.zap();
    }
    @Test
    public void test147() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test148() {
		C3 z = new C3();
		z.pop();
		z.toString();
    }
    @Test
    public void test149() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.toString();
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test150() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test151() {
		C3 x = new C3();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		x.toString();
    }
    @Test
    public void test152() {
		C3 x = new C3();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test153() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.zap();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test154() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
		z.zap();
    }
    @Test
    public void test155() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
    }
    @Test
    public void test156() {
		C3 x = new C3();
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
    }
    @Test
    public void test157() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.pop();
		z.pop();
		z.toString();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
    }
    @Test
    public void test158() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.zap();
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.zap();
    }
    @Test
    public void test159() {
		C3 x = new C3();
		x.pop();
    }
    @Test
    public void test160() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test161() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.pop();
    }
    @Test
    public void test162() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		variable.toString();
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
    }
    @Test
    public void test163() {
		C3 Var = new C3();
		Var.pop();
    }
    @Test
    public void test164() {
		C3 y = new C3();
		y.pop();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test165() {
		C3 y = new C3();
		y.pop();
    }
    @Test
    public void test166() {
		C3 y = new C3();
		y.zap();
		y.zap();
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test167() {
		C3 y = new C3();
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.toString();
		y.toString();
		y.zap();
		y.pop();
    }
    @Test
    public void test168() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
    }
    @Test
    public void test169() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test170() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
    }
    @Test
    public void test171() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test172() {
		C3 variable = new C3();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test173() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.zap();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.toString();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test174() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.zap();
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test175() {
		C3 z = new C3();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals("ZAP!", z.zap());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
		z.zap();
    }
    @Test
    public void test176() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test177() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test178() {
		C3 x = new C3();
		x.toString();
    }
    @Test
    public void test179() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		Var.pop();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
    }
    @Test
    public void test180() {
		C3 x = new C3();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.pop();
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
    }
    @Test
    public void test181() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test182() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		z.zap();
		z.toString();
		z.toString();
		z.toString();
		z.pop();
    }
    @Test
    public void test183() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.toString();
		x.pop();
    }
    @Test
    public void test184() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.toString();
		y.pop();
		y.zap();
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test185() {
		C3 z = new C3();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.toString();
		z.zap();
		z.pop();
    }
    @Test
    public void test186() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		z.pop();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		z.toString();
		z.pop();
    }
    @Test
    public void test187() {
		C3 z = new C3();
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.zap();
    }
    @Test
    public void test188() {
		C3 z = new C3();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		z.pop();
		z.zap();
    }
    @Test
    public void test189() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		Var.toString();
		Var.pop();
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.toString();
    }
    @Test
    public void test190() {
		C3 y = new C3();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test191() {
		C3 x = new C3();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test192() {
		C3 variable = new C3();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.toString();
    }
    @Test
    public void test193() {
		C3 x = new C3();
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.toString();
    }
    @Test
    public void test194() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.pop();
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test195() {
		C3 y = new C3();
		y.zap();
		assertEquals("Aloha", y.toString());
		assertEquals("ZAP!", y.zap());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.zap();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test196() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.pop();
		x.zap();
		x.zap();
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
    }
    @Test
    public void test197() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
    }
    @Test
    public void test198() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test199() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.toString();
		x.pop();
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		assertEquals("ZAP!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.toString();
    }
    @Test
    public void test200() {
		C3 x = new C3();
		x.pop();
		x.pop();
		x.toString();
    }
    @Test
    public void test201() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.toString();
    }
    @Test
    public void test202() {
		C3 z = new C3();
		z.toString();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.toString();
		z.toString();
    }
    @Test
    public void test203() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
    }
    @Test
    public void test204() {
		C3 x = new C3();
		x.pop();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.zap();
		x.pop();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test205() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.pop();
		y.toString();
    }
    @Test
    public void test206() {
		C3 x = new C3();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		x.pop();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		x.toString();
    }
    @Test
    public void test207() {
		C3 Var = new C3();
		Var.zap();
		Var.pop();
		Var.zap();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.zap();
    }
    @Test
    public void test208() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.zap();
    }
    @Test
    public void test209() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test210() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.pop();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test211() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
    }
    @Test
    public void test212() {
		C3 y = new C3();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.zap();
		y.pop();
		y.pop();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.toString();
    }
    @Test
    public void test213() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test214() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.toString();
		z.zap();
    }
    @Test
    public void test215() {
		C3 Var = new C3();
		Var.zap();
    }
    @Test
    public void test216() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test217() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.pop();
		x.pop();
		x.pop();
    }
    @Test
    public void test218() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.pop();
		Var.zap();
		Var.zap();
		Var.toString();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
    }
    @Test
    public void test219() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.toString();
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		z.pop();
		z.pop();
    }
    @Test
    public void test220() {
		C3 z = new C3();
		z.toString();
		z.zap();
    }
    @Test
    public void test221() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test222() {
		C3 z = new C3();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.zap();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
    }
    @Test
    public void test223() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test224() {
		C3 y = new C3();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("Aloha", y.toString());
		y.pop();
		y.zap();
		y.zap();
    }
    @Test
    public void test225() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test226() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test227() {
		C3 y = new C3();
		y.zap();
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test228() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.pop();
		x.zap();
		x.zap();
		x.pop();
    }
    @Test
    public void test229() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test230() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.toString();
    }
    @Test
    public void test231() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.zap();
		x.zap();
		x.zap();
		x.toString();
		x.pop();
		x.toString();
		x.pop();
    }
    @Test
    public void test232() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test233() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.pop();
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
    }
    @Test
    public void test234() {
		C3 y = new C3();
		y.zap();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test235() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
    }
    @Test
    public void test236() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
		x.zap();
    }
    @Test
    public void test237() {
		C3 z = new C3();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.toString();
		z.zap();
		z.pop();
		z.pop();
		z.pop();
		z.pop();
    }
    @Test
    public void test238() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.pop();
		y.zap();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("Aloha", y.toString());
		assertEquals("ZAP!", y.zap());
		y.zap();
		y.toString();
		y.pop();
		y.toString();
    }
    @Test
    public void test239() {
		C3 Var = new C3();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.pop();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test240() {
		C3 z = new C3();
		z.pop();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
    }
    @Test
    public void test241() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.toString();
    }
    @Test
    public void test242() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
		x.pop();
		x.zap();
		x.zap();
		x.zap();
		x.pop();
		x.pop();
    }
    @Test
    public void test243() {
		C3 y = new C3();
		y.pop();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.zap();
		y.pop();
		y.toString();
		y.pop();
		y.toString();
    }
    @Test
    public void test244() {
		C3 x = new C3();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.pop();
    }
    @Test
    public void test245() {
		C3 y = new C3();
		y.pop();
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test246() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.toString();
		Var.pop();
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test247() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.toString();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test248() {
		C3 variable = new C3();
		variable.toString();
    }
    @Test
    public void test249() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test250() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.toString();
    }
    @Test
    public void test251() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test252() {
		C3 y = new C3();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test253() {
		C3 y = new C3();
		y.zap();
		y.toString();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test254() {
		C3 y = new C3();
		y.zap();
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.pop();
		y.toString();
    }
    @Test
    public void test255() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test256() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
    }
    @Test
    public void test257() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.pop();
		variable.toString();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test258() {
		C3 x = new C3();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.pop();
		x.toString();
    }
    @Test
    public void test259() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.pop();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test260() {
		C3 variable = new C3();
		variable.zap();
    }
    @Test
    public void test261() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test262() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		Var.pop();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		Var.toString();
    }
    @Test
    public void test263() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
		z.zap();
		z.toString();
    }
    @Test
    public void test264() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.zap();
		Var.pop();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.zap();
    }
    @Test
    public void test265() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
    }
    @Test
    public void test266() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
    }
    @Test
    public void test267() {
		C3 x = new C3();
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
		x.zap();
		x.zap();
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
    }
    @Test
    public void test268() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.zap();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test269() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test270() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.toString();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test271() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.zap();
		y.pop();
		y.zap();
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test272() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test273() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.toString();
    }
    @Test
    public void test274() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test275() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.pop();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.zap();
    }
    @Test
    public void test276() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test277() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.zap();
		z.toString();
    }
    @Test
    public void test278() {
		C3 y = new C3();
		y.toString();
    }
    @Test
    public void test279() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.toString();
		y.pop();
    }
    @Test
    public void test280() {
		C3 z = new C3();
		z.pop();
		z.pop();
		z.pop();
		z.pop();
		z.pop();
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
    }
    @Test
    public void test281() {
		C3 x = new C3();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.zap();
		x.pop();
    }
    @Test
    public void test282() {
		C3 Var = new C3();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.pop();
    }
    @Test
    public void test283() {
		C3 Var = new C3();
		Var.zap();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.toString();
    }
    @Test
    public void test284() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.pop();
    }
    @Test
    public void test285() {
		C3 z = new C3();
		z.toString();
		z.pop();
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.zap();
		z.zap();
    }
    @Test
    public void test286() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.zap();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		assertEquals(-1, x.pop());
		x.toString();
    }
    @Test
    public void test287() {
		C3 Var = new C3();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.toString();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test288() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test289() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.zap();
    }
    @Test
    public void test290() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.pop();
		y.zap();
    }
    @Test
    public void test291() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.toString();
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test292() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		z.pop();
    }
    @Test
    public void test293() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.zap();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		z.pop();
    }
    @Test
    public void test294() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("ZAP!", y.zap());
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
    }
    @Test
    public void test295() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test296() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.zap();
    }
    @Test
    public void test297() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test298() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.zap();
    }
    @Test
    public void test299() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.pop();
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test300() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test301() {
		C3 x = new C3();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		x.zap();
		x.toString();
		x.pop();
		x.zap();
		x.zap();
    }
    @Test
    public void test302() {
		C3 Var = new C3();
		Var.zap();
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test303() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.zap();
    }
    @Test
    public void test304() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.toString();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
		y.pop();
    }
    @Test
    public void test305() {
		C3 z = new C3();
		z.pop();
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test306() {
		C3 x = new C3();
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.pop();
    }
    @Test
    public void test307() {
		C3 x = new C3();
		x.toString();
    }
    @Test
    public void test308() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.pop();
    }
    @Test
    public void test309() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test310() {
		C3 variable = new C3();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
    }
    @Test
    public void test311() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.toString();
		y.pop();
		y.zap();
    }
    @Test
    public void test312() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.zap();
		x.pop();
		x.pop();
		x.toString();
		x.pop();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test313() {
		C3 y = new C3();
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.zap();
		y.pop();
    }
    @Test
    public void test314() {
		C3 variable = new C3();
		variable.toString();
    }
    @Test
    public void test315() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.toString();
    }
    @Test
    public void test316() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test317() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.toString();
    }
    @Test
    public void test318() {
		C3 y = new C3();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test319() {
		C3 z = new C3();
		z.toString();
		z.pop();
		z.pop();
		z.pop();
		z.zap();
		z.pop();
		z.toString();
		z.zap();
    }
    @Test
    public void test320() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test321() {
		C3 Var = new C3();
		Var.zap();
    }
    @Test
    public void test322() {
		C3 x = new C3();
		x.toString();
    }
    @Test
    public void test323() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.toString();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test324() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.pop();
    }
    @Test
    public void test325() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
		y.toString();
		y.pop();
    }
    @Test
    public void test326() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		y.pop();
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		y.zap();
    }
    @Test
    public void test327() {
		C3 Var = new C3();
		Var.pop();
    }
    @Test
    public void test328() {
		C3 z = new C3();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		z.zap();
		z.zap();
    }
    @Test
    public void test329() {
		C3 y = new C3();
		y.zap();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test330() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test331() {
		C3 x = new C3();
		x.pop();
		x.zap();
    }
    @Test
    public void test332() {
		C3 x = new C3();
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		x.zap();
		x.toString();
		x.pop();
		x.pop();
		x.toString();
    }
    @Test
    public void test333() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.toString();
		Var.pop();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.zap();
		Var.zap();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test334() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test335() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test336() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.toString();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test337() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test338() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test339() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test340() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test341() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.zap();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
    }
    @Test
    public void test342() {
		C3 x = new C3();
		x.toString();
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.pop();
    }
    @Test
    public void test343() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.toString();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		z.pop();
		z.pop();
    }
    @Test
    public void test344() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test345() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test346() {
		C3 variable = new C3();
		variable.toString();
    }
    @Test
    public void test347() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.zap();
		x.zap();
    }
    @Test
    public void test348() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test349() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.zap();
		x.pop();
		x.zap();
		x.zap();
		x.zap();
		x.pop();
		x.pop();
		x.toString();
    }
    @Test
    public void test350() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
		variable.pop();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test351() {
		C3 x = new C3();
		x.zap();
		x.toString();
		x.pop();
		assertEquals("ZAP!", x.zap());
		assertEquals(-1, x.pop());
		x.toString();
		x.zap();
    }
    @Test
    public void test352() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		variable.toString();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test353() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.pop();
		z.zap();
    }
    @Test
    public void test354() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.zap();
		y.zap();
		y.zap();
		y.zap();
    }
    @Test
    public void test355() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test356() {
		C3 z = new C3();
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.zap();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test357() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
    }
    @Test
    public void test358() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
    }
    @Test
    public void test359() {
		C3 y = new C3();
		y.toString();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
    }
    @Test
    public void test360() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.pop();
    }
    @Test
    public void test361() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.toString();
		x.toString();
    }
    @Test
    public void test362() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.zap();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
		y.pop();
		y.zap();
		y.pop();
    }
    @Test
    public void test363() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test364() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test365() {
		C3 y = new C3();
		y.zap();
		y.toString();
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.toString();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.zap();
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test366() {
		C3 y = new C3();
		y.zap();
		y.toString();
    }
    @Test
    public void test367() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.pop();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.toString();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test368() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test369() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.pop();
    }
    @Test
    public void test370() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		x.zap();
		x.zap();
		x.pop();
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.zap();
		x.zap();
    }
    @Test
    public void test371() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.toString();
		z.zap();
    }
    @Test
    public void test372() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.pop();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test373() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		z.toString();
		z.toString();
		z.pop();
    }
    @Test
    public void test374() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.pop();
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test375() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.toString();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test376() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.pop();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test377() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.zap();
		Var.toString();
		Var.toString();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test378() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
    }
    @Test
    public void test379() {
		C3 z = new C3();
		z.zap();
		z.toString();
    }
    @Test
    public void test380() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test381() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.pop();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test382() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test383() {
		C3 x = new C3();
		x.zap();
		x.toString();
    }
    @Test
    public void test384() {
		C3 variable = new C3();
		variable.pop();
    }
    @Test
    public void test385() {
		C3 y = new C3();
		y.toString();
		y.zap();
    }
    @Test
    public void test386() {
		C3 variable = new C3();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test387() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.toString();
    }
    @Test
    public void test388() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		x.toString();
    }
    @Test
    public void test389() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
		variable.zap();
		variable.pop();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test390() {
		C3 z = new C3();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		z.toString();
		z.pop();
		z.toString();
		z.zap();
    }
    @Test
    public void test391() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
    }
    @Test
    public void test392() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.pop();
		x.toString();
		x.toString();
		x.toString();
		x.zap();
		x.toString();
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals(-1, x.pop());
		x.pop();
    }
    @Test
    public void test393() {
		C3 y = new C3();
		y.pop();
		y.toString();
    }
    @Test
    public void test394() {
		C3 y = new C3();
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
		y.zap();
    }
    @Test
    public void test395() {
		C3 x = new C3();
		x.pop();
    }
    @Test
    public void test396() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test397() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test398() {
		C3 x = new C3();
		x.pop();
		x.zap();
		x.pop();
    }
    @Test
    public void test399() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
    }
    @Test
    public void test400() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		variable.zap();
		variable.toString();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test401() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test402() {
		C3 x = new C3();
		x.zap();
		x.toString();
		x.pop();
		x.toString();
    }
    @Test
    public void test403() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.pop();
		y.toString();
		y.zap();
		y.toString();
		y.toString();
		y.zap();
		y.zap();
    }
    @Test
    public void test404() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.pop();
		y.toString();
    }
    @Test
    public void test405() {
		C3 x = new C3();
		x.pop();
		x.zap();
		x.toString();
		x.zap();
		x.zap();
		x.toString();
    }
    @Test
    public void test406() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
		Var.pop();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test407() {
		C3 x = new C3();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test408() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
    }
    @Test
    public void test409() {
		C3 z = new C3();
		z.zap();
		z.zap();
		z.pop();
    }
    @Test
    public void test410() {
		C3 z = new C3();
		z.zap();
		z.zap();
		z.toString();
    }
    @Test
    public void test411() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		y.pop();
    }
    @Test
    public void test412() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test413() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test414() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals("ZAP!", z.zap());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		z.zap();
    }
    @Test
    public void test415() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test416() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		Var.pop();
		assertEquals("ZAP!", Var.zap());
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test417() {
		C3 y = new C3();
		y.zap();
    }
    @Test
    public void test418() {
		C3 Var = new C3();
		Var.zap();
    }
    @Test
    public void test419() {
		C3 y = new C3();
		y.pop();
		y.pop();
		y.toString();
    }
    @Test
    public void test420() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.zap();
		x.pop();
		x.zap();
    }
    @Test
    public void test421() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.zap();
    }
    @Test
    public void test422() {
		C3 z = new C3();
		z.zap();
		z.toString();
    }
    @Test
    public void test423() {
		C3 y = new C3();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.pop();
    }
    @Test
    public void test424() {
		C3 x = new C3();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.pop();
		x.toString();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.toString();
    }
    @Test
    public void test425() {
		C3 y = new C3();
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.pop();
    }
    @Test
    public void test426() {
		C3 x = new C3();
		x.toString();
		x.zap();
		x.pop();
		x.pop();
		x.pop();
    }
    @Test
    public void test427() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.toString();
		y.toString();
    }
    @Test
    public void test428() {
		C3 y = new C3();
		y.toString();
		y.pop();
    }
    @Test
    public void test429() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		variable.toString();
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test430() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test431() {
		C3 z = new C3();
		z.pop();
		z.pop();
    }
    @Test
    public void test432() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.pop();
		y.toString();
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
		y.zap();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test433() {
		C3 Var = new C3();
		Var.zap();
		Var.zap();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test434() {
		C3 y = new C3();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.zap();
		y.pop();
		y.zap();
    }
    @Test
    public void test435() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.pop();
		x.zap();
		x.toString();
    }
    @Test
    public void test436() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.toString();
		x.pop();
		x.pop();
    }
    @Test
    public void test437() {
		C3 Var = new C3();
		Var.pop();
    }
    @Test
    public void test438() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
    }
    @Test
    public void test439() {
		C3 y = new C3();
		y.zap();
		y.toString();
		y.zap();
		y.toString();
		y.zap();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test440() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.pop();
		z.pop();
		z.toString();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test441() {
		C3 z = new C3();
		z.pop();
		z.pop();
		z.pop();
		z.toString();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.zap();
    }
    @Test
    public void test442() {
		C3 x = new C3();
		x.pop();
		x.pop();
		x.toString();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test443() {
		C3 x = new C3();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		x.pop();
    }
    @Test
    public void test444() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
    }
    @Test
    public void test445() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test446() {
		C3 Var = new C3();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test447() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		Var.zap();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test448() {
		C3 z = new C3();
		z.zap();
    }
    @Test
    public void test449() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.pop();
    }
    @Test
    public void test450() {
		C3 x = new C3();
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.zap();
		x.pop();
		x.pop();
		x.pop();
		x.toString();
		x.zap();
		x.toString();
    }
    @Test
    public void test451() {
		C3 y = new C3();
		y.pop();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.pop();
    }
    @Test
    public void test452() {
		C3 x = new C3();
		x.pop();
		x.zap();
		x.pop();
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.toString();
		x.zap();
		x.toString();
		x.pop();
    }
    @Test
    public void test453() {
		C3 y = new C3();
		y.pop();
		y.zap();
		y.pop();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
    }
    @Test
    public void test454() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		z.toString();
		z.zap();
		z.zap();
    }
    @Test
    public void test455() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test456() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.pop();
    }
    @Test
    public void test457() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
    }
    @Test
    public void test458() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.pop();
		assertEquals("Aloha", y.toString());
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
    }
    @Test
    public void test459() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test460() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.zap();
    }
    @Test
    public void test461() {
		C3 variable = new C3();
		variable.pop();
    }
    @Test
    public void test462() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test463() {
		C3 x = new C3();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
		assertEquals("ZAP!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
		x.pop();
    }
    @Test
    public void test464() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.pop();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test465() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.zap();
		x.toString();
		x.toString();
		x.pop();
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test466() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.toString();
    }
    @Test
    public void test467() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test468() {
		C3 x = new C3();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.toString();
    }
    @Test
    public void test469() {
		C3 y = new C3();
		y.zap();
    }
    @Test
    public void test470() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.zap();
    }
    @Test
    public void test471() {
		C3 y = new C3();
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.pop();
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test472() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.zap();
		x.toString();
		x.toString();
    }
    @Test
    public void test473() {
		C3 y = new C3();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test474() {
		C3 variable = new C3();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test475() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.zap();
		y.zap();
    }
    @Test
    public void test476() {
		C3 Var = new C3();
		Var.zap();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.zap();
		Var.zap();
		Var.zap();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		Var.toString();
    }
    @Test
    public void test477() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test478() {
		C3 y = new C3();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test479() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.zap();
    }
    @Test
    public void test480() {
		C3 z = new C3();
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
    }
    @Test
    public void test481() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.toString();
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test482() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.toString();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test483() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test484() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.toString();
		z.pop();
    }
    @Test
    public void test485() {
		C3 z = new C3();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		z.toString();
    }
    @Test
    public void test486() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
    }
    @Test
    public void test487() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test488() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.toString();
		z.zap();
    }
    @Test
    public void test489() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test490() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.pop();
		y.zap();
		y.pop();
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test491() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
		z.pop();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test492() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test493() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test494() {
		C3 x = new C3();
		x.zap();
    }
    @Test
    public void test495() {
		C3 y = new C3();
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		y.toString();
		y.pop();
		y.pop();
		y.pop();
    }
    @Test
    public void test496() {
		C3 y = new C3();
		y.toString();
    }
    @Test
    public void test497() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test498() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test499() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		variable.pop();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test500() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		z.toString();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
    }
    @Test
    public void test501() {
		C3 variable = new C3();
		variable.toString();
    }
    @Test
    public void test502() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.zap();
		x.pop();
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test503() {
		C3 x = new C3();
		x.pop();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
		x.toString();
		x.zap();
		x.toString();
    }
    @Test
    public void test504() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.toString();
		Var.pop();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test505() {
		C3 variable = new C3();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test506() {
		C3 Var = new C3();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.toString();
		Var.toString();
		Var.toString();
		Var.zap();
		Var.toString();
		Var.zap();
    }
    @Test
    public void test507() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test508() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
    }
    @Test
    public void test509() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		Var.toString();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.pop();
		Var.toString();
		Var.zap();
    }
    @Test
    public void test510() {
		C3 x = new C3();
		x.pop();
		assertEquals(-1, x.pop());
		x.toString();
		x.zap();
    }
    @Test
    public void test511() {
		C3 z = new C3();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
    }
    @Test
    public void test512() {
		C3 x = new C3();
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
    }
    @Test
    public void test513() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.toString();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test514() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test515() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test516() {
		C3 y = new C3();
		y.pop();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
		y.zap();
		y.zap();
		y.zap();
    }
    @Test
    public void test517() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test518() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.toString();
		z.toString();
		z.zap();
		z.toString();
		z.pop();
		z.zap();
    }
    @Test
    public void test519() {
		C3 y = new C3();
		y.toString();
		y.zap();
		y.pop();
		y.zap();
		y.zap();
    }
    @Test
    public void test520() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test521() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test522() {
		C3 x = new C3();
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.toString();
		x.zap();
		x.toString();
		x.pop();
		x.toString();
    }
    @Test
    public void test523() {
		C3 x = new C3();
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		x.toString();
		x.pop();
    }
    @Test
    public void test524() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test525() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
    }
    @Test
    public void test526() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.toString();
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.zap();
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test527() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test528() {
		C3 y = new C3();
		y.toString();
    }
    @Test
    public void test529() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.zap();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.toString();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test530() {
		C3 variable = new C3();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
    }
    @Test
    public void test531() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.toString();
		Var.zap();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test532() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.zap();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test533() {
		C3 Var = new C3();
		Var.pop();
    }
    @Test
    public void test534() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test535() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.toString();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test536() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test537() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test538() {
		C3 x = new C3();
		x.pop();
		x.pop();
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		x.toString();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
    }
    @Test
    public void test539() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test540() {
		C3 y = new C3();
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.pop();
		y.zap();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		y.zap();
		y.zap();
    }
    @Test
    public void test541() {
		C3 Var = new C3();
		Var.pop();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test542() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test543() {
		C3 y = new C3();
		y.pop();
		y.zap();
		y.pop();
		y.pop();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.pop();
		y.toString();
		assertEquals("ZAP!", y.zap());
		y.zap();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.toString();
    }
    @Test
    public void test544() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
    }
    @Test
    public void test545() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.pop();
		z.pop();
		z.pop();
    }
    @Test
    public void test546() {
		C3 z = new C3();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
    }
    @Test
    public void test547() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
		variable.toString();
		variable.zap();
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test548() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test549() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test550() {
		C3 Var = new C3();
		Var.toString();
    }
    @Test
    public void test551() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.toString();
		x.toString();
		x.zap();
		x.zap();
		x.pop();
		x.pop();
    }
    @Test
    public void test552() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.toString();
    }
    @Test
    public void test553() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.zap();
		x.toString();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.pop();
    }
    @Test
    public void test554() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.pop();
		z.zap();
		z.toString();
    }
    @Test
    public void test555() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		z.pop();
		z.zap();
		z.pop();
		z.pop();
    }
    @Test
    public void test556() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.toString();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test557() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
    }
    @Test
    public void test558() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.pop();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test559() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.pop();
    }
    @Test
    public void test560() {
		C3 variable = new C3();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.toString();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test561() {
		C3 x = new C3();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
    }
    @Test
    public void test562() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test563() {
		C3 z = new C3();
		z.toString();
    }
    @Test
    public void test564() {
		C3 y = new C3();
		y.toString();
		y.zap();
    }
    @Test
    public void test565() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test566() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.toString();
    }
    @Test
    public void test567() {
		C3 z = new C3();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
    }
    @Test
    public void test568() {
		C3 z = new C3();
		z.pop();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		z.toString();
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.zap();
    }
    @Test
    public void test569() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.zap();
		x.pop();
		x.toString();
    }
    @Test
    public void test570() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test571() {
		C3 variable = new C3();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test572() {
		C3 z = new C3();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
    }
    @Test
    public void test573() {
		C3 x = new C3();
		x.toString();
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
    }
    @Test
    public void test574() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.pop();
    }
    @Test
    public void test575() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test576() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.zap();
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		y.zap();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.toString();
    }
    @Test
    public void test577() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test578() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		z.pop();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test579() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.toString();
		Var.zap();
    }
    @Test
    public void test580() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.zap();
		z.toString();
		z.zap();
    }
    @Test
    public void test581() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		assertEquals("ZAP!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.toString();
    }
    @Test
    public void test582() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.pop();
		y.pop();
    }
    @Test
    public void test583() {
		C3 z = new C3();
		z.zap();
		z.zap();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
    }
    @Test
    public void test584() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		z.toString();
		z.toString();
		z.toString();
		z.pop();
		z.toString();
    }
    @Test
    public void test585() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test586() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
    }
    @Test
    public void test587() {
		C3 variable = new C3();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.zap();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test588() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test589() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test590() {
		C3 y = new C3();
		y.pop();
		y.pop();
		y.zap();
		y.zap();
    }
    @Test
    public void test591() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		x.toString();
		x.zap();
		x.pop();
		x.zap();
		x.zap();
		x.zap();
		x.toString();
    }
    @Test
    public void test592() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.zap();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.zap();
    }
    @Test
    public void test593() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test594() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.pop();
		variable.pop();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test595() {
		C3 y = new C3();
		y.zap();
    }
    @Test
    public void test596() {
		C3 variable = new C3();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
    }
    @Test
    public void test597() {
		C3 z = new C3();
		z.zap();
    }
    @Test
    public void test598() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test599() {
		C3 x = new C3();
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
    }
    @Test
    public void test600() {
		C3 variable = new C3();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test601() {
		C3 y = new C3();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.toString();
		y.zap();
		y.zap();
		y.toString();
		y.toString();
		y.pop();
		y.pop();
    }
    @Test
    public void test602() {
		C3 x = new C3();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test603() {
		C3 Var = new C3();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test604() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.zap();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test605() {
		C3 y = new C3();
		y.zap();
		y.pop();
		assertEquals("ZAP!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.zap();
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.zap();
    }
    @Test
    public void test606() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.zap();
		Var.zap();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test607() {
		C3 variable = new C3();
		variable.zap();
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test608() {
		C3 z = new C3();
		z.toString();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.pop();
		z.pop();
		z.toString();
    }
    @Test
    public void test609() {
		C3 z = new C3();
		z.zap();
		z.zap();
    }
    @Test
    public void test610() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
		z.toString();
		z.zap();
		z.toString();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
    }
    @Test
    public void test611() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test612() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test613() {
		C3 x = new C3();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.zap();
		x.toString();
		x.pop();
		x.zap();
		x.pop();
    }
    @Test
    public void test614() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
    }
    @Test
    public void test615() {
		C3 x = new C3();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.toString();
		x.zap();
		x.zap();
		x.toString();
		x.toString();
		x.zap();
    }
    @Test
    public void test616() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
		z.pop();
    }
    @Test
    public void test617() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.zap();
		y.pop();
    }
    @Test
    public void test618() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.toString();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.zap();
		variable.toString();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test619() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test620() {
		C3 y = new C3();
		y.toString();
		y.toString();
    }
    @Test
    public void test621() {
		C3 z = new C3();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.zap();
		z.zap();
		z.pop();
    }
    @Test
    public void test622() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
    }
    @Test
    public void test623() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.toString();
		z.zap();
		z.pop();
		z.toString();
		z.pop();
    }
    @Test
    public void test624() {
		C3 y = new C3();
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
    }
    @Test
    public void test625() {
		C3 y = new C3();
		y.pop();
		assertEquals(-1, y.pop());
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.zap();
    }
    @Test
    public void test626() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test627() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.toString();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
		y.pop();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test628() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test629() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test630() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.toString();
		z.pop();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.zap();
    }
    @Test
    public void test631() {
		C3 x = new C3();
		x.toString();
		x.toString();
    }
    @Test
    public void test632() {
		C3 z = new C3();
		z.toString();
		z.zap();
		z.pop();
		z.zap();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test633() {
		C3 x = new C3();
		x.toString();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
		x.toString();
    }
    @Test
    public void test634() {
		C3 y = new C3();
		y.zap();
    }
    @Test
    public void test635() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.toString();
		Var.zap();
    }
    @Test
    public void test636() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.zap();
		y.zap();
		y.pop();
    }
    @Test
    public void test637() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test638() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		x.zap();
		x.toString();
		x.pop();
    }
    @Test
    public void test639() {
		C3 z = new C3();
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		z.toString();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
    }
    @Test
    public void test640() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.zap();
		Var.toString();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test641() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
    }
    @Test
    public void test642() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
		y.pop();
    }
    @Test
    public void test643() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
    }
    @Test
    public void test644() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		assertEquals("ZAP!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
    }
    @Test
    public void test645() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test646() {
		C3 z = new C3();
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
		z.pop();
		z.toString();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test647() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
		y.zap();
		y.zap();
    }
    @Test
    public void test648() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test649() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.zap();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test650() {
		C3 y = new C3();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
    }
    @Test
    public void test651() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
    }
    @Test
    public void test652() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
		z.zap();
		z.pop();
		z.toString();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test653() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.zap();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.pop();
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.toString();
    }
    @Test
    public void test654() {
		C3 variable = new C3();
		variable.toString();
    }
    @Test
    public void test655() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.zap();
    }
    @Test
    public void test656() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.pop();
		z.pop();
		z.pop();
		z.toString();
		z.pop();
		z.toString();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test657() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test658() {
		C3 z = new C3();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.pop();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
		z.zap();
		z.zap();
    }
    @Test
    public void test659() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test660() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.toString();
		Var.zap();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.pop();
		Var.pop();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test661() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test662() {
		C3 Var = new C3();
		Var.toString();
    }
    @Test
    public void test663() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.toString();
    }
    @Test
    public void test664() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.zap();
		x.toString();
		x.toString();
		x.toString();
		x.toString();
    }
    @Test
    public void test665() {
		C3 variable = new C3();
		variable.pop();
    }
    @Test
    public void test666() {
		C3 Var = new C3();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test667() {
		C3 y = new C3();
		y.pop();
		y.zap();
    }
    @Test
    public void test668() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
    }
    @Test
    public void test669() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
    }
    @Test
    public void test670() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		x.pop();
		assertEquals("ZAP!", x.zap());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.toString();
		x.toString();
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
    }
    @Test
    public void test671() {
		C3 y = new C3();
		y.pop();
		y.pop();
		y.toString();
    }
    @Test
    public void test672() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
    }
    @Test
    public void test673() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.zap();
		z.pop();
    }
    @Test
    public void test674() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.toString();
		variable.zap();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test675() {
		C3 x = new C3();
		x.toString();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
		x.toString();
		x.zap();
		assertEquals(-1, x.pop());
		x.toString();
		x.zap();
		x.zap();
		x.zap();
    }
    @Test
    public void test676() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
		assertEquals("ZAP!", z.zap());
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test677() {
		C3 variable = new C3();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test678() {
		C3 y = new C3();
		y.pop();
    }
    @Test
    public void test679() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
    }
    @Test
    public void test680() {
		C3 y = new C3();
		y.pop();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test681() {
		C3 z = new C3();
		z.zap();
		z.pop();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("ZAP!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
		z.pop();
		z.zap();
		z.zap();
		z.zap();
    }
    @Test
    public void test682() {
		C3 y = new C3();
		y.toString();
    }
    @Test
    public void test683() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.pop();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test684() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test685() {
		C3 z = new C3();
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.pop();
		z.pop();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.toString();
		z.zap();
		z.toString();
    }
    @Test
    public void test686() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.toString();
		Var.pop();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.pop();
    }
    @Test
    public void test687() {
		C3 z = new C3();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.toString();
		z.toString();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.toString();
		z.toString();
		z.toString();
		z.pop();
    }
    @Test
    public void test688() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		x.toString();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
    }
    @Test
    public void test689() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test690() {
		C3 y = new C3();
		y.zap();
		y.pop();
    }
    @Test
    public void test691() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
    }
    @Test
    public void test692() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
    }
    @Test
    public void test693() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test694() {
		C3 Var = new C3();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test695() {
		C3 z = new C3();
		z.zap();
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.toString();
    }
    @Test
    public void test696() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test697() {
		C3 Var = new C3();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.zap();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test698() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test699() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		x.toString();
		x.zap();
		x.toString();
		x.pop();
		x.zap();
    }
    @Test
    public void test700() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.zap();
		z.toString();
		z.pop();
    }
    @Test
    public void test701() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test702() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.pop();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test703() {
		C3 variable = new C3();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
    }
    @Test
    public void test704() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals("ZAP!", x.zap());
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.toString();
		x.zap();
    }
    @Test
    public void test705() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.zap();
    }
    @Test
    public void test706() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
    }
    @Test
    public void test707() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.toString();
		assertEquals("ZAP!", y.zap());
		y.zap();
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test708() {
		C3 x = new C3();
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.pop();
		x.toString();
		x.toString();
		x.pop();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test709() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.pop();
		Var.pop();
		Var.zap();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test710() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test711() {
		C3 z = new C3();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test712() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test713() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.zap();
		z.zap();
		z.zap();
		z.zap();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test714() {
		C3 x = new C3();
		x.zap();
    }
    @Test
    public void test715() {
		C3 z = new C3();
		z.pop();
    }
    @Test
    public void test716() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.toString();
		x.toString();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		x.toString();
    }
    @Test
    public void test717() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
    }
    @Test
    public void test718() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.pop();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test719() {
		C3 Var = new C3();
		Var.toString();
    }
    @Test
    public void test720() {
		C3 x = new C3();
		x.toString();
		x.toString();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
    }
    @Test
    public void test721() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.pop();
    }
    @Test
    public void test722() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.zap();
		y.zap();
		y.zap();
		y.toString();
		y.toString();
		y.pop();
		y.zap();
    }
    @Test
    public void test723() {
		C3 x = new C3();
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		x.toString();
    }
    @Test
    public void test724() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.zap();
    }
    @Test
    public void test725() {
		C3 Var = new C3();
		Var.pop();
		Var.pop();
		Var.pop();
		Var.pop();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test726() {
		C3 y = new C3();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals(-1, y.pop());
		y.pop();
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.toString();
    }
    @Test
    public void test727() {
		C3 z = new C3();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
    }
    @Test
    public void test728() {
		C3 z = new C3();
		z.pop();
		z.toString();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test729() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test730() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
    }
    @Test
    public void test731() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.zap();
		z.toString();
    }
    @Test
    public void test732() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.zap();
    }
    @Test
    public void test733() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.toString();
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
    }
    @Test
    public void test734() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		x.zap();
    }
    @Test
    public void test735() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.toString();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
    }
    @Test
    public void test736() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
		variable.toString();
		variable.pop();
		variable.toString();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test737() {
		C3 x = new C3();
		x.toString();
		x.zap();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		x.toString();
    }
    @Test
    public void test738() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals("ZAP!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
    }
    @Test
    public void test739() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.toString();
		assertEquals("ZAP!", variable.zap());
		variable.toString();
		variable.pop();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test740() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test741() {
		C3 x = new C3();
		x.zap();
		x.pop();
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
		x.pop();
		x.pop();
    }
    @Test
    public void test742() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.pop();
		y.toString();
    }
    @Test
    public void test743() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.pop();
		assertEquals("ZAP!", y.zap());
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.zap();
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
    }
    @Test
    public void test744() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
    }
    @Test
    public void test745() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		x.toString();
    }
    @Test
    public void test746() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test747() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		Var.pop();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.pop();
		Var.pop();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.toString();
    }
    @Test
    public void test748() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals(-1, y.pop());
		y.toString();
		y.pop();
		y.zap();
		y.zap();
		y.pop();
		y.pop();
		y.pop();
		y.pop();
		assertEquals(-1, y.pop());
		y.pop();
    }
    @Test
    public void test749() {
		C3 z = new C3();
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.zap();
		z.pop();
		z.zap();
    }
    @Test
    public void test750() {
		C3 y = new C3();
		y.zap();
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.pop();
		y.zap();
		y.toString();
    }
    @Test
    public void test751() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test752() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.pop();
		z.zap();
		z.toString();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
    }
    @Test
    public void test753() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
    }
    @Test
    public void test754() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.toString();
		Var.pop();
    }
    @Test
    public void test755() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.zap();
		z.toString();
		z.zap();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test756() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
    }
    @Test
    public void test757() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test758() {
		C3 z = new C3();
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.pop();
		z.pop();
		z.zap();
    }
    @Test
    public void test759() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.toString();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.toString();
    }
    @Test
    public void test760() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
    }
    @Test
    public void test761() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test762() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.toString();
		x.toString();
		x.toString();
    }
    @Test
    public void test763() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test764() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test765() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.pop();
		z.zap();
		assertEquals(-1, z.pop());
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.pop();
		z.zap();
    }
    @Test
    public void test766() {
		C3 z = new C3();
		z.zap();
		z.toString();
		assertEquals("ZAP!", z.zap());
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.zap();
    }
    @Test
    public void test767() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test768() {
		C3 z = new C3();
		z.zap();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		z.zap();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test769() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.zap();
    }
    @Test
    public void test770() {
		C3 y = new C3();
		y.toString();
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		y.pop();
    }
    @Test
    public void test771() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.zap();
		z.zap();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test772() {
		C3 z = new C3();
		z.pop();
		z.toString();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.pop();
		z.pop();
		z.pop();
    }
    @Test
    public void test773() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		z.zap();
		z.pop();
    }
    @Test
    public void test774() {
		C3 Var = new C3();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.toString();
		Var.pop();
		Var.toString();
		Var.zap();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test775() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test776() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.pop();
    }
    @Test
    public void test777() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.toString();
		x.pop();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
    }
    @Test
    public void test778() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.pop();
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
		x.toString();
    }
    @Test
    public void test779() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.zap();
		variable.toString();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test780() {
		C3 y = new C3();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.toString();
    }
    @Test
    public void test781() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test782() {
		C3 y = new C3();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.toString();
		y.toString();
		y.toString();
		y.pop();
		y.pop();
		y.zap();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.zap();
    }
    @Test
    public void test783() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.pop();
    }
    @Test
    public void test784() {
		C3 y = new C3();
		y.zap();
    }
    @Test
    public void test785() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.pop();
    }
    @Test
    public void test786() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test787() {
		C3 y = new C3();
		y.zap();
		assertEquals(-1, y.pop());
		y.pop();
		y.toString();
		y.toString();
		y.toString();
		assertEquals("ZAP!", y.zap());
		y.zap();
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
    }
    @Test
    public void test788() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.zap();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
    }
    @Test
    public void test789() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		z.pop();
		z.pop();
		z.pop();
    }
    @Test
    public void test790() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
		y.toString();
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.zap();
    }
    @Test
    public void test791() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test792() {
		C3 y = new C3();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
		y.toString();
    }
    @Test
    public void test793() {
		C3 variable = new C3();
		variable.pop();
    }
    @Test
    public void test794() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.zap();
    }
    @Test
    public void test795() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
    }
    @Test
    public void test796() {
		C3 z = new C3();
		z.pop();
		z.zap();
    }
    @Test
    public void test797() {
		C3 z = new C3();
		z.zap();
		z.pop();
    }
    @Test
    public void test798() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test799() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.toString();
    }
    @Test
    public void test800() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test801() {
		C3 z = new C3();
		z.toString();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
    }
    @Test
    public void test802() {
		C3 variable = new C3();
		variable.pop();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test803() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.zap();
    }
    @Test
    public void test804() {
		C3 x = new C3();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
		x.pop();
		assertEquals(-1, x.pop());
		x.zap();
    }
    @Test
    public void test805() {
		C3 z = new C3();
		z.pop();
		z.pop();
		z.pop();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		z.pop();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test806() {
		C3 z = new C3();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.pop();
		assertEquals(-1, z.pop());
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.toString();
    }
    @Test
    public void test807() {
		C3 variable = new C3();
		variable.zap();
    }
    @Test
    public void test808() {
		C3 y = new C3();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		assertEquals(-1, y.pop());
		assertEquals(-1, y.pop());
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test809() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
		z.zap();
		z.toString();
		z.toString();
		assertEquals(-1, z.pop());
		z.zap();
    }
    @Test
    public void test810() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test811() {
		C3 z = new C3();
		z.toString();
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
		z.pop();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
    }
    @Test
    public void test812() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		z.pop();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.zap();
		z.toString();
    }
    @Test
    public void test813() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		x.zap();
    }
    @Test
    public void test814() {
		C3 x = new C3();
		x.pop();
		x.pop();
		x.pop();
		x.pop();
		x.toString();
		assertEquals(-1, x.pop());
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.pop();
    }
    @Test
    public void test815() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.pop();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test816() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test817() {
		C3 z = new C3();
		z.toString();
		z.zap();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.zap();
		z.toString();
    }
    @Test
    public void test818() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test819() {
		C3 z = new C3();
		z.toString();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.zap();
		z.pop();
		z.toString();
    }
    @Test
    public void test820() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.pop();
		z.toString();
		z.toString();
    }
    @Test
    public void test821() {
		C3 y = new C3();
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test822() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.toString();
		x.toString();
    }
    @Test
    public void test823() {
		C3 variable = new C3();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.toString();
    }
    @Test
    public void test824() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test825() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.pop();
		assertEquals(-1, x.pop());
		x.toString();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals(-1, x.pop());
		x.pop();
    }
    @Test
    public void test826() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		variable.pop();
		variable.zap();
		variable.zap();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
    }
    @Test
    public void test827() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.zap();
    }
    @Test
    public void test828() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test829() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.zap();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.pop();
    }
    @Test
    public void test830() {
		C3 z = new C3();
		z.toString();
		z.zap();
    }
    @Test
    public void test831() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.toString();
		x.pop();
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		x.pop();
		x.toString();
		x.zap();
		x.zap();
    }
    @Test
    public void test832() {
		C3 Var = new C3();
		Var.toString();
		Var.toString();
		Var.toString();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test833() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test834() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
		Var.zap();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.pop();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test835() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		Var.pop();
    }
    @Test
    public void test836() {
		C3 z = new C3();
		z.zap();
    }
    @Test
    public void test837() {
		C3 Var = new C3();
		Var.toString();
		Var.zap();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("ZAP!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.pop();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
		Var.zap();
    }
    @Test
    public void test838() {
		C3 x = new C3();
		x.pop();
		x.pop();
		x.toString();
		x.pop();
		x.zap();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test839() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("ZAP!", Var.zap());
		Var.pop();
		Var.zap();
		Var.pop();
		Var.zap();
		Var.pop();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test840() {
		C3 Var = new C3();
		Var.toString();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.toString();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.zap();
    }
    @Test
    public void test841() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
    }
    @Test
    public void test842() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test843() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.pop();
		variable.zap();
		variable.pop();
		variable.zap();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
    }
    @Test
    public void test844() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		assertEquals("Aloha", y.toString());
		assertEquals("ZAP!", y.zap());
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		y.toString();
    }
    @Test
    public void test845() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.zap();
		z.pop();
    }
    @Test
    public void test846() {
		C3 z = new C3();
		z.toString();
		z.toString();
		z.pop();
		z.toString();
		z.toString();
		z.pop();
		assertEquals(-1, z.pop());
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		z.pop();
    }
    @Test
    public void test847() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.toString();
    }
    @Test
    public void test848() {
		C3 Var = new C3();
		Var.pop();
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		Var.toString();
		assertEquals("ZAP!", Var.zap());
		Var.toString();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test849() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.toString();
		variable.zap();
    }
    @Test
    public void test850() {
		C3 x = new C3();
		x.zap();
		x.pop();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.pop();
		x.pop();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
    }
    @Test
    public void test851() {
		C3 z = new C3();
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		z.pop();
		z.zap();
		z.pop();
		z.pop();
		z.pop();
		z.pop();
    }
    @Test
    public void test852() {
		C3 x = new C3();
		x.pop();
    }
    @Test
    public void test853() {
		C3 z = new C3();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		z.pop();
    }
    @Test
    public void test854() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.toString();
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test855() {
		C3 y = new C3();
		y.toString();
    }
    @Test
    public void test856() {
		C3 Var = new C3();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		assertEquals(-1, Var.pop());
		Var.zap();
		Var.zap();
		assertEquals(-1, Var.pop());
		Var.zap();
    }
    @Test
    public void test857() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.zap();
		assertEquals(-1, x.pop());
		x.zap();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.zap();
    }
    @Test
    public void test858() {
		C3 y = new C3();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		assertEquals(-1, y.pop());
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.toString();
		y.zap();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
		y.pop();
		y.pop();
		y.zap();
    }
    @Test
    public void test859() {
		C3 x = new C3();
		x.toString();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.zap();
		x.pop();
    }
    @Test
    public void test860() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.zap();
		variable.pop();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test861() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.pop();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
    }
    @Test
    public void test862() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.toString();
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.zap();
		variable.zap();
		variable.toString();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test863() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.pop();
		x.pop();
		x.zap();
    }
    @Test
    public void test864() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.toString();
		z.toString();
		z.toString();
    }
    @Test
    public void test865() {
		C3 x = new C3();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test866() {
		C3 x = new C3();
		x.toString();
		assertEquals(-1, x.pop());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.zap();
		x.zap();
		x.pop();
		x.toString();
		x.pop();
		x.zap();
		x.zap();
    }
    @Test
    public void test867() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		assertEquals("Aloha", y.toString());
		y.toString();
		y.toString();
		y.zap();
		y.zap();
		y.pop();
		y.pop();
		y.zap();
    }
    @Test
    public void test868() {
		C3 z = new C3();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.zap();
		z.toString();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.toString();
    }
    @Test
    public void test869() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.zap();
		y.zap();
		y.zap();
		y.zap();
		y.pop();
		y.zap();
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test870() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
    }
    @Test
    public void test871() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.zap();
		y.zap();
    }
    @Test
    public void test872() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
    }
    @Test
    public void test873() {
		C3 z = new C3();
		z.zap();
		z.toString();
		z.toString();
    }
    @Test
    public void test874() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
		variable.zap();
		variable.toString();
    }
    @Test
    public void test875() {
		C3 z = new C3();
		z.zap();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.zap();
		z.zap();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.pop();
    }
    @Test
    public void test876() {
		C3 x = new C3();
		x.toString();
		x.zap();
		assertEquals(-1, x.pop());
		x.pop();
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		assertEquals("ZAP!", x.zap());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.pop();
    }
    @Test
    public void test877() {
		C3 x = new C3();
		x.zap();
		x.zap();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.zap();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.pop();
		x.zap();
		x.pop();
		x.pop();
		x.toString();
    }
    @Test
    public void test878() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
    }
    @Test
    public void test879() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.toString();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("ZAP!", z.zap());
		z.pop();
    }
    @Test
    public void test880() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.toString();
		variable.pop();
		variable.pop();
		variable.toString();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
    }
    @Test
    public void test881() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
    }
    @Test
    public void test882() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.zap();
		y.zap();
    }
    @Test
    public void test883() {
		C3 variable = new C3();
		variable.pop();
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		assertEquals(-1, variable.pop());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
    }
    @Test
    public void test884() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("Aloha", x.toString());
		x.zap();
		x.toString();
		x.pop();
    }
    @Test
    public void test885() {
		C3 y = new C3();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.pop();
		y.pop();
		assertEquals(-1, y.pop());
		y.zap();
		y.pop();
		y.zap();
    }
    @Test
    public void test886() {
		C3 x = new C3();
		x.toString();
		x.pop();
    }
    @Test
    public void test887() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.pop();
		y.toString();
    }
    @Test
    public void test888() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.toString();
    }
    @Test
    public void test889() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.zap();
    }
    @Test
    public void test890() {
		C3 variable = new C3();
		variable.pop();
		variable.zap();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test891() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		variable.zap();
    }
    @Test
    public void test892() {
		C3 y = new C3();
		y.pop();
		y.zap();
    }
    @Test
    public void test893() {
		C3 x = new C3();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.pop();
		x.toString();
		x.zap();
    }
    @Test
    public void test894() {
		C3 y = new C3();
		y.toString();
		y.zap();
    }
    @Test
    public void test895() {
		C3 x = new C3();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.toString();
		assertEquals("ZAP!", x.zap());
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("ZAP!", x.zap());
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
		x.pop();
		x.zap();
    }
    @Test
    public void test896() {
		C3 y = new C3();
		y.toString();
		y.pop();
    }
    @Test
    public void test897() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
		Var.toString();
		Var.pop();
		Var.zap();
    }
    @Test
    public void test898() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
		Var.toString();
		Var.pop();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
    }
    @Test
    public void test899() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.pop();
		Var.zap();
		Var.pop();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test900() {
		C3 z = new C3();
		z.zap();
		assertEquals(-1, z.pop());
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("ZAP!", z.zap());
		z.zap();
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals("ZAP!", z.zap());
		z.pop();
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
		z.zap();
		z.toString();
		z.zap();
    }
    @Test
    public void test901() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
    }
    @Test
    public void test902() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test903() {
		C3 x = new C3();
		x.toString();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
    }
    @Test
    public void test904() {
		C3 Var = new C3();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		Var.pop();
		Var.toString();
		Var.toString();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.pop();
    }
    @Test
    public void test905() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.pop();
    }
    @Test
    public void test906() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.toString();
		y.zap();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.zap();
    }
    @Test
    public void test907() {
		C3 z = new C3();
		z.toString();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.zap();
		z.pop();
    }
    @Test
    public void test908() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.zap();
    }
    @Test
    public void test909() {
		C3 x = new C3();
		assertEquals(-1, x.pop());
		x.toString();
    }
    @Test
    public void test910() {
		C3 x = new C3();
		x.zap();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals("ZAP!", x.zap());
		x.toString();
		x.zap();
		x.zap();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.zap();
    }
    @Test
    public void test911() {
		C3 Var = new C3();
		Var.pop();
		Var.toString();
    }
    @Test
    public void test912() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.zap();
		y.zap();
		y.toString();
		y.pop();
		y.toString();
		y.toString();
		y.toString();
		y.toString();
		y.zap();
    }
    @Test
    public void test913() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test914() {
		C3 x = new C3();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.zap();
		x.zap();
		x.pop();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.zap();
    }
    @Test
    public void test915() {
		C3 z = new C3();
		z.toString();
		z.pop();
		z.pop();
		z.zap();
    }
    @Test
    public void test916() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		x.toString();
		x.zap();
		x.pop();
		x.zap();
    }
    @Test
    public void test917() {
		C3 x = new C3();
		x.pop();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.pop();
    }
    @Test
    public void test918() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test919() {
		C3 y = new C3();
		y.zap();
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
		y.zap();
		y.zap();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("Aloha", y.toString());
		y.toString();
		y.pop();
    }
    @Test
    public void test920() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.zap();
		variable.pop();
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test921() {
		C3 y = new C3();
		y.zap();
		y.toString();
		y.toString();
		y.zap();
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		assertEquals(-1, y.pop());
		y.toString();
		y.pop();
		y.zap();
		y.pop();
    }
    @Test
    public void test922() {
		C3 z = new C3();
		z.pop();
		z.pop();
		z.zap();
		z.zap();
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.toString();
    }
    @Test
    public void test923() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.zap();
		assertEquals("ZAP!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.pop();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.pop();
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.pop();
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.toString();
    }
    @Test
    public void test924() {
		C3 z = new C3();
		z.pop();
		z.pop();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.pop();
    }
    @Test
    public void test925() {
		C3 y = new C3();
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.pop();
		y.pop();
    }
    @Test
    public void test926() {
		C3 x = new C3();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.toString();
		x.pop();
    }
    @Test
    public void test927() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.pop();
    }
    @Test
    public void test928() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.toString();
		x.toString();
		x.toString();
    }
    @Test
    public void test929() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals(-1, y.pop());
		y.zap();
		y.zap();
    }
    @Test
    public void test930() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		variable.zap();
    }
    @Test
    public void test931() {
		C3 x = new C3();
		x.zap();
		assertEquals("ZAP!", x.zap());
		assertEquals("Aloha", x.toString());
		x.toString();
		x.toString();
		x.toString();
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.zap();
		x.zap();
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		assertEquals(-1, x.pop());
		x.zap();
    }
    @Test
    public void test932() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		Var.zap();
    }
    @Test
    public void test933() {
		C3 variable = new C3();
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.pop();
    }
    @Test
    public void test934() {
		C3 Var = new C3();
		Var.zap();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		assertEquals(-1, Var.pop());
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.toString();
		assertEquals("Aloha", Var.toString());
		assertEquals(-1, Var.pop());
		Var.toString();
    }
    @Test
    public void test935() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		x.pop();
		x.zap();
		x.pop();
		x.pop();
		x.toString();
    }
    @Test
    public void test936() {
		C3 y = new C3();
		y.toString();
		y.pop();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("ZAP!", y.zap());
		y.zap();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
		y.pop();
		y.toString();
    }
    @Test
    public void test937() {
		C3 x = new C3();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
		x.zap();
		x.toString();
    }
    @Test
    public void test938() {
		C3 y = new C3();
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.pop();
		y.pop();
    }
    @Test
    public void test939() {
		C3 variable = new C3();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test940() {
		C3 variable = new C3();
		variable.toString();
    }
    @Test
    public void test941() {
		C3 z = new C3();
		z.pop();
		z.pop();
    }
    @Test
    public void test942() {
		C3 x = new C3();
		x.zap();
		x.toString();
		x.toString();
		x.zap();
		assertEquals("BZZZZZZZ!", x.zap());
		assertEquals("Aloha", x.toString());
		x.pop();
		x.pop();
    }
    @Test
    public void test943() {
		C3 x = new C3();
		x.zap();
		assertEquals("ZAP!", x.zap());
		assertEquals("Aloha", x.toString());
		assertEquals(-1, x.pop());
		x.pop();
		x.toString();
		assertEquals("Aloha", x.toString());
		x.zap();
    }
    @Test
    public void test944() {
		C3 variable = new C3();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test945() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		variable.toString();
		variable.toString();
    }
    @Test
    public void test946() {
		C3 z = new C3();
		z.zap();
    }
    @Test
    public void test947() {
		C3 x = new C3();
		x.toString();
		x.toString();
    }
    @Test
    public void test948() {
		C3 z = new C3();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		z.pop();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.zap();
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
    }
    @Test
    public void test949() {
		C3 variable = new C3();
		variable.toString();
		variable.pop();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		assertEquals("Aloha", variable.toString());
		variable.toString();
		variable.toString();
    }
    @Test
    public void test950() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		Var.pop();
		Var.zap();
		Var.zap();
		Var.toString();
    }
    @Test
    public void test951() {
		C3 Var = new C3();
		Var.zap();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.zap();
		assertEquals(-1, Var.pop());
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("ZAP!", Var.zap());
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
    }
    @Test
    public void test952() {
		C3 x = new C3();
		x.toString();
		x.pop();
    }
    @Test
    public void test953() {
		C3 z = new C3();
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
    }
    @Test
    public void test954() {
		C3 z = new C3();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.pop();
		z.zap();
		z.toString();
		z.zap();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test955() {
		C3 x = new C3();
		x.toString();
		x.toString();
    }
    @Test
    public void test956() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		y.pop();
		assertEquals(-1, y.pop());
		y.toString();
		y.toString();
		y.toString();
		y.zap();
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
		y.zap();
    }
    @Test
    public void test957() {
		C3 Var = new C3();
		Var.toString();
		Var.pop();
		Var.pop();
    }
    @Test
    public void test958() {
		C3 Var = new C3();
		Var.toString();
		assertEquals("Aloha", Var.toString());
		Var.toString();
    }
    @Test
    public void test959() {
		C3 Var = new C3();
		Var.zap();
		Var.pop();
		Var.zap();
		Var.toString();
		Var.zap();
		Var.pop();
    }
    @Test
    public void test960() {
		C3 Var = new C3();
		assertEquals("Aloha", Var.toString());
		Var.toString();
    }
    @Test
    public void test961() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.toString();
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test962() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		variable.pop();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		assertEquals(-1, variable.pop());
		variable.pop();
		variable.toString();
		variable.pop();
		variable.toString();
		variable.pop();
		variable.pop();
    }
    @Test
    public void test963() {
		C3 y = new C3();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("ZAP!", y.zap());
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
		assertEquals(-1, y.pop());
		y.zap();
		y.toString();
    }
    @Test
    public void test964() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
		variable.zap();
		variable.pop();
		variable.zap();
		variable.toString();
		variable.toString();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
    }
    @Test
    public void test965() {
		C3 variable = new C3();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		assertEquals("ZAP!", variable.zap());
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test966() {
		C3 x = new C3();
		x.zap();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		assertEquals("ZAP!", x.zap());
		x.pop();
    }
    @Test
    public void test967() {
		C3 variable = new C3();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test968() {
		C3 y = new C3();
		y.toString();
		y.toString();
		y.zap();
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		y.pop();
		y.pop();
		y.pop();
		y.zap();
    }
    @Test
    public void test969() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.zap();
		variable.pop();
		variable.toString();
    }
    @Test
    public void test970() {
		C3 variable = new C3();
		variable.toString();
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.toString();
    }
    @Test
    public void test971() {
		C3 variable = new C3();
		assertEquals(-1, variable.pop());
		assertEquals("Aloha", variable.toString());
		assertEquals(-1, variable.pop());
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.pop();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.zap();
		assertEquals("ZAP!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		variable.zap();
		variable.zap();
    }
    @Test
    public void test972() {
		C3 y = new C3();
		y.toString();
		y.zap();
    }
    @Test
    public void test973() {
		C3 z = new C3();
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		z.pop();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
    }
    @Test
    public void test974() {
		C3 z = new C3();
		z.pop();
		z.zap();
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("ZAP!", z.zap());
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		assertEquals(-1, z.pop());
		assertEquals("Aloha", z.toString());
		z.zap();
		z.pop();
		assertEquals("ZAP!", z.zap());
		z.toString();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
    }
    @Test
    public void test975() {
		C3 variable = new C3();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.toString();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
    }
    @Test
    public void test976() {
		C3 variable = new C3();
		variable.zap();
		variable.toString();
		variable.pop();
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.toString();
		variable.zap();
		assertEquals("Aloha", variable.toString());
		variable.pop();
		variable.toString();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
		variable.zap();
    }
    @Test
    public void test977() {
		C3 y = new C3();
		y.pop();
		y.toString();
		y.toString();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.toString();
		y.toString();
    }
    @Test
    public void test978() {
		C3 z = new C3();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
    }
    @Test
    public void test979() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		assertEquals(-1, z.pop());
		assertEquals(-1, z.pop());
		z.toString();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
		z.zap();
		z.zap();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.zap();
		assertEquals("Aloha", z.toString());
		z.pop();
    }
    @Test
    public void test980() {
		C3 y = new C3();
		y.zap();
		y.zap();
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		assertEquals("Aloha", y.toString());
		assertEquals("ZAP!", y.zap());
		assertEquals("Aloha", y.toString());
		y.zap();
		y.toString();
		y.toString();
		y.pop();
		y.pop();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.zap();
    }
    @Test
    public void test981() {
		C3 x = new C3();
		x.pop();
		x.toString();
		x.toString();
		x.toString();
		assertEquals(-1, x.pop());
		x.toString();
		x.zap();
		assertEquals("ZAP!", x.zap());
		x.zap();
    }
    @Test
    public void test982() {
		C3 z = new C3();
		assertEquals("BZZZZZZZ!", z.zap());
		assertEquals("Aloha", z.toString());
		assertEquals("Aloha", z.toString());
		z.toString();
		assertEquals(-1, z.pop());
		z.toString();
    }
    @Test
    public void test983() {
		C3 x = new C3();
		x.pop();
		assertEquals("BZZZZZZZ!", x.zap());
		x.toString();
		x.toString();
		x.pop();
		x.zap();
		x.pop();
		x.toString();
		x.pop();
		x.pop();
		x.zap();
    }
    @Test
    public void test984() {
		C3 z = new C3();
		z.zap();
		assertEquals("ZAP!", z.zap());
		assertEquals("BZZZZZZZ!", z.zap());
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
    }
    @Test
    public void test985() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
		z.toString();
		z.pop();
		z.pop();
    }
    @Test
    public void test986() {
		C3 Var = new C3();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.toString();
		Var.toString();
    }
    @Test
    public void test987() {
		C3 z = new C3();
		z.zap();
		z.pop();
		z.zap();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.toString();
		z.toString();
    }
    @Test
    public void test988() {
		C3 x = new C3();
		x.toString();
		x.pop();
		x.toString();
		x.pop();
		x.pop();
    }
    @Test
    public void test989() {
		C3 variable = new C3();
		assertEquals("Aloha", variable.toString());
		assertEquals("BZZZZZZZ!", variable.zap());
		assertEquals("ZAP!", variable.zap());
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.pop();
		variable.pop();
		variable.zap();
		assertEquals(-1, variable.pop());
		variable.toString();
		variable.pop();
		variable.pop();
		variable.zap();
		assertEquals("BZZZZZZZ!", variable.zap());
		variable.zap();
		variable.pop();
    }
    @Test
    public void test990() {
		C3 z = new C3();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.pop();
		z.zap();
		z.pop();
		assertEquals("Aloha", z.toString());
		z.zap();
		z.zap();
    }
    @Test
    public void test991() {
		C3 Var = new C3();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
    }
    @Test
    public void test992() {
		C3 y = new C3();
		y.zap();
		y.toString();
		assertEquals("ZAP!", y.zap());
		assertEquals("Aloha", y.toString());
		y.toString();
		y.zap();
    }
    @Test
    public void test993() {
		C3 y = new C3();
		assertEquals("Aloha", y.toString());
		y.toString();
		assertEquals("BZZZZZZZ!", y.zap());
		y.toString();
		y.zap();
		y.toString();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.zap();
		y.zap();
		y.pop();
		y.toString();
		assertEquals(-1, y.pop());
		y.toString();
    }
    @Test
    public void test994() {
		C3 x = new C3();
		x.zap();
		x.zap();
		assertEquals("Aloha", x.toString());
		x.pop();
		x.pop();
		x.zap();
    }
    @Test
    public void test995() {
		C3 z = new C3();
		z.pop();
		z.toString();
		z.toString();
		assertEquals("Aloha", z.toString());
		z.pop();
		assertEquals("BZZZZZZZ!", z.zap());
		z.pop();
		z.toString();
    }
    @Test
    public void test996() {
		C3 Var = new C3();
		Var.pop();
		assertEquals("BZZZZZZZ!", Var.zap());
		Var.zap();
    }
    @Test
    public void test997() {
		C3 variable = new C3();
		variable.zap();
		variable.pop();
    }
    @Test
    public void test998() {
		C3 Var = new C3();
		Var.pop();
		assertEquals(-1, Var.pop());
		Var.toString();
		Var.toString();
		assertEquals(-1, Var.pop());
		assertEquals("Aloha", Var.toString());
		Var.pop();
		Var.zap();
		assertEquals("ZAP!", Var.zap());
		Var.zap();
    }
    @Test
    public void test999() {
		C3 y = new C3();
		y.zap();
		assertEquals("ZAP!", y.zap());
		y.pop();
		assertEquals("Aloha", y.toString());
		y.pop();
		assertEquals("Aloha", y.toString());
		y.zap();
		y.zap();
		y.pop();
		y.pop();
		y.pop();
    }
}


/********************************************
 * Project ZUnit that is personalized/miniaturized
 * JUnit.
 *
 * Created by: Lasse J. Kongsdal
 * Date: 19-10-2020
 *
 * ZUnit can test basic equations and alike
 * all from int, double and long to Strings.
 ********************************************/

import ZUnit.TestSuite;

public class TestClass extends TestSuite {

    public static void main(String[] args) {

        TestClass testClass = new TestClass();
        testClass.runTestSuite();

    }

    @Override
    public void testMethodList() {

        testThis1();
        testThis2();
        testThis3();
        testThis4();
        testThis5();

    }

    public void testThis1() {
        int result = 5;
        claimEqual(5, result);
    }

    public void testThis2() {
        int result = 7;
        claimEqual(5, result);
    }

    public void testThis3() {
        int result = 16;
        claimEqual(16, result);
    }

    public void testThis4() {
        int result = 14;
        claimEqual(14, result);
    }

    public void testThis5() {
        String result = "Hello";
        claimEqual("hello", result);
    }


}

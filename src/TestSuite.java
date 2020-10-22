/********************************************
 * Project description
 *
 * Created by: Lasse J. Kongsdal
 * Date: 19-10-2020
 *
 * Description of program
 ********************************************/

abstract public class TestSuite {

    private int numberOfTests;
    private int numberOfPassedTests;

    public void runTestSuite() {
        testMethodList();
        // prints a summary of the test results
        System.out.printf("\u001B[0m\nNumber of Tests: %d\nNumber of Tests passed: %d\nNumber of Tests Failed: %d", numberOfTests, numberOfPassedTests, numberOfTests - numberOfPassedTests);
    }

    abstract public void testMethodList();

    public void claimEqual(String expected, String actual) {
        numberOfTests++;
        if (expected.equals(actual)) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            // gets the name of the method getting tested and the line where the test is called from
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %s\n  Actual output: %s\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(int expected, int actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(double expected, double actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %f\n  Actual output: %f\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(short expected, short actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(byte expected, byte actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(long expected, long actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(char expected, char actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %s\n  Actual output: %s\n", name, linePos, expected, actual);
        }
    }

    public void claimEqual(float expected, float actual) {
        numberOfTests++;
        if (expected == actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %f\n  Actual output: %f\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(String expected, String actual) {
        numberOfTests++;
        if (!(expected.equals(actual))) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %s\n  Actual output: %s\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(int expected, int actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(double expected, double actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %f\n  Actual output: %f\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(short expected, short actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(byte expected, byte actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(long expected, long actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %d\n  Actual output: %d\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(char expected, char actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %s\n  Actual output: %s\n", name, linePos, expected, actual);
        }
    }

    public void claimNotEqual(float expected, float actual) {
        numberOfTests++;
        if (expected != actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + expected + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %f\n  Actual output: %f\n", name, linePos, expected, actual);
        }
    }

    public void claimTrueBoolean(boolean actual) {
        numberOfTests++;
        if (actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + true + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %b\n  Actual output: %b\n", name, linePos, true, actual);
        }
    }

    public void claimFalseBoolean(boolean actual) {
        numberOfTests++;
        if (!actual) {
            System.out.println("\u001B[0m\nPASS:\n  Expected output: " + false + "\n  Actual output: " + actual);
            numberOfPassedTests++;
        } else  {
            String name = Thread.currentThread().getStackTrace()[2].getMethodName();
            int linePos = Thread.currentThread().getStackTrace()[2].getLineNumber();
            System.out.printf("\u001B[31m\nFAIL:\n MethodName: %s Fail found at line: %d\n  Expected output: %b\n  Actual output: %b\n", name, linePos, false, actual);
        }
    }

}

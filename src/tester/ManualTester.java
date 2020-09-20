package tester;

public class ManualTester implements Tester {
    @Override
    public void testStuff() {
        System.out.println("Testing things manually");
    }

    @Override
    public void proveValidity() {
        System.out.println("Send results to test engineer");
    }
}

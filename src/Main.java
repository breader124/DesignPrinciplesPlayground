public class Main {
    public static void main(String[] args) {
        testEagerSingleton();
        testDoubleCheckedLockingSingleton();
        testInitializationHolderSingleton();
        testEnumSingleton();
    }

    private static void testEagerSingleton() {
        EagerSingleton first = EagerSingleton.getInstance();
        EagerSingleton second = EagerSingleton.getInstance();

        System.out.print("Testing eager singleton: ");
        System.out.println(first == second);
    }

    private static void testDoubleCheckedLockingSingleton() {
        DoubleCheckedLockingSingleton first = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton second = DoubleCheckedLockingSingleton.getInstance();

        System.out.print("Testing double checked locking singleton: ");
        System.out.println(first == second);
    }

    private static void testInitializationHolderSingleton() {
        InitializationHolderSingleton first = InitializationHolderSingleton.getInstance();
        InitializationHolderSingleton second = InitializationHolderSingleton.getInstance();

        System.out.print("Testing initialization holder singleton: ");
        System.out.println(first == second);
    }

    private static void testEnumSingleton() {
        EnumSingleton first = EnumSingleton.INSTANCE;
        EnumSingleton second = EnumSingleton.INSTANCE;

        System.out.print("Testing enum singleton: ");
        System.out.println(first == second);
    }
}

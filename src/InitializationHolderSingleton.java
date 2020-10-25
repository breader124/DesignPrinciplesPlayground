public class InitializationHolderSingleton {
    private static class Holder {
        private static final InitializationHolderSingleton INSTANCE = new InitializationHolderSingleton();
    }

    public static InitializationHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private InitializationHolderSingleton() { }
}

package developer;

public class JavaDeveloper implements Developer {
    @Override
    public void implementStuff() {
        System.out.println("Implementing Java stuff");
    }

    @Override
    public void learnNewLanguage() {
        System.out.println("Learning Scala");
    }
}

package singleton;

public class SingletonRunner {

    public static void main(String[] args) {
        EagerInitializedSingleton instance = EagerInitializedSingleton.getInstance();
        System.out.println(instance);
    }
}

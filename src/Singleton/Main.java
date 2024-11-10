package Singleton;

public class Main {

    public static void main(String[] args) {

        StaticBlockSingleton singleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton singleton2 = StaticBlockSingleton.getInstance();

        System.out.println("singleton1 hashCode = " + singleton1.hashCode());
        System.out.println("singleton2 hashCode = " + singleton2.hashCode());

        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("References point to different instances.");
        }
    }
}

package SuperKeyword;

public interface WaitUnitUtils {
    static void waitUntil() {
        System.out.println("Static methods");
    }

    default void Login() {
        System.out.println("Default method");
    }
    static void logout(){
        System.out.println("Logout Method");
    }
}
//interface can have default and static method variables
//abstraction
/**
 * Noninstantiability
 */
public class Noninstantiability {

    public static void main(String[] args) {
        UtilityClass.sayHello();
    }

}

class UtilityClass {
    private UtilityClass() {
        throw new AssertionError();
    }

    public static final void sayHello() {
        System.out.println("Hello");
    }
}
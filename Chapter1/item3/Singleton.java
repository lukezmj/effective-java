/**
 * Singleton
 */
public class Singleton {

    public static void main(String[] args) {
        // static factory
        ElvisStaticFactory instanceStaticFactory1 = ElvisStaticFactory.getInstance();
        ElvisStaticFactory instanceStaticFactory2 = ElvisStaticFactory.getInstance();

        System.out.println(instanceStaticFactory1 == instanceStaticFactory2);

        //enum
        ElvisEnum.INSTANCE.returnAddress();
        ElvisEnum.INSTANCE.returnAddress();
    }

}

// Singleton with static factory
class ElvisStaticFactory {
    private static final ElvisStaticFactory INSTANCE = new ElvisStaticFactory();

    private ElvisStaticFactory() {
    }

    public static ElvisStaticFactory getInstance() {
        return INSTANCE;
    }

}

enum ElvisEnum {
    INSTANCE;

    public void returnAddress() {
        System.out.println(INSTANCE.hashCode());
    }
}
import java.lang.reflect.Array;
import java.time.Instant;
import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/**
 * CreateDestroyObjects
 */
public class CreateDestroyObjects {

    public static void main(String[] args) {
        staticFactoryMethods();
    }

    private static void staticFactoryMethods() {
        // Date.from 
        // a type-conversion method returns corresponding instance of this type
        Date d = Date.from(Instant.now());
        System.out.println(d.toString());

        //Enum.of()
        Set<Rank> faceCards = EnumSet.of(Rank.JACK, Rank.QUEEN, Rank.KING);
        for (Rank rank : faceCards) {
            System.out.println(rank.toString());
        }

        //Array.newInstance()
        int arrayLen = 3;
        String[] newArray = (String[]) Array.newInstance(String.class, arrayLen);
        Array.set(newArray,0,"Jack");
        Array.set(newArray,1,"Queen");
        Array.set(newArray,2,"King");
        for (String string : newArray) {
            System.out.println(string);
        }
    }

    public enum Rank {
        JACK("Jack"), QUEEN("Queen"), KING("King");

        private String card;

        Rank(String card) {
            this.card = card;
        }

        @Override
        public String toString() {
            return this.card;
        }
    }

}
import java.util.Objects;

/**
 * DependencyInjection
 */
public class DependencyInjection {

    public static void main(String[] args) {
        Lexicon dictionary = new Chinese(); 
        SpellChecker checker = new SpellChecker(dictionary);
        System.out.println(checker.isValid("Hello"));

        Lexicon dictionary2 = new English(); 
        SpellChecker checker2 = new SpellChecker(dictionary2);
        System.out.println(checker2.isValid("Hello"));
    }    
}

class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public boolean isValid(String word) { return dictionary.wordValid(); }
}

interface Lexicon {
    public boolean wordValid();
}

class Chinese implements Lexicon{

    @Override
    public boolean wordValid() {
        // TODO Auto-generated method stub
        return true;
    }

}

class English implements Lexicon {

    @Override
    public boolean wordValid() {
        // TODO Auto-generated method stub
        return false;
    }

}
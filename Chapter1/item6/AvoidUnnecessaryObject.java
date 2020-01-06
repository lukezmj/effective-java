import java.util.regex.Pattern;

/**
 * AvoidUnnecessaryObject
 */
public class AvoidUnnecessaryObject {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("执行代码块/方法");
        for (int i = 0; i < 10000; i++) {
            RomanNumerals.isRomanNumeral("IV");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime - startTime) + "ms");
        long startTime1 = System.currentTimeMillis();
        System.out.println("执行代码块/方法");
        for (int i = 0; i < 10000; i++) {
            RomanNumerals.isRomanNumeralPoor("IV");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime1 - startTime1) + "ms");

        // autoboxing and unboxing
        long startTime3 = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime3 - startTime3) + "ms");

        // autoboxing and unboxing
        long startTime4 = System.currentTimeMillis();
        long sum_primitive = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum_primitive += i;
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println("程序运行时间： " + (endTime4 - startTime4) + "ms");
    }
}

/**
 * Reusing expensive object for improved performance
 */
class RomanNumerals {
    private static final Pattern ROMAN = Pattern
            .compile("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    // preferred
    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    static boolean isRomanNumeralPoor(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})" + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
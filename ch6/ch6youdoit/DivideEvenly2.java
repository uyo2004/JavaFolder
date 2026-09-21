// Uyoojo Okene
// p. 222

public class DivideEvenly2 {

    public static void main(String[] args) {
        final int limit = 100;
        int var;
        int number;
        for (number = 1; number <= limit; ++number) {
        System.out.println(number + "is evenly divisible by ");
        for(var = 1; var <= number; ++var)
            if (number % var == 0)
                System.out.print(var + " ");
            }
            System.out.println();
    }
}

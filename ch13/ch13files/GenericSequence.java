// Uyoojo Okene
// p.534



public class GenericSequence {

    public static void main(String[] args) {

        // Declare variables of different data types
        Character letter = 'A';
        Integer number = 0;
        Double decimal = 21.34;
        String word = "Hello";

        // Call the generic method four times
        duplicate(letter, 5);
        duplicate(number, 9);
        duplicate(decimal, 4);
        duplicate(word, 7);
    }

    // Generic method to duplicate objects
    public static <T> void duplicate(T object, int times) {

        for (int i = 0; i < times; i++) {
            System.out.print(object + " ");
        }

        System.out.println();
    }
}


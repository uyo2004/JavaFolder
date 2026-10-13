// Uyoojo oKENE
// P.494


public class CountingDownDemo {

    public static void main(String[] args) {

        // Call the recursive method starting at 10
        countingDown(10);

        // Display message after countdown
        System.out.println("Blastoff!");
    }

    // Recursive method to count down
    public static void countingDown(int number) {

        if (number > 0) {

            System.out.println(number);

            // Call the method again with a smaller number
            countingDown(number - 1);
        }
    }
}

// Uyoojo Okene
// P.387


import java.util.Scanner;

public class UseBook {

    public static void main(String[] args) {

        // Enter fiction book title
        try (Scanner input = new Scanner(System.in)) {
            // Enter fiction book title
            System.out.print("Enter a fiction book title: ");
            String fictionTitle = input.nextLine();
            
            // Enter nonfiction book title
            System.out.print("Enter a nonfiction book title: ");
            String nonFictionTitle = input.nextLine();
            
            // Create book objects
            Fiction fictionBook = new Fiction(fictionTitle);
            NonFiction nonFictionBook = new NonFiction(nonFictionTitle);
            
            // Display fiction book information
            System.out.println("\nFiction Book");
            System.out.println("Title: " + fictionBook.getTitle());
            System.out.printf("Price: $%.2f%n", fictionBook.getPrice());
            
            // Display nonfiction book information
            System.out.println("\nNonfiction Book");
            System.out.println("Title: " + nonFictionBook.getTitle());
            System.out.printf("Price: $%.2f%n", nonFictionBook.getPrice());
        }
    }
}


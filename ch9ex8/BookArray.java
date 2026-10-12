// Uyoojo Okene
// p.387


import java.util.Scanner;

public class BookArray {

    public static void main(String[] args) {

        // Create an array for 10 books
        try (Scanner input = new Scanner(System.in)) {
            // Create an array for 10 books
            Book[] books = new Book[10];
            
            // Enter information for each book
            for (int i = 0; i < books.length; i++) {
                
                System.out.println("\nBook " + (i + 1));
                
                System.out.print("Enter book title: ");
                String title = input.nextLine();
                
                String type;
                
                // Ask for a valid book type
                while (true) {
                    
                    System.out.print(
                            "Enter book type (F for Fiction, N for Nonfiction): "
                    );
                    
                    type = input.nextLine().trim().toUpperCase();
                    
                    if (type.equals("F") || type.equals("N")) {
                        break;
                    }
                    
                    System.out.println(
                            "Invalid choice. Please enter F or N."
                    );
                }

                // Create the appropriate book
                if (type.equals("F")) {
                    books[i] = new Fiction(title);
                } else {
                    books[i] = new NonFiction(title);
                }
            }
            
            // Display all 10 books
            System.out.println("\n===== BOOK DETAILS =====");
            
            for (int i = 0; i < books.length; i++) {
                
                System.out.println("\nBook " + (i + 1));
                
                System.out.println(
                        "Title: " + books[i].getTitle()
                );
                
                if (books[i] instanceof Fiction) {
                    System.out.println("Type: Fiction");
                } else {
                    System.out.println("Type: Nonfiction");
                }
                
                System.out.printf(
                        "Price: $%.2f%n", books[i].getPrice()
                );
            }
        }
    }
}


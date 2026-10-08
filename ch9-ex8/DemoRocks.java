// Uyoojo Okene
// p.387

import java.util.Scanner;

public class DemoRocks
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
            char rockType;
            int sampleNumber;
            double weight;
            Rock rock;
            
            System.out.print("Enter rock type (U, I, S, or M): ");
            rockType = input.nextLine().toUpperCase().charAt(0);
            
            if(rockType == 'U' || rockType == 'I' ||
                    rockType == 'S' || rockType == 'M')
            {
                System.out.print("Enter sample number: ");
                sampleNumber = input.nextInt();
                
                System.out.print("Enter weight in grams: ");
                weight = input.nextDouble();
                
                rock = switch (rockType) {
                    case 'I' -> new IgneousRock(sampleNumber, weight);
                    case 'S' -> new SedimentaryRock(sampleNumber, weight);
                    case 'M' -> new MetamorphicRock(sampleNumber, weight);
                    default -> new Rock(sampleNumber, weight);
                };
            }
            else
            {
                rock = new Rock(0, 0);
            }
            
            displayRock(rock);
        }
    }

    public static void displayRock(Rock rock)
    {
        System.out.println();
        System.out.println("Rock Sample Information");
        System.out.println("-----------------------");
        System.out.println("Sample Number: " + rock.getSampleNumber());
        System.out.println("Description: " + rock.getDescription());
        System.out.println("Weight: " + rock.getWeight() + " grams");
    }
}

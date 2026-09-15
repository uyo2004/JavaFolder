// Uyoojo Okene
// p.133

import java.util.Scanner;
public class CreateSpaServices {
 
    public static void main (String[] args) {
    
    SpaService firstService = new SpaService();
    SpaService secondService = new SpaService();
    SpaService thirdService = new SpaService("Facial", 22.99);
    firstService = getData (firstService);
   // secondService = getData (secondService);
    System.out.println("The first service details: ");
    System.out.println(firstService.getServiceName() + " " + firstService.getServicePrice());
    System.out.println("The second service details: ");
    System.out.println(secondService.getServiceName() + " " + secondService.getServicePrice());
    System.out.println("The third service details: ");
    System.out.println(thirdService.getServiceName() + " " + thirdService.getServicePrice());
    }
    public static SpaService getData(SpaService service) {
        String serviceName;
        double servicePrice;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter the name of the service: ");
            serviceName = keyboard.nextLine();
            System.out.print("Enter the price of the service: ");
            servicePrice = keyboard.nextDouble();
            service.setServiceName(serviceName);
            service.setServicePrice(servicePrice);
            keyboard.nextLine(); // consume the newline character
        }
        return service;
    }


}
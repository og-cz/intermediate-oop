import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Iphone model: ");
        String iphoneModel = scanner.nextLine().toUpperCase();

        System.out.print("Enter IOS version: ");
        String iphoneIos = scanner.nextLine().toUpperCase();

        System.out.print("Enter Iphone bought year: ");
        int iphoneYear = scanner.nextInt();
        scanner.nextLine();
        
        
        Iphone iphone = new Iphone(iphoneModel, iphoneIos, iphoneYear);

        System.out.println("\nIphone Information:");
        iphone.displayInfo();
     
    }
}

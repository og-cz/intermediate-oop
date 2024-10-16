import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Iphone model: ");
        String model = scanner.nextLine();

        System.out.print("Enter OS version: ");
        String os = scanner.nextLine();

        System.out.print("Enter Iphone bought year: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter Face ID: ");
        String faceId = scanner.nextLine();
        
        Iphone iphone = new Iphone(model, os, year, faceId);

        System.out.println("\nIphone Information:");
        iphone.displayInfo();
    }
}

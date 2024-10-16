import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Input a Country: Philippines, Brazil, Mexico, Japan, China");
        String inputCountry = scanner.nextLine();
        System.out.println("---------------------------------");

        // Create Population object based on input country
        Population population = new Population(inputCountry);

        // Display population info
        population.displayInfo();
    }
}

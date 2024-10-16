import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st Grade: ");
        String taskOne = scanner.nextLine();

        System.out.print("2nd Grade: ");
        String taskTwo = scanner.nextLine();

        System.out.print("3rd Grade: ");
        int taskThree = scanner.nextInt();
        scanner.nextLine();
        
        
        Formula formula = new Formula(taskOne, taskTwo, taskThree);

        System.out.println("\nResults:");
        formula.displayInfo();

        scanner.close();
    }
}

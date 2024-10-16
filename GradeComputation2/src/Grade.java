import java.util.Scanner;
import java.util.InputMismatchException;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println ("Maximum score you can input!");
        System.out.println("---------------------------------");
        System.out.println ("50 for Tasks (30%)");
        System.out.println ("100 for Long Exam (20%)");
        System.out.println ("100 for Group Exam (20%)");
        System.out.println ("100 for the Final Exam (30%)");
        System.out.println("---------------------------------");
        System.out.println("\"Grade Input Computation\"");
        int tsk1, tsk2, tsk3, tsk4, tsk5, peta1, peta2, finals;
 
        try {
            System.out.print("Enter Task 1 Score: ");
            tsk1 = scanner.nextInt();
            if (tsk1 > 50) {
                throw new InputMismatchException();
            }
 
            System.out.print("Enter Task 2 Score: ");
            tsk2 = scanner.nextInt();
            if (tsk2 > 50) {
                throw new InputMismatchException();
            }
 
            System.out.print("Enter Task 3 Score: ");
            tsk3 = scanner.nextInt();
            if (tsk3 > 50) {
                throw new InputMismatchException();
            }
 
            System.out.print("Enter Task 4 Score: ");
            tsk4 = scanner.nextInt();
            if (tsk4 > 50) {
                throw new InputMismatchException();
            }
 
            System.out.print("Enter Task 5 Score: ");
            tsk5 = scanner.nextInt();
            if (tsk5 > 50) {
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for tasks! Please enter a number less than or equal to 50.");
            return;
        }
 
        try {
            System.out.print("Enter Performance Task 1 Score: ");
            peta1 = scanner.nextInt();
            if (peta1 > 100) {
                System.out.println("Your score cannot exceed 70.");
                return;
            }
 
            System.out.print("Enter Performance Task 2 Score: ");
            peta2 = scanner.nextInt();
            if (peta2 > 100) {
                System.out.println("Your score cannot exceed 80.");
                return;
            }
 
            System.out.print("Enter Finals Exam Score: ");
            finals = scanner.nextInt();
            if (finals > 100) {
                System.out.println("Your score cannot exceed 100.");
                return;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input for performance tasks or finals. Please enter valid scores.");
            return;
        }
 
        Computation input = new Computation(tsk1, tsk2, tsk3, tsk4, tsk5, peta1, peta2, finals);
      //  System.out.println("\nTotal Grade:");
        input.displayGrade();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user for input
        System.out.println("Choose an animal (1 for Dog, 2 for Cat):");
        int choice = scanner.nextInt();

        // Creating objects of Dog and Cat based on user's choice
        Animal animal;
        if (choice == 1) {
            animal = new Dog();
        } else if (choice == 2) {
            animal = new Cat();
        } else {
            System.out.println("Invalid choice. Exiting...");
            return;
        }

        // Displaying output based on the chosen animal
        System.out.println("\nAnimal:");
        animal.makeSound();
        animal.eat();
    }
}

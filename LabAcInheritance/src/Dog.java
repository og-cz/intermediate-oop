public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks!");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

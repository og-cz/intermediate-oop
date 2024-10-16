import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("Area Calculator! Input shape either Rectangle, Circle, or Triangle");
		// input shape choose
		String inpShape = x.nextLine();
		System.out.println();
		
		// choose shape for calculation
		switch(inpShape.toLowerCase()) {
			case "rectangle":
			case "rec":
				System.out.println("Rectangle Calculator");
				System.out.print("Input Length: ");
				int recLength = x.nextInt();
				System.out.print("Input Width: ");
				int recWidth = x.nextInt();
			return;
			case "circle":
			case "cir":
				System.out.println("Circle Calculator");
				System.out.print("Input pi: ");
				int cirPi = x.nextInt();
			return;
			case "triangle":
			case "tri":
				System.out.println("Triangle Calculator");
				System.out.print("Input base: ");
				int triBase = x.nextInt();
				System.out.print("Input Height: ");
				int triHeight = x.nextInt();
			default:
				System.out.println("Invalid Input");
			break;
			

		}
		

	}

}

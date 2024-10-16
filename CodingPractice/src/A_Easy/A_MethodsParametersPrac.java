package A_Easy;

public class A_MethodsParametersPrac {

	public static void main(String[] args) {
		
		print("Hello");
		
		boolean t = true;
		print(t);
		
		print(10, 6, "OG");
		
		print("");
		nestMethod();
		print("");
		nestMethods(t);
	}

	static void print(String word) {
		System.out.println(word);
	}
	
	static boolean print(boolean t) {
		if(!t == true)  System.out.println("true");
		return t;
	}
	
	static int print(int num1, int num2, String name) {
		int sum = num1 + num2;
		System.out.println(name + ", you are age is " + sum);
		return sum;
	}
	
	static int print(int num1, int num2) {
		return num1 + num2;
	}
	
	// method on method
	static void nestMethod() {
		print("Nested Method Upcoming!");
		print(20, 20);		
	}
	
	// trying complications
	static void nestMethods(boolean t) {
		int sum = print(20, 20);		
		if(!t == true) {
			print("False");
		} else {
			if(sum == 40) print("Thumbs Up");
		}
	}
	
	
}

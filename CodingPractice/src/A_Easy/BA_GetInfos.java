package A_Easy;

public class BA_GetInfos {

	public static void main(String[] args) {

		
		// this class instantite
		BB_Infos i = new BB_Infos();
		String hello = i.hello;
		System.out.println(hello);
		
		// other class
		BB_Infos i2 = new BB_Infos("Hi");
		String hi = i2.hi;
		System.out.println(hi);
		
		BB_Infos i3 = new BB_Infos();
		String age = i3.age2;
		String name = i3.name2;
		
		System.out.println(i3.age2 + " age of " + name);
		
	}

	// Constructors on the main
	 String age;
	 String name;
		
	BA_GetInfos(String name, String age) {
		this.name = name;
		this.age = age;
		
	}
}

package A_Easy;

public class BB_Infos {
	
	public String hello = "Hello";
	BB_Infos() {
	}
		
	String hi;
	BB_Infos(String hi) {
		this.hi = hi;
	}
	
	BA_GetInfos gi = new BA_GetInfos("Carl", "18");
	String age2 = gi.age;
	String name2 = gi.name;
}

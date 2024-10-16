
class CustomerDetails {
	private String name;
	private int year;
	private char sex;
	private String nationality;
	private String civilstatus;
	private String country;
	
	// NAME
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
		
	// YEAR
	public void setYear(int newYear) {
		year = newYear;
	}
	public int getYear() {
		return year;
	}
		
	// SEX
	public void setSex(char newSex) {
		sex = newSex;
	}
	public char geSex() {
		return sex;	
	}
		
	// NATIONALITY
	public void setNationality(String newNationality) {
		nationality = newNationality;
	}
	public String getNationality() {
		return nationality;
	}
		
	// CIVIL STATUS
	public void setCivilstatus(String newCivilstatus) {
		civilstatus = newCivilstatus;
	}
	public String getCivilstatus() {
		return civilstatus;
	}
	
	// COUNTRY
	public void setCountry(String newCountry) {
		country = newCountry;
	}
	public String getCountry() {
		return country;
	}
 
}
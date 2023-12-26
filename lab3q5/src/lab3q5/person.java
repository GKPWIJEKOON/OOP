package lab3q5;

public class person {
	
	private String name,address;
	
	public person(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public void displaypersondetails() {
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
	}
	
	

}

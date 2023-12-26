package lab3q5;

public class student extends person{
	
	private String stuid;
	
	public student(String name ,String address,String stuid ) {
		
		super(name,address);
		this.stuid=stuid;
	}
	public void displaystudentdetails() {
		super.displaypersondetails();
		System.out.println("Student ID :"+stuid);
	}

}

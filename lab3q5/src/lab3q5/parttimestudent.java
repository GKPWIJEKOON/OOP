package lab3q5;

public class parttimestudent extends student {
	private String sub;
	
	public parttimestudent(String name ,String address,String stuid,String sub) {
		super (name ,address,stuid);
		this.sub=sub;
	}
	public void displaypartstudetails() {
		super.displaystudentdetails();
		System.out.println("Subject :"+sub);
	}
}

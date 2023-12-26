package lab3q2;

public class student {
	String name;
    String studentId;
    String address;
    
    public student() {
    	
    }

    public student(String name, String studentId, String address) {
        this.name = name;
        this.studentId = studentId;
        this.address = address;
    }
    public void displaydetails() {
    	System.out.println("\nName :"+name);
    	System.out.println("Stu ID :"+studentId);
    	System.out.println("Address :"+address);
    }

}

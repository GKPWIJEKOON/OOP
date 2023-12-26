package lab3q3;

public class student {
    private String name;
    private String address;
    private String dit;

    
    public student(String name, String address, String dit) {
        this.name = name;
        this.address = address;
        this.dit = dit;
    }

  
  
    public void  displaydetails() {
    	 System.out.println("Name: " +name );
	     System.out.println("Student ID: " +address );
    	
    }
}

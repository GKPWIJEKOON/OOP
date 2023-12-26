package lab3q9;

public class cat extends pet{
	private int live;
	
	public cat(String name, String owner) {
		super(name, owner);
		this.live=50;
	}
	public cat(String name, String owner ,int live) {
		super(name,owner);
		this.live=live;
	}
	public void displaycatdetails() {
		super.displaypetDetails();
		System.out.println("lives :"+live);
	}

}

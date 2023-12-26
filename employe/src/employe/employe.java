package employe;


public class employe 
	{
	    private int empno;
	    private String empname;
	    private float basicsalary;
	    
	    public void setvalue(int eno,String en , float bs )
	    {
	        empno=eno;
	        empname=en;
	        basicsalary=bs;
	    }
	    public void display()
	    {
	        System.out.println("Employe no :"+empno);
	        System.out.println("Employe name :"+empname);
	        System.out.println("basic salary :"+basicsalary);
	        System.out.println();
	    }

}

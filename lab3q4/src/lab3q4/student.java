package lab3q4;

public class student {
    private String name;
    private String address;
    private String dit;

    
    public student(String name, String address, String dit) {
        this.name = name;
        this.address = address;
        this.dit = dit;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }

    public void setDit(String dit) {
        this.dit = dit;
    }
    public String getDit() {
        return dit;
    }   
    public String getDetails() {
        return "I am a Student.\n" + "My name is " + name + ".\n" +"I am from " + address + ".\n" + "My dit no is " + dit+"\n";
    }
}


package oops_concepts.Encapsulation;

public class Main {
    public static void main(String[] args) {
        PersonalData personal = new PersonalData();
        personal.setName("Ram");
        personal.setDOB("08/04/2004");
        personal.setEmail("ram@123");

        personal.getName();
        personal.getEmail();
        personal.getDOB();
    }
}

class PersonalData{
    private String name;
    private String DOB;

    private String email;

    public void  getName() {
        System.out.println("The name is "+ name);
    }

    public void getDOB() {
        System.out.println("The DOB is "+ DOB);
    }

    public void getEmail() {
        System.out.println("The Email is "+email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

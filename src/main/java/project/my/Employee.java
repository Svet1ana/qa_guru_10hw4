package project.my;

public class Employee {
    String firstName;
    String LastName;
    int age;
    int workExperienceInCompany;

    public void setAge(int age) {
        this.age = age;
    }

    public void setWorkExperienceInCompany(int workExperienceInCompany) {
        this.workExperienceInCompany = workExperienceInCompany;
    }

    public int getAge() {
        return age;
    }

    public int getWorkExperienceInCompany() {
        return workExperienceInCompany;
    }

    public String getFullName() {
        return firstName +' ' + LastName;
    }

    public void sayName() {
        System.out.println("Name: " + this.firstName);
    }

    public void sayFullName() {
        System.out.println("Full Name: " + this.getFullName());
    }

    public void sayAge() {
        System.out.println("Age: " + this.getAge());
    }

    public void sayWorkExperienceInCompany() {
        System.out.println("Experience: " + this.getWorkExperienceInCompany());
    }
}

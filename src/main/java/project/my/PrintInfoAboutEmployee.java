package project.my;

public class PrintInfoAboutEmployee {

    public void infoAbout(Employee employee) {
        this.sayName(employee);
        this.sayFullName(employee);
        this.sayAge(employee);
        this.sayWorkExperienceInCompany(employee);
    }

    private void sayName(Employee employee) {
        System.out.println("Name: " + employee.firstName);
    }

    private void sayFullName(Employee employee) {
        System.out.println("Full Name: " + employee.getFullName());
    }

    private void sayAge(Employee employee) {
        System.out.println("Age: " + employee.getAge());
    }

    private void sayWorkExperienceInCompany(Employee employee) {
        System.out.println("Experience: " + employee.getWorkExperienceInCompany());
    }
}

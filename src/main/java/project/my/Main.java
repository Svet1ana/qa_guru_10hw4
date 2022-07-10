package project.my;

public class Main {
    public static void main(String[] args) {
        PrintInfoAboutEmployee printInfo = new PrintInfoAboutEmployee();

        Employee employee1 = new Employee();
        employee1.firstName = "Andy";
        employee1.LastName = "Larkin";
        employee1.setAge(25);
        employee1.setWorkExperienceInCompany(5);

        Employee employee2 = new Employee();
        employee2.firstName = "Tom";
        employee2.LastName = "Soyer";
        employee2.setAge(30);
        employee2.setWorkExperienceInCompany(7);

        // way number 1
        employee1.sayName();
        employee1.sayFullName();
        employee1.sayAge();
        employee1.sayWorkExperienceInCompany();

        // way number 2, with use PrintInfoAbout Employee class
        printInfo.infoAbout(employee2);

    }
}
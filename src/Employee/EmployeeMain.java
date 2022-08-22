package Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        DeveloperClass developer = new DeveloperClass();
        developer.name  ="Alper ";
        developer.isFullTime = true;
        developer.salary = 140_000;
        developer.develop();
        developer.featuresCreated = true;

        TesterClass tester = new TesterClass();
        tester.name = developer.name;
        tester.work();
        tester.isBugFound = true;
        tester.test();
        tester.isBugFound = false;


        EmployeeClass employee = new EmployeeClass();
        employee.name = "Alper";
        employee.isFullTime = true;
        employee.salary = 145_000;

        employee.work();


    }
}

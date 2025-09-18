public class Programmer extends Employee{
    int workingHours;
    double hourlyRate;

    Programmer(String name, int workingHours, double hourlyRate){
        super(name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;

    }
    @Override
    double calculateSalary() {
        return workingHours * hourlyRate;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("working Hours: " + workingHours);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

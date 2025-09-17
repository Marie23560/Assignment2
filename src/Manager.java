  public class Manager extends Employee{
     double basesalary;
     double bonus;

     Manager(String name,double basesalary , double bonus){
         super(name);
         this.basesalary = basesalary;
         this.bonus = bonus;

     }
    @Override
     double calculateSalary() {
         return  basesalary + bonus;
     }

     @Override
     void displayInfo() {
         System.out.println("Manager Name: " + name);
         System.out.println("Base Salary: " + basesalary);
         System.out.println("Bonus: " + bonus);
         System.out.println("Total Salary " + calculateSalary());

     }
 }

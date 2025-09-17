public class Main {
    public class TestEmployee{

    }
    public static void main(String[] args) {
        Manager m = new Manager("Roxanne",8500,1400);
        Programmer p = new Programmer("Daniella",4300,560);

        m.displayInfo();
        System.out.println();
        p.displayInfo();
    }
}
public class TestEmployee {
    public static  void  main(String[] args){
        try {
            Manager m = new Manager("keza",4509,-320);
            m.displayInfo();
        }catch (IllegalArgumentException e){
            System.out.println("error creating Manager:" + e.getMessage());
        }
        try {
            Programmer p = new Programmer("kelvin",150,23);
            p.displayInfo();
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating Programmer " + e.getMessage());
        }

    }
}

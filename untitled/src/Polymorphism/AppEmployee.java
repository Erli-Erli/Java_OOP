package Polymorphism;

public class AppEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("Erli",10, "Surabaya");
        System.out.println(employee.names);
        System.out.println(employee.Sum);
        System.out.println(employee.addess);

        employee = new Manager("Adi",20,null);
        System.out.println(employee.names);
        System.out.println(employee.Sum);

        employee = new VicePresident("Riko",22,"Bandung");
        System.out.println(employee.names);
        System.out.println(employee.Sum);
        System.out.println(employee.addess);

        result(new VicePresident("A",0,"Bandung"));
        result(new Employee("B",0,"Bandung"));
        result(new Manager("C",0,"Bandung"));
    }

    // untuk menggecek dan mengconversi object
    static void result( Employee employee) {
        // untuk menggecek object
       if (employee instanceof VicePresident) {
           // untuk mengconversi object
           VicePresident vicePresident = (VicePresident) employee;
           System.out.println("Hallo VP : " + vicePresident.names);
       } else if (employee instanceof Manager) {
           Manager manager = (Manager) employee;
           System.out.println("Hallo manager : " + manager.names);
       } else {
           System.out.println("Hallow Emplyee : " + employee.names);
       }

    }
}

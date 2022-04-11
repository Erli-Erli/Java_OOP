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

        result(new VicePresident("",0,"Bandung"));
        result(new Employee("",0,"Bandung"));
        result(new Manager("",0,"Bandung"));
    }

    static void result( Employee employee) {
        System.out.println("Alamat rumah kamu ada di : " + employee.addess);
    }
}

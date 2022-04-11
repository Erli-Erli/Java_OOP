package Polymorphism;

public class Employee {
    String names;
    int Sum;
    String addess;

    Employee(String names,int Sum, String addess){
        this.names = names;
        this.Sum = Sum;
        this.addess = addess;
    }
    public void value (Employee employee) {
        System.out.println("alamat tinggal anda : " + this.addess);
    }
}

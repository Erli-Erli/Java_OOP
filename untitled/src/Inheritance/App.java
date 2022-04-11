package Inheritance;

public class App {
    public static void main(String[] args) {

        Manager manager = new Manager("Otong");
        //manager.names = "Otong";
        manager.values("Adi waluyo");

        VicePresident vicePresident = new VicePresident("Riko");
        //vicePresident.names = "Riko";
        vicePresident.values("Keris nadi");


        System.out.println(manager.hasil());
        System.out.println(vicePresident.hasil());
        System.out.println(vicePresident.result());
    }
}

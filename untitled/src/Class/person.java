package Class;

public class person {
    public static void main(String[] args) {

        // cara membaut obeject

        var Home = new Home();
        var rumah = Home.age = 11;
        // Home.country = "India"
        Home.names = "Adi Waluyo";

        Home home = new Home(); // cara buat object

        Home home1;// cara membuat object
        home1 = new Home();
        home1.names = "Umi Maysaroh";

        // cara mengakses object
        System.out.println(Home.names);
        System.out.println(rumah);
        System.out.println(home1.country);

        // cara mengakses metod dalam java
        home1.SayHallo("Lia");
    }
}

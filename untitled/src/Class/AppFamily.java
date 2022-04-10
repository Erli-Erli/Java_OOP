package Class;

public class AppFamily {
    public static void main(String[] args) {

        // cara mengakses Construktor
         var family = new Family("Sunari","Bangka Belitung",5);
         var family2 = new Family("Erli","Adi",0);
        var family1 = new Family(null,null ,0);

        System.out.println(family2.names);
        System.out.println(family1.names);
        System.out.println(family.names);

        family.value("Adi");
    }
}

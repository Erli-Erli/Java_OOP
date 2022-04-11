package Class;

public class Family {
    String names;
    String Stay;
    int Familymembers;

    // cara membuat Construktor
    // kata kunci this digunakan untuk mengakses object saat ini
    Family(String names, String Stay, int Familymembers){
        this.names = names;
        this.Stay = Stay;
        this.Familymembers = Familymembers;
    }
    // digunkan this untuk mengakses data setalahnya (Overloading)
    Family(String names){
        this(names,null,0);
    }
    Family(){
        this(null,null,0);
    }
    void value(String names){
        System.out.println("Halo name saya : " + names + " nama anda : " + this.names);
    }
}

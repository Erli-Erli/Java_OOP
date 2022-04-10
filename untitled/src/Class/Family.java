package Class;

public class Family {
    String names;
    String Stay;
    int Familymembers;

    // cara membuat Construktor

    Family(String nama, String tinggal, int JumlahKeluarga){
        names = nama;
        Stay = tinggal;
        Familymembers = JumlahKeluarga;
    }
    // digunkan this untuk mengakses data setalahnya (Overloading)
    Family(String nama){
        this(nama,null,0);
    }
    Family(){
        this(null,null,0);
    }
    void value(String neme){
        System.out.println("Halo name saya : " + neme + " nama anda : " + names);
    }
}

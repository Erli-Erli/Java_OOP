package Test;

public class Sekolah {
    String namaSiwa;
    String NamaGuru;
    int JumlahGuru;
    int JumlahMurid;
    final String AlmtSekolah = "SMK 1 N bandung";

    Sekolah(String namaGuru, int JumlahGuru,String namaSiwa, int JumlahMurid ){
        this.NamaGuru = namaGuru;
        this.namaSiwa = namaSiwa;
        this.JumlahMurid = JumlahMurid;
        this.JumlahGuru = JumlahGuru;
    }

    String userNemes() {
        return "Umi may saroh";
    }

    void address(){
        System.out.println("Alamat Sekolah : " + AlmtSekolah);
    }
}

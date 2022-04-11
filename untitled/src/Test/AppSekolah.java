package Test;

public class AppSekolah {
    public static void main(String[] args) {

        Sekolah sekolah = new Sekolah("Supri Hatin",1,"Cika",2);

        System.out.println(sekolah.NamaGuru);
        System.out.println(sekolah.JumlahGuru);
        System.out.println(sekolah.namaSiwa);
        System.out.println(sekolah.JumlahMurid);
        sekolah.address();

        Murid murid = new Murid("Erli",2);
        System.out.println(murid.namaSiwa);
        System.out.println(murid.JumlahMurid);

        System.out.println(murid.result());
    }
}

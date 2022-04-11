package Inheritance;

public class VicePresident extends  Manager {

    VicePresident(String names){
        super(names);
    }

    void values(String nemes){
        System.out.println("Hallo : " + nemes + " Nama saya : " +  this.names);
    }

    @Override
    int hasil() {
        return 10;
    }

    // cara untuk mengakses data kembali di kelas parent
    int result(){
        return super.hasil();
    }
}

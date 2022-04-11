package Interface;

public class Avanza implements Car {

    public void names(String nemes) {
        System.out.println("Nama Mobil ini Adalah : " + nemes + " dan jumlahnya : " + sum());
    }
    public int sum() {
        return 5;
    }
}

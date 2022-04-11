package Abstract;

public class Car extends Animal{

    public Car(String nemes) {
        super(nemes);
    }

    @Override
    public void result() {
        System.out.println("Nama kucing itu adalah : " + nemes );
    }
}

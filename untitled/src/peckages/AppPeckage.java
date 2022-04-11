package peckages;

import peckages.Data.*;
import peckages.Produk.produk;

public class AppPeckage {
    public static void main(String[] args) {

        Main main = new Main();
        main.address = "Bandung";
        System.out.println(main.address);

        produk produk = new produk();
        produk.nemes = "Mie Goreng";
        System.out.println(produk.nemes);


    }
}

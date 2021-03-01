package com.Pojo;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Mobil merk = new Mobil();
        merk.setMobil_pertama("Volvo");
        merk.setMobil_kedua("Mercedes-Benz");
        merk.setMobil_ketiga("Volkswagen");
        merk.setMobil_keempat("Toyota");
        ArrayList<String> brand = new ArrayList<>();
        brand.add(merk.getMobil_pertama());
        brand.add(merk.getMobil_kedua());
        brand.add(merk.getMobil_ketiga());
        brand.add(merk.getMobil_keempat());
        //Print semua index
        for (String mbl : brand) {
            System.out.println("Mobil : " + mbl);
        }
        System.out.println("==========================");
        brand.remove(2); //Hapus index ke-2
        //Print semua index kecuali index ke-2
        for (String mbl : brand) {
            System.out.println("Mobil : " + mbl);
        }
    }
}
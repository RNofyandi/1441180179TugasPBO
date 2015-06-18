package com.rotimatahari;

/**
 * Created by TOSHIBA on 6/17/2015.
 */
public class TestUnit {
    public static void main(String[] args) {
//        buat objek rekening
        Rekening xxx = new Rekening(2000000.0);
        Nasabah yyy = new Nasabah("Resqy Nofyandi");

        System.out.printf(yyy.toString());
        yyy.setTabungan(xxx);
        System.out.printf("\n");
        System.out.printf(yyy.toString());

        xxx.tarik(10000000.0);
        System.out.printf(xxx.getSaldo());
    }
}

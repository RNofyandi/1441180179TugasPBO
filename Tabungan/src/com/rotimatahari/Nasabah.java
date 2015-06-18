package com.rotimatahari;

/**
 * Created by TOSHIBA on 6/17/2015.
 */
public class Nasabah {
    private String namaLengkap;
    private Rekening tabungan;

    public Nasabah(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Nasabah(String namaLengkap, Rekening tabungan) {
        this.namaLengkap = namaLengkap;
        this.tabungan = tabungan;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public Rekening getTabungan() {
        return tabungan;
    }

    public void setTabungan(Rekening tabungan) {
        this.tabungan = tabungan;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "namaLengkap='" + namaLengkap + '\'' +
                ", tabungan=" + tabungan +
                '}';
    }
}

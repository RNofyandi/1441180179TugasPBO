package com.company;

import java.util.ArrayList;
import java.lang.String;

public class Liga {
    private String namaLiga;

    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    public Liga(String namaLiga) {this.namaLiga = namaLiga;}

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public void getDaftarDivisi(String ligaCari) {
        if (ligaCari == getNamaLiga()){
            for (int j = 0; j < daftarDivisi.size(); j++){
                System.out.println(daftarDivisi.get(j));
            }
        }
        else{
            System.out.println("Tidak Ditemukan");
        }
    }

    public void setDaftarDivisi(Divisi divisi)
    {
        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Klub> getDaftarKlub(){
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub){
        this.daftarKlub.add(klub);
    }

    @Override
    public String toString() {
        return "Liga " +namaLiga;
    }
}

package com.company;

import java.lang.String;

import static java.lang.String.*;
/**
 * Created by TOSHIBA on 6/24/2015.
 */
public class Main {
    public static void main(String[] args) {
        Liga inggris = new Liga("Inggris");

        Divisi divisi1 = new Divisi("Premiership", inggris);
        Divisi divisi2 = new Divisi("Championship", inggris);


        Klub klub1 = new Klub("Manchester United",divisi1,inggris);
        Klub klub2 = new Klub("Arsenal",divisi1,inggris);

        Klub klub3 = new Klub("Shefield Wednesday",divisi2,inggris);
        Klub klub4 = new Klub("Birmingham City",divisi2,inggris);

        inggris.setDaftarDivisi(divisi1);
        inggris.setDaftarDivisi(divisi2);
        inggris.setDaftarKlub(klub1);
        inggris.setDaftarKlub(klub2);
        inggris.setDaftarKlub(klub3);
        inggris.setDaftarKlub(klub4);

        divisi1.setDaftarKlub(klub1);
        divisi1.setDaftarKlub(klub2);

        divisi2.setDaftarKlub(klub3);
        divisi2.setDaftarKlub(klub4);

        System.out.println("Get daftar divisi by namaLiga");
        System.out.println("Liga Inggris terdiri dari : ");
        inggris.getDaftarDivisi("Inggris");
        System.out.println(" ");

        System.out.println("Get Daftar Klub by nama liga");
        System.out.println("Daftar klub liga Inggris : ");
        divisi1.getDaftarKlubLiga("Inggris");
        System.out.println(" ");

        System.out.println("Get Daftar Klub by nama Divisi");
        System.out.println("Klub di divisi Premiership : ");
        divisi1.getDaftarKlubDivisi("Premiership");
        System.out.println("Klub di divisi Championship : ");
        divisi2.getDaftarKlubDivisi("Championship");
        System.out.println(" ");

        System.out.println("Get Klub ini berada di divisi mana by nama Klub");
        klub3.getDivisi("Manchester United");
        System.out.println(" ");

        System.out.println("Get Klub ini berada di liga apa by nama Klub");
        klub4.getLiga("Arsenal");
    }
}

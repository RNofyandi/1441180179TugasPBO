package com.company;

/**
 * Created by TOSHIBA on 6/24/2015.
 */
public class Main {
    public static void main(String[] args) {
        Liga inggris = new Liga("Inggris");

        Divisi divisi1 = new Divisi("Premiership");
        Divisi divisi2 = new Divisi("Championship");


        Klub klub1 = new Klub("Manchester United",divisi1);
        Klub klub2 = new Klub("Arsenal",divisi1,inggris);

        Klub klub3 = new Klub("Shefield Wednesday",divisi2);
        Klub klub4 = new Klub("Birmingham City",divisi2);

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

        System.out.println("1. Get daftar divisi by namaLiga");
        System.out.println("   Nama Liga : " +inggris.getNamaLiga());
        System.out.println("   Daftar Divisi : " +inggris.getDaftarDivisi());

        System.out.println(" ");

        System.out.println("2. Get daftar klub by namaLiga");
        System.out.println("   Nama Liga : " +inggris.getNamaLiga());
        System.out.println("   Daftar Klub : " +inggris.getDaftarKlub());

        System.out.printf("\n");

        System.out.println("3. Get daftar klub by namaDivisi");
        System.out.println("   Nama Liga : " +inggris.getNamaLiga());
        System.out.println("   Daftar Klub : " +divisi1.getDaftarKlub() + ", " +divisi2.getDaftarKlub());

        System.out.println(" ");

        System.out.println("4. Get klub ini berada di divisi mana by namaKlub");
        System.out.println("   Nama Liga : " +inggris.getNamaLiga());
        System.out.println("   Klub " +klub2.getNamaKlub() + " berasal dari " +klub2.getDivisi());

        System.out.printf("\n");

        System.out.println("5. Get klub ini berada di liga apa by namaKlub");
        System.out.println("   Nama Liga : " +inggris.getNamaLiga());
        System.out.printf("   Klub " +klub2.getNamaKlub() + " berasal dari " +klub2.getLiga());
    }
}

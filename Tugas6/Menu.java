import java.util.Scanner;	//scanner dalam paket java util

public class  Menu{
	public static void main(String[] args) {
		for (int i = 1; 1 < 9999 ; ) {
		
		System.out.println("");
		System.out.println("Menu Aplikasi Matematika :");
		System.out.println("1. Penjumlahan");
		System.out.println("2. Pengurangan");
		System.out.println("3. Perkalian ");
		System.out.println("4. Pembagian");
		System.out.println("0. Keluar");
		Scanner pilih = new Scanner(System.in);
		System.out.print("Masukan Pilihan Anda : ");
		int pilihan = pilih.nextInt();
		
		switch(pilihan){
			case 1:
			Scanner a1 = new Scanner(System.in);
			System.out.print("Masukan Nilai A : ");
			int a = a1.nextInt();
			Scanner b2 = new Scanner(System.in);
			System.out.print("Masukan Nilai B : ");
			int b = b2.nextInt();
			int c;
			c = a+ b;
			System.out.print("Hasil Dari "+ a );
			System.out.print(" + " + b);
			System.out.print(" = " + c);
			System.out.println("");
			break;

			case 2 :
			Scanner a2 = new Scanner(System.in);
			System.out.print("Masukan Nilai A : ");
			int x1 = a2.nextInt();
			Scanner b1 = new Scanner(System.in);
			System.out.print("Masukan Nilai B : ");
			int x2 = b1.nextInt();
			int x3;
			x3 = x1 - x2;
			System.out.print("Hasil Dari " + x1 );
			System.out.print(" - " + x2 );
			System.out.print(" = " + x3 );
			System.out.println("");
			break;
			
			case 3:
			Scanner z1 = new Scanner(System.in);
			System.out.print("Masukan Nilai A : ");
			int na = z1.nextInt();
			Scanner z2 = new Scanner(System.in);
			System.out.print("Masukan Nilai B : ");
			int nb = z2.nextInt();
			int nc;
			nc = na * nb;
			System.out.print("Hasil Dari "+ na );
			System.out.print(" X " + nb);
			System.out.print(" = " + nc);
			System.out.println("");
			break;
			
			case 4:
			Scanner k1 = new Scanner(System.in);
			System.out.print("Masukan Nilai A : ");
			int ka = k1.nextInt();
			Scanner k2 = new Scanner(System.in);
			System.out.print("Masukan Nilai B : ");
			int kb = k2.nextInt();
			int kc;
			kc = ka/ kb;
			System.out.print("Hasil Dari "+ ka );
			System.out.print(" / " + kb);
			System.out.print(" = " + kc);
			System.out.println("");
			break;

			case 0:
			System.exit(0);
			
			default:
			System.out.println("maaf !! Pilihan tidak ada !! ");
			break;
			}
		}
	}
}
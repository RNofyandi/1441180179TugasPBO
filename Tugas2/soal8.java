public class soal8{
	public static void main(String[] args) {
		int angka;

		for (angka = 1 ; angka < 111 ; angka++) {
			System.out.print(" " +angka);

			if (angka % 11 == 0)
				System.out.print("\n");
		}
	}
}
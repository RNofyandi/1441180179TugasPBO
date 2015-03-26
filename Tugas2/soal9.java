public class soal9{
	public static void main(String[] args) {
		int angka;

		for (angka = 1; angka < 111 ;angka++) {
			if (angka % 5 == 0)
				System.out.print(" JONI");
			else
			System.out.print(" " + angka);

			if (angka % 11 == 0)
				System.out.print("\n");
		}
	}
}
public class soal11{
	public static void main(String[] args) {
		int panjang = 5;
		int lebar = 5;

		for (int i = 1 ; i <= panjang ; i++) {
			System.out.println(" ");

			if (i%2 == 0)
				System.out.print(" #");

			for (int j = 1 ; j <= lebar ; j++)
				System.out.print("#");
		}
	}
}
public class TestKendaraan
{
	public static void main(String[] args)
	{
		mobil porsche = new mobil(200, 5000, 2, 4);
		porsche.cetakspesifikasi();
		System.out.println("");
		porsche.jalankan(100);
		porsche.jalankan(180);
	}
}

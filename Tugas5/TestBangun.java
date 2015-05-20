public class TestBangun{
	public static void main(String[] args) {
		segitiga biru = new segitiga(3, 4, 5);
		lingkaran setan = new lingkaran(7);

		System.out.println("========================");
		System.out.println("       SEGITIGA");
		System.out.println("========================");
		biru.tampilkanProperty();
		System.out.println("Luas : " +biru.luassegitiga());
		System.out.println("Keliling : " +biru.kelilingsegitiga());
		
		System.out.println("");

		System.out.println("========================");
		System.out.println("       LINGKARAN");
		System.out.println("========================");
		setan.tampilkanProperty();
		System.out.println("Luas : " +setan.luaslingkaran());
		System.out.println("Keliling : " +setan.kelilinglingkaran());
	}
}
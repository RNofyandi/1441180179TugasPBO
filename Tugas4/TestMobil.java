class TestMobil{
	public static void main(String[] args) {
		//create an object
		mobil mobilSatu = new mobil();
		mobil mobilDua = new mobil(500, "Laguna Seca", "N 4969 XO", "Honda", "Hitam", 125);
	
		//display the 1st object : mobilSatu
		System.out.print("Merk " +mobilSatu.getMerk());
		System.out.print(", berlokasi di "+mobilSatu.getPosisi());
		System.out.print(", memiliki nomor polisi "+mobilSatu.getNopol());
		System.out.print(", kecepatan mampu mencapai "+mobilSatu.getSpeed()+" km/h");
		System.out.print(", berwarna "+mobilSatu.getWarna());
		System.out.print(", bermesin "+mobilSatu.getMesin()+" cc");

		System.out.println(" ");
		System.out.println(" ");
		
		System.out.print("Merk " +mobilDua.getMerk());
		System.out.print(", berlokasi di "+mobilDua.getPosisi());
		System.out.print(", memiliki nomor polisi "+mobilDua.getNopol());
		System.out.print(", kecepatan mampu mencapai "+mobilDua.getSpeed()+" km/h");
		System.out.print(", berwarna "+mobilDua.getWarna());
		System.out.print(", bermesin "+mobilDua.getMesin()+" cc");


	}
}
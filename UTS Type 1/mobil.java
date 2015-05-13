class mobil extends kendaraan{
	private int kecMaks;
	private int jumlahRoda;

	public mobil(int kecMaksIn, int beratIn, int kapasitasIn, int jumlahRodaIn){
		kecMaks = kecMaksIn;
		berat = beratIn;
		kapasitas = kapasitasIn;
		jumlahRoda = jumlahRodaIn;
	}

	kendaraan k = new kendaraan();

	public void cetakspesifikasi(){
		System.out.println("Kecepatan Maks Kendaraan : " +k.getkecMaks());
		System.out.println("Kecepatan Maks Mobil : " +kecMaks);
		System.out.println("Berat Mobil : " +berat);
		System.out.println("Kapasitas Mobil : " +kapasitas);
		System.out.println("Jumlah Roda Mobil : " +jumlahRoda);
	}

	public void jalankan( int kecepatan){
		System.out.println("Mobil dijalankan dengan kecepatan " +kecepatan);
	}
}
class TestLaptop{
	public static void main(String[] args) {
		//create an object
		laptop laptopSatu = new laptop();
		laptop laptopDua = new laptop("ASUS", "Silver");
		laptop laptopTiga = new laptop("ACER", "Gold", "Not Connected");
		laptop laptopEmpat = new laptop("Vaio", "Emerald", "Connected", 99);

		//display the 1st object
		laptopSatu.nyala();		
		System.out.println(laptopSatu.getMerk()+ " " +laptopSatu.getWarna());
		laptopSatu.indikatorBaterai();
		laptopSatu.indikatorWifi();
		laptopSatu.mati();

		System.out.print("\n");

		//setting battery and wifi for 2nd object
		laptopDua.setBaterai(80);
		laptopDua.setWifi("Not Connected");
		//display the 2nd object
		laptopDua.nyala();
		System.out.println(laptopDua.getMerk()+ " " +laptopDua.getWarna());
		laptopDua.indikatorBaterai();
		laptopDua.indikatorWifi();
		laptopDua.mati();

		System.out.print("\n");
		//setting battery for 3rd object
		laptopTiga.setBaterai(75);
		//display the 3rd object
		laptopTiga.nyala();
		System.out.println(laptopTiga.getMerk()+ " " +laptopTiga.getWarna());
		laptopTiga.indikatorBaterai();
		laptopTiga.indikatorWifi();
		laptopTiga.mati();

		System.out.print("\n");
		//display the 4th object
		laptopEmpat.nyala();
		System.out.println(laptopEmpat.getMerk()+ " " +laptopEmpat.getWarna());
		laptopEmpat.indikatorBaterai();
		laptopEmpat.indikatorWifi();
		laptopEmpat.mati();
	}
}
class TestTabungan{
	public static void main(String[] args) {
		//create an object
		tabungan tbgSatu = new tabungan();
		tabungan tbgDua = new tabungan(500000, "Ir. Soekarno");
		tabungan tbgTiga = new tabungan(10000, "Soeharto", 1441180009);
		tabungan tbgEmpat = new tabungan(1000000000, "Ir. Joko Widodo", 1441180177, 1);

		//display the 1st object : tbgSatu
		System.out.println("LAYANAN TABUNGAN BANK PERKREDITAN RAKYAT");
		
		System.out.println(" ");
		
		System.out.println("Nama        : "+tbgSatu.getpemRek());
		System.out.println("No Rekening : "+tbgSatu.getnoRek());
		System.out.println(" ");
		tbgSatu.menabung();
		tbgSatu.mengambil();
		tbgSatu.transfer();
		tbgSatu.ditransfer();
		tbgSatu.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar : "+tbgSatu.getBunga()+" %");
		
		System.out.println(" ");
		
		//set noRek and bunga for 2nd object
		tbgDua.setnoRek(1441180765);
		tbgDua.setBunga(2);
		//display the 2nd object : tbgDua
		System.out.println("Nama        : "+tbgDua.getpemRek());
		System.out.println("No Rekening : "+tbgDua.getnoRek());
		System.out.println(" ");
		tbgDua.menabung();
		tbgDua.mengambil();
		tbgDua.transfer();
		tbgDua.ditransfer();
		tbgDua.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar : "+tbgDua.getBunga()+" %");

		System.out.println(" ");

		//set bunga for 3rd object
		tbgTiga.setBunga(3);
		//display the 3rd object : tbgTiga
		System.out.println("Nama        : "+tbgTiga.getpemRek());
		System.out.println("No Rekening : "+tbgTiga.getnoRek());
		System.out.println(" ");
		tbgTiga.menabung();
		tbgTiga.mengambil();
		tbgTiga.transfer();
		tbgTiga.ditransfer();
		tbgTiga.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar : "+tbgTiga.getBunga()+" %");

		System.out.println(" ");

		//display the 4th object : tbgEmpat
		System.out.println("Nama        : "+tbgEmpat.getpemRek());
		System.out.println("No Rekening : "+tbgEmpat.getnoRek());
		System.out.println(" ");
		tbgEmpat.menabung();
		tbgEmpat.mengambil();
		tbgEmpat.transfer();
		tbgEmpat.ditransfer();
		tbgEmpat.cekSaldo();
		System.out.println("Anda memiliki bunga sebesar : "+tbgEmpat.getBunga()+" %");
	}
}
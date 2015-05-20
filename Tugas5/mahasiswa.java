class mahasiswa{
	//attributes
	private String nama;
	private int umur;

	//constructor
	public mahasiswa(String namaIn, int umurIn){
		nama = namaIn;
		umur = umurIn;
	}

	//method
	public void tampilkanBiodata(){
		System.out.println("::: BIODATA :::");
		System.out.println("Nama : " +getNama());
		System.out.println("Umur : " +getUmur());
	}

	//setter and getter
	public void setNama(String n){
		nama = n;
	}

	public void setUmur(int u){
		umur = u;
	}

	public String getNama(){
		return nama;
	}

	public int getUmur(){
		return umur;
	}
}
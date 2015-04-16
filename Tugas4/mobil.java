class mobil{
	//variables
	private double speed;
	private String posisi;
	private String nopol;
	private String merk;
	private String warna;
	private double mesin;

	//constructors
	public mobil(){
		speed = 200;
		posisi = "Losail";
		nopol = "N 3044 TAN";
		merk = "Bajaj";
		warna = "Orange";
		mesin = 1000;
	}

	public mobil(double speedInput, String posisiInput, String nopolInput, String merkInput, String warnaInput, double mesinInput){
		speed = speedInput;
		posisi = posisiInput;
		nopol = nopolInput;
		merk = merkInput;
		warna = warnaInput;
		mesin = mesinInput;
	}

	//methods
	public void maju(){
		System.out.println("Majuuuuuuuuuuu.............");
	}

	public void mundur(){
		System.out.println("Munduuuuuuuurrr............");
	}

	public void berhenti(){
		System.out.println("Stop !");
	}

	public void belok(){
		System.out.println("Balas Kanan, Balas Kiri");
	}

	public void ngebut(){
		System.out.println("Ngeeeeeenngg.................");
	}

	public void ngerem(){
		System.out.println("Ciiiittttt............");
	}

	//getter
	public double getSpeed(){
		return speed;
	}
	
	public String getPosisi(){
		return posisi;
	}

	public String getNopol(){
		return nopol;
	}
	
	public String getMerk(){
		return merk;
	}
	
	public String getWarna(){
		return warna;
	}
	
	public double getMesin(){
		return mesin;
	}
}
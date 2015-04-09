class laptop{
	//variables
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	//constructors
	public laptop(){
		merk = "TOSHIBA";
		warna = "Black";
		wifi ="Connected";
		baterai = 50;
	}
	
	public laptop(String merkInput, String warnaInput){
		merk = merkInput;
		warna = warnaInput;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput){
		merk = merkInput;
		warna = warnaInput;
		wifi = wifiInput;
	}

	public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput){
		merk = merkInput;
		warna = warnaInput;
		wifi = wifiInput;
		baterai = bateraiInput;
	}

	//methods
	public void nyala(){
		System.out.println("Welcome to Laptop");
	}

	public void mati(){
		System.out.println("Thank You - Have a Nice Day");
	}

	public void indikatorBaterai(){
		System.out.println("Battery Percentage : " + getBaterai() + " %");
	}

	public void indikatorWifi(){
		System.out.println("WiFi : " + wifi);
	}

	//setter and getter
	public String getMerk(){
		return merk;
	}
	
	public String getWarna(){
		return warna;
	}

	public String getWifi(){
		return wifi;
	}

	public int getBaterai(){
		return baterai;
	}

	public void setMerk(String m){
		merk = m;
	}
	
	public void setWarna(String c){
		warna = c;
	}

	public void setWifi(String w){
		wifi = w;
	}

	public void setBaterai(int b){
		baterai = b;
	}
}
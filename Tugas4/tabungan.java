class tabungan{
	//variabel
	private double saldo;
	private String pemRek;
	private double noRek;
	private int bunga;

	//constructors
	public tabungan(){
		saldo = 12000000;
		pemRek = "Resqy Nofyandi";
		noRek = 1441180179;
		bunga = 1;
	}

	public tabungan(double saldoInput, String pemRekInput){
		saldo = saldoInput;
		pemRek = pemRekInput;
	}

	public tabungan(double saldoInput, String pemRekInput, double noRekInput){
		saldo = saldoInput;
		pemRek = pemRekInput;
		noRek = noRekInput;
	}

	public tabungan(double saldoInput, String pemRekInput, double noRekInput, int bungaInput){
		saldo = saldoInput;
		pemRek = pemRekInput;
		noRek = noRekInput;
		bunga = bungaInput;
	}

	//methods
	public void menabung(){
		System.out.println("Saldo anda telah bertambah sebesar : ");
	}

	public void mengambil(){
		System.out.println("Anda telah menarik tunai sebesar : ");
	}

	public void transfer(){
		System.out.println("Transfer anda telah berhasil");
	}

	public void ditransfer(){
		System.out.println("Anda telah menerima transfer sebesar : ");
	}

	public void cekSaldo(){
		System.out.println("Saldo anda sebesar : " +getSaldo());
	}

	//setter and getter
	public double getSaldo(){
		return saldo;
	}

	public String getpemRek(){
		return pemRek;
	}

	public double getnoRek(){
		return noRek;
	}

	public int getBunga(){
		return bunga;
	}

	
	public void setSaldo(double s){
		saldo = s;
	}

	public void setpemRek(String p){
		pemRek = p;
	}

	public void setnoRek(double n){
		noRek = n;
	}

	public void setBunga(int b){
		bunga = b;
	}
}
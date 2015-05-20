public class lingkaran{
	//attributes
	int jejari;
	double luasLingkaran;
	double kelilingLingkaran;

	//constructor
	public lingkaran(int jejariIn){
		jejari = jejariIn;
	}

	//methods
	public void tampilkanProperty(){
		System.out.println("Jari-jari Lingkaran : " +jejari);
	}

	public double luaslingkaran(){
		luasLingkaran = Math.PI * jejari * jejari;
		return luasLingkaran;
	}

	public double kelilinglingkaran(){
		kelilingLingkaran = 2 * Math.PI * jejari;
		return kelilingLingkaran;
	}		
}
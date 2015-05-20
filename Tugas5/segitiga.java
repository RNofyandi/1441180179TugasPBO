public class segitiga{
	//attributes
	int tinggiSegitiga;
	int alasSegitiga;
	int smSegitiga;
	int luasSegitiga;
	int kelilingSegitiga;

	//constructor
	public segitiga(int tinggiSegitigaIn, int alasSegitigaIn, int smSegitigaIn){
		tinggiSegitiga = tinggiSegitigaIn;
		alasSegitiga = alasSegitigaIn;
		smSegitiga = smSegitigaIn;
	}

	//methods
	public void tampilkanProperty(){
		System.out.println("Tinggi segitiga        : " +tinggiSegitiga);
		System.out.println("Alas segitiga          : " +alasSegitiga);
		System.out.println("Sisi miring segitiga   : " +smSegitiga);
	}

	public int luassegitiga(){
		luasSegitiga = (alasSegitiga * tinggiSegitiga) / 2;
		return luasSegitiga;
	}

	public int kelilingsegitiga(){
		kelilingSegitiga = alasSegitiga + tinggiSegitiga + smSegitiga;
		return kelilingSegitiga;
	}		
}
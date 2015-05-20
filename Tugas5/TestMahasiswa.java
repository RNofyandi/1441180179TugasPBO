public class TestMahasiswa{
	public static void main(String[] args) {
		mahasiswa mhs = new mahasiswa("Resqy Dwi Nofyandi", 17);

		mhs.tampilkanBiodata();
		
		System.out.println("");

		mhs.setUmur(25);
		mhs.tampilkanBiodata();
	}
}
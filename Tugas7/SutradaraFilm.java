public class SutradaraFilm {
    private String namaSutradara;
    private int umurSutradara;
    private char jeniskelaminSutradara;
    private String kwarganegaraanSutradara;

    public SutradaraFilm(String namaSutradara, int umurSutradara, char jeniskelaminSutradara, String kwarganegaraanSutradara) {
        this.namaSutradara = namaSutradara;
        this.umurSutradara = umurSutradara;
        this.jeniskelaminSutradara = jeniskelaminSutradara;
        this.kwarganegaraanSutradara = kwarganegaraanSutradara;
    }

    public String getNamaSutradara() {
        return namaSutradara;
    }

    public void setNamaSutradara(String namaSutradara) {
        this.namaSutradara = namaSutradara;
    }

    public int getUmurSutradara() {
        return umurSutradara;
    }

    public void setUmurSutradara(int umurSutradara) {
        this.umurSutradara = umurSutradara;
    }

    public char getJeniskelaminSutradara() {
        return jeniskelaminSutradara;
    }

    public void setJeniskelaminSutradara(char jeniskelaminSutradara) {
        this.jeniskelaminSutradara = jeniskelaminSutradara;
    }

    public String getKwarganegaraanSutradara() {
        return kwarganegaraanSutradara;
    }

    public void setKwarganegaraanSutradara(String kwarganegaraanSutradara) {
        this.kwarganegaraanSutradara = kwarganegaraanSutradara;
    }

    @Override
    public String toString() {
        return "SutradaraFilm{" +
                "namaSutradara='" + namaSutradara + '\'' +
                ", umurSutradara=" + umurSutradara +
                ", jeniskelaminSutradara=" + jeniskelaminSutradara +
                ", kwarganegaraanSutradara='" + kwarganegaraanSutradara + '\'' +
                '}';
    }
}
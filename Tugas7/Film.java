/**
 * Created by TOSHIBA on 6/11/2015.
 */
public class Film {
    private String namaFilm;
    private String genreFilm;
    private int thnrilisFilm;
    private SutradaraFilm directedBy;

    public Film(String namaFilm, String genreFilm, int thnrilisFilm, SutradaraFilm directedBy) {
        this.namaFilm = namaFilm;
        this.genreFilm = genreFilm;
        this.thnrilisFilm = thnrilisFilm;
        this.directedBy = directedBy;
    }

    public String getNamaFilm() {
        return namaFilm;
    }

    public void setNamaFilm(String namaFilm) {
        this.namaFilm = namaFilm;
    }

    public String getGenreFilm() {
        return genreFilm;
    }

    public void setGenreFilm(String genreFilm) {
        this.genreFilm = genreFilm;
    }

    public int getThnrilisFilm() {
        return thnrilisFilm;
    }

    public void setThnrilisFilm(int thnrilisFilm) {
        this.thnrilisFilm = thnrilisFilm;
    }

    public SutradaraFilm getDirectedBy() {
        return directedBy;
    }

    public void setDirectedBy(SutradaraFilm directedBy) {
        this.directedBy = directedBy;
    }

    @Override
    public String toString() {
        return "Film{" +
                "namaFilm='" + namaFilm + '\'' +
                ", genreFilm='" + genreFilm + '\'' +
                ", thnrilisFilm=" + thnrilisFilm +
                ", directedBy=" + directedBy +
                '}';
    }
}
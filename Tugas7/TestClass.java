/**
 * Created by TOSHIBA on 6/11/2015.
 */
public class TestClass {
    public static void main(String[] args) {
        SutradaraFilm sutradaraSatu = new SutradaraFilm("James Cameron",60,'L',"Kanada");

        System.out.printf(sutradaraSatu.toString());

        Film filmSatu = new Film("Avatar","Adventure",2011,sutradaraSatu);
        
        System.out.printf(filmSatu.toString());

    }
}

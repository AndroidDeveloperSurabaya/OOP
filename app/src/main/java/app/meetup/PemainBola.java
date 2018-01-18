package app.meetup;

/**
 * Created by khoiron on 18/01/18.
 */

public class PemainBola {
    String menendang;
    String drible;

    //Contoh method megembalikan nilai
    public String getMenendang() {
        return menendang;
    }

    //contoh method tidak mengembalikan nilai
    public void setMenendang(String menendang) {
        this.menendang = menendang;
    }

    public String getDrible() {
        return drible;
    }

    public void setDrible(String drible) {
        this.drible = drible;
    }

    //Comtoh Contructor
    public PemainBola(String menendang, String drible) {
        this.menendang = menendang;
        this.drible = drible;
    }
}

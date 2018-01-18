package app.meetup

/**
 * Created by khoiron on 18/01/18.
 */
class PemainbolaKotlin {

    var menendang : String = ""
    var drible : String = ""

    //contoh method mengembalikan nilai
    fun getMenendangg(): String {
        return menendang
    }

    //contoh method tidak mengembalikan nilai
    fun setMenendangg(menendang: String) {
        this.menendang = menendang
    }

    fun getDriblee(): String {
        return drible
    }

    fun setDriblee(drible: String) {
        this.drible = drible
    }

    //Comtoh Contructor
    constructor(menendang: String, drible: String){
        this.menendang = menendang
        this.drible = drible
    }
}
package app.meetup.PenerapanInheritance.Kotlin

import app.meetup.R

class RegisterActivityKotlin : BaseActivityKotlin() {

    override fun getLayout(): Int {
        return R.layout.activity_register_kotlin
    }

    override fun onMain() {
        //kita tinnggal pakai method2 yang telah kita buat di Base Contohnya
        setLog("Data/pesan yang mau di tampilkan")
        setToast("Data/pesan yang mau di tampilkan")
    }

}

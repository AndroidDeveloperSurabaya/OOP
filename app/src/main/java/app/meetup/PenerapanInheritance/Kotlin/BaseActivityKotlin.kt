package app.meetup.PenerapanInheritance.Kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import app.meetup.R

/**
 * Created by khoiron on 18/01/18.
 */
abstract class BaseActivityKotlin :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        //Init Object2 yang basa kita pakai di Activity di sini agar kita tinggal pakai di semua Activity kita

        onMain();
    }

    abstract fun getLayout(): Int
    abstract fun onMain()

    //buat method2 yang sering kita pakai di baseActivity ini untuk kita gunakan di semua Activity kita
    fun setLog(message: String) {
        Log.e("Test aplikasi", message)
    }

    fun setToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
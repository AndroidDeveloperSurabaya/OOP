package app.meetup.PenerapanInheritance.Kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import app.meetup.R

/**
 * Created by khoiron on 18/01/18.
 */
abstract class BaseActivityKotlin :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayout())
        onMain();
    }

    abstract fun getLayout(): Int
    abstract fun onMain()
}
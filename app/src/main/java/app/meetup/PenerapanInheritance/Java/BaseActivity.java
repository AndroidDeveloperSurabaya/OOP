package app.meetup.PenerapanInheritance.Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import app.meetup.R;

/**
 * Created by khoiron on 18/01/18.
 */

abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        //Init Object2 yang basa kita pakai di Activity di sini agar kita tinggal pakai di semua Activity kita
        //Contohnya Init Butterknife
        //ButterKnife.bind(this)
		//
        onMain();
    }

    protected abstract int getLayout();
    protected abstract void onMain();

    //buat method2 yang sering kita pakai di baseActivity ini untuk kita gunakan di semua Activity kita
    public void setLog(String message){
        Log.e("Test aplikasi",message);
    }
    public void setToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

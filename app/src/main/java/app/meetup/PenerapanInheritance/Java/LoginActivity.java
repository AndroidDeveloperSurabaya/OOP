package app.meetup.PenerapanInheritance.Java;

import android.widget.TextView;

import app.meetup.R;

public class LoginActivity extends BaseActivity {

    @Override protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override protected void onMain() {
        //kita tinnggal pakai method2 yang telah kita buat di Base Contohnya
        setLog("Data/pesan yang mau di tampilkan");
        setToast("Data/pesan yang mau di tampilkan");
    }


}

package app.meetup.PenerapanInheritance.Java;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import app.meetup.R;

/**
 * Created by khoiron on 18/01/18.
 */

abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        onMain();
    }

    protected abstract int getLayout();
    protected abstract void onMain();
}

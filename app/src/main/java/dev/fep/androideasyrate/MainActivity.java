package dev.fep.androideasyrate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dev.fep.androideasyratelib.AndroidEasyRate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AndroidEasyRate.ShowDialog(this);
    }
}

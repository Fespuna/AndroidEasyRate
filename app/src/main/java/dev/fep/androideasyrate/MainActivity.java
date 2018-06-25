package dev.fep.androideasyrate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dev.fep.androideasyratelib.AndroidEasyRate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /*     AndroidEasyRate.ShowDialog(this);  */

  /*      AndroidEasyRate.ShowCustomDialog(this,
                "Hey! would you like to rate this App?",
                "Please give 5 stars",
                R.color.colorPrimary);  */

        AndroidEasyRate.ShowCustomDialogWithCustomStars(this,
                "Hey! would you like to rate this App?",
                "Please give 5 stars",
                R.color.colorPrimary,
                R.drawable.starb);

    }
}

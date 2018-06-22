package dev.fep.androideasyratelib;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ferran on 23/06/2018.
 */

public class AndroidEasyRate {

    public AndroidEasyRate() {

    }

    public static void ShowDialog(Context context) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.rating_dialog);

        Button dialogButton = (Button) dialog.findViewById(R.id.button);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    public static void ShowDialogWithTitle(Context context, String title) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.rating_dialog);
        dialog.setTitle(title);

        Button dialogButton = (Button) dialog.findViewById(R.id.button);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

}

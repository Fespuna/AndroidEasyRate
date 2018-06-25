package dev.fep.androideasyratelib;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Ferran on 23/06/2018.
 */

public class AndroidEasyRate {

    public AndroidEasyRate() {

    }

    public static void ShowDialog(Context context) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.rating_dialog);

        LinearLayout dialogButton = (LinearLayout) dialog.findViewById(R.id.ratebtn);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();

    }

    public static void ShowCustomDialog(final Context context, String rating_dialog_text, String rate_button_text, int rate_button_color) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.rating_dialog);

        // rate dialog text
        TextView tv_rating_dialog_text = (TextView) dialog.findViewById(R.id.rating_dialog_text);
        tv_rating_dialog_text.setText(rating_dialog_text);

        //rate dialog button text
        TextView tv_rate_button_text = (TextView) dialog.findViewById(R.id.rate_button_text);
        tv_rate_button_text.setText(rate_button_text);

        //rate button
        LinearLayout dialogButton = (LinearLayout) dialog.findViewById(R.id.ratebtn);
        dialogButton.setBackgroundColor(rate_button_color);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    context.startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    context.startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
                }
                dialog.dismiss();
            }
        });

        dialog.setCancelable(false);

        dialog.show();

    }

    public static void ShowCustomDialogWithCustomStars(final Context context, String rating_dialog_text, String rate_button_text, int rate_button_color, int custom_star) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.rating_dialog);

        // rate dialog text
        TextView tv_rating_dialog_text = (TextView) dialog.findViewById(R.id.rating_dialog_text);
        tv_rating_dialog_text.setText(rating_dialog_text);

        //rate dialog button text
        TextView tv_rate_button_text = (TextView) dialog.findViewById(R.id.rate_button_text);
        tv_rate_button_text.setText(rate_button_text);

        //rate button
        LinearLayout dialogButton = (LinearLayout) dialog.findViewById(R.id.ratebtn);
        dialogButton.setBackgroundColor(rate_button_color);

        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("market://details?id=" + context.getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);

                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    context.startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    context.startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
                }
                dialog.dismiss();
            }
        });

        ImageView star1 = (ImageView) dialog.findViewById(R.id.star1);
        ImageView star2 = (ImageView) dialog.findViewById(R.id.star2);
        ImageView star3 = (ImageView) dialog.findViewById(R.id.star3);
        ImageView star4 = (ImageView) dialog.findViewById(R.id.star4);
        ImageView star5 = (ImageView) dialog.findViewById(R.id.star5);

        setcustomstars(star1, star2, star3, star4, star5, custom_star);

        dialog.setCancelable(false);

        dialog.show();

    }


    public static void setcustomstars(ImageView star1, ImageView star2, ImageView star3, ImageView star4, ImageView star5, int custom_star){

        star1.setImageResource(custom_star);
        star2.setImageResource(custom_star);
        star3.setImageResource(custom_star);
        star4.setImageResource(custom_star);
        star5.setImageResource(custom_star);

    }

}

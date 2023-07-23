package com.example.ficheras;

import androidx.appcompat.app.AppCompatActivity;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Pelicula12 extends AppCompatActivity {

    private ImageButton imbPoster12;
    private ImageView imvPoster12Grande;
    private TextView txvVer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula12);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        imbPoster12 = findViewById(R.id.imbPoster12);
        imvPoster12Grande = findViewById(R.id.imvPoster12Grande);
        txvVer = findViewById(R.id.txvVer);

        imbPoster12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imvPoster12Grande.setX(0);
                imvPoster12Grande.setY(190);
                imvPoster12Grande.setVisibility(View.VISIBLE);

            }
        });

        imvPoster12Grande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imvPoster12Grande.setVisibility(View.GONE);
            }
        });

        txvVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.clarovideo.com/mexico/vcard/homeuser/699316"));
                startActivity(intent);
            }
        });

        //transparente status bar.

        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }

        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

    }

    //metodo status bar transparante
    public static void setWindowFlag(Activity activity, final int bits, boolean on) {
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on) {
            winParams.flags |= bits;
        } else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);
    }

}
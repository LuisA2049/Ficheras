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

public class Pelicula1 extends AppCompatActivity {

    private ImageButton imbPoster1;
    private ImageView imvPoster1Grande;
    private TextView txvVer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula1);

        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}

        imbPoster1 = findViewById(R.id.imbPoster1);
        imvPoster1Grande = findViewById(R.id.imvPoster1Grande);
        txvVer = findViewById(R.id.txvVer);

        imbPoster1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                imvPoster1Grande.setX(0);
                imvPoster1Grande.setY(190);
                imvPoster1Grande.setVisibility(View.VISIBLE);

            }
        });

        imvPoster1Grande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imvPoster1Grande.setVisibility(View.GONE);
            }
        });


        txvVer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dailymotion.com/video/x3pv9sb"));
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
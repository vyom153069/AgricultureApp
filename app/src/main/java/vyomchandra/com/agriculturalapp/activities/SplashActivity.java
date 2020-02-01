package vyomchandra.com.agriculturalapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import vyomchandra.com.agriculturalapp.R;


public class SplashActivity extends AppCompatActivity {

    private int SPLASH_LENGTH=2000;
    TextView textView;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        img=(ImageView)findViewById(R.id.imageView2);
        textView=(TextView)findViewById(R.id.textView2);
        textView.setScaleX(0);
        //textView.setScaleY(0);
        img.setTranslationY(2000);
        img.animate().translationY(0).setDuration(500);
        textView.animate().scaleX(1).setDuration(800);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_LENGTH);
    }
}

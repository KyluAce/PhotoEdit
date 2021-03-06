package com.example.kylu.photoedit.View;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
//cc
import android.util.Log;
import com.example.kylu.photoedit.R;
public class MainActivity extends Activity
{
    private static int CZAS = 2000; //3 sekundy

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityStarter starter = new ActivityStarter();

        getActionBar().hide();
        starter.start();
    }

    private class ActivityStarter extends Thread {

        @Override
        public void run()
        {
            try {
                Thread.sleep(CZAS);
            } catch (Exception e) {
                Log.e("SplashScreen", e.getMessage());
            }
            Intent intent = new Intent(MainActivity.this, ChoiceActivity.class);
            MainActivity.this.startActivity(intent);
            MainActivity.this.finish();
        }
    }
}



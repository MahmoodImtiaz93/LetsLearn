package com.mahmoodimtiaz.letslearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    EditText mLoginMail,mloginPass;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        mLoginMail= (EditText) findViewById(R.id.loginEmailD);
        mloginPass= (EditText) findViewById(R.id.logingPassID);

        b1= (Button) findViewById(R.id.loginbutton);
        b2= (Button) findViewById(R.id.createnewacc);


        //Animation

        updateAlpha(logo);
        mLoginMail.setAlpha(0);
        mloginPass.setAlpha(0);
        b1.setAlpha(0);

        logo.setTranslationY(200);
        mLoginMail.setTranslationY(200);
        mloginPass.setTranslationY(200);
        b1.setTranslationY(100);


        logo.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();

        mLoginMail.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(600).start();
        mloginPass.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(900).start();
        b1.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(900).start();

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUp.class);
                startActivity(intent);

            }
        });
    }

    void updateAlpha(View v)
    {
        v.setAlpha(0);
    }
}

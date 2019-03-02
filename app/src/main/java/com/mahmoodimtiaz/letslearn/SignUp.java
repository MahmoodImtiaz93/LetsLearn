package com.mahmoodimtiaz.letslearn;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    TextView mTextview;
    ImageView logo;
    EditText mSignUpMail,mSignUpPass,mSignUpUser;
    Button mSignUpButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mTextview = (TextView) findViewById(R.id.signupid);
        logo = (ImageView) findViewById(R.id.logo);
        mSignUpMail= (EditText) findViewById(R.id.signUpEmailD);
        mSignUpUser= (EditText) findViewById(R.id.signupUserNameID);
        mSignUpPass= (EditText) findViewById(R.id.signUpPassID);
        mSignUpButton = (Button) findViewById(R.id.signUpbutton);

        updateAlpha(logo);
        mSignUpMail.setAlpha(0);
        mTextview.setAlpha(0);
        mSignUpUser.setAlpha(0);
        mSignUpPass.setAlpha(0);
        mSignUpButton.setAlpha(0);

        logo.setTranslationY(200);
        mSignUpMail.setTranslationY(200);
        mTextview.setTranslationY(200);
        mSignUpUser.setTranslationY(200);
        mSignUpPass.setTranslationY(200);
        mSignUpButton.setTranslationY(200);


        logo.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(300).start();
        mSignUpMail.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(600).start();
        mTextview.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(450).start();
        mSignUpUser.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(900).start();
        mSignUpPass.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(1200).start();
        mSignUpButton.animate().alpha(1).translationY(0).setDuration(800).setStartDelay(1500).start();

        Typeface AbrilFat = Typeface.createFromAsset(getAssets(),"fonts/AbrilFat.ttf");
        mTextview.setTypeface(AbrilFat);

    }

    void updateAlpha(View v)
    {
        v.setAlpha(0);
    }
}

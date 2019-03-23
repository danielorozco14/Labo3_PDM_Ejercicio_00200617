package com.example.ejerciciolabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.ejerciciolabo3.utilities.AppConstants;

public class SecondActivity extends AppCompatActivity {

    TextView mShowName,mShowPass,mShowEmail,mShowGender;
    Button mButtonShare;//BOTON QUE SIRVE PARRA COMPARTIR LOS DATOS

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("MAINACTIVIY","Entrando a onCreate() de SecondActivity()");

        getTextViewId();

        Intent mIntent = this.getIntent();

        if (mIntent!=null) {
            Log.d("MAINACTIVIY","ENTRANDO AL IF DE SECOND ACTIVITY");
            mShowName.setText(mIntent.getStringExtra(AppConstants.NAME_KEY));
            mShowPass.setText(mIntent.getStringExtra(AppConstants.PASS_KEY));
            mShowEmail.setText(mIntent.getStringExtra(AppConstants.EMAIL_KEY));
            mShowGender.setText(mIntent.getStringExtra(AppConstants.GENDER_KEY));
        }

    }

    public void getTextViewId(){
        mShowName=(TextView)findViewById(R.id.txt_name);
        mShowPass=(TextView)findViewById(R.id.txt_password);
        mShowEmail=(TextView)findViewById(R.id.txt_email);
        mShowGender=(TextView)findViewById(R.id.txt_gender);
    }


}

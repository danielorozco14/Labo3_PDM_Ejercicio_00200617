package com.example.ejerciciolabo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejerciciolabo3.utilities.AppConstants;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();


    Button mButton;//BOTON QUE SIRVE PARA ENVIAR LOS DATOS A LA NUEVA ACTIVIDAD;
    EditText mInputName,mInputPass,mInputEmail,mInputGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViewId();

        mButton.setOnClickListener(v->{
            Intent mIntent = new Intent(MainActivity.this,SecondActivity.class);
            mIntent.putExtra(AppConstants.NAME_KEY,mInputName.getText().toString());
            mIntent.putExtra(AppConstants.PASS_KEY,mInputPass.getText().toString());
            mIntent.putExtra(AppConstants.EMAIL_KEY,mInputEmail.getText().toString());
            mIntent.putExtra(AppConstants.GENDER_KEY,mInputGender.getText().toString());
            startActivity(mIntent);
        });

        Log.d("MAINACTIVIY","Entrando a onCreate()");
    }

    public void getViewId(){
        mButton=findViewById(R.id.bt_main_send);
        mInputName=findViewById(R.id.et_name);
        mInputPass=findViewById(R.id.et_password);
        mInputEmail=findViewById(R.id.et_email);
        mInputGender=findViewById(R.id.et_gender);
        Log.d("MAINACTIVIY","Entrando a getViewId()");
    }
}

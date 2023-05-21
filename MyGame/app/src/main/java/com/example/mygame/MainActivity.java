package com.example.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button enter,Register;
    private ImageView logo;
    private TextView player;
    private TextView password;
    private EditText Entname;
    private EditText Entpassword;
    private TextView Hata;
    private String Name, Password, TName ="Huso", TPassword = "1234";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = findViewById(R.id.confirm);
        player = findViewById(R.id.girisview1);
        password = findViewById(R.id.girisview2);
        Entname = findViewById(R.id.name);
        Entpassword = findViewById(R.id.password);
        Hata = findViewById(R.id.error);
        logo =findViewById(R.id.girislog);
        Register =findViewById(R.id.signup);
        dbHelper databaseHelper = new dbHelper(getApplicationContext());
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(MainActivity.this, CreateUserHandler.class);
                startActivity(intent);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (databaseHelper.isUserValid(Entname.getText().toString(),Entpassword.getText().toString())){
                    Intent inte = new Intent(MainActivity.this, MainActivity2.class);
                    inte.putExtra("Entname",Name);
                    finish();
                    startActivity(inte);
                }
            }
        });
    }


   /* public void Confirm(View view) {

        Name = Entname.getText().toString();
        Password = Entpassword.getText().toString();

       if (!TextUtils.isEmpty(Name)) {
            if (!TextUtils.isEmpty(Password)) {
                if (Name.equals(TName)) {
                    if (Password.equals(TPassword)) {

                       // finish();
                    } else
                        Hata.setText("Wrong Password");
                } else
                    Hata.setText("Wrong Name");
            } else
                Hata.setText("You Cannot Enter The Password Blank");
        } else
            Hata.setText("You Cannot Enter The Username Blank");



    } */
}





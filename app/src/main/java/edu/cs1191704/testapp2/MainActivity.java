package edu.cs1191704.testapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.userName);
        password = findViewById(R.id.pass);
    }


    public void btnLogin(View view) {

        String userName = username.getText().toString();
        String pass = password.getText().toString();

        String msg = "Username: " + userName + " ,Password: " + pass;


            Toast.makeText(this, msg , Toast.LENGTH_LONG).show();





    }
}
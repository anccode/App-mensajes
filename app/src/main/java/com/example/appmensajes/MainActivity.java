package com.example.appmensajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnMsm;
    EditText telefono;
    EditText mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMsm = findViewById(R.id.btnMSM);
        telefono = findViewById(R.id.Numero);
        mensaje = findViewById(R.id.Mensaje);
        btnMsm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(telefono.getText().toString(),null,mensaje.getText().toString(),null,null);
                Toast.makeText(MainActivity.this, "MessageSuccees", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
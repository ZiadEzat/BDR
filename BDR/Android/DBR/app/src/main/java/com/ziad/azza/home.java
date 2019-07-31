package com.ziad.azza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity {
 EditText ipaddress;
 EditText ipaddresscam;
 Button connectbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ipaddress = findViewById(R.id.IPAddress4);
        ipaddresscam = findViewById(R.id.IPAddressCAM);
        connectbutton = findViewById(R.id.connect_button);
        connectbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(home.this, MainActivity.class);
                intent.putExtra("ipaddress", ipaddress.getText().toString());
                intent.putExtra("ipaddresscam", ipaddresscam.getText().toString());

                startActivity(intent);

            }
        });
    }
}

package com.example.teacher.restauranr1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnClickListener {
    EditText etusername,etpassword;
    Button blogin,bshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      blogin=(Button)findViewById(R.id.blogin);
        etusername=(EditText) findViewById(R.id.etusername);
        etpassword=(EditText) findViewById(R.id.etpassword);
        blogin.setOnClickListener(this);



    }



    @Override
    public void onClick(View v) {
      switch (v.getId()) {
          case R.id.blogin:
              startActivity(new Intent(this,Resitora.class));
      }
    }
}

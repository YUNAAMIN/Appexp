package com.example.name;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
private Button btn;
private EditText add;
private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        add=findViewById(R.id.add);
        btn=findViewById(R.id.btn);
        pass=findViewById(R.id.pass);



    }

    public void btnClick(View view) {
     String Name= add.getText().toString();
     String pwd=pass.getText().toString();
     String msg= "Name:"+Name +", Password:"+pwd;
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
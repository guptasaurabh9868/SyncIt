package com.mobilecomputing.guptas.syncit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class JoinActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);

        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);



    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v == button1){
                Intent intent = new Intent(getApplication(),PlaylistActivity.class);
                startActivity(intent);
            }else if(v == button2){
                Intent intent = new Intent(getApplication(),PlaylistActivity.class);
                startActivity(intent);
            }else if(v == button3){
                Intent intent = new Intent(getApplication(),PlaylistActivity.class);
                startActivity(intent);
            }else if(v == button4){
                Intent intent = new Intent(getApplication(),PlaylistActivity.class);
                startActivity(intent);
            }

        }
    };

}

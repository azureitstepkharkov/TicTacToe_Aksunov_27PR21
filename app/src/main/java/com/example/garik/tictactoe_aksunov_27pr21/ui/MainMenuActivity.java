package com.example.garik.tictactoe_aksunov_27pr21.ui;

import android.app.AlertDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.garik.tictactoe_aksunov_27pr21.R;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        findViewById(R.id.newGame).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.recTable).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, ScoresActivity.class);
                startActivity(intent);
            }
        });
    }

    public void clickAboutButton(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage(R.string.about_message)
                .setTitle(R.string.about_title);

        AlertDialog dialog = builder.create();

        dialog.show();
    }
}

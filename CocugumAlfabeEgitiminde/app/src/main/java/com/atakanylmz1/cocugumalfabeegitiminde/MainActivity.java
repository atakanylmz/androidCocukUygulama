package com.atakanylmz1.cocugumalfabeegitiminde;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
        Button calis_buton,harfler_buton,sayilar_buton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calis_buton=(Button)findViewById(R.id.calis_btn);
        harfler_buton= (Button) findViewById(R.id.harf_bul_btn);
        sayilar_buton=(Button)findViewById(R.id.sayi_bul_btn);
        calis_buton.setOnClickListener(this);
        harfler_buton.setOnClickListener(this);
        sayilar_buton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        switch (id){
            case R.id.calis_btn:
                Intent niyet=new Intent(getApplicationContext(),birinci_sayfa.class);
                startActivity(niyet);
                break;
            case R.id.harf_bul_btn:
                Intent niyet1=new Intent(getApplicationContext(),harfler_bir.class);
                startActivity(niyet1);
                break;
            case R.id.sayi_bul_btn:
                Intent niyet2=new Intent(getApplicationContext(),sayilar.class);
                startActivity(niyet2);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
                .setMessage("Çıkmak istediğinize emin misiniz?")
                .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Intent intent = new Intent(Intent.ACTION_MAIN);
                        intent.addCategory(Intent.CATEGORY_HOME);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }).setNegativeButton("Hayır", null).show();
    }
}

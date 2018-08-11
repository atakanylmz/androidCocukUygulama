package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class yedinci_sayfa extends Activity {
    MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yedinci_sayfa);
        cal=MediaPlayer.create(getApplicationContext(),R.raw.a);
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.yedidenaltiya_btn){
            Intent niyet=new Intent(getApplicationContext(),altinci_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.yedidenbire_btn){
            Intent niyet=new Intent(getApplicationContext(),birinci_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homeyedi_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }
    public  void  sescal(View v){
        cal.reset();
        switch (v.getId()){
            case R.id.alti_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.alti);
                cal.start();
                break;case R.id.yedi_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.yedi);
                cal.start();
                break;case R.id.sekiz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.sekiz);
                cal.start();
                break;case R.id.dokuz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.dokuz);
                cal.start();
                break;case R.id.on_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.on);
                cal.start();
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

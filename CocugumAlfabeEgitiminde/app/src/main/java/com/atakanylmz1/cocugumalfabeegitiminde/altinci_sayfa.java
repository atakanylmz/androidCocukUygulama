package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class altinci_sayfa extends Activity {
    MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altinci_sayfa);
        cal=MediaPlayer.create(getApplicationContext(), R.raw.a);
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.altidanbese_btn){
            Intent niyet=new Intent(getApplicationContext(),besinci_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.altidanyediye_btn){
            Intent niyet=new Intent(getApplicationContext(),yedinci_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homealti_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }
    public  void  sescal(View v){
        cal.reset();
        switch (v.getId()){
            case R.id.bir_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.bir);
                cal.start();
                break;case R.id.iki_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.iki);
                cal.start();
                break;case R.id.uc_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.uc);
                cal.start();
                break;case R.id.dort_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.dort);
                cal.start();
                break;case R.id.bes_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.bes);
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

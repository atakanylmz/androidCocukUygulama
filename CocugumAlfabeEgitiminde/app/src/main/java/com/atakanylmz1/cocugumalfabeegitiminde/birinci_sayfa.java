package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class birinci_sayfa extends Activity {
    MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birinci_sayfa);
        cal=MediaPlayer.create(getApplicationContext(),R.raw.a);
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.birdenikiye_btn){
            Intent niyet=new Intent(getApplicationContext(),ikinci_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.birdenyediye_btn){
            Intent niyet=new Intent(getApplicationContext(),yedinci_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homebir_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }
    public void sescal(View v){

        cal.reset();

        switch(v.getId()){
            case R.id.aslan_btn:

                cal=MediaPlayer.create(getApplicationContext(),R.raw.aslan);
                cal.start();
                break;
            case  R.id.a_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.a);
                cal.start();
                break;
            case  R.id.ari_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.ari);
                cal.start();
                break;
            case R.id.balik_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.balik);
                cal.start();
                break;
            case R.id.b_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.b);
                cal.start();
                break;
            case R.id.bisiklet_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.bisiklet);
                cal.start();
                break;
            case R.id.ceviz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.ceviz);
                cal.start();
                break;
            case R.id.c_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.c);
                cal.start();
                break;
            case R.id.civciv_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.civciv);
                cal.start();
                break;
            case R.id.cicek_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.cicek);
                cal.start();
                break;
            case R.id.cc_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.cc);
                cal.start();
                break;
            case R.id.canta_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.canta);
                cal.start();
                break;
            case R.id.deve_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.deve);
                cal.start();
                break;
            case R.id.d_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.d);
                cal.start();
                break;
            case R.id.dondurma_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.dondurma);
                cal.start();
                break;
            case R.id.elma_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.elma);
                cal.start();
                break;
            case R.id.e_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.e);
                cal.start();
                break;
            case R.id.esek_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.esek);
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

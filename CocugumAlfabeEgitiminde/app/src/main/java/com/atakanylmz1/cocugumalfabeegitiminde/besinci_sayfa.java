package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class besinci_sayfa extends Activity {
    MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besinci_sayfa);
        cal=MediaPlayer.create(getApplicationContext(),R.raw.a);
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.bestenaltiya_btn){
            Intent niyet=new Intent(getApplicationContext(),altinci_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.bestendorde_btn){
            Intent niyet=new Intent(getApplicationContext(),dorduncu_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homebes_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }
    public void sescal(View v){
        cal.reset();
        switch(v.getId()){
            case R.id.ucak_btn:
                cal= MediaPlayer.create(getApplicationContext(),R.raw.ucak);
                cal.start();
                break;
            case  R.id.u_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.u);
                cal.start();
                break;
            case  R.id.ucurtma_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.ucurtma);
                cal.start();
                break;
            case R.id.uuzum_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.uzum);
                cal.start();
                break;
            case R.id.uu_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.uu);
                cal.start();
                break;
            case R.id.utu_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.utu);
                cal.start();
                break;
            case R.id.vapur_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.vapur);
                cal.start();
                break;
            case R.id.v_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.v);
                cal.start();
                break;
            case R.id.visne_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.visne);
                cal.start();
                break;
            case R.id.yumurta_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.yumurta);
                cal.start();
                break;
            case R.id.y_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.y);
                cal.start();
                break;
            case R.id.yildiz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.yildiz);
                cal.start();
                break;
            case R.id.zebra_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.zebra);
                cal.start();
                break;
            case R.id.z_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.z);
                cal.start();
                break;
            case R.id.zeytin_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.zeytin);
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

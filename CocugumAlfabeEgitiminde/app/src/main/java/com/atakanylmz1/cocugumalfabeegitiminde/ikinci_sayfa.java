package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ikinci_sayfa extends Activity {
    MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_sayfa);
        cal=MediaPlayer.create(getApplicationContext(),R.raw.a);
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.ikidenuce_btn){
            Intent niyet=new Intent(getApplicationContext(),ucuncu_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.ikidenbire_btn){
            Intent niyet=new Intent(getApplicationContext(),birinci_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homeiki_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }
    public void sescal(View v){
        cal.reset();
        switch(v.getId()){
            case R.id.findik_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.findik);
                cal.start();
                break;
            case  R.id.f_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.f);
                cal.start();
                break;
            case  R.id.fil_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.fil);
                cal.start();
                break;
            case R.id.geyik_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.geyik);
                cal.start();
                break;
            case R.id.g_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.g);
                cal.start();
                break;
            case R.id.gozluk_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.gozluk);
                cal.start();
                break;

            case R.id.gg_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.gg);
                cal.start();
                break;

            case R.id.havuc_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.havuc);
                cal.start();
                break;
            case R.id.h_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.h);
                cal.start();
                break;
            case R.id.horoz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.horoz);
                cal.start();
                break;
            case R.id.isik_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.isik);
                cal.start();
                break;
            case R.id.ii_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.ii);
                cal.start();
                break;
            case R.id.ispanak_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.ispanak);
                cal.start();
                break;
            case R.id.inek_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.inek);
                cal.start();
                break;
            case R.id.i_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.i);
                cal.start();
                break;
            case R.id.incir_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.incir);
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

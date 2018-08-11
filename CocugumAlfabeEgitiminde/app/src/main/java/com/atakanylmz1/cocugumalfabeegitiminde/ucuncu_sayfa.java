package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ucuncu_sayfa extends Activity {
MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ucuncu_sayfa);
        cal=MediaPlayer.create(getApplicationContext(),R.raw.a);
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.ucdendorde_btn){
            Intent niyet=new Intent(getApplicationContext(),dorduncu_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.ucdenikiye_btn){
            Intent niyet=new Intent(getApplicationContext(),ikinci_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homeuc_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }
    public void sescal(View v){
        cal.reset();
        switch(v.getId()){
            case R.id.jet_btn:
                cal= MediaPlayer.create(getApplicationContext(),R.raw.jet);
                cal.start();
                break;
            case  R.id.j_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.j);
                cal.start();
                break;
            case  R.id.jaguar_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.jaguar);
                cal.start();
                break;
            case R.id.kedi_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.kedi);
                cal.start();
                break;
            case R.id.k_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.k);
                cal.start();
                break;
            case R.id.karpuz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.karpuz);
                cal.start();
                break;

            case R.id.lale_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.lale);
                cal.start();
                break;
            case R.id.l_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.l);
                cal.start();
                break;
            case R.id.limon_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.limon);
                cal.start();
                break;
            case R.id.muz_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.muz);
                cal.start();
                break;
            case R.id.m_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.m);
                cal.start();
                break;
            case R.id.maymun_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.maymun);
                cal.start();
                break;
            case R.id.nota_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.nota);
                cal.start();
                break;
            case R.id.n_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.n);
                cal.start();
                break;
            case R.id.nar_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.nar);
                cal.start();
                break;
            case R.id.oyuncak_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.oyuncak);
                cal.start();
                break;
            case R.id.o_btn:
                MediaPlayer cal=MediaPlayer.create(getApplicationContext(),R.raw.o);
                cal.start();
                break;
            case R.id.otobus_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.otobus);
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

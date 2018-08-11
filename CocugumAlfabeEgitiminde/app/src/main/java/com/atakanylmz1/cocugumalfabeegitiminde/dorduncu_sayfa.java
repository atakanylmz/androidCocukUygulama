package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class dorduncu_sayfa extends Activity {
    MediaPlayer cal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorduncu_sayfa);
        cal=MediaPlayer.create(getApplicationContext(),R.raw.a);

    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.dorttenbese_btn){
            Intent niyet=new Intent(getApplicationContext(),besinci_sayfa.class);
            startActivity(niyet);
        }
        else if(v.getId()==R.id.dorttenuce_btn){
            Intent niyet=new Intent(getApplicationContext(),ucuncu_sayfa.class);
            startActivity(niyet);
        }
        else if (v.getId()==R.id.homedort_btn){
            Intent niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
    }

    public void sescal(View v){
        cal.reset();
        switch(v.getId()){
            case R.id.ordek_btn:
                cal= MediaPlayer.create(getApplicationContext(),R.raw.ordek);
                cal.start();
                break;
            case  R.id.oo_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.oo);
                cal.start();
                break;
            case  R.id.onluk_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.onluk);
                cal.start();
                break;
            case R.id.pasta_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.pasta);
                cal.start();
                break;
            case R.id.p_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.p);
                cal.start();
                break;
            case R.id.panda_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.panda);
                cal.start();
                break;

            case R.id.robot_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.robot);
                cal.start();
                break;
            case R.id.r_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.r);
                cal.start();
                break;
            case R.id.roket_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.roket);
                cal.start();
                break;
            case R.id.saat_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.saat);
                cal.start();
                break;
            case R.id.s_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.s);
                cal.start();
                break;
            case R.id.sincap_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.sincap);
                cal.start();
                break;
            case R.id.ssapka_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.sapka);
                cal.start();
                break;
            case R.id.ss_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.ss);
                cal.start();
                break;
            case R.id.ssemsiye_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.semsiye);
                cal.start();
                break;
            case R.id.tavsan_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.tavsan);
                cal.start();
                break;
            case R.id.t_btn:
                MediaPlayer cal=MediaPlayer.create(getApplicationContext(),R.raw.t);
                cal.start();
                break;
            case R.id.tavuk_btn:
                cal=MediaPlayer.create(getApplicationContext(),R.raw.tavuk);
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

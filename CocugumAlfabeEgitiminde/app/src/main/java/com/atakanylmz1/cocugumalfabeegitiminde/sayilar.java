package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageButton;

public class sayilar extends Activity {
    MediaPlayer soru,guzel,tekrar;
    int secilenHarfSira,istenenHarfSira;
    Intent niyet;
    ImageButton bir,iki,uc,dort,bes,alti,yedi,sekiz,dokuz,on;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayilar);
        butonAdlandir();
        istenenHarfSira=(int)(Math.random()*9)+1;
        guzel = MediaPlayer.create(getApplicationContext(), R.raw.guzel);
        tekrar = MediaPlayer.create(getApplicationContext(), R.raw.tekrar);
        soruSor(istenenHarfSira);

    }


    public void caliyormu(MediaPlayer medya){
        if(medya.isPlaying())
            caliyormu(medya);
    }

    @Override
    protected void onResume() {
        super.onResume();
        soru.start();
        caliyormu(soru);

    }

    public void butonAdlandir(){
        bir= (ImageButton) findViewById(R.id.bir_btn);
        iki= (ImageButton) findViewById(R.id.iki_btn);
        uc= (ImageButton) findViewById(R.id.uc_btn);
        dort= (ImageButton) findViewById(R.id.dort_btn);
        bes= (ImageButton) findViewById(R.id.bes_btn);
        alti= (ImageButton) findViewById(R.id.alti_btn);
        yedi= (ImageButton) findViewById(R.id.yedi_btn);
        sekiz= (ImageButton) findViewById(R.id.sekiz_btn);
        dokuz= (ImageButton) findViewById(R.id.dokuz_btn);
        on= (ImageButton) findViewById(R.id.on_btn);
    }

    public void kontrolEt(View v){

        if(tekrar.isPlaying()||soru.isPlaying()||guzel.isPlaying())
        {}
        else{

            secilenHarfSira = siraBul(v);
            if (secilenHarfSira == istenenHarfSira) {
                guzel.start();
                caliyormu(guzel);
                soru.reset();
                istenenHarfSira=(int)(Math.random()*9)+1;
                soruSor(istenenHarfSira);
                soru.start();
            }
            else {
                tekrar.start();
                caliyormu(tekrar);
                soru.start();
            }
        }
    }
    public  int siraBul(View v){
        switch (v.getId()){
            case R.id.bir_btn:
                return 1;
            case R.id.iki_btn:
                return 2;
            case R.id.uc_btn:
                return 3;
            case R.id.dort_btn:
                return 4;
            case R.id.bes_btn:
                return 5;
            case R.id.alti_btn:
                return 6;
            case R.id.yedi_btn:
                return 7;
            case R.id.sekiz_btn:
                return 8;
            case R.id.dokuz_btn:
                return 9;
            case R.id.on_btn:
                return 10;
        }
        return 0;
    }
    public void soruSor(int sira){
        switch (sira){
            case 1:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.bir);
                break;
            case 2:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.iki);
                break;
            case 3:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.uc);
                break;
            case 4:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.dort);
                break;
            case 5:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.bes);
                break;
            case 6:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.alti);
                break;
            case 7:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.yedi);
                break;
            case 8:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.sekiz);
                break;
            case 9:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.dokuz);
                break;
            case 10:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.on);
                break;

            default:
                break;
        }
    }
    public void sayfa_degis(View v){
        if (v.getId()==R.id.homesayilar_btn){
            niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
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

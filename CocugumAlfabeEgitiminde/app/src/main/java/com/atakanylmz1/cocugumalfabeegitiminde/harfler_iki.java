package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageButton;

public class harfler_iki extends Activity {
    MediaPlayer soru,guzel,tekrar;
    int secilenHarfSira, istenenHarfSira;
    Intent niyet;
    ImageButton a2,b2,c2,cc2,d2,e2,f2,g2,gg2,h2,ii2,i2,j2,k2,l2,m2,n2,o2,oo2,p2,r2,s2,ss2,t2,u2,uu2,v2,y2,z2;
    boolean yeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler_iki);
        butonAdlandir2();
        istenenHarfSira = (int) (Math.random() * 28) + 1;
        guzel = MediaPlayer.create(getApplicationContext(), R.raw.guzel);
        tekrar = MediaPlayer.create(getApplicationContext(), R.raw.tekrar);
        soruSor2(istenenHarfSira);
    }

    private void medyaReset2(){
        guzel.reset();
        tekrar.reset();
        soru.reset();
    }

    @Override
    protected void onResume() {
        super.onResume();
        soru.start();
        caliyormu2(soru);
        yeter=false;
    }

    public void caliyormu2(MediaPlayer medya){
        if(medya.isPlaying())
            caliyormu2(medya);
    }

    private void butonAdlandir2(){
        a2= (ImageButton) findViewById(R.id.a2_btn);
        b2= (ImageButton) findViewById(R.id.b2_btn);
        c2= (ImageButton) findViewById(R.id.c2_btn);
        cc2= (ImageButton) findViewById(R.id.cc2_btn);
        d2= (ImageButton) findViewById(R.id.d2_btn);
        e2= (ImageButton) findViewById(R.id.e2_btn);
        f2= (ImageButton) findViewById(R.id.f2_btn);
        g2= (ImageButton) findViewById(R.id.g2_btn);
        gg2= (ImageButton) findViewById(R.id.gg2_btn);
        h2= (ImageButton) findViewById(R.id.h2_btn);
        ii2= (ImageButton) findViewById(R.id.ii2_btn);
        i2= (ImageButton) findViewById(R.id.i2_btn);
        j2= (ImageButton) findViewById(R.id.j2_btn);
        k2= (ImageButton) findViewById(R.id.k2_btn);
        l2= (ImageButton) findViewById(R.id.l2_btn);
        m2= (ImageButton) findViewById(R.id.m2_btn);
        n2= (ImageButton) findViewById(R.id.n2_btn);
        o2= (ImageButton) findViewById(R.id.o2_btn);
        oo2= (ImageButton) findViewById(R.id.oo2_btn);
        p2= (ImageButton) findViewById(R.id.p2_btn);
        r2= (ImageButton) findViewById(R.id.r2_btn);
        s2= (ImageButton) findViewById(R.id.s2_btn);
        ss2= (ImageButton) findViewById(R.id.ss2_btn);
        t2= (ImageButton) findViewById(R.id.t2_btn);
        u2= (ImageButton) findViewById(R.id.u2_btn);
        uu2= (ImageButton) findViewById(R.id.uu2_btn);
        v2= (ImageButton) findViewById(R.id.v2_btn);
        y2= (ImageButton) findViewById(R.id.y2_btn);
        z2= (ImageButton) findViewById(R.id.z2_btn);
    }

    public void kontrolEt2(View v) {
        if(tekrar.isPlaying()||soru.isPlaying()||guzel.isPlaying()||yeter==true)
        {}
        else{
          secilenHarfSira = siraBul2(v);
          if (secilenHarfSira == istenenHarfSira) {
              guzel.start();
              caliyormu2(guzel);
              medyaReset2();
              sayfa_degis2(v);
              yeter=true;
              // sonraki sayfanın onResume veya onCreate içinde soruSor()
          }
          else {
              tekrar.start();
              caliyormu2(tekrar);
              soru.start();
          }
      }
    }

    public int siraBul2(View v) {
        switch (v.getId()) {
            case R.id.a2_btn:
                return 1;
            case R.id.b2_btn:
                return 2;
            case R.id.c2_btn:
                return 3;
            case R.id.cc2_btn:
                return 4;
            case R.id.d2_btn:
                return 5;
            case R.id.e2_btn:
                return 6;
            case R.id.f2_btn:
                return 7;
            case R.id.g2_btn:
                return 8;
            case R.id.gg2_btn:
                return 9;
            case R.id.h2_btn:
                return 10;
            case R.id.ii2_btn:
                return 11;
            case R.id.i2_btn:
                return 12;
            case R.id.j2_btn:
                return 13;
            case R.id.k2_btn:
                return 14;
            case R.id.l2_btn:
                return 15;
            case R.id.m2_btn:
                return 16;
            case R.id.n2_btn:
                return 17;
            case R.id.o2_btn:
                return 18;
            case R.id.oo2_btn:
                return 19;
            case R.id.p2_btn:
                return 20;
            case R.id.r2_btn:
                return 21;
            case R.id.s2_btn:
                return 22;
            case R.id.ss2_btn:
                return 23;
            case R.id.t2_btn:
                return 24;
            case R.id.u2_btn:
                return 25;
            case R.id.uu2_btn:
                return 26;
            case R.id.v2_btn:
                return 27;
            case R.id.y2_btn:
                return 28;
            case R.id.z2_btn:
                return 29;
        }
        return 0;
    }

    public void soruSor2(int sira){
        switch (sira){
            case 1:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.a);
                break;
            case 2:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.b);
                break;
            case 3:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.c);
                break;
            case 4:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.cc);
                break;
            case 5:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.d);
                break;
            case 6:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.e);
                break;
            case 7:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.f);
                break;
            case 8:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.g);
                break;
            case 9:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.gg);
                break;
            case 10:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.h);
                break;
            case 11:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.ii);
                break;
            case 12:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.i);
                break;
            case 13:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.j);
                break;
            case 14:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.k);
                break;
            case 15:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.l);
                break;
            case 16:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.m);
                break;
            case 17:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.n);
                break;
            case 18:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.o);
                break;
            case 19:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.oo);
                break;
            case 20:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.p);
                break;
            case 21:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.r);
                break;
            case 22:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.s);
                break;
            case 23:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.ss);
                break;
            case 24:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.t);
                break;
            case 25:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.u);
                break;
            case 26:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.uu);
                break;
            case 27:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.v);
                break;
            case 28:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.y);
                break;
            case 29:
                soru=MediaPlayer.create(getApplicationContext(),R.raw.z);
                break;
            default:
                break;
        }
    }

    public void sayfa_degis2(View v) {
        if (v.getId() == R.id.homeHarfler2_btn) {
            niyet = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(niyet);
        } else {
            niyet=new Intent(getApplicationContext(),harfler_uc.class);
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


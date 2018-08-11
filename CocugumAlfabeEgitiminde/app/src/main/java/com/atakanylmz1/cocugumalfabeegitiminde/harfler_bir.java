package com.atakanylmz1.cocugumalfabeegitiminde;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageButton;

public class harfler_bir extends Activity {
    MediaPlayer soru,guzel,tekrar;
    int secilenHarfSira,istenenHarfSira;
    Intent niyet;
    ImageButton a1,b1,c1,cc1,d1,e1,f1,g1,gg1,h1,ii1,i1,j1,k1,l1,m1,n1,o1,oo1,p1,r1,s1,ss1,t1,u1,uu1,v1,y1,z1;
    boolean yeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler_bir);
        butonAdlandir1();
        istenenHarfSira=(int)(Math.random()*28)+1;
        guzel = MediaPlayer.create(getApplicationContext(), R.raw.guzel);
        tekrar = MediaPlayer.create(getApplicationContext(), R.raw.tekrar);
        soruSor1(istenenHarfSira);

    }

    private void medyaReset1(){
        guzel.reset();
        tekrar.reset();
        soru.reset();
    }
    public void caliyormu1(MediaPlayer medya){
        if(medya.isPlaying())
            caliyormu1(medya);
    }

    @Override
    protected void onResume() {
        super.onResume();
        soru.start();
        caliyormu1(soru);
        yeter=false;
    }

    public void butonAdlandir1(){
        a1= (ImageButton) findViewById(R.id.a1_btn);
        b1= (ImageButton) findViewById(R.id.b1_btn);
        c1= (ImageButton) findViewById(R.id.c1_btn);
        cc1= (ImageButton) findViewById(R.id.cc1_btn);
        d1= (ImageButton) findViewById(R.id.d1_btn);
        e1= (ImageButton) findViewById(R.id.e1_btn);
        f1= (ImageButton) findViewById(R.id.f1_btn);
        g1= (ImageButton) findViewById(R.id.g1_btn);
        gg1= (ImageButton) findViewById(R.id.gg1_btn);
        h1= (ImageButton) findViewById(R.id.h1_btn);
        ii1= (ImageButton) findViewById(R.id.ii1_btn);
        i1= (ImageButton) findViewById(R.id.i1_btn);
        j1= (ImageButton) findViewById(R.id.j1_btn);
        k1= (ImageButton) findViewById(R.id.k1_btn);
        l1= (ImageButton) findViewById(R.id.l1_btn);
        m1= (ImageButton) findViewById(R.id.m1_btn);
        n1= (ImageButton) findViewById(R.id.n1_btn);
        o1= (ImageButton) findViewById(R.id.o1_btn);
        oo1= (ImageButton) findViewById(R.id.oo1_btn);
        p1= (ImageButton) findViewById(R.id.p1_btn);
        r1= (ImageButton) findViewById(R.id.r1_btn);
        s1= (ImageButton) findViewById(R.id.s1_btn);
        ss1= (ImageButton) findViewById(R.id.ss1_btn);
        t1= (ImageButton) findViewById(R.id.t1_btn);
        u1= (ImageButton) findViewById(R.id.u1_btn);
        uu1= (ImageButton) findViewById(R.id.uu1_btn);
        v1= (ImageButton) findViewById(R.id.v1_btn);
        y1= (ImageButton) findViewById(R.id.y1_btn);
        z1= (ImageButton) findViewById(R.id.z1_btn);
    }

    public void kontrolEt1(View v){

        if(tekrar.isPlaying()||soru.isPlaying()||guzel.isPlaying()||yeter==true)
        {}
        else{

            secilenHarfSira = siraBul1(v);
            if (secilenHarfSira == istenenHarfSira) {
                guzel.start();
                caliyormu1(guzel);
                medyaReset1();
                sayfa_degis1(v);
                yeter=true;
                // sonraki sayfanın onResume veya onCreate içinde soruSor()
            }
            else {
                tekrar.start();
                caliyormu1(tekrar);
                soru.start();
            }
        }
    }
    public  int siraBul1(View v){
        switch (v.getId()){
            case R.id.a1_btn:
                return 1;
            case R.id.b1_btn:
                return 2;
            case R.id.c1_btn:
                return 3;
            case R.id.cc1_btn:
                return 4;
            case R.id.d1_btn:
                return 5;
            case R.id.e1_btn:
                return 6;
            case R.id.f1_btn:
                return 7;
            case R.id.g1_btn:
                return 8;
            case R.id.gg1_btn:
                return 9;
            case R.id.h1_btn:
                return 10;
            case R.id.ii1_btn:
                return 11;
            case R.id.i1_btn:
                return 12;
            case R.id.j1_btn:
                return 13;
            case R.id.k1_btn:
                return 14;
            case R.id.l1_btn:
                return 15;
            case R.id.m1_btn:
                return 16;
            case R.id.n1_btn:
                return 17;
            case R.id.o1_btn:
                return 18;
            case R.id.oo1_btn:
                return 19;
            case R.id.p1_btn:
                return 20;
            case R.id.r1_btn:
                return 21;
            case R.id.s1_btn:
                return 22;
            case R.id.ss1_btn:
                return 23;
            case R.id.t1_btn:
                return 24;
            case R.id.u1_btn:
                return 25;
            case R.id.uu1_btn:
                return 26;
            case R.id.v1_btn:
                return 27;
            case R.id.y1_btn:
                return 28;
            case R.id.z1_btn:
                return 29;
        }
        return 0;
    }
    public void soruSor1(int sira){
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
    public void sayfa_degis1(View v){
        if (v.getId()==R.id.homeHarfler1_btn){
            niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
        else{
            niyet=new Intent(getApplicationContext(),harfler_iki.class);
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

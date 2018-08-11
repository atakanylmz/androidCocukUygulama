package com.atakanylmz1.cocugumalfabeegitiminde;

        import android.app.Activity;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.media.MediaPlayer;
        import android.os.Bundle;
        import android.support.v7.app.AlertDialog;
        import android.view.View;
        import android.widget.ImageButton;

public class harfler_uc extends Activity {
    MediaPlayer soru,guzel,tekrar;
    int secilenHarfSira,istenenHarfSira;
    Intent niyet;
    ImageButton a1,b1,c1,cc1,d1,e1,f1,g1,gg1,h1,ii1,i1,j1,k1,l1,m1,n1,o1,oo1,p1,r1,s1,ss1,t1,u1,uu1,v1,y1,z1;
    boolean yeter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harfler_uc);
        butonAdlandir3();
        istenenHarfSira=(int)(Math.random()*28)+1;
        guzel = MediaPlayer.create(getApplicationContext(), R.raw.guzel);
        tekrar = MediaPlayer.create(getApplicationContext(), R.raw.tekrar);
        soruSor3(istenenHarfSira);
    }

    private void medyaReset3(){
        guzel.reset();
        tekrar.reset();
        soru.reset();
    }
    private void caliyormu3(MediaPlayer medya){
        if(medya.isPlaying())
            caliyormu3(medya);
    }

    @Override
    protected void onResume() {
        super.onResume();
        soru.start();
        caliyormu3(soru);
        yeter=false;
    }

    public void butonAdlandir3(){
        a1= (ImageButton) findViewById(R.id.a3_btn);
        b1= (ImageButton) findViewById(R.id.b3_btn);
        c1= (ImageButton) findViewById(R.id.c3_btn);
        cc1= (ImageButton) findViewById(R.id.cc3_btn);
        d1= (ImageButton) findViewById(R.id.d3_btn);
        e1= (ImageButton) findViewById(R.id.e3_btn);
        f1= (ImageButton) findViewById(R.id.f3_btn);
        g1= (ImageButton) findViewById(R.id.g3_btn);
        gg1= (ImageButton) findViewById(R.id.gg3_btn);
        h1= (ImageButton) findViewById(R.id.h3_btn);
        ii1= (ImageButton) findViewById(R.id.ii3_btn);
        i1= (ImageButton) findViewById(R.id.i3_btn);
        j1= (ImageButton) findViewById(R.id.j3_btn);
        k1= (ImageButton) findViewById(R.id.k3_btn);
        l1= (ImageButton) findViewById(R.id.l3_btn);
        m1= (ImageButton) findViewById(R.id.m3_btn);
        n1= (ImageButton) findViewById(R.id.n3_btn);
        o1= (ImageButton) findViewById(R.id.o3_btn);
        oo1= (ImageButton) findViewById(R.id.oo3_btn);
        p1= (ImageButton) findViewById(R.id.p3_btn);
        r1= (ImageButton) findViewById(R.id.r3_btn);
        s1= (ImageButton) findViewById(R.id.s3_btn);
        ss1= (ImageButton) findViewById(R.id.ss3_btn);
        t1= (ImageButton) findViewById(R.id.t3_btn);
        u1= (ImageButton) findViewById(R.id.u3_btn);
        uu1= (ImageButton) findViewById(R.id.uu3_btn);
        v1= (ImageButton) findViewById(R.id.v3_btn);
        y1= (ImageButton) findViewById(R.id.y3_btn);
        z1= (ImageButton) findViewById(R.id.z3_btn);
    }

    public void kontrolEt3(View v){

        if(tekrar.isPlaying()||soru.isPlaying()||guzel.isPlaying()||yeter==true)
        {}
        else{

            secilenHarfSira = siraBul3(v);
            if (secilenHarfSira == istenenHarfSira) {
                guzel.start();
                caliyormu3(guzel);
                medyaReset3();
                sayfa_degis3(v);
                yeter=true;
                // sonraki sayfanın onResume veya onCreate içinde soruSor()
            }
            else {
                tekrar.start();
                caliyormu3(tekrar);
                soru.start();
            }
        }
    }
    public  int siraBul3(View v){
        switch (v.getId()){
            case R.id.a3_btn:
                return 1;
            case R.id.b3_btn:
                return 2;
            case R.id.c3_btn:
                return 3;
            case R.id.cc3_btn:
                return 4;
            case R.id.d3_btn:
                return 5;
            case R.id.e3_btn:
                return 6;
            case R.id.f3_btn:
                return 7;
            case R.id.g3_btn:
                return 8;
            case R.id.gg3_btn:
                return 9;
            case R.id.h3_btn:
                return 10;
            case R.id.ii3_btn:
                return 11;
            case R.id.i3_btn:
                return 12;
            case R.id.j3_btn:
                return 13;
            case R.id.k3_btn:
                return 14;
            case R.id.l3_btn:
                return 15;
            case R.id.m3_btn:
                return 16;
            case R.id.n3_btn:
                return 17;
            case R.id.o3_btn:
                return 18;
            case R.id.oo3_btn:
                return 19;
            case R.id.p3_btn:
                return 20;
            case R.id.r3_btn:
                return 21;
            case R.id.s3_btn:
                return 22;
            case R.id.ss3_btn:
                return 23;
            case R.id.t3_btn:
                return 24;
            case R.id.u3_btn:
                return 25;
            case R.id.uu3_btn:
                return 26;
            case R.id.v3_btn:
                return 27;
            case R.id.y3_btn:
                return 28;
            case R.id.z3_btn:
                return 29;
        }
        return 0;
    }
    public void soruSor3(int sira){
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
    public void sayfa_degis3(View v){
        if (v.getId()==R.id.homeHarfler3_btn){
            niyet=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(niyet);
        }
        else{
            niyet=new Intent(getApplicationContext(),harfler_dort.class);
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

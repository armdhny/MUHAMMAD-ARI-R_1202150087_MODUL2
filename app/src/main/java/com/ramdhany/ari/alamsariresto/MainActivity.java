package com.ramdhany.ari.alamsariresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button a;
    private RadioGroup b;
    private RadioButton c,d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi sesuai ID yang ada pada activity_main
        a = (Button)findViewById (R.id.btnPesan);
        b = (RadioGroup) findViewById(R.id.pilih);
        c = (RadioButton)findViewById(R.id.dinein);
        d = (RadioButton) findViewById(R.id.takeaway);
    }

    public void onClickPilih(View view) {

    }

    public void onClickPesanan(View view) {
        // untuk mengecek button sudah ditekan
        boolean checked = ((RadioButton) view).isChecked();
        // jika dipilih buttonn dine in maka dine in yang akan jalan
        //menggunakan break agar tidak melanjutkan ke case selanjutnya
        switch(view.getId()) {
            case R.id.dinein:
                if (checked)
                    dine();
                break;
            case R.id.takeaway:
                if (checked)
                    take();
                break;
        }
    }
    //menampilkan toast saat radio button di klik
    private void take() {
        Toast.makeText(this,"Take Away",Toast.LENGTH_LONG).show();
    }
    //menampilkan toast saat radio button di klik
    private void dine() {
        Toast.makeText(this,"Dine in",Toast.LENGTH_LONG).show();
    }

    public void Pesan(View view) {
        int item = b.getCheckedRadioButtonId();
        
        if (item == c.getId()){
            Toast.makeText(this, "Dine In", Toast.LENGTH_LONG).show();

            //memindahkan ke aktivitas dari mainactivity ke dinein class
            Intent e = new Intent(MainActivity.this, DineInActivity.class);
            startActivity(e);

        }else if (item == d.getId()){
            Toast.makeText(this, "Take Away", Toast.LENGTH_LONG).show();

            //memindahkan ke aktivitas dari mainactivity ke takeaway class
            Intent f = new Intent(MainActivity.this, TakeAway.class);
            startActivity(f);
        }else {
            Toast.makeText(this,"Pilih salah satu!",Toast.LENGTH_SHORT).show();
        }
    }
}

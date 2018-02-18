package com.ramdhany.ari.alamsariresto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class DineInActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner sMeja;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        // Membuat Spinner
        sMeja = (Spinner) findViewById(R.id.label_spinner);
        if (sMeja != null) {
            sMeja.setOnItemSelectedListener(this);
        }

        // Membuat aray adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.array_meja, android.R.layout.simple_spinner_item);

        // memunculkan layout dropdown
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);

        // mengaplikasikan adapter ke spinner
        if (sMeja != null) {
            sMeja.setAdapter(adapter);
        }

    }
    public void ShowOrder(View view) {
        //Mengambil nilai dari EditText Nama
        name = (EditText) findViewById(R.id.editText2);
        String a = sMeja.getSelectedItem().toString();

        // Kalau spinner tidak diisi
        if (name == null){
            Toast.makeText(this,"Anda Harus Pilih Nomor Meja",Toast.LENGTH_LONG).show();
        }
        // memilih meja 1 maka muncul toast
        else if (a.equalsIgnoreCase("Meja 1")){
            String nama = name.getText().toString();
            Toast.makeText(this,"Anda ," + nama + " memilih meja 1",Toast.LENGTH_LONG).show();
        }
        // memilih meja 2 maka muncul toast
        else if (a.equalsIgnoreCase("Meja 2")){
            String nama = name.getText().toString();
            Toast.makeText(this,"Anda ," + nama + " memilih meja 2",Toast.LENGTH_LONG).show();
        }
        // memilih meja 3 maka muncul toast
        else if (a.equalsIgnoreCase("Meja 3")){
            String nama = name.getText().toString();
            Toast.makeText(this,"Anda , " + nama + " memilih meja 3",Toast.LENGTH_LONG).show();
        }
        // memilih meja 4 maka muncul toast
        else if (a.equalsIgnoreCase("Meja 4")){
            String nama = name.getText().toString();
            Toast.makeText(this,"Anda ," + nama + " memilih meja 4",Toast.LENGTH_LONG).show();
        }
        //intent
        //Intent r = new Intent(DineInActivity.this,DaftarMenu.class);
        //startActivity(r);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {


    }
}

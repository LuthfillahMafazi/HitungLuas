package com.example.lutfillahmafazi.hitungluas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtJdl;
    Button btnStart;
    EditText edtText;
    Integer panjang,lebar,hasil;
    EditText edtPanjang;
    EditText edtLebar;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtJdl = findViewById(R.id.txtJudul);
        btnStart = findViewById(R.id.btnStart);
        edtText = findViewById(R.id.edtText);

        // Cara membuat variabe widget langsung mengisinya/inisiasi
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        txtHasil = findViewById(R.id.txtHasil);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isiEditTxt = edtText.getText().toString();
                hitung();
            }
        });
    }
    public void hitung(){
        String isiEditText = edtText.getText().toString();
        //memasukan input panjang dan lebar dari user ke dalam variable
        panjang = Integer.valueOf(edtPanjang.getText().toString());
        lebar = Integer.valueOf(edtLebar.getText().toString());
        // menghitung luas persegi panjang = p * l
        hasil = panjang * lebar;

        //cetak hasil
        txtHasil.setText("HELLO " + isiEditText + ",Hasil luasnya adalah : " + hasil);
    }
}

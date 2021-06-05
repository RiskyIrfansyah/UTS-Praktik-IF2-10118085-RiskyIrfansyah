package com.example.uts_praktik_if2_10118085_riskyirfansyah;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_verif extends Activity {
    /*
    NIM                 : 10118085
    Nama                : Risky Irfansyah
    Kelas               : IF2
    Matakuliah          : Aplikasi Komputasi Bergerak
    Tanggal pengerjaan  : 04 Juni 2021
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verif);
    }

    public void btngreen2(View view) {
        Intent intent = new Intent(this, Dialog.class);
        startActivity(intent);
    }
    public void btngreenwhite(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}

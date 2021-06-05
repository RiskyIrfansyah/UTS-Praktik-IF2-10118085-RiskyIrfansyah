package com.example.uts_praktik_if2_10118085_riskyirfansyah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    /*
    NIM                 : 10118085
    Nama                : Risky Irfansyah
    Kelas               : IF2
    Matakuliah          : Aplikasi Komputasi Bergerak
    Tanggal pengerjaan  : 04 Juni 2021
    */

    public void btngreen1(View view) {
        Intent intent = new Intent(this, Activity_verif.class);
        startActivity(intent);
    }
}
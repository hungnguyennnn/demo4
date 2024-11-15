package com.example.demo4;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class Demo2MainActivity2 extends AppCompatActivity {


    Button btnAn, btnHien;
    BlankFragmen41 frg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_demo2_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnAn = findViewById(R.id.demo42btnAn);
        btnHien = findViewById(R.id.demo42btnHien);
         btnAn.setOnClickListener(v -> {
             //tạo đối tượng quản lí frament
             FragmentManager fragmentManager = getSupportFragmentManager();
             frg =(BlankFragmen41) fragmentManager.findFragmentById(R.id.demo42Fr1);
             //ẩn
             fragmentManager.beginTransaction()
                     .hide(frg)
                     .commit();
         });
         btnHien.setOnClickListener(v -> {
             FragmentManager fragmentManager = getSupportFragmentManager();
             frg =(BlankFragmen41) fragmentManager.findFragmentById(R.id.demo42Fr1);
             //Hiện
             fragmentManager.beginTransaction()
                     .show(frg)
                     .commit();
         });
    }
}
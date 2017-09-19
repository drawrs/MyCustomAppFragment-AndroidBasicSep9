package com.khilman.mycustomapp;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.khilman.mycustomapp.data.ImageAssets;
import com.khilman.mycustomapp.fragment.AnggotaTubuhFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // panggil kelas Fragment manager

        FragmentManager fragmentManager = getSupportFragmentManager();
        // panggil fragment angota tubuh
        AnggotaTubuhFragment kepala = new AnggotaTubuhFragment();
        // set data gambar dan index kedalam class fragment
        kepala.setDataGambar(ImageAssets.getHeads());
        kepala.setIndexGambar(0);
        // isi framelayout bagian kepala dengan fragment kepala
        // lalu commit
        fragmentManager.beginTransaction()
                .add(R.id.kepala_container, kepala)
                .commit();

        // panggil fragment angota tubuh
        AnggotaTubuhFragment badan = new AnggotaTubuhFragment();
        // set data gambar dan index kedalam class fragment
        badan.setDataGambar(ImageAssets.getBodies());
        badan.setIndexGambar(0);
        // isi framelayout bagian kepala dengan fragment kepala
        // lalu commit
        fragmentManager.beginTransaction()
                .add(R.id.badan_container, badan)
                .commit();
        // panggil fragment angota tubuh
        AnggotaTubuhFragment kaki = new AnggotaTubuhFragment();
        // set data gambar dan index kedalam class fragment
        kaki.setDataGambar(ImageAssets.getLegs());
        kaki.setIndexGambar(0);
        // isi framelayout bagian kepala dengan fragment kepala
        // lalu commit
        fragmentManager.beginTransaction()
                .add(R.id.kaki_container_container, kaki)
                .commit();

    }
}

package com.khilman.mycustomapp.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.khilman.mycustomapp.R;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnggotaTubuhFragment extends Fragment {

    List<Integer> dataGambar;
    int indexGambar;

    public AnggotaTubuhFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_anggota_tubuh2, container, false);
        final ImageView imgtubuh = (ImageView) view.findViewById(R.id.imgTubuh);
        imgtubuh.setImageResource(dataGambar.get(indexGambar));
        // event onCLick
        imgtubuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // ketika index gambar kurang dari jumlah array list gambar
                if (indexGambar < (dataGambar.size() - 1)){
                    // lakukan increment atau penambahan index dengan + 1
                    indexGambar++;
                } else { // jika tidak
                    // set index kembali 0
                    indexGambar = 0;
                }
                // set resource gambar
                imgtubuh.setImageResource(dataGambar.get(indexGambar));
            }
        });
        return view;
    }

    public List<Integer> getDataGambar() {
        return dataGambar;
    }

    public void setDataGambar(List<Integer> dataGambar) {
        this.dataGambar = dataGambar;
    }

    public int getIndexGambar() {
        return indexGambar;
    }

    public void setIndexGambar(int indexGambar) {
        this.indexGambar = indexGambar;
    }
}

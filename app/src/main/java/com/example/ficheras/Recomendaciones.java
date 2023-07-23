package com.example.ficheras;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Recomendaciones extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recomendaciones,container,false);

        ImageButton imageButton = view.findViewById(R.id.imbPelicula1);
        ImageButton imageButton2 = view.findViewById(R.id.imbPelicula2);
        ImageButton imageButton3 = view.findViewById(R.id.imbPelicula3);
        ImageButton imageButton4 = view.findViewById(R.id.imbPelicula4);
        ImageButton imageButton5 = view.findViewById(R.id.imbPelicula5);
        ImageButton imageButton6 = view.findViewById(R.id.imbPelicula6);
        ImageButton imageButton7 = view.findViewById(R.id.imbPelicula7);
        ImageButton imageButton8 = view.findViewById(R.id.imbPelicula8);
        ImageButton imageButton9 = view.findViewById(R.id.imbPelicula9);
        ImageButton imageButton10 = view.findViewById(R.id.imbPelicula10);
        ImageButton imageButton11 = view.findViewById(R.id.imbPelicula11);
        ImageButton imageButton12 = view.findViewById(R.id.imbPelicula12);
        ImageButton imageButton13 = view.findViewById(R.id.imbPelicula13);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula1.class);
                startActivity(intent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula2.class);
                startActivity(intent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula3.class);
                startActivity(intent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula4.class);
                startActivity(intent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula5.class);
                startActivity(intent);
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula6.class);
                startActivity(intent);
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula7.class);
                startActivity(intent);
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula8.class);
                startActivity(intent);
            }
        });

        imageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula9.class);
                startActivity(intent);
            }
        });

        imageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula10.class);
                startActivity(intent);
            }
        });

        imageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula11.class);
                startActivity(intent);
            }
        });

        imageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula12.class);
                startActivity(intent);
            }
        });

        imageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Pelicula13.class);
                startActivity(intent);
            }
        });

        return view;

    }

}
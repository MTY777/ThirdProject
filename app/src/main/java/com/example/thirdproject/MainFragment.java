package com.example.thirdproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class MainFragment extends Fragment {
    private ArrayList<String> language;
    private TPAdapter adapter;
    private RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        laodData();
        recyclerView = view.findViewById(R.id.recycle);
        adapter = new TPAdapter(language);
        recyclerView.setAdapter(adapter);
    }

    private void laodData() {
        language = new ArrayList<>();
        language.add("Java");
        language.add("Kotlin");
        language.add("JS");
        language.add("Python");
        language.add("Swift");
        language.add("C++");
        language.add("C#");
        language.add("C");
        language.add("Go");
    }
}
package com.grupotres.foodpal.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grupotres.foodpal.R;
import com.grupotres.foodpal.classes.Items;
import com.grupotres.foodpal.classes.PiramideAdapter;

public class PiramideFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_piramide, container, false);

        recyclerView = view.findViewById(R.id.simple_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        adapter = new PiramideAdapter(getActivity(), new Items().getItems());
        recyclerView.setAdapter(adapter);

        return view;
    }
}

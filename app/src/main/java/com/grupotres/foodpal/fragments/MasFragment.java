package com.grupotres.foodpal.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.grupotres.foodpal.R;
import com.grupotres.foodpal.activities.WebViewActivity;

public class MasFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mas, container, false);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), WebViewActivity.class);
                intent.putExtra("productosUrl", view.getTag().toString());
                startActivity(intent);
            }
        };

        view.findViewById(R.id.sancor_button).setOnClickListener(onClickListener);

        view.findViewById(R.id.serenisima_button).setOnClickListener(onClickListener);

        view.findViewById(R.id.arcor_button).setOnClickListener(onClickListener);

        view.findViewById(R.id.nutrinfo_button).setOnClickListener(onClickListener);

        return view;
    }

}

package com.salajim.musab.jokestar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class TopJokesFragment extends Fragment {
    public static final String TAG = "TopJokesFragment";

    private Button clickBtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_jokes, container, false);
        clickBtn = (Button) view.findViewById(R.id.sub);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "You just clicked me!", Toast.LENGTH_LONG).show();
            }
        });

        return view;
    }
}

package com.pabloguevara.ct;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class EmbalseFragment extends Fragment {

    private Button bEmbalse;


    public EmbalseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_embalse, container,false);

        bEmbalse = (Button) rootView.findViewById(R.id.bEmbalse);
        bEmbalse.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag = 7;

                Intent i = new Intent(EmbalseFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}

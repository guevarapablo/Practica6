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
public class VillaFragment extends Fragment {

    private Button bVilla;


    public VillaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_villa, container,false);

        bVilla = (Button) rootView.findViewById(R.id.bVilla);
        bVilla.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag=3;

                Intent i = new Intent(VillaFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}

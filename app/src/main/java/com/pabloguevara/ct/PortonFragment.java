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
public class PortonFragment extends Fragment {

    private Button bPorton;


    public PortonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_porton, container,false);

        bPorton = (Button) rootView.findViewById(R.id.bPorton);
        bPorton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag=2;

                Intent i = new Intent(PortonFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}

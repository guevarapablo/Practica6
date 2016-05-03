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
public class ZarzoFragment extends Fragment {

    private Button bZarzo;


    public ZarzoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_zarzo, container,false);

        bZarzo = (Button) rootView.findViewById(R.id.bZarzo);
        bZarzo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag=6;

                Intent i = new Intent(ZarzoFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}

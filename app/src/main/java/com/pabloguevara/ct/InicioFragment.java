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
public class InicioFragment extends Fragment {

    private Button bInicio;

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_inicio, container,false);

        bInicio = (Button) rootView.findViewById(R.id.bInicio);
        bInicio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                int flag = 0;

                Intent i = new Intent(InicioFragment.this.getActivity(), MapsActivity.class);
                i.putExtra("key",flag);
                startActivity(i);

            }
        });
        return rootView;
    }

}

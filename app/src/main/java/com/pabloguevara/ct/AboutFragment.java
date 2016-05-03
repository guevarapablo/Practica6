package com.pabloguevara.ct;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {

    String Aboutapp = "Colombia Turística V.3.0\nEntrerríos - Antioquia\nPor: Pablo Guevara";

    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), Aboutapp, Toast.LENGTH_LONG).show();
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

}

package com.example.fragmentosbasicos.fragmentos;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragmentosbasicos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImcFragment extends Fragment implements View.OnClickListener {

    private EditText altura;
    private EditText peso;
    private Button button;

    public ImcFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Regresa una vista inflada
//                             Quitar return y ponerla en varisble tipo view
//                             CTRL+alt+V escoger view
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_imc, container, false);

        init(view);
        button.setOnClickListener(this);

        return view;
    }

    private void init(View view)
    {
        altura = (EditText) view.findViewById(R.id.altura);
        peso = (EditText) view.findViewById(R.id.peso);
        button = (Button) view.findViewById(R.id.button);

    }

    @Override
    public void onClick(View view)
    {
        try {
            float height = Float.parseFloat(altura.getText().toString());
            float weight = Float.parseFloat(peso.getText().toString());
            float result = weight / (height);
            Toast.makeText(getContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {


           //Toast.makeText(this,"Introduce una cantidad", Toast.LENGTH_SHORT).show();
        }
    }
    }
//



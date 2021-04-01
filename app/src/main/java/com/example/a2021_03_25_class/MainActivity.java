package com.example.a2021_03_25_class;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvhello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        /*
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,
                        R.array.planets_array,
                        android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

         */

        spinner.setSelection(2, false);
        spinner.setOnItemSelectedListener(spinnerOnItemSelected);
        tvhello= (TextView) findViewById(R.id.hello);
        tvhello.setText("選項:"+spinner.getSelectedItem().toString());
    }
    private AdapterView.OnItemSelectedListener spinnerOnItemSelected =new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String sPos=String.valueOf(position);
            String sInfo=parent.getItemAtPosition(position).toString();
            Toast.makeText(MainActivity.this,"pos:"+position+":"+sInfo,Toast.LENGTH_LONG).show();
            //String sInfo=parent.getSelectedItem().toString();
            tvhello.setText("選項"+sPos+":"+sInfo);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };


}
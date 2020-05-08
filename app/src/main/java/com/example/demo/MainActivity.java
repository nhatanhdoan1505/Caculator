package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private EditText edtA;
    private EditText edtB;
    private TextView tvResult;
    private ListView  listView;
    ArrayList<String> arrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtA = (EditText)findViewById(R.id.edt_A);
        edtB = (EditText)findViewById(R.id.edt_B);
        tvResult = (TextView)findViewById(R.id.tv_Result);
        listView = (ListView)findViewById(R.id.list_view);
    }
    public void plusFunc(View view){
        float a = Integer.parseInt(edtA.getText().toString());
        float b = Integer.parseInt(edtB.getText().toString());
        float result = a + b;
        tvResult.setText("" + result);
        arrayList.add(a + " + " + b + " = " + result);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
    public void minusFunc(View view){
        float a = Integer.parseInt(edtA.getText().toString());
        float b = Integer.parseInt(edtB.getText().toString());
        float result = a  - b;
        tvResult.setText("" + result);
        arrayList.add(a + " - " + b + " = " + result);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
    public void mutipleFunc(View view){
        float a = Integer.parseInt(edtA.getText().toString());
        float b = Integer.parseInt(edtB.getText().toString());
        float result = a * b;
        tvResult.setText("" + result);
        arrayList.add(a + " x " + b + " = " + result);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
    public void divideFunc(View view){
        float a = Integer.parseInt(edtA.getText().toString());
        float b = Integer.parseInt(edtB.getText().toString());
        float result = a / b;
        tvResult.setText("" + result);
        arrayList.add(a + " / " + b + " = " + result);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(arrayAdapter);
    }
}

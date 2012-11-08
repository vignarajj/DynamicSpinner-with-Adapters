package com.move.spinnerselect;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity 
{
Spinner sp1,sp2;
String main[]={"select one","a","b","c","d","e","f","g"};
String a[]={"a1","a2","a3"};
String b[]={"b1","b2","b3"};
String c[]={"c1","c2","c3"};
String d[]={"d1","d2","d3"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=(Spinner)findViewById(R.id.spinner1);
        sp2=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<String> spin1= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,main);
        final ArrayAdapter<String> spin21= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,a);
        final ArrayAdapter<String> spin22= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,b);
        final ArrayAdapter<String> spin23= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,c);
        final ArrayAdapter<String> spin24= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,d);
        sp1.setAdapter(spin1);
        sp2.setVisibility(View.INVISIBLE);
        sp1.setOnItemSelectedListener(new OnItemSelectedListener() 
        {

			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				// TODO Auto-generated method stub
				if(arg2==1)
				{
					sp2.setVisibility(View.VISIBLE);
					sp2.setAdapter(spin21);
				}
				else if(arg2==2)
				{
					sp2.setVisibility(View.VISIBLE);
					sp2.setAdapter(spin22);
				}
				else if(arg2==3)
				{
					sp2.setVisibility(View.VISIBLE);
					sp2.setAdapter(spin23);
				}
				else if(arg2==4)
				{
					sp2.setVisibility(View.VISIBLE);
					sp2.setAdapter(spin24);
				}
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub			
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}

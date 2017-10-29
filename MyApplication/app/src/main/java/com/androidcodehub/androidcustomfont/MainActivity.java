package com.androidcodehub.androidcustomfont;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

	
	TextView tv1,tv2,tv3;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
	tv1=(TextView)findViewById(R.id.textView1);
	
	//tv2=(TextView)findViewById(R.id.textView2);
	
	tv3=(TextView)findViewById(R.id.textView3);
	
		
		tv1.setText("Custom Font1");
		
	//	tv2.setText("Custom Font2");
		
		tv3.setText("Custom Font3");
		

	      Typeface face= Typeface.createFromAsset(getAssets(), "fonts/ginga/Ginga.ttf");
	   
	      tv1.setTypeface(face);
	      
	      
//	      Typeface face1= Typeface.createFromAsset(getAssets(), "fonts/sniper/SNIPER_.ttf");
//
//	      tv2.setTypeface(face1);
	      
	      Typeface face2= Typeface.createFromAsset(getAssets(), "fonts/youmurderer-bb/youmurdererbb_reg.ttf");
		   
	      tv3.setTypeface(face2);  
	      
	      
		
		
		
	}
}

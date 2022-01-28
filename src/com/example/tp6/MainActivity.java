package com.example.tp6;

import java.text.DecimalFormat;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements  
View.OnClickListener{

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);
        
        Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);
        
        Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);
        
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);
        
        Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);
        
        Button button5=(Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);
        
        
    }
    @Override
    public void onClick(View v){
    	DecimalFormat df = new DecimalFormat ("0.00");
	  	if( v.getId()==R.id.button1){ 		
		  	try {
		  	  EditText t= (EditText)findViewById(R.id.editText);
		      double n = Double.parseDouble(t.getText().toString());
		      EditText t1= (EditText)findViewById(R.id.editText1);
		      double n21 = Double.parseDouble(t1.getText().toString());
		      double r = n+n21;
		      TextView ts= (TextView)findViewById(R.id.text3);
		      ts.setText("" + df.format(r));
		  	}
		  	catch (Exception e){
		  		Toast.makeText(getApplicationContext(), "erreur" ,Toast.LENGTH_SHORT ).show();
		  	}	
	  	}
	  	else if ( v.getId()==R.id.button2){
	  	  	try {
	  	  	  EditText t2= (EditText)findViewById(R.id.editText);
	  	      double n2 = Double.parseDouble(t2.getText().toString());
	  	      EditText t12= (EditText)findViewById(R.id.editText1);
	  	      double n22 = Double.parseDouble(t12.getText().toString());
	  	      
	  	      double r1 = n2-n22;
	  	      TextView ts1= (TextView)findViewById(R.id.text3);
	  	      ts1.setText("" + df.format(r1));
	  	  	}
	  	  	catch (Exception e){
	  	  		Toast.makeText(getApplicationContext(), "erreur" ,Toast.LENGTH_SHORT ).show();
	  	  	}
	  	}   
	  	
		else if ( v.getId()==R.id.button3){
	  	  	try {
	  	  	  EditText t3= (EditText)findViewById(R.id.editText);
	  	      double n3 = Double.parseDouble(t3.getText().toString());
	  	      EditText t13= (EditText)findViewById(R.id.editText1);
	  	      double n23 = Double.parseDouble(t13.getText().toString());
	  	      double r2 = n3*n23;
	  	      TextView ts1= (TextView)findViewById(R.id.text3);
	  	      ts1.setText("" + df.format(r2));
	  	  	}
	  	  	catch (Exception e){
	  	  		Toast.makeText(getApplicationContext(), "erreur" ,Toast.LENGTH_SHORT ).show();
	  	  	}
	  	}   
	  
		else if ( v.getId()==R.id.button4){
	  	  	try {
	  	  	  EditText t4= (EditText)findViewById(R.id.editText);
	  	      double n4 = Double.parseDouble(t4.getText().toString());
	  	      EditText t14= (EditText)findViewById(R.id.editText1);
	  	      double n24 = Double.parseDouble(t14.getText().toString());
	  	      double r4 = n4/n24;
	    	   if (n24==0){
	      	    	Toast.makeText(getApplicationContext(), "Impossible de diviser par 0", Toast.LENGTH_LONG).show();
	      	    }
	    	    else{
	  	      TextView ts1= (TextView)findViewById(R.id.text3);
	  	      ts1.setText("" + r4);}
	  	  	}
	   /*  catch (DivideByZeroException){
		
	}*/
	  	  	catch (Exception e){
	  	  		Toast.makeText(getApplicationContext(), "erreur" ,Toast.LENGTH_SHORT ).show();
	  	  	}
		 }
	  	  else 
	  	  	{
	  		  	EditText t5= (EditText)findViewById(R.id.editText);
		  	  	t5.setText("");
		  	  	EditText t51= (EditText)findViewById(R.id.editText1);
		  	  	t51.setText("");
		  	  	TextView t52= (TextView)findViewById(R.id.text3);
		
		  	  	t52.setText("");
	  	  	}  	
	   
	  
	}
}


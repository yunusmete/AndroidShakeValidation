package com.mete.yunus.shakevalidate;

import com.mete.yunus.shakevalidate.component.ValidationEditText;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.PasswordTransformationMethod;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	ValidationEditText email, id, sifre;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		email = (ValidationEditText) findViewById(R.id.et_valid);
		email.setValidator(new EmailValidator());
		
		id = (ValidationEditText) findViewById(R.id.et_valid_id);
		id.setValidator(new IdValidator());
		
		sifre = (ValidationEditText) findViewById(R.id.et_valid_pw);
		sifre.setTransformationMethod(new PasswordTransformationMethod());
		sifre.setValidator(new SifreValidator());
	}

	public void onDoneClicked(View button) {
        if (email.uygunGirisMi()) {
            Toast.makeText(this, "Baþarýlý", Toast.LENGTH_LONG).show();
        }
        if(id.uygunGirisMi()){
        	Toast.makeText(this, "Baþarýlý", Toast.LENGTH_LONG).show();
        }
        if(sifre.uygunGirisMi()){
        	Toast.makeText(this, "Baþarýlý", Toast.LENGTH_LONG).show();
        }
    }
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

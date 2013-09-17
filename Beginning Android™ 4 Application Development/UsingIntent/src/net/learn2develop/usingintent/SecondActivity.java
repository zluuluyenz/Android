package net.learn2develop.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}
	
	public void onClick(View v){
		Intent data = new Intent();
		
		//--- get edit text view ---
		EditText editText = (EditText)findViewById(R.id.txt_username);
		//--- set the data to pass back ----
		data.setData(Uri.parse(editText.getText().toString()));
		setResult(RESULT_OK, data);
		//--- close activity
		finish();
	}
}

package alexTanner.example.grocerylist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity implements View.OnClickListener
{
	private Button remove1,remove2,remove3,remove4,remove5,remove6,remove7,remove8,remove9,remove10,remove11,remove12,remove13,remove14,remove15,remove16; 
	private EditText editText1,editText2,editText3,editText4,editText5,editText6,editText7,editText8,editText9,editText10,editText11,editText12,editText13,editText14,editText15,editText16;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
		editText4 = (EditText) findViewById(R.id.editText4);
		editText5 = (EditText) findViewById(R.id.editText5);
		editText6 = (EditText) findViewById(R.id.editText6);
		editText7 = (EditText) findViewById(R.id.editText7);
		editText8 = (EditText) findViewById(R.id.editText8);
		editText9 = (EditText) findViewById(R.id.editText9);
		editText10 = (EditText) findViewById(R.id.editText10);
		editText11 = (EditText) findViewById(R.id.editText11);
		editText12 = (EditText) findViewById(R.id.editText12);
		editText13 = (EditText) findViewById(R.id.editText13);
		editText14 = (EditText) findViewById(R.id.editText14);
		editText15 = (EditText) findViewById(R.id.editText15);
		editText16 = (EditText) findViewById(R.id.editText16);
	
		remove1 = (Button) findViewById(R.id.button1);
		remove2 = (Button) findViewById(R.id.button2);
		remove3 = (Button) findViewById(R.id.button3);
		remove4 = (Button) findViewById(R.id.button4);
		remove5 = (Button) findViewById(R.id.button5);
		remove6 = (Button) findViewById(R.id.button6);
		remove7 = (Button) findViewById(R.id.button7);
		remove8 = (Button) findViewById(R.id.button8);
		remove9 = (Button) findViewById(R.id.button9);
		remove10 = (Button) findViewById(R.id.button10);
		remove11 = (Button) findViewById(R.id.button11);
		remove12 = (Button) findViewById(R.id.button12);
		remove13 = (Button) findViewById(R.id.button13);
		remove14 = (Button) findViewById(R.id.button14);
		remove15 = (Button) findViewById(R.id.button15);
		remove16 = (Button) findViewById(R.id.button16);
		
		remove1.setOnClickListener(this);
		remove2.setOnClickListener(this);
		remove3.setOnClickListener(this);
		remove4.setOnClickListener(this);
		remove5.setOnClickListener(this);
		remove6.setOnClickListener(this);
		remove7.setOnClickListener(this);
		remove8.setOnClickListener(this);
		remove9.setOnClickListener(this);
		remove10.setOnClickListener(this);
		remove11.setOnClickListener(this);
		remove12.setOnClickListener(this);
		remove13.setOnClickListener(this);
		remove14.setOnClickListener(this);
		remove15.setOnClickListener(this);
		remove16.setOnClickListener(this);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onClick(View view) {
		if (view.getId() == remove1.getId()) {
			editText1.setText("");
		}
		if (view.getId() == remove2.getId()) {
			editText2.setText("");
		}
		if (view.getId() == remove3.getId()) {
			editText3.setText("");
		}
		if (view.getId() == remove4.getId()) {
			editText4.setText("");
		}
		if (view.getId() == remove5.getId()) {
			editText5.setText("");
		}
		if (view.getId() == remove6.getId()) {
			editText6.setText("");
		}
		if (view.getId() == remove7.getId()) {
			editText7.setText("");
		}
		if (view.getId() == remove8.getId()) {
			editText8.setText("");
		}
		if (view.getId() == remove9.getId()) {
			editText9.setText("");
		}
		if (view.getId() == remove10.getId()) {
			editText10.setText("");
		}
		if (view.getId() == remove11.getId()) {
			editText11.setText("");
		}
		if (view.getId() == remove12.getId()) {
			editText12.setText("");
		}
		if (view.getId() == remove13.getId()) {
			editText13.setText("");
		}
		if (view.getId() == remove14.getId()) {
			editText14.setText("");
		}
		if (view.getId() == remove15.getId()) {
			editText15.setText("");
		}
		if (view.getId() == remove16.getId()) {
			editText16.setText("");
		}
	}
	
	}
	


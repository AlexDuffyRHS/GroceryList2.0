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
	private Button remove1,remove2,remove3;
	private EditText editText1,editText2,editText3;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);
		
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
	
		remove1 = (Button) findViewById(R.id.button1);
		remove2 = (Button) findViewById(R.id.button2);
		remove3 = (Button) findViewById(R.id.button3);
		
		remove1.setOnClickListener(this);
		remove2.setOnClickListener(this);
		remove3.setOnClickListener(this);
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
		
	}
	
	}
	


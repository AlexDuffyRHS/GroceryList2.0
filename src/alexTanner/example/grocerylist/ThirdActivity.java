package alexTanner.example.grocerylist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends Activity 
{	
	private Button remove1,remove2,remove3;
	private EditText editText1,editText2,editText3;

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		editText1 = (EditText) findViewById(R.id.editText1);
		editText2 = (EditText) findViewById(R.id.editText2);
		editText3 = (EditText) findViewById(R.id.editText3);
	
		remove1 = (Button) findViewById(R.id.button1);
		remove2 = (Button) findViewById(R.id.button2);
		remove3 = (Button) findViewById(R.id.button3);
		
		remove1.setOnClickListener((OnClickListener) this);
		remove2.setOnClickListener((OnClickListener) this);
		remove3.setOnClickListener((OnClickListener) this);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

	
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

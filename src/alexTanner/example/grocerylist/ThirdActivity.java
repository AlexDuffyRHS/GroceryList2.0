package alexTanner.example.grocerylist;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends Activity {
	
	
	private Button remove2;
	private EditText editText2;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		editText2 = (EditText) findViewById(R.id.editText2);
		
		
		remove2 = (Button) findViewById(R.id.button2);
		//remove2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.third, menu);
		return true;
	}

	
	public void onClick(View view) {
		if (view.getId() == remove2.getId()) {
			editText2.setText("");
		}
	}
}

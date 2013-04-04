package de.hilti.hiltifirestop;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ScanFireStop extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scan_fire_stop);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.scan_fire_stop, menu);
		return true;
	}

}

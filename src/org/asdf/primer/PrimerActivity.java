package org.asdf.primer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PrimerActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_primer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_primer, menu);
        return true;
    }
}

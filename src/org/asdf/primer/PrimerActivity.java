package org.asdf.primer;

import android.os.Bundle;
import org.apache.cordova;

public class PrimerActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}

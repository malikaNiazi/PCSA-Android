package com.peacecorps.pcsa.circle_of_trust;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.peacecorps.pcsa.R;

/*
 * Activity for Circle of Trust fragment container
 *
 * @author calistus
 * @since 2015-08-18
 */
public class CircleOfTrust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_of_trust);
    }

    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(CircleOfTrustFragment.sentReceiver, new IntentFilter(CircleOfTrustFragment.SENT));
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(CircleOfTrustFragment.sentReceiver);
    }
}

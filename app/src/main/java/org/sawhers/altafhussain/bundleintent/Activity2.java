package org.sawhers.altafhussain.bundleintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tv= (TextView) findViewById(R.id.tv2);
        //here we get the bundle value
        Bundle bundle=getIntent().getExtras();
        String name=bundle.getString("ALTAF");
        tv.setText(name);

    }
}

package org.sawhers.altafhussain.bundleintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {

    TextView tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        tv3=(TextView)findViewById(R.id.tv_acitvity3);
        Bundle bundle=getIntent().getExtras();
        int n1 =bundle.getInt("NO1");
        int n2 =bundle.getInt("NO2");

        int sum=n1+n2;
        //tv3.setText(sum);//this give error b/c they accept text and we pass int

        //tv3.setText(Integer.toString(sum));//intested of this we need to do this
        tv3.setText(String.valueOf(sum));

    }
}

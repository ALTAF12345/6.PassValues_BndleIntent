package org.sawhers.altafhussain.bundleintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn2,btn3,btn_PassObject;
    EditText etNumber1,etNumber2;
    Student s1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn2= (Button) findViewById(R.id.btn2);
        btn3= (Button) findViewById(R.id.btn3);
        btn_PassObject=(Button)findViewById(R.id.btnpass_object);
        etNumber1=(EditText)findViewById(R.id.et_number1);
        etNumber2=(EditText)findViewById(R.id.et_number2);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn_PassObject.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){ case R.id.btn2:
            //use budle to put key value pair and then to get in 2activity
            Bundle bundle1=new Bundle();
            bundle1.putCharSequence("ALTAF","Hi i'm again in the developement of android");

            Intent intent1=new Intent(MainActivity.this,Activity2.class);
            //here we need to put in intent
            intent1.putExtras(bundle1);
            startActivity(intent1);

            break;

            case R.id.btn3:
                String n1=etNumber1.getText().toString();
                String n2=etNumber2.getText().toString();
                //n1 and n2 we get in the form of string below we need to cast into integer
                int num1=Integer.parseInt(n1);
                int num2=Integer.parseInt(n2);
                //here we put in bundle
                Bundle bundle2=new Bundle();
                bundle2.putInt("NO1",num1);
                bundle2.putInt("NO2",num2);
                //give to bundle
                Intent intent2=new Intent(MainActivity.this,Activity3.class);
                intent2.putExtras(bundle2);
                startActivity(intent2);

                break;
 //now let pass the bject to another activity
            case R.id.btnpass_object:
                Student s=new Student(1,"Ali","Android",10000);
   //First we need pass simple object and then pass complete object
                /*int id=s.getId();
                String name=s.getName();
                String course=s.getCourse();
                int fee=s.getFee();
                //now pass to bundle
                Bundle bundle3=new Bundle();
                bundle3.putInt("ID",id);
                bundle3.putString("NAME",name);
                bundle3.putString("COURSE",course);
                bundle3.putInt("FEE",fee);
                //pass to in intent
                Intent intent3=new Intent(MainActivity.this,StudentDetails.class);
                intent3.putExtras(bundle3);
                startActivity(intent3);*/
//now we need to pass the complete objrct now
                //for this we need to make the student serializable
                //STUDENT is key and S is object
                Bundle b=new Bundle();
                b.putSerializable("STUDENT",s);

                Intent i=new Intent(MainActivity.this,StudentDetails.class);
                i.putExtras(b);
                startActivity(i);


                break;

        }


    }
}

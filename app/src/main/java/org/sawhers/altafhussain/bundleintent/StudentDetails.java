package org.sawhers.altafhussain.bundleintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class StudentDetails extends AppCompatActivity {
    TextView tv_Student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_details);
        tv_Student=(TextView)findViewById(R.id.tv_Student);


       /* Bundle bundle=getIntent().getExtras();
        int id=bundle.getInt("ID");
        String name=bundle.getString("NAME");
        String course=bundle.getString("COURSE");
        int fee=bundle.getInt("FEE");
        tv_Student.setText(id+"\n"+name+"\n"+course+"\n"+fee);*/
        //now we need to get the complete object from mainactivity


        Bundle b=getIntent().getExtras();
        Student s= (Student) b.getSerializable("STUDENT");//s is datatype of student class
        tv_Student.setText(s.toString());

    }
}

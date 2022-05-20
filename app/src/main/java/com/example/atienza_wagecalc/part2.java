package com.example.atienza_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class part2 extends AppCompatActivity {
    TextView typeofemployee, hoursr, oth, otw, rw, tw;

    mona mona = new mona();
    jean jean = new jean();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part2);

        Intent intent = getIntent();
        mona.setName(intent.getStringExtra("Name"));
        mona.setEmployeeType(intent.getStringExtra("Type"));
        mona.setPt(intent.getDoubleExtra("Hours", mona.getPt()));

        typeofemployee = findViewById(R.id.employeeType);
        hoursr = findViewById(R.id.hoursr);
        oth = findViewById(R.id.oth);
        otw = findViewById(R.id.otw);
        rw = findViewById(R.id.rw);
        tw = findViewById(R.id.tw);

        double pt = jean.keqing(mona.getPt());
        double regular = jean.regular(mona.getEmployeeType(), mona.getPt(), pt);
        double overtime = jean.overTime(mona.getEmployeeType(), pt);
        double total = jean.total(pt, overtime);

        typeofemployee.setText(mona.getName()+ "(" + mona.getEmployeeType() + ")");
        hoursr.setText((int) mona.getPt());
        oth.setText((int) pt);
        rw.setText((int) regular);
        otw.setText((int) total);
        tw.setText(String.valueOf(total));



    }
}
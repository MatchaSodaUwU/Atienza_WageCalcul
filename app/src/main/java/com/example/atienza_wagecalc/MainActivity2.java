package com.example.atienza_wagecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    EditText empnmehre, hours;
    Button regular, proba, pt, calcu;
    TextView employeeType;
    mona name=new mona();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        regular = findViewById(R.id.regular);
        proba = findViewById(R.id.proba);
        pt = findViewById(R.id.pt);
        calcu = findViewById(R.id.calcu);
        empnmehre = findViewById(R.id.empnmehre);
        hours = findViewById(R.id.hours);
        employeeType = findViewById(R.id.employeeType);

        regular.setOnClickListener(this);
        proba.setOnClickListener(this);
        pt.setOnClickListener(this);
        calcu.setOnClickListener(this);
    }
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.regular:
                name.setEmployeeType("Regular");
                employeeType.setText("Regular Employee");
                break;

            case R.id.proba:
                name.setEmployeeType("Probationary");
                employeeType.setText("Probationary Employee");
                break;

            case R.id.pt:
                name.setEmployeeType("Part Time");
                employeeType.setText("Part Time Employee");
                break;

            case R.id.calcu:
                if (name.getEmployeeType() == ""){

                }else {
                    name.setName(String.valueOf(employeeType.getText()));
                    name.setPt(Double.parseDouble(hours.getText().toString()));

                    Intent intent = new Intent(this, part2.class);
                    intent.putExtra("Name", name.getName());
                    intent.putExtra("Employee Type", name.getEmployeeType());
                    intent.putExtra("Hours", name.getPt());
                    startActivity(intent);
                }
                break;
        }
    }
}
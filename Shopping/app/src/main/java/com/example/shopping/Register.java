package com.example.shopping;


import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Register extends AppCompatActivity {
    EditText username,pass,job;
    TextView birth;
    Button reg,log,cat,pro;
    ImageButton birthDateBtn;
    Spinner gender;
    Database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=findViewById(R.id.username);
        pass=findViewById(R.id.Password);
        birth=findViewById(R.id.birth);
        birthDateBtn=findViewById(R.id.birthDateBtn);
        gender=findViewById(R.id.gender);
        job=findViewById(R.id.job);
        reg=findViewById(R.id.Register);

        db=new Database(this);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=username.getText().toString();
                String password=pass.getText().toString();
                String birthdate=birth.getText().toString();
                String Gender=gender.getSelectedItem().toString();
                String Job=job.getText().toString();
                if(user.equals("")||password.equals("")||birthdate.equals("")||Gender.equals("")||Job.equals("")){
                    Toast.makeText(getApplicationContext(),"Please enter the fields",Toast.LENGTH_LONG).show();
                }
                else {
                    if(db.checkUserName(user)==false) {
                        db.new_customer(user, password, Gender, birthdate, Job);
                        Toast.makeText(getApplicationContext(), "Register Successfully", Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getApplicationContext(),Main.class);
                        startActivity(intent);
                    }
                    else
                        Toast.makeText(getApplicationContext(), "userName is exist", Toast.LENGTH_LONG).show();

                }
            }
        });


        birthDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDatePickerDialog();
            }
        });
    }
    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog= new DatePickerDialog(this,
                this::onDateSet,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
        String date = day+"/"+(month+1)+"/"+year;
        birth.setText(date);
    }
}
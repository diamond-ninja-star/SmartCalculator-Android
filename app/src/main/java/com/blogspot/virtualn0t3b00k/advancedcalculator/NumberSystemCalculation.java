package com.blogspot.virtualn0t3b00k.advancedcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import functions.NumberSystem;

public class NumberSystemCalculation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    NumberSystem object = new NumberSystem();

    Button add,substract,multiply,divide,answer,clear;
    TextView input1Label,input2Label,numberSystemLabel,result,output;
    EditText input1,input2;
    Spinner spinner;

    //Initialize array
    public String[] systemTypeList = new String[] {"(Select a type)","decimal","binary","octal","hexadecimal"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_calculation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("BASE-N CALCULATION");

        //Initialize ids
        add=(Button)findViewById(R.id.button_add);
        substract=(Button)findViewById(R.id.button_subtract);
        multiply=(Button)findViewById(R.id.button_multiply);
        divide=(Button)findViewById(R.id.button_divide);
        answer=(Button)findViewById(R.id.button_answer);
        clear=(Button)findViewById(R.id.button_clear);
        input1Label=(TextView)findViewById(R.id.textView_first_input);
        input2Label=(TextView)findViewById(R.id.textView_second_input);
        numberSystemLabel=(TextView)findViewById(R.id.textView_output);
        result=(TextView)findViewById(R.id.textView_result);
        input1 = (EditText) findViewById(R.id.editText_first_input);
        input2 = (EditText) findViewById(R.id.editText_second_input) ;
        output = (TextView) findViewById(R.id.textView_outputResult);
        spinner = (Spinner) findViewById(R.id.spinner_ns_type);

        // initialize spinner
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,systemTypeList);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(arrayAdapter);

        clear.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input1.setText("");
                                input2.setText("");
                                output.setText("");
                            }
                        }

                );
        answer.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s1 = input1.getText().toString();
                                int flag = 0 ;
                                if(s1.equals(""))
                                {
                                    flag=1;
                                }
                                if(flag==0)
                                {
                                    input2.setText("");
                                    input1.setText(output.getText().toString());
                                }
                            }
                        }

                );
        add.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s1 = input1.getText().toString();
                                String s2 = input2.getText().toString();
                                String s3 = spinner.getSelectedItem().toString();
                                String result = object.doMathematicalOperationOnNBasedNumberSystem(s1,s2,s3,"add");
                                output.setText(result);
                            }
                        }
                );
        substract.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s1 = input1.getText().toString();
                                String s2 = input2.getText().toString();
                                String s3 = spinner.getSelectedItem().toString();
                                String result = object.doMathematicalOperationOnNBasedNumberSystem(s1,s2,s3,"substract");
                                output.setText(result);
                            }
                        }
                );
        multiply.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s1 = input1.getText().toString();
                                String s2 = input2.getText().toString();
                                String s3 = spinner.getSelectedItem().toString();
                                String result = object.doMathematicalOperationOnNBasedNumberSystem(s1,s2,s3,"multiply");
                                output.setText(result);
                            }
                        }
                );
        divide.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                String s1 = input1.getText().toString();
                                String s2 = input2.getText().toString();
                                String s3 = spinner.getSelectedItem().toString();
                                String result = object.doMathematicalOperationOnNBasedNumberSystem(s1,s2,s3,"divide");
                                output.setText(result);
                            }
                        }
                );

    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.number_system_calculation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_start_page)
        {
            // Handle the camera action
            Intent intent = new Intent(NumberSystemCalculation.this,StartPage.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {

        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,TableCalculator.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,ScientificCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(NumberSystemCalculation.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import functions.Unit;

public class UnitConversion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    Unit object = new Unit();
    TextView input,output,tv_unit,tv_from,tv_to;
    Button zero,one,two,three,four,five,six,seven,eight,nine;
    Button backspace,clear,convert,decimalPoint,negative;
    Spinner unit,from,to;
    //Declaring Flags
    public int converterDecimalPointClickFlag=0,converterNegativeClickFlag=0;
    //Declaring Variables
    public String converterUnitString, converterFromString, converterToString ;
    public String converterInputString, converterOutputString ;
    public double converterInput, converterOutput;
    //Initializing Unit list
    public String[] converterUnitList = new String[] {"(Select a unit)","Torque","Angle","Density","Time","Temperature","Speed","Weight","Volume","Length","Pressure","Area"};
    //Initializing Items List
    //Empty
    public String[] converterEmptyItemList = new String[] {""};
    //Torque
    public String[] converterTorqueItemList = new String[] {"Newton Meter","Meter Kilogram"};
    //Angle
    public String[] converterAngleItemList = new String[] {"Degree","Radian"};
    //Density
    public String[] converterDensityItemList = new String[] {"Kilogram Per Meter Cube","Gram Per Centimeter Cube","Pound Per Foot Cube"};
    //Time
    public String[] converterTimeItemList = new String[] {"Day","Hour","Minute","Second"};
    //Temperature
    public String[] converterTemperatureItemList = new String[] {"Celsius","Fahrenheit","Kelvin"};
    //Speed
    public String[] converterSpeedItemList = new String[] {"Kilometer Per Hour","Mile Per Hour","Meter Per Second"};
    //Weight
    public String[] converterWeightItemList = new String[] {"Kilogram","Gram","Pound"};
    //Volume
    public String[] converterVolumeItemList = new String[] {"Liter","Cubic Meter","Cubic Centimeter","Cubic Foot","Cubic Inch"};
    //Length
    public String[] converterLengthItemList = new String[] {"Kilometer","Meter","Centimeter","Mile","Foot","Inch"};
    //Pressure
    public String[] converterPressureItemList = new String[] {"Physical Atmosphere","bar","Kilo Pascal","mmHg"};
    //Area
    public String[] converterAreaItemList = new String[] {"Square Meter","Square Centimeter","Square Mile","Square Inch","Square Foot"};

    //function to set spinner items relatively
    public void relativeSpinnerItemSet()
    {
        //get the string from unit spinner
        converterUnitString=unit.getSelectedItem().toString();
        //match it inside if else block and set from and to spinner
        //Torque
        if(converterUnitString.equals("Torque"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTorqueItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTorqueItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Angle
        else if(converterUnitString.equals("Angle"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAngleItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAngleItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Density
        else if(converterUnitString.equals("Density"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterDensityItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterDensityItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Time
        else if(converterUnitString.equals("Time"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTimeItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTimeItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Temperature
        else if(converterUnitString.equals("Temperature"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTemperatureItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTemperatureItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Speed
        else if(converterUnitString.equals("Speed"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterSpeedItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterSpeedItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Weight
        else if(converterUnitString.equals("Weight"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterWeightItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterWeightItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Volume
        else if(converterUnitString.equals("Volume"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterVolumeItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterVolumeItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Length
        else if(converterUnitString.equals("Length"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterLengthItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterLengthItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Pressure
        else if(converterUnitString.equals("Pressure"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterPressureItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterPressureItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Area
        else if(converterUnitString.equals("Area"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAreaItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAreaItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
        //Empty
        else
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterEmptyItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            from.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterEmptyItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            to.setAdapter(arrayAdapterTo);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_conversion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setTitle("UNIT CONVERSION");

        //Initializing Id s
        input = (TextView) findViewById(R.id.textView_input);
        output = (TextView) findViewById(R.id.textView_output);
        unit = (Spinner) findViewById(R.id.spinner_unit);
        from = (Spinner) findViewById(R.id.spinner_from);
        to = (Spinner) findViewById(R.id.spinner_to);
        zero = (Button) findViewById(R.id.button_zero);
        one = (Button) findViewById(R.id.button_one);
        two = (Button) findViewById(R.id.button_two);
        three = (Button) findViewById(R.id.button_three);
        four = (Button) findViewById(R.id.button_four);
        five = (Button) findViewById(R.id.button_five);
        six = (Button) findViewById(R.id.button_six);
        seven = (Button) findViewById(R.id.button_seven);
        eight = (Button) findViewById(R.id.button_eight);
        nine = (Button) findViewById(R.id.button_nine);
        decimalPoint = (Button) findViewById(R.id.button_decimalPoint);
        negative = (Button) findViewById(R.id.button_negative);
        backspace = (Button) findViewById(R.id.button_backspace);
        clear = (Button) findViewById(R.id.button_clear);
        convert = (Button) findViewById(R.id.button_convert);
        tv_unit = (TextView)findViewById(R.id.textView_unit);
        tv_from = (TextView)findViewById(R.id.textView_from);
        tv_to = (TextView)findViewById(R.id.textView_to);

        zero.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "0");

                            }
                        }
                );
        one.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "1");
                            }
                        }


                );
        two.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "2");
                            }
                        }


                );
        three.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "3");
                            }
                        }


                );
        four.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "4");
                            }
                        }


                );
        five.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "5");
                            }
                        }


                );
        six.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "6");
                            }
                        }


                );
        seven.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "7");
                            }
                        }


                );
        eight.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "8");
                            }
                        }


                );
        nine.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "9");
                            }
                        }
                );
        decimalPoint.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                if (converterDecimalPointClickFlag == 0)
                                {
                                    String s1, s2, s3;
                                    s1 = input.getText().toString();
                                    s2 = decimalPoint.getText().toString();
                                    s3 = s1 + s2;
                                    input.setText(s3);
                                    converterDecimalPointClickFlag = 1;
                                }
                            }
                        }
                );
        negative.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s0 = input.getText().toString();
                                if (converterNegativeClickFlag == 0 && s0.equals(""))
                                {
                                    String s1, s2, s3;
                                    s2 = "-";
                                    s1 = input.getText().toString();
                                    s3 = s2 + s1;
                                    input.setText(s3);
                                    converterNegativeClickFlag = 1;
                                }
                            }
                        }
                );
        clear.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                converterNegativeClickFlag = 0;
                                converterDecimalPointClickFlag = 0;
                                String s1 = "";
                                input.setText(s1);
                                output.setText(s1);
                            }
                        }
                );
        backspace.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                int isInputEmptyFlag = 0;
                                //converterDecimalPointClickFlag = 0;
                                String s0 = input.getText().toString();
                                if (s0.equals(""))
                                {
                                    isInputEmptyFlag = 1;
                                }
                                if (isInputEmptyFlag == 0)
                                {
                                    String oldString, newString;
                                    oldString = input.getText().toString();
                                    int oldStringLength = oldString.length();
                                    int index = oldStringLength - 1;
                                    newString = oldString.substring(0, index);
                                    input.setText(newString);
                                }
                            }
                        }
                );
        //set and initialize the unit spinner
        ArrayAdapter<String> arrayAdapterUnit = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterUnitList);
        arrayAdapterUnit.setDropDownViewResource(android.R.layout.simple_spinner_item);
        unit.setAdapter(arrayAdapterUnit);



        convert.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s = input.getText().toString();
                                String s1 = unit.getSelectedItem().toString();
                                String s2 = from.getSelectedItem().toString();
                                String s3 = to.getSelectedItem().toString();
                                String result = object.UnitConversion(s,s1,s2,s3) ;
                                output.setText(result);
                            }
                        }
                );
        unit.setOnItemSelectedListener
                (
                        new AdapterView.OnItemSelectedListener()
                        {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                            {
                                relativeSpinnerItemSet();
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent)
                            {

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
        getMenuInflater().inflate(R.menu.unit_conversion, menu);
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
            Intent intent = new Intent(UnitConversion.this,StartPage.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {

        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(UnitConversion.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(UnitConversion.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(UnitConversion.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(UnitConversion.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(UnitConversion.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(UnitConversion.this,ScientificCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(UnitConversion.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

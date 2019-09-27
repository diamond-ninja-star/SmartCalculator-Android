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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;

import bsh.Interpreter;
import functions.Constants;
import functions.Unit;

public class ScientificCalculator extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    //components

    //simple
    EditText input;
    TextView output;
    Button clear,answer,backspace,floor,ceilling,random;
    Button one,two,three,four,five,six,seven,eight,nine,zero;
    Button xToThePowerY, tenToThePowerX,eToThePowerX,squareRoot, cubicRoot,comma;
    Button plus,minus,multiply,divide,log,ln,pi,decimalPoint,equal,startingBracket,endingBracket;

    //trigonometry
    Button bSin,bCos,bTan;
    Button bSinh,bCosh,bTanh;
    Button bSinInv,bCosInv,bTanInv;

    //constants
    Button constant1,constant2,constant3,constant4,constant5,constant6,constant7,constant8,constant9,constant10;
    Button constant11,constant12,constant13,constant14,constant15,constant16,constant17,constant18,constant19,constant20;
    Button constant21,constant22,constant23,constant24,constant25,constant26,constant27,constant28,constant29,constant30;
    Button constant31,constant32,constant33,constant34,constant35,constant36,constant37,constant38,constant39,constant40;
    Button constant41,constant42;

    //converter
    TabHost tabHost;
    EditText cnvInput;
    TextView cnvOutput;
    Spinner cnvUnit,cnvTo,cnvFrom;
    Button cnvClear,cnvConvert,cnvBackspace,cnvSetToInput;

    //fields

    int constantFlag=0;

    public void relativeConstantSet(int x)
    {
        int constantNumber = x-1;

        Constants object = new Constants();
        String data = object.constantValue(constantNumber);
        input.setText(input.getText().toString()+data);
    }

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
        String converterUnitString=cnvUnit.getSelectedItem().toString();
        //match it inside if else block and set from and to spinner
        //Torque
        if(converterUnitString.equals("Torque"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTorqueItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTorqueItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Angle
        else if(converterUnitString.equals("Angle"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAngleItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAngleItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Density
        else if(converterUnitString.equals("Density"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterDensityItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterDensityItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Time
        else if(converterUnitString.equals("Time"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTimeItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTimeItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Temperature
        else if(converterUnitString.equals("Temperature"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTemperatureItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterTemperatureItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Speed
        else if(converterUnitString.equals("Speed"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterSpeedItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterSpeedItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Weight
        else if(converterUnitString.equals("Weight"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterWeightItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterWeightItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Volume
        else if(converterUnitString.equals("Volume"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterVolumeItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterVolumeItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Length
        else if(converterUnitString.equals("Length"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterLengthItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterLengthItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Pressure
        else if(converterUnitString.equals("Pressure"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterPressureItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterPressureItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Area
        else if(converterUnitString.equals("Area"))
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAreaItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterAreaItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
        //Empty
        else
        {
            ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterEmptyItemList);
            arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvFrom.setAdapter(arrayAdapterFrom);
            ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterEmptyItemList);
            arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
            cnvTo.setAdapter(arrayAdapterTo);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientific_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("SCIENTIFIC MODE");

        //simple
        input = (EditText)findViewById(R.id.editText_input);
        clear = (Button)findViewById(R.id.button_clear);
        backspace = (Button)findViewById(R.id.button_backspace);
        answer = (Button)findViewById(R.id.button_answer);
        plus = (Button)findViewById(R.id.button_plus);
        minus = (Button)findViewById(R.id.button_minus);
        multiply = (Button)findViewById(R.id.button_multiply);
        divide = (Button)findViewById(R.id.button_divide);
        log = (Button)findViewById(R.id.button_log);
        ln = (Button)findViewById(R.id.button_ln);
        pi = (Button)findViewById(R.id.button_pi);
        comma = (Button)findViewById(R.id.button_comma);
        startingBracket = (Button)findViewById(R.id.button_starting_bracket);
        endingBracket = (Button)findViewById(R.id.button_ending_bracket);
        equal = (Button)findViewById(R.id.button_equal);
        xToThePowerY = (Button)findViewById(R.id.button_xtToThePowerY);
        eToThePowerX = (Button)findViewById(R.id.button_eToThePowerX);
        tenToThePowerX = (Button)findViewById(R.id.button_10ToThePowerX);
        squareRoot = (Button)findViewById(R.id.button_square_root);
        cubicRoot = (Button)findViewById(R.id.button_cubic_root);
        decimalPoint = (Button)findViewById(R.id.button_decimalPoint);
        random = (Button)findViewById(R.id.button_random);
        floor = (Button)findViewById(R.id.button_floor);
        ceilling = (Button)findViewById(R.id.button_ceilling);
        one = (Button)findViewById(R.id.button_one);
        two = (Button)findViewById(R.id.button_two);
        three = (Button)findViewById(R.id.button_three);
        four = (Button)findViewById(R.id.button_four);
        five = (Button)findViewById(R.id.button_five);
        six = (Button)findViewById(R.id.button_six);
        seven = (Button)findViewById(R.id.button_seven);
        eight = (Button)findViewById(R.id.button_eight);
        nine = (Button)findViewById(R.id.button_nine);
        zero = (Button)findViewById(R.id.button_zero);
        output = (TextView)findViewById(R.id.textView_output);

        //constants

        constant1 = (Button)findViewById(R.id.button_constant_1);
        constant2 = (Button)findViewById(R.id.button_constant_2);
        constant3 = (Button)findViewById(R.id.button_constant_3);
        constant4 = (Button)findViewById(R.id.button_constant_4);
        constant5 = (Button)findViewById(R.id.button_constant_5);
        constant6 = (Button)findViewById(R.id.button_constant_6);
        constant7 = (Button)findViewById(R.id.button_constant_7);
        constant8 = (Button)findViewById(R.id.button_constant_8);
        constant9 = (Button)findViewById(R.id.button_constant_9);
        constant10 = (Button)findViewById(R.id.button_constant_10);
        constant11 = (Button)findViewById(R.id.button_constant_11);
        constant12 = (Button)findViewById(R.id.button_constant_12);
        constant13 = (Button)findViewById(R.id.button_constant_13);
        constant14 = (Button)findViewById(R.id.button_constant_14);
        constant15 = (Button)findViewById(R.id.button_constant_15);
        constant16 = (Button)findViewById(R.id.button_constant_16);
        constant17 = (Button)findViewById(R.id.button_constant_17);
        constant18 = (Button)findViewById(R.id.button_constant_18);
        constant19 = (Button)findViewById(R.id.button_constant_19);
        constant20 = (Button)findViewById(R.id.button_constant_20);
        constant21 = (Button)findViewById(R.id.button_constant_21);
        constant22 = (Button)findViewById(R.id.button_constant_22);
        constant23 = (Button)findViewById(R.id.button_constant_23);
        constant24 = (Button)findViewById(R.id.button_constant_24);
        constant25 = (Button)findViewById(R.id.button_constant_25);
        constant26 = (Button)findViewById(R.id.button_constant_26);
        constant27 = (Button)findViewById(R.id.button_constant_27);
        constant28 = (Button)findViewById(R.id.button_constant_28);
        constant29 = (Button)findViewById(R.id.button_constant_29);
        constant30 = (Button)findViewById(R.id.button_constant_30);
        constant31 = (Button)findViewById(R.id.button_constant_31);
        constant32 = (Button)findViewById(R.id.button_constant_32);
        constant33 = (Button)findViewById(R.id.button_constant_33);
        constant34 = (Button)findViewById(R.id.button_constant_34);
        constant35 = (Button)findViewById(R.id.button_constant_35);
        constant36 = (Button)findViewById(R.id.button_constant_36);
        constant37 = (Button)findViewById(R.id.button_constant_37);
        constant38 = (Button)findViewById(R.id.button_constant_38);
        constant39 = (Button)findViewById(R.id.button_constant_39);
        constant40 = (Button)findViewById(R.id.button_constant_40);
        constant41 = (Button)findViewById(R.id.button_constant_41);
        constant42 = (Button)findViewById(R.id.button_constant_42);

        //trigonometry
        bSin=(Button)findViewById(R.id.button_sin);
        bCos=(Button)findViewById(R.id.button_cos);
        bTan=(Button)findViewById(R.id.button_tan);
        bSinh=(Button)findViewById(R.id.button_hyperbolic_sin);
        bCosh=(Button)findViewById(R.id.button_hyperbolic_cos);
        bTanh=(Button)findViewById(R.id.button_hyperbolic_tan);
        bSinInv=(Button)findViewById(R.id.button_sin_inverse);
        bCosInv=(Button)findViewById(R.id.button_cos_inverse);
        bTanInv=(Button)findViewById(R.id.button_tan_inverse);
        //conversion
        cnvInput = (EditText)findViewById(R.id.editText_quantityInput);
        cnvOutput = (TextView)findViewById(R.id.textView_result);
        cnvUnit = (Spinner)findViewById(R.id.spinner_unit);
        cnvFrom = (Spinner)findViewById(R.id.spinner_from);
        cnvTo = (Spinner)findViewById(R.id.spinner_to);
        cnvClear = (Button)findViewById(R.id.button_clear1);
        cnvConvert = (Button) findViewById(R.id.button_convert1);
        cnvBackspace = (Button) findViewById(R.id.button_backspace1);
        cnvSetToInput = (Button)findViewById(R.id.button_setToInput);

        ArrayAdapter<String> arrayAdapterUnit = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, converterUnitList);
        arrayAdapterUnit.setDropDownViewResource(android.R.layout.simple_spinner_item);
        cnvUnit.setAdapter(arrayAdapterUnit);

        tabHost=(TabHost)findViewById(R.id.tabHost);
        //TabHost setup
        tabHost.setup();
        //tab1
        TabHost.TabSpec tabSpec1=tabHost.newTabSpec("SIMPLE");
        tabSpec1.setIndicator("SIMPLE");
        tabSpec1.setContent(R.id.linearLayout1);
        tabHost.addTab(tabSpec1);
        //tab2
        TabHost.TabSpec tabSpec2=tabHost.newTabSpec("TRIGONOMETRIC");
        tabSpec2.setIndicator("TRIGONOMETRIC");
        tabSpec2.setContent(R.id.linearLayout2);
        tabHost.addTab(tabSpec2);
        //tab3
        TabHost.TabSpec tabSpec3=tabHost.newTabSpec("CONSTANTS");
        tabSpec3.setIndicator("CONSTANTS");
        tabSpec3.setContent(R.id.linearLayout3);
        tabHost.addTab(tabSpec3);
        //tab4
        TabHost.TabSpec tabSpec4=tabHost.newTabSpec("CONVERSIONS");
        tabSpec4.setIndicator("CONVERSIONS");
        tabSpec4.setContent(R.id.linearLayout4);
        tabHost.addTab(tabSpec4);

        //simple

        one.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+one.getText().toString());
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
                                input.setText(input.getText().toString()+two.getText().toString());
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
                                input.setText(input.getText().toString()+three.getText().toString());
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
                                input.setText(input.getText().toString()+four.getText().toString());
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
                                input.setText(input.getText().toString()+five.getText().toString());
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
                                input.setText(input.getText().toString()+six.getText().toString());
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
                                input.setText(input.getText().toString()+seven.getText().toString());
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
                                input.setText(input.getText().toString()+eight.getText().toString());
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
                                input.setText(input.getText().toString()+nine.getText().toString());
                            }
                        }
                );
        zero.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+zero.getText().toString());
                            }
                        }
                );
        plus.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+plus.getText().toString());
                            }
                        }
                );
        minus.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+minus.getText().toString());
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
                                input.setText(input.getText().toString()+multiply.getText().toString());
                            }
                        }
                );
        divide.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+divide.getText().toString());
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
                                input.setText(input.getText().toString()+decimalPoint.getText().toString());
                            }
                        }
                );
        comma.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+comma.getText().toString());
                            }
                        }
                );
        startingBracket.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+startingBracket.getText().toString());
                            }
                        }
                );
        endingBracket.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+endingBracket.getText().toString());
                            }
                        }
                );
        log.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.log10(");
                            }
                        }
                );
        ln.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.log(");
                            }
                        }
                );
        pi.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.PI");
                            }
                        }
                );
        floor.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.floor(");
                            }
                        }
                );
        ceilling.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.ceil(");
                            }
                        }
                );
        random.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.random()");
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
                                input.setText(input.getText().toString()+output.getText().toString());
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
                                input.setText("");
                                output.setText("");
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
        xToThePowerY.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.pow(");
                            }
                        }
                );
        tenToThePowerX.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.pow(10,");
                            }
                        }
                );
        eToThePowerX.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.pow(Math.E,");
                            }
                        }
                );
        squareRoot.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.sqrt(");
                            }
                        }
                );
        cubicRoot.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.cbrt(");
                            }
                        }
                );
        equal.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String in = input.getText().toString();
                                Interpreter interpreter = new Interpreter();
                                try
                                {
                                    String result = interpreter.eval(in).toString();
                                    output.setText(result);
                                }
                                catch (Exception e)
                                {

                                }


                            }
                        }
                );


        //constants
        constant1.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(1);
                            }
                        }
                );
        constant2.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(2);
                            }
                        }
                );
        constant3.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(3);
                            }
                        }
                );
        constant4.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(4);
                            }
                        }
                );
        constant5.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(5);
                            }
                        }
                );
        constant6.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(6);
                            }
                        }
                );
        constant7.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(7);
                            }
                        }
                );
        constant8.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(8);
                            }
                        }
                );
        constant9.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(9);
                            }
                        }
                );
        constant10.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(10);
                            }
                        }
                );
        constant11.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(11);
                            }
                        }
                );
        constant12.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(12);
                            }
                        }
                );
        constant13.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(13);
                            }
                        }
                );
        constant14.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(14);
                            }
                        }
                );
        constant15.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(15);
                            }
                        }
                );
        constant16.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(16);
                            }
                        }
                );
        constant17.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(17);
                            }
                        }
                );
        constant18.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(18);
                            }
                        }
                );
        constant19.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(19);
                            }
                        }
                );
        constant20.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(20);
                            }
                        }
                );
        constant21.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(21);
                            }
                        }
                );
        constant22.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(22);
                            }
                        }
                );
        constant23.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(23);
                            }
                        }
                );
        constant24.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(24);
                            }
                        }
                );
        constant25.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(25);
                            }
                        }
                );
        constant26.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(26);
                            }
                        }
                );
        constant27.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(27);
                            }
                        }
                );
        constant28.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(28);
                            }
                        }
                );
        constant29.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(29);
                            }
                        }
                );
        constant30.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(30);
                            }
                        }
                );
        constant31.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(31);
                            }
                        }
                );
        constant32.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(32);
                            }
                        }
                );
        constant33.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(33);
                            }
                        }
                );
        constant34.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(34);
                            }
                        }
                );
        constant35.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(35);
                            }
                        }
                );
        constant36.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(36);
                            }
                        }
                );
        constant37.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(37);
                            }
                        }
                );
        constant38.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(38);
                            }
                        }
                );
        constant39.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(39);
                            }
                        }
                );
        constant40.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(40);
                            }
                        }
                );
        constant41.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(41);
                            }
                        }
                );
        constant42.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                relativeConstantSet(42);
                            }
                        }
                );

        //trigonometry

        bSin.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.sin(");
                            }
                        }
                );
        bCos.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.cos(");
                            }
                        }
                );
        bTan.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.tan(");
                            }
                        }
                );
        bSinh.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.sinh(");
                            }
                        }
                );
        bCosh.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.cosh(");
                            }
                        }
                );
        bTanh.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.tanh(");
                            }
                        }
                );
        bSinInv.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.asin(");
                            }
                        }
                );
        bCosInv.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.acos(");
                            }
                        }
                );
        bTanInv.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+"Math.atan(");
                            }
                        }
                );

        //converter :

        cnvBackspace.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                int isInputEmptyFlag = 0;
                                String s0 = cnvInput.getText().toString();
                                if (s0.equals(""))
                                {
                                    isInputEmptyFlag = 1;
                                }
                                if (isInputEmptyFlag == 0)
                                {
                                    String oldString, newString;
                                    oldString = cnvInput.getText().toString();
                                    int oldStringLength = oldString.length();
                                    int index = oldStringLength - 1;
                                    newString = oldString.substring(0, index);
                                    cnvInput.setText(newString);
                                }
                            }
                        }
                );
        cnvClear.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                cnvInput.setText("");
                                cnvOutput.setText("");
                            }
                        }
                );
        cnvSetToInput.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String outputString = cnvOutput.getText().toString();
                                String inputString = input.getText().toString();
                                String finalString = inputString+outputString;
                                input.setText(finalString);
                            }

                        }
                );
        cnvUnit.setOnItemSelectedListener
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
        cnvConvert.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s = cnvInput.getText().toString();
                                String s1 = cnvUnit.getSelectedItem().toString();
                                String s2 = cnvFrom.getSelectedItem().toString();
                                String s3 = cnvTo.getSelectedItem().toString();
                                Unit object = new Unit();
                                String result = object.UnitConversion(s,s1,s2,s3) ;
                                cnvOutput.setText(result);
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
        getMenuInflater().inflate(R.menu.scientific_calculator, menu);
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
            Intent intent = new Intent(ScientificCalculator.this,StartPage.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(ScientificCalculator.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(ScientificCalculator.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(ScientificCalculator.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(ScientificCalculator.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(ScientificCalculator.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(ScientificCalculator.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {

        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(ScientificCalculator.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

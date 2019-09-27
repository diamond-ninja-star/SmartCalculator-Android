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
import android.widget.Spinner;
import android.widget.TextView;

import functions.NumberSystem;

public class NumberSystemConversion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    //components
    TextView input,output,tv_from,tv_to;
    Button zero,one,two,three,four,five,six,seven,eight,nine;
    Button a,b,c,d,e,f,backspace,clear,convert,answer;
    Spinner from,to;

    //initializing item list
    public String[] fromList = new String[] {"(from)","decimal","binary","octal","hexadecimal"};
    public String[] toList = new String[] {"(to)","decimal","binary","octal","hexadecimal"};

    //Create object for number system class
    NumberSystem object = new NumberSystem();

    //function to set spinners
    public void relativeSpinnerItemSet()
    {
        ArrayAdapter<String> arrayAdapterFrom = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fromList);
        arrayAdapterFrom.setDropDownViewResource(android.R.layout.simple_spinner_item);
        from.setAdapter(arrayAdapterFrom);
        ArrayAdapter<String> arrayAdapterTo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,toList);
        arrayAdapterTo.setDropDownViewResource(android.R.layout.simple_spinner_item);
        to.setAdapter(arrayAdapterTo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_conversion);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setTitle("BASE-N CONVERSION");

        //Initializing Id s
        input = (TextView) findViewById(R.id.textView_input);
        output = (TextView) findViewById(R.id.textView_output);
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
        a= (Button)findViewById(R.id.button_a);
        b= (Button)findViewById(R.id.button_b);
        c= (Button)findViewById(R.id.button_c);
        d= (Button)findViewById(R.id.button_d);
        e= (Button)findViewById(R.id.button_e);
        f= (Button)findViewById(R.id.button_f);
        answer = (Button)findViewById(R.id.button_answer);
        backspace = (Button) findViewById(R.id.button_backspace);
        clear = (Button) findViewById(R.id.button_clear);
        convert = (Button) findViewById(R.id.button_convert);
        tv_from = (TextView)findViewById(R.id.textView_from);
        tv_to = (TextView)findViewById(R.id.textView_to);

        //set items to spinner
        relativeSpinnerItemSet();


        //write listener for other components
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

        a.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "A");
                            }
                        }
                );

        b.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "B");
                            }
                        }
                );
        c.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "C");
                            }
                        }
                );
        d.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "D");
                            }
                        }
                );
        e.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "E");
                            }
                        }
                );
        f.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString() + "F");
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
                                String s1 = input.getText().toString();
                                int flag = 0 ;
                                if(s1.equals(""))
                                {
                                    flag=1;
                                }
                                if(flag==0)
                                {
                                    input.setText(output.getText().toString());
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
        convert.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s1 = from.getSelectedItem().toString();
                                String s2 = to.getSelectedItem().toString();
                                int flag = 0;

                                if (input.getText().toString().equals(""))
                                {
                                    flag = 1;
                                }
                                if (flag == 0)
                                {
                                    try
                                    {
                                        if (s1.equals(s2))
                                        {
                                            output.setText(input.getText().toString());
                                        }
                                        else if (s1.equals("decimal") && s2.equals("binary"))
                                        {
                                            output.setText(Integer.toBinaryString(Integer.parseInt(input.getText().toString())));
                                        }
                                        else if (s1.equals("decimal") && s2.equals("octal"))
                                        {
                                            output.setText(Integer.toOctalString(Integer.parseInt(input.getText().toString())));
                                        }
                                        else if (s1.equals("decimal") && s2.equals("hexadecimal"))
                                        {
                                            output.setText(Integer.toHexString(Integer.parseInt(input.getText().toString())));
                                        }

//-------------------------------------------------------------------------------------

                                        else if (s1.equals("binary") && s2.equals("decimal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"binary");
                                            int finalInt = Integer.parseInt(get2);
                                            output.setText("" + finalInt);
                                        }
                                        else if (s1.equals("binary") && s2.equals("octal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"binary");
                                            int finalInt = Integer.parseInt(get2);
                                            String get3 = Integer.toOctalString(finalInt);
                                            output.setText("" + get3);
                                        }
                                        else if (s1.equals("binary") && s2.equals("hexadecimal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"binary");
                                            int finalInt = Integer.parseInt(get2);
                                            String get3 = Integer.toHexString(finalInt);
                                            output.setText("" + get3);
                                        }

//----------------------------------------------------------------

                                        else if (s1.equals("octal") && s2.equals("decimal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"octal");
                                            int finalInt = Integer.parseInt(get2);
                                            output.setText("" + finalInt);
                                        }
                                        else if (s1.equals("octal") && s2.equals("binary"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"octal");
                                            int finalInt = Integer.parseInt(get2);
                                            String get3 = Integer.toBinaryString(finalInt);
                                            output.setText("" + get3);
                                        }
                                        else if (s1.equals("octal") && s2.equals("hexadecimal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"octal");
                                            int finalInt = Integer.parseInt(get2);
                                            String get3 = Integer.toHexString(finalInt);
                                            output.setText("" + get3);
                                        }

//------------------------------------------------------------------

                                        else if (s1.equals("hexadecimal") && s2.equals("decimal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"hexadecimal");
                                            int finalInt = Integer.parseInt(get2);
                                            output.setText("" + finalInt);
                                        }
                                        else if (s1.equals("hexadecimal") && s2.equals("binary"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"hexadecimal");
                                            int finalInt = Integer.parseInt(get2);
                                            String get3 = Integer.toBinaryString(finalInt);
                                            output.setText("" + get3);
                                        }
                                        else if (s1.equals("hexadecimal") && s2.equals("octal"))
                                        {
                                            String get1 = input.getText().toString();
                                            String get2 = object.convertToDecimalNumberSystem(get1,"hexadecimal");
                                            int finalInt = Integer.parseInt(get2);
                                            String get3 = Integer.toOctalString(finalInt);
                                            output.setText("" + get3);
                                        }

//-------------------------------------------------------------------

                                    }
                                    catch (Exception e)
                                    {

                                    }
                                }
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
        getMenuInflater().inflate(R.menu.number_system_conversion, menu);
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
            Intent intent = new Intent(NumberSystemConversion.this,StartPage.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(NumberSystemConversion.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {

        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(NumberSystemConversion.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(NumberSystemConversion.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(NumberSystemConversion.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(NumberSystemConversion.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(NumberSystemConversion.this,ScientificCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(NumberSystemConversion.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

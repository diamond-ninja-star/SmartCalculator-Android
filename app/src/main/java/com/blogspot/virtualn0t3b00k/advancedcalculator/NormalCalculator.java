package com.blogspot.virtualn0t3b00k.advancedcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import bsh.Interpreter;

public class NormalCalculator extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    Button zero,one,two,three,four,five,six,seven,eight,nine;
    Button decimal,ans,root,clear,backspace;
    Button plus,minus,multiply,divide,equal;
    Button mc,mr,ms,mPlus,mMinus,sB,cB,comma;
    EditText input;
    TextView output,extra;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("NORMAL MODE");

        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        ans = (Button)findViewById(R.id.answer);
        decimal = (Button)findViewById(R.id.decimal);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        root = (Button)findViewById(R.id.root);
        clear = (Button)findViewById(R.id.clear);
        backspace = (Button)findViewById(R.id.backspace);
        equal = (Button)findViewById(R.id.equal);
        sB = (Button)findViewById(R.id.sBracket);
        cB = (Button)findViewById(R.id.cBracket);
        input = (EditText)findViewById(R.id.edit_number);
        output = (TextView )findViewById(R.id.history);
        extra = (TextView)findViewById(R.id.extra);
        mc = (Button)findViewById(R.id.mc);
        mr = (Button)findViewById(R.id.mr);
        ms = (Button)findViewById(R.id.ms);
        mPlus = (Button)findViewById(R.id.m_plus);
        mMinus = (Button)findViewById(R.id.m_minus);
        //comma = (Button)findViewById(R.id.comma);

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
        decimal.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+decimal.getText().toString());
                            }
                        }
                );
        /*
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
                */
        sB.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+sB.getText().toString());
                            }
                        }
                );
        cB.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                input.setText(input.getText().toString()+cB.getText().toString());
                            }
                        }
                );
        ans.setOnClickListener
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
        root.setOnClickListener
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
        equal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Interpreter interpreter = new Interpreter();
                String string = input.getText().toString();
                try
                {
                    Object object = interpreter.eval(string);
                    output.setText(object.toString());
                }
                catch (Exception e)
                {
                    output.setText(e.getMessage());
                }
            }

        });
        // memory store
        ms.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                extra.setText(output.getText().toString());
            }
        });
        //memory clear
        mc.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                extra.setText("");
            }
        });
        //memory recall
        mr.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                input.setText(input.getText().toString()+extra.getText().toString());
            }
        });
        mPlus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String isEmptyString = input.getText().toString();
                int checkFlag=1;
                if(isEmptyString.equals(""))
                {
                    checkFlag=0;
                }
                if(checkFlag==1)
                {
                    input.setText(input.getText().toString()+"+"+extra.getText().toString());
                }
            }
        });
        mMinus.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String isEmptyString = input.getText().toString();
                int checkFlag=1;
                if(isEmptyString.equals(""))
                {
                    checkFlag=0;
                }
                if(checkFlag==1)
                {
                    input.setText(input.getText().toString() + "-" + extra.getText().toString());
                }
            }
        });
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
        getMenuInflater().inflate(R.menu.normal_calculator, menu);
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
            Intent intent = new Intent(NormalCalculator.this,StartPage.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(NormalCalculator.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(NormalCalculator.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(NormalCalculator.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(NormalCalculator.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(NormalCalculator.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(NormalCalculator.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(NormalCalculator.this,ScientificCalculator.class);
            startActivity(intent);
        }

        else if(id==R.id.nav_normal_calculator)
        {

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

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
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import functions.Equation;

public class EquationCalculator extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    //members
    List list=new ArrayList();
    String[] typeString=new String[] {"(Select equation type)","Degree of a variable","Unknown variables"};
    String[] quantity1String=new String[] {"(How Many unknown variables?)","2","3"};
    String[] quantity2String=new String[] {"(Select highest degree of variable)","2","3"};
    String[] emptyString=new String[] {""};
    //components
    Spinner type,quantity;
    TextView enterYourEquationLabel,outputLabel;
    EditText a1,b1,c1,d1,a2,b2,c2,d2,a3,b3,c3,d3;
    TextView x1,y1,z1,w1,x2,y2,z2,w2,x3,y3,z3,w3;
    ListView outputList;
    Button calculate,clear;



    public void relativeListSet()
    {
        ArrayAdapter<String> arrayAdapterList = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        arrayAdapterList.notifyDataSetChanged();
        outputList.setAdapter(arrayAdapterList);
    }

    public void relativeSpinnerItemSet()
    {
        String s=type.getSelectedItem().toString();

        if(s.equalsIgnoreCase("Unknown variables"))
        {
            ArrayAdapter<String> arrayAdapterQuantity1=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,quantity1String);
            arrayAdapterQuantity1.setDropDownViewResource(android.R.layout.simple_spinner_item);
            quantity.setAdapter(arrayAdapterQuantity1);
        }
        else if(s.equalsIgnoreCase("Degree of a variable"))
        {
            ArrayAdapter<String> arrayAdapterQuantity2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,quantity2String);
            arrayAdapterQuantity2.setDropDownViewResource(android.R.layout.simple_spinner_item);
            quantity.setAdapter(arrayAdapterQuantity2);
        }
        else
        {
            ArrayAdapter<String> arrayAdapterEmpty=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,emptyString);
            arrayAdapterEmpty.setDropDownViewResource(android.R.layout.simple_spinner_item);
            quantity.setAdapter(arrayAdapterEmpty);
            makeAllGone();
        }
    }

    public void makeAllGone()
    {
        clear.setVisibility(View.INVISIBLE);
        calculate.setVisibility(View.INVISIBLE);
        enterYourEquationLabel.setVisibility(View.INVISIBLE);
        outputLabel.setVisibility(View.INVISIBLE);
        outputList.setVisibility(View.INVISIBLE);
        a1.setVisibility(View.INVISIBLE);
        a2.setVisibility(View.INVISIBLE);
        a3.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.INVISIBLE);
        b3.setVisibility(View.INVISIBLE);
        c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.INVISIBLE);
        c3.setVisibility(View.INVISIBLE);
        d1.setVisibility(View.INVISIBLE);
        d2.setVisibility(View.INVISIBLE);
        d3.setVisibility(View.INVISIBLE);
        x1.setVisibility(View.INVISIBLE);
        x2.setVisibility(View.INVISIBLE);
        x3.setVisibility(View.INVISIBLE);
        y1.setVisibility(View.INVISIBLE);
        y2.setVisibility(View.INVISIBLE);
        y3.setVisibility(View.INVISIBLE);
        z1.setVisibility(View.INVISIBLE);
        z2.setVisibility(View.INVISIBLE);
        z3.setVisibility(View.INVISIBLE);
        w1.setVisibility(View.INVISIBLE);
        w2.setVisibility(View.INVISIBLE);
        w3.setVisibility(View.INVISIBLE);
    }

    public void setAllFieldClear()
    {
        a1.setText("");
        a2.setText("");
        a3.setText("");
        b1.setText("");
        b2.setText("");
        b3.setText("");
        c1.setText("");
        c2.setText("");
        c3.setText("");
        d1.setText("");
        d2.setText("");
        d3.setText("");
    }

    public void relativeVisibility()
    {
        String s0=type.getSelectedItem().toString();
        String s1=quantity.getSelectedItem().toString();
        if(s0.equalsIgnoreCase("Degree of a variable")&&s1.equalsIgnoreCase("2"))
        {
            clear.setVisibility(View.VISIBLE);
            calculate.setVisibility(View.VISIBLE);
            enterYourEquationLabel.setVisibility(View.VISIBLE);
            outputLabel.setVisibility(View.VISIBLE);
            outputList.setVisibility(View.VISIBLE);
            a1.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
            c1.setVisibility(View.VISIBLE);
            x1.setVisibility(View.VISIBLE);
            y1.setVisibility(View.VISIBLE);
            z1.setVisibility(View.VISIBLE);

        }
        else if(s0.equalsIgnoreCase("Degree of a variable")&&s1.equalsIgnoreCase("3"))
        {
            clear.setVisibility(View.VISIBLE);
            calculate.setVisibility(View.VISIBLE);
            enterYourEquationLabel.setVisibility(View.VISIBLE);
            outputLabel.setVisibility(View.VISIBLE);
            outputList.setVisibility(View.VISIBLE);
            a1.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
            c1.setVisibility(View.VISIBLE);
            d1.setVisibility(View.VISIBLE);
            x1.setVisibility(View.VISIBLE);
            y1.setVisibility(View.VISIBLE);
            z1.setVisibility(View.VISIBLE);
            w1.setVisibility(View.VISIBLE);

        }
        else if(s0.equalsIgnoreCase("Unknown variables")&&s1.equalsIgnoreCase("2"))
        {
            calculate.setVisibility(View.VISIBLE);
            clear.setVisibility(View.VISIBLE);
            enterYourEquationLabel.setVisibility(View.VISIBLE);
            outputLabel.setVisibility(View.VISIBLE);
            outputList.setVisibility(View.VISIBLE);
            a1.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
            c1.setVisibility(View.VISIBLE);
            x1.setVisibility(View.VISIBLE);
            y1.setVisibility(View.VISIBLE);
            z1.setVisibility(View.VISIBLE);
            a2.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
            c2.setVisibility(View.VISIBLE);
            x2.setVisibility(View.VISIBLE);
            y2.setVisibility(View.VISIBLE);
            z2.setVisibility(View.VISIBLE);
        }
        else if(s0.equalsIgnoreCase("Unknown variables")&&s1.equalsIgnoreCase("3"))
        {
            clear.setVisibility(View.VISIBLE);
            calculate.setVisibility(View.VISIBLE);
            enterYourEquationLabel.setVisibility(View.VISIBLE);
            outputLabel.setVisibility(View.VISIBLE);
            outputList.setVisibility(View.VISIBLE);
            a1.setVisibility(View.VISIBLE);
            b1.setVisibility(View.VISIBLE);
            c1.setVisibility(View.VISIBLE);
            d1.setVisibility(View.VISIBLE);
            x1.setVisibility(View.VISIBLE);
            y1.setVisibility(View.VISIBLE);
            z1.setVisibility(View.VISIBLE);
            a2.setVisibility(View.VISIBLE);
            b2.setVisibility(View.VISIBLE);
            c2.setVisibility(View.VISIBLE);
            d2.setVisibility(View.VISIBLE);
            x2.setVisibility(View.VISIBLE);
            y2.setVisibility(View.VISIBLE);
            z2.setVisibility(View.VISIBLE);
            a3.setVisibility(View.VISIBLE);
            b3.setVisibility(View.VISIBLE);
            c3.setVisibility(View.VISIBLE);
            d3.setVisibility(View.VISIBLE);
            x3.setVisibility(View.VISIBLE);
            y3.setVisibility(View.VISIBLE);
            z3.setVisibility(View.VISIBLE);
        }
        else
        {
            makeAllGone();
        }
    }

    public void relativeTextSet()
    {
        String s0=type.getSelectedItem().toString();
        String s1=quantity.getSelectedItem().toString();

        if(s0.equalsIgnoreCase("Degree of a variable")&&s1.equalsIgnoreCase("2"))
        {
            x1.setText("x2+");
            y1.setText("x+");
            z1.setText("=0");
        }
        else if(s0.equalsIgnoreCase("Degree of a variable")&&s1.equalsIgnoreCase("3"))
        {
            x1.setText("x3+");
            y1.setText("x2+");
            z1.setText("x+");
            w1.setText("=0");
        }
        else if(s0.equalsIgnoreCase("Unknown variables")&&s1.equalsIgnoreCase("2"))
        {
            x1.setText("x1+");
            y1.setText("y1+");
            z1.setText("=0");

            x2.setText("x2+");
            y2.setText("y2+");
            z2.setText("=0");
        }
        else if(s0.equalsIgnoreCase("Unknown variables")&&s1.equalsIgnoreCase("3"))
        {
            x1.setText("x1+");
            y1.setText("y1+");
            z1.setText("z1=");

            x2.setText("x2+");
            y2.setText("y2+");
            z2.setText("z2=");

            x3.setText("x3+");
            y3.setText("y3+");
            z3.setText("z3=");
        }
        else
        {

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equation_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        getSupportActionBar().setTitle("EQUATION");

        type=(Spinner)findViewById(R.id.spinner_type);
        quantity=(Spinner)findViewById(R.id.spinner_quantity);
        calculate=(Button)findViewById(R.id.button_calculate);
        clear=(Button)findViewById(R.id.button_clear);
        enterYourEquationLabel=(TextView)findViewById(R.id.textView_enterYourEquationLabel);
        outputLabel=(TextView)findViewById(R.id.textView_outputLabel);
        outputList=(ListView)findViewById(R.id.listView_output);
        a1=(EditText)findViewById(R.id.editText_a1);
        a2=(EditText)findViewById(R.id.editText_a2);
        a3=(EditText)findViewById(R.id.editText_a3);
        b1=(EditText)findViewById(R.id.editText_b1);
        b2=(EditText)findViewById(R.id.editText_b2);
        b3=(EditText)findViewById(R.id.editText_b3);
        c1=(EditText)findViewById(R.id.editText_c1);
        c2=(EditText)findViewById(R.id.editText_c2);
        c3=(EditText)findViewById(R.id.editText_c3);
        d1=(EditText)findViewById(R.id.editText_d1);
        d2=(EditText)findViewById(R.id.editText_d2);
        d3=(EditText)findViewById(R.id.editText_d3);
        x1=(TextView)findViewById(R.id.textView_x1);
        x2=(TextView)findViewById(R.id.textView_x2);
        x3=(TextView)findViewById(R.id.textView_x3);
        y1=(TextView)findViewById(R.id.textView_y1);
        y2=(TextView)findViewById(R.id.textView_y2);
        y3=(TextView)findViewById(R.id.textView_y3);
        z1=(TextView)findViewById(R.id.textView_z1);
        z2=(TextView)findViewById(R.id.textView_z2);
        z3=(TextView)findViewById(R.id.textView_z3);
        w1=(TextView)findViewById(R.id.textView_w1);
        w2=(TextView)findViewById(R.id.textView_w2);
        w3=(TextView)findViewById(R.id.textView_w3);



        makeAllGone();

        ArrayAdapter<String> arrayAdapterType=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,typeString);
        arrayAdapterType.setDropDownViewResource(android.R.layout.simple_spinner_item);
        type.setAdapter(arrayAdapterType);

        type.setOnItemSelectedListener
                (
                        new AdapterView.OnItemSelectedListener()
                        {
                            @Override
                            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
                            {
                                makeAllGone();
                                relativeSpinnerItemSet();
                                relativeVisibility();
                                relativeTextSet();
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent)
                            {

                            }
                        }
                );
        quantity.setOnItemSelectedListener
                (
                        new AdapterView.OnItemSelectedListener()
                        {
                            @Override
                            public void onItemSelected(AdapterView<?> parent,View view,int position,long id)
                            {
                                makeAllGone();
                                relativeVisibility();
                                relativeTextSet();
                            }

                            @Override
                            public void onNothingSelected(AdapterView<?> parent)
                            {

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
                                setAllFieldClear();
                            }
                        }
                );
        calculate.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String s0=type.getSelectedItem().toString();
                                String s1=quantity.getSelectedItem().toString();

                                if(s0.equalsIgnoreCase("Degree of a variable")&&s1.equalsIgnoreCase("2"))
                                {
                                    list.clear();
                                    try
                                    {
                                        String f1 = a1.getText().toString();
                                        String f2 = b1.getText().toString();
                                        String f3 = c1.getText().toString();
                                        int flag = 0;
                                        if(f1.equals("")||f2.equals("")||f3.equals(""))
                                        {
                                            flag=1;
                                        }
                                        if(flag==0)
                                        {
                                            double a = Double.parseDouble(f1);
                                            double b = Double.parseDouble(f2);
                                            double c = Double.parseDouble(f3);

                                            Equation equation = new Equation();
                                            list= equation.calculationPerform(a,b,c);
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        list.add(e.getMessage());
                                    }
                                }
                                else if(s0.equalsIgnoreCase("Degree of a variable")&&s1.equalsIgnoreCase("3"))
                                {
                                    list.clear();
                                    try
                                    {
                                        String f1 = a1.getText().toString();
                                        String f2 = b1.getText().toString();
                                        String f3 = c1.getText().toString();
                                        String f4 = d1.getText().toString();
                                        int flag = 0;
                                        if(f1.equals("")||f2.equals("")||f3.equals("")||f4.equals(""))
                                        {
                                            flag=1;
                                        }
                                        if(flag==0)
                                        {
                                            double a = Double.parseDouble(f1);
                                            double b = Double.parseDouble(f2);
                                            double c = Double.parseDouble(f3);
                                            double d = Double.parseDouble(f4);

                                            Equation equation = new Equation();
                                            list= equation.calculationPerform(a,b,c,d);
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        list.add(e.getMessage());
                                    }

                                }
                                else if(s0.equalsIgnoreCase("Unknown variables")&&s1.equalsIgnoreCase("2"))
                                {
                                    list.clear();
                                    try
                                    {
                                        String f1 = a1.getText().toString();
                                        String f2 = b1.getText().toString();
                                        String f3 = c1.getText().toString();
                                        String f4 = a2.getText().toString();
                                        String f5 = b2.getText().toString();
                                        String f6 = c2.getText().toString();
                                        int flag = 0;
                                        if (f1.equals("") || f2.equals("") || f3.equals("") || f4.equals("")||f5.equals("")||f6.equals(""))
                                        {
                                            flag = 1;
                                        }
                                        if (flag == 0)
                                        {
                                            double a = Double.parseDouble(f1);
                                            double b = Double.parseDouble(f2);
                                            double c = Double.parseDouble(f3);
                                            double d = Double.parseDouble(f4);
                                            double e = Double.parseDouble(f5);
                                            double f = Double.parseDouble(f6);

                                            Equation equation = new Equation();
                                            list = equation.calculationPerform(a,b,c,d,e,f);
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        list.add(e.getMessage());
                                    }

                                }
                                else if(s0.equalsIgnoreCase("Unknown variables")&&s1.equalsIgnoreCase("3"))
                                {
                                    list.clear();
                                    try
                                    {
                                        String f1 = a1.getText().toString();
                                        String f2 = b1.getText().toString();
                                        String f3 = c1.getText().toString();
                                        String f4 = d1.getText().toString();
                                        String f5 = a2.getText().toString();
                                        String f6 = b2.getText().toString();
                                        String f7 = c2.getText().toString();
                                        String f8 = d2.getText().toString();
                                        String f9 = a3.getText().toString();
                                        String f10 = b3.getText().toString();
                                        String f11 = c3.getText().toString();
                                        String f12 = d3.getText().toString();
                                        int flag = 0;
                                        if (f1.equals("") || f2.equals("") || f3.equals("") || f4.equals("")||f5.equals("")||f6.equals(""))
                                        {
                                            flag = 1;
                                        }
                                        if (flag == 0)
                                        {
                                            double a = Double.parseDouble(f1);
                                            double b = Double.parseDouble(f2);
                                            double c = Double.parseDouble(f3);
                                            double d = Double.parseDouble(f4);
                                            double e = Double.parseDouble(f5);
                                            double f = Double.parseDouble(f6);
                                            double g = Double.parseDouble(f7);
                                            double h = Double.parseDouble(f8);
                                            double i = Double.parseDouble(f9);
                                            double j = Double.parseDouble(f10);
                                            double k = Double.parseDouble(f11);
                                            double l = Double.parseDouble(f12);

                                            Equation equation = new Equation();
                                            list = equation.calculationPerform(a,b,c,d,e,f,g,h,i,j,k,l);
                                        }
                                    }
                                    catch (Exception e)
                                    {
                                        list.add(e.getMessage());
                                    }

                                }
                                else
                                {
                                    list.clear();
                                }
                                relativeListSet();
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
        getMenuInflater().inflate(R.menu.equation_calculator, menu);
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


        if (id==R.id.nav_start_page)
        {
            // Handle the camera action
            Intent intent=new Intent(EquationCalculator.this,StartPage.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_converter)
        {
            Intent intent=new Intent(EquationCalculator.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_number_system_converter)
        {
            Intent intent=new Intent(EquationCalculator.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent=new Intent(EquationCalculator.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent=new Intent(EquationCalculator.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {

        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent=new Intent(EquationCalculator.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(EquationCalculator.this,ScientificCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(EquationCalculator.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

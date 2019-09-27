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

import org.apache.commons.math3.complex.Complex;
import org.apache.commons.math3.complex.ComplexFormat;

import functions.ComplexFrAid;

public class ComplexCalculator extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    //components
    EditText input1, input2 ;
    Spinner operation;
    TextView output;
    Button select;
    //members
    public String[] empty1 = new String[] {""};
    public String[] operations = new String[]
            {
                    "(SELECT A OPERATION)","CLEAR","SWAP","ANSWER","ADD","SUBTRACT","MULTIPLY","DIVIDE",
                    "CONJUGATE","NEGATE","ARGUMENT","ABSOLUTE","POWER","LOGARITHM","SQUARE ROOT",
                    "SQUARE ROOT OF (1-function^2)","EXPONENTIAL FUNCTION",
                    "SINE","COSINE","TANGENT","COSECANT","SECANT","COTANGENT","SINE INVERSE","COSINE INVERSE",
                    "TANGENT INVERSE","COSECANT INVERSE","SECANT INVERSE","COTANGENT INVERSE",
                    "HYPERBOLIC SINE","HYPERBOLIC COSINE","HYPERBOLIC TANGENT","HYPERBOLIC COSECANT",
                    "HYPERBOLIC SECANT","HYPERBOLIC COTANGENT","INVERSE HYPERBOLIC SINE",
                    "INVERSE HYPERBOLIC COSINE","INVERSE HYPERBOLIC TANGENT","INVERSE HYPERBOLIC COSECANT",
                    "INVERSE HYPERBOLIC SECANT","INVERSE HYPERBOLIC COTANGENT"
            };

    public void setEmptyList()
    {
        ArrayAdapter<String> arrayAdapterEmpty = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,empty1);
        arrayAdapterEmpty.setDropDownViewResource(android.R.layout.simple_spinner_item);
        operation.setAdapter(arrayAdapterEmpty);
    }
    public void setOperationList()
    {
        ArrayAdapter<String> arrayAdapterResult = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,operations);
        arrayAdapterResult.setDropDownViewResource(android.R.layout.simple_spinner_item);
        operation.setAdapter(arrayAdapterResult);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complex_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("COMPLEX");

        input1 = (EditText)findViewById(R.id.editText_input1);
        input2  = (EditText)findViewById(R.id.editText_input2);
        operation = (Spinner)findViewById(R.id.spinner_operation);
        output = (TextView)findViewById(R.id.textView_output);
        select = (Button)findViewById(R.id.button_select);

        setOperationList();

        select.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                String i1=input1.getText().toString();
                                String i2=input2.getText().toString();
                                String o = operation.getSelectedItem().toString();
                                //clear
                                if(o.equalsIgnoreCase("clear"))
                                {
                                    input1.setText("");
                                    input2.setText("");
                                    output.setText("");
                                }
                                //answer
                                if(o.equalsIgnoreCase("answer"))
                                {
                                    input1.setText(output.getText().toString());
                                    input2.setText("");
                                }
                                //add
                                else if(o.equalsIgnoreCase("add"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z2 = complexFormat.parse(i2);
                                        Complex z = z1.add(z2);
                                        String finalResult = complexFormat.format(z);
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //subtract
                                else if(o.equalsIgnoreCase("subtract"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z2 = complexFormat.parse(i2);
                                        Complex z = z1.subtract(z2);
                                        String finalResult = complexFormat.format(z);
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //multiply
                                else if(o.equalsIgnoreCase("multiply"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z2 = complexFormat.parse(i2);
                                        Complex z = z1.multiply(z2);
                                        String finalResult = complexFormat.format(z);
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //divide
                                else if(o.equalsIgnoreCase("divide"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z2 = complexFormat.parse(i2);
                                        Complex z = z1.divide(z2);
                                        String finalResult = complexFormat.format(z);
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //swap
                                else if(o.equalsIgnoreCase("swap"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z2 = complexFormat.parse(i2);
                                        Complex z = z1;
                                        z1 = z2 ;
                                        input1.setText(complexFormat.format(z1));
                                        input2.setText(complexFormat.format(z));

                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //power
                                else if(o.equalsIgnoreCase("power"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z2 = complexFormat.parse(i2);
                                        Complex z = z1.pow(z2);
                                        String finalResult = complexFormat.format(z);
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //log
                                else if(o.equalsIgnoreCase("logarithm"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.log();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //conjugate
                                else if(o.equalsIgnoreCase("conjugate"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.conjugate();

                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //argument
                                else if(o.equalsIgnoreCase("argument"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        double z = z1.getArgument();
                                        String finalResult = Double.toString(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //negate
                                else if(o.equalsIgnoreCase("negate"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.negate();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //absolute
                                else if(o.equalsIgnoreCase("absolute"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        double z = z1.abs();
                                        String finalResult = Double.toString(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //square root
                                else if(o.equalsIgnoreCase("square root"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.sqrt();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //SQUARE ROOT OF (1-z^2)
                                else if(o.equalsIgnoreCase("square root of (1-function^2)"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.sqrt1z();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //exponential function
                                else if(o.equalsIgnoreCase("exponential function"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.exp();

                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //sin
                                else if(o.equalsIgnoreCase("sine"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.sin();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cos
                                else if(o.equalsIgnoreCase("cosine"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.cos();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //tan
                                else if(o.equalsIgnoreCase("tangent"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.tan();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cosec
                                else if(o.equalsIgnoreCase("cosecant"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.sin()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //sec
                                else if(o.equalsIgnoreCase("secant"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.cos()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cot
                                else if(o.equalsIgnoreCase("cotangent"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.tan()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //sin^-1
                                else if(o.equalsIgnoreCase("sine inverse"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.asin();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cos^-1
                                else if(o.equalsIgnoreCase("cosine inverse"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.acos();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //tan^-1
                                else if(o.equalsIgnoreCase("tangent inverse"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.atan();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cosec^-1
                                else if(o.equalsIgnoreCase("cosecant inverse"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.asin()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //sec^-1
                                else if(o.equalsIgnoreCase("secant inverse"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.acos()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cot^-1
                                else if(o.equalsIgnoreCase("cotangent inverse"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.atan()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //sinh
                                else if(o.equalsIgnoreCase("hyperbolic sine"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.sinh();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cosh
                                else if(o.equalsIgnoreCase("hyperbolic cosine"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.cosh();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //tanh
                                else if(o.equalsIgnoreCase("hyperbolic tangent"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = z1.tanh();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //cosech
                                else if(o.equalsIgnoreCase("hyperbolic cosecant"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.sinh()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //sech
                                else if(o.equalsIgnoreCase("hyperbolic secant"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.cosh()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //coth
                                else if(o.equalsIgnoreCase("hyperbolic cotangent"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        Complex z = (z1.tanh()).reciprocal();
                                        String finalResult = complexFormat.format(z);
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //asinh
                                else if(o.equalsIgnoreCase("inverse hyperbolic sine"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        ComplexFrAid complexFrAid = new ComplexFrAid();
                                        String finalResult = complexFrAid.complexTrigonometricResult("asinh",z1.getReal(),z1.getImaginary());
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //acosh
                                else if(o.equalsIgnoreCase("inverse hyperbolic cosine"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        ComplexFrAid complexFrAid = new ComplexFrAid();
                                        String finalResult = complexFrAid.complexTrigonometricResult("acosh",z1.getReal(),z1.getImaginary());
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //atanh
                                else if(o.equalsIgnoreCase("inverse hyperbolic tangent"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        ComplexFrAid complexFrAid = new ComplexFrAid();
                                        String finalResult = complexFrAid.complexTrigonometricResult("atanh",z1.getReal(),z1.getImaginary());
                                        input2.setText("");
                                        output.setText(finalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //acosech
                                else if(o.equalsIgnoreCase("inverse hyperbolic cosecant"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        ComplexFrAid complexFrAid = new ComplexFrAid();
                                        String finalResult = complexFrAid.complexTrigonometricResult("asinh",z1.getReal(),z1.getImaginary());
                                        Complex z2 = (complexFormat.parse(finalResult)).reciprocal();
                                        String newFinalResult = complexFormat.format(z2);
                                        input2.setText("");
                                        output.setText(newFinalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //asech
                                else if(o.equalsIgnoreCase("inverse hyperbolic secant"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        ComplexFrAid complexFrAid = new ComplexFrAid();
                                        String finalResult = complexFrAid.complexTrigonometricResult("cosh",z1.getReal(),z1.getImaginary());
                                        Complex z2 = (complexFormat.parse(finalResult)).reciprocal();
                                        String newFinalResult = complexFormat.format(z2);
                                        input2.setText("");
                                        output.setText(newFinalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
                                    }
                                }
                                //acoth
                                else if(o.equalsIgnoreCase("inverse hyperbolic cotangent"))
                                {
                                    try
                                    {
                                        ComplexFormat complexFormat = new ComplexFormat();
                                        Complex z1 = complexFormat.parse(i1);
                                        ComplexFrAid complexFrAid = new ComplexFrAid();
                                        String finalResult = complexFrAid.complexTrigonometricResult("atanh",z1.getReal(),z1.getImaginary());
                                        Complex z2 = (complexFormat.parse(finalResult)).reciprocal();
                                        String newFinalResult = complexFormat.format(z2);
                                        input2.setText("");
                                        output.setText(newFinalResult);
                                    }
                                    catch (Exception e)
                                    {
                                        output.setText("");
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
        getMenuInflater().inflate(R.menu.complex_calculator, menu);
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
            Intent intent = new Intent(ComplexCalculator.this,StartPage.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(ComplexCalculator.this,NormalCalculator.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(ComplexCalculator.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(ComplexCalculator.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(ComplexCalculator.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(ComplexCalculator.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {

        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(ComplexCalculator.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(ComplexCalculator.this,ScientificCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

package com.blogspot.virtualn0t3b00k.advancedcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
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
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import bsh.Interpreter;
import bsh.EvalError;


public class TableCalculator extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    //declaring members
    public String[] empty1 = new String[] {""};
    public List list = new ArrayList();
    //declare component varibale
    public EditText start1,step1,end1,equation1;
    public Button calculate1,clear1;
    public ListView list1;
    //MyRecyclerViewAdapter adapter;

    //creating functions
    public void setEmptyList()
    {
        /*
        ArrayAdapter<String> arrayAdapterEmpty = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,empty1);
        arrayAdapterEmpty.setDropDownViewResource(android.R.layout.simple_list_item_1);
        list1.setAdapter(arrayAdapterEmpty);
        */
    }

    public void setResultList()
    {
        System.out.println(list);

        //
        ArrayAdapter<String> arrayAdapterEmpty = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        arrayAdapterEmpty.setDropDownViewResource(android.R.layout.simple_list_item_1);
        list1.setAdapter(arrayAdapterEmpty);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_calculator);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("TABLE");

        // capture ids
        equation1 = (EditText)findViewById(R.id.editText_equation);
        start1 = (EditText)findViewById(R.id.editText_start);
        end1 = (EditText)findViewById(R.id.editText_end);
        step1 = (EditText)findViewById(R.id.editText_step);
        calculate1 = (Button)findViewById(R.id.button_calculate);
        list1 = (ListView)findViewById(R.id.listView_output);
        clear1 = (Button)findViewById(R.id.button_clear);
        //set empty list to listView
        setEmptyList();
        //work with calculate button
        calculate1.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                list.clear();
                                String s = equation1.getText().toString();
                                String s1 = start1.getText().toString();
                                String s2 = end1.getText().toString();
                                String s3 = step1.getText().toString();

                                int flag = 1;
                                if(s.equals("")||s1.equals("")||s2.equals("")||s3.equals(""))
                                {
                                    flag = 0;
                                }
                                if((s.contains("x")||s.contains("X"))==false)
                                {
                                    flag = 0;
                                }
                                if(flag==1)
                                {
                                    try
                                    {
                                        double begin = Double.parseDouble(s1);
                                        double ending = Double.parseDouble(s2);
                                        double step = Double.parseDouble(s3);

                                        for(double d =begin; d<=ending; d=d+step)
                                        {
                                            String s4 = s.replaceAll("x",""+d);
                                            String s0 = s4.replaceAll("X",""+d);

                                            Interpreter interpreter = new Interpreter();
                                            String result = interpreter.eval("1.0*"+s0).toString();

                                            String finalResult = "x : "+d+" F(x) : "+result;
                                            list.add(finalResult);
                                        }

                                        setResultList();
                                    }
                                    catch (Exception e)
                                    {

                                    }
                                }
                            }
                        }
                );
        clear1.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            @Override
                            public void onClick(View v)
                            {
                                equation1.setText("");
                                start1.setText("");
                                end1.setText("");
                                step1.setText("");
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
        getMenuInflater().inflate(R.menu.table_calculator, menu);
        return true;
    }

    public void onItemClick(View view, int position) {
        //Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
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
            Intent intent = new Intent(TableCalculator.this,StartPage.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(TableCalculator.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(TableCalculator.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(TableCalculator.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {

        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(TableCalculator.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(TableCalculator.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(TableCalculator.this,ScientificCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(TableCalculator.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

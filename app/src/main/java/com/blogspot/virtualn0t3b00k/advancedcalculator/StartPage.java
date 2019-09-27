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
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class StartPage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
    ListView listView;
    List<String> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setTitle("START PAGE");
        /*

        listView=(ListView)findViewById(R.id.listView);
        list.add("DEVELOPERS : ");
        list.add("MUHAMMAD ZAFIR ALVI");
        list.add("A.M.N. BILLAH KHAN");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_1);
        listView.setAdapter(arrayAdapter);
        */

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
        getMenuInflater().inflate(R.menu.start_page, menu);
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
        }
        else if (id == R.id.nav_converter)
        {
            Intent intent = new Intent(StartPage.this,UnitConversion.class);
            startActivity(intent);
        }
        else if (id == R.id.nav_number_system_converter)
        {
            Intent intent = new Intent(StartPage.this,NumberSystemConversion.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_number_system_calculator)
        {
            Intent intent = new Intent(StartPage.this,NumberSystemCalculation.class);
            startActivity(intent);
        }
        else if  (id==R.id.nav_table_calculator)
        {
            Intent intent = new Intent(StartPage.this,TableCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_complex_calculator)
        {
            Intent intent = new Intent(StartPage.this,ComplexCalculator.class);
            startActivity(intent);
        }
        else if (id==R.id.nav_equation_calculator)
        {
            Intent intent = new Intent(StartPage.this,EquationCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_scientific_calculator)
        {
            Intent intent = new Intent(StartPage.this,ScientificCalculator.class);
            startActivity(intent);
        }
        else if(id==R.id.nav_normal_calculator)
        {
            Intent intent = new Intent(StartPage.this,NormalCalculator.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

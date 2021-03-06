package com.example.seartho16.drawalarmclock;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    int difficulty = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
//        String[] items = new String[]{"1", "2", "3"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
//        dropdown.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addAlarm(View view) {
//        Time savedTime = new Time(System.currentTimeMillis());
//        Time savedTime = new Time();
//        NextFragment nextFrag= new NextFragment();
//        this.getFragmentManager().beginTransaction()
//                .replace(R.id.Layout_container, nextFrag,TAG_FRAGMENT)
//                .addToBackStack(null)
//                .commit();
        Fragment newFragment = new Fragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.Pick_Time, newFragment);
        transaction.addToBackStack(null);

        transaction.commit();


    }

    public void difficultyChange(View view) {

    }

    public void viewAlarms(View view) {

    }

}

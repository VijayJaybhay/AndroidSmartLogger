package me.vijayjaybhay.androidsmartlogger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import logger.ApplicationLogger;
import logger.Logger;


public class LoggerDemo extends ActionBarActivity {

    private static final String TAG= LoggerDemo.class.getName().substring(0,20);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logger_demo);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        ApplicationLogger.d(TAG,"In onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        ApplicationLogger.d(TAG,"In onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        ApplicationLogger.d(TAG,"In onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        ApplicationLogger.d(TAG,"In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        ApplicationLogger.d(TAG,"In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ApplicationLogger.d(TAG,"In onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_logger_demo, menu);
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
}

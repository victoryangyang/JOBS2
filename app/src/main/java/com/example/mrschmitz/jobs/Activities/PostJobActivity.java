package com.example.mrschmitz.jobs.Activities;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.mrschmitz.jobs.Activities.Utilities.BottomNavigationViewHelper;
import com.example.mrschmitz.jobs.R;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class PostJobActivity extends AppCompatActivity {

    private static final String TAG = "PostJobActivity";
    private static final int ACTIVITY_NUM = 2;

    private Context mContext = PostJobActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_job);

        Log.d(TAG, "onCreate: starting.");

        setupBottomNavigationView();
    }

    public void backToProfile(View view){
        Intent intent = new Intent(PostJobActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}

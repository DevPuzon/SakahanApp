package com.softwaresolution.sakahan_app.BuyerPackage;

import android.os.Bundle;
import android.support.annotation.NonNull;
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

import com.softwaresolution.sakahan_app.R;

public class BuyerMain extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Market()).commit();
            getSupportActionBar().setTitle("Market");
            navigationView.setCheckedItem(R.id.nav_market);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.nav_market:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Market()).commit();
                getSupportActionBar().setTitle("Market");
                break;
            case R.id.nav_farmer_offer:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new MyOffer()).commit();
                getSupportActionBar().setTitle("My Offer");
                break;
            case R.id.nav_transaction:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Transaction()).commit();
                getSupportActionBar().setTitle("Transaction");
                break;
            case R.id.nav_dashboard:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Dashboard()).commit();
                getSupportActionBar().setTitle("Dashboard");
                break;
            case R.id.nav_message:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Message()).commit();
                getSupportActionBar().setTitle("Message");
                break;
            case R.id.nav_account_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AccountSettings()).commit();
                getSupportActionBar().setTitle("Account Settings");
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
}

package com.example.lishamanandhar.onefootballeg;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 Toolbar toolbar;
 TabLayout tablayout;
 ViewPager viewpager;
 ViewPagerAdapter viewpageradapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tablayout = (TabLayout) findViewById(R.id.tablayout);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new GameDay());
        fragments.add(new Table());
        fragments.add(new Transfers());
        fragments.add(new Stats());
        fragments.add(new Teams());

        viewpageradapter = new ViewPagerAdapter(getSupportFragmentManager(),fragments);
        viewpager.setAdapter(viewpageradapter);
        setSupportActionBar(toolbar);

        TabLayout.Tab one  = tablayout.newTab();
        TabLayout.Tab two  = tablayout.newTab();
        TabLayout.Tab three  = tablayout.newTab();
        TabLayout.Tab four  = tablayout.newTab();
        TabLayout.Tab five = tablayout.newTab();



        one.setText("GameDay");
        two.setText("Table");
        three.setText("Transfer");
        four.setText("Stats");
        five.setText("Teams");



        tablayout.addTab(one);
        tablayout.addTab(two);
        tablayout.addTab(three);
        tablayout.addTab(four);
        tablayout.addTab(five);



        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));


    }
}

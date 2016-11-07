package com.branislav.icpc;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aurelhubert.ahbottomnavigation.AHBottomNavigation;
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem;
import com.branislav.icpc.fragment.CategoryDetailsFragment;
import com.branislav.icpc.fragment.IcbcHelpFragment;
import com.branislav.icpc.fragment.IcpcCategoryFragment;
import com.branislav.icpc.fragment.IcpcListFragment;
import com.branislav.icpc.fragment.PDFFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AHBottomNavigation bottomNavigation = (AHBottomNavigation) findViewById(R.id.bottom_navigation);

// Create items
        AHBottomNavigationItem item1 = new AHBottomNavigationItem(R.string.nav_category, R.drawable.glossary, R.color.color_tab_1);
        AHBottomNavigationItem item2 = new AHBottomNavigationItem(R.string.nav_list, R.drawable.policies, R.color.color_tab_2);
        AHBottomNavigationItem item3 = new AHBottomNavigationItem(R.string.nav_help, R.drawable.info, R.color.color_tab_3);


// Add items
        bottomNavigation.addItem(item1);
        bottomNavigation.addItem(item2);
        bottomNavigation.addItem(item3);


// Set background color
        bottomNavigation.setDefaultBackgroundColor(Color.parseColor("#FEFEFE"));

// Disable the translation inside the CoordinatorLayout
        bottomNavigation.setBehaviorTranslationEnabled(false);

// Change colors
        bottomNavigation.setAccentColor(Color.parseColor("#F63D2B"));
        bottomNavigation.setInactiveColor(Color.parseColor("#747474"));

// Force to tint the drawable (useful for font with icon for example)
        bottomNavigation.setForceTint(true);

// Force the titles to be displayed (against Material Design guidelines!)
        bottomNavigation.setForceTitlesDisplay(true);

// Use colored navigation with circle reveal effect
        bottomNavigation.setColored(true);

// Set current item programmatically
        bottomNavigation.setCurrentItem(0);

// Customize notification (title, background, typeface)


// Add or remove notification for each item

//        bottomNavigation.setNotification("", 1);
        getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, new IcpcCategoryFragment()).commit();
// Set listeners
        bottomNavigation.setOnTabSelectedListener(new AHBottomNavigation.OnTabSelectedListener() {
            @Override
            public boolean onTabSelected(int position, boolean wasSelected) {
                // selection code...
                if(position==0){

                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, new IcpcCategoryFragment()).commit();

                }
                else if(position==1){

                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, new IcpcListFragment()).commit();

                }
                else if(position==2){

                    getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, new IcbcHelpFragment()).commit();

                }

                return true;
            }
        });
        bottomNavigation.setOnNavigationPositionListener(new AHBottomNavigation.OnNavigationPositionListener() {
            @Override public void onPositionChange(int y) {
                // Manage the new y position
            }
        });


    }

    public void ReplaceFramgent (int position ,String title,String details)
    {
        if(position==1){
            Bundle bundle = new Bundle();
            bundle.putString("title", title);
            bundle.putString("sub","This is sub");
            bundle.putString("details",details);
// set Fragmentclass Arguments
            CategoryDetailsFragment categoryDetailsFragment = new CategoryDetailsFragment();
            categoryDetailsFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, categoryDetailsFragment).commit();
        }
        else if(position==2){
            Bundle bundle = new Bundle();
            bundle.putString("details",details);
            bundle.putString("title",title);
            PDFFragment pdfFragment = new PDFFragment();
            pdfFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(R.id.contentContainer, pdfFragment).commit();
        }


    }


}

package com.alexchecker.a2chmobile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static BottomNavigationView bottomNav;

    public static Fragment BoardsList;
    public static Fragment threadView = null;
    public static Fragment postView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNav = findViewById(R.id.bottomNav);
        BoardsList = new Boards();
        setFragment(BoardsList);
        bottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.ThreadsList:
                        setFragment(BoardsList);

                        break;

                    case R.id.PostList:
                        if(threadView!=null)
                        {
                            setFragment(threadView);
                        }
                        break;

                    case R.id.PostContent:
                        setFragment(new PostReader());
                        break;
                }

                return true;
            }
        });

    }

    public void setFragment(Fragment frag)
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentViewer,frag,null).commit();
    }
}
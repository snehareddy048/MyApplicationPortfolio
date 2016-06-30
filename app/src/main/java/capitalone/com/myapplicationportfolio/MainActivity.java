package capitalone.com.myapplicationportfolio;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private static String displayMessage = "This button will launch ";
    ComponentName componentName;
    Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moviesApp(View v) {
        String pkg = "com.example.snehaanand.";
        componentName = new ComponentName(pkg + "moviesapp",
                pkg + "moviesapp.view.MainActivity");
        intent.setComponent(componentName);
        startActivity(intent);
    }

    public void scoresApp(View v) {
        String pkg = "barqsoft.footballscores";
        componentName = new ComponentName(pkg ,
                pkg + ".MainActivity");
        intent.setComponent(componentName);
        startActivity(intent);
            }

    public void libraryApp(View v) {
        String pkg = "it.jaschke.alexandria";
        componentName = new ComponentName(pkg ,
                pkg + ".MainActivity");
        intent.setComponent(componentName);
        startActivity(intent);
            }

    public void buildItBigger(View v) {
        String pkg = "com.udacity.gradle.builditbigger";
        componentName = new ComponentName(pkg ,
                pkg + ".MainActivity");
        intent.setComponent(componentName);
        startActivity(intent);
    }

    public void materialApp(View v) {
        String pkg = "com.example.xyzreader";
        componentName = new ComponentName(pkg ,
                pkg + ".ui.ArticleListActivity");
        intent.setComponent(componentName);
        startActivity(intent);
    }

    public void goUbiquitous(View v) {
        String pkg = "com.example.snehaanandyeluguri.ubiquitouswatchface";
        componentName = new ComponentName(pkg ,
                pkg + ".MainActivity");
        intent.setComponent(componentName);
        startActivity(intent);
    }


    public void capstoneMyOwnApp(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "my capstone app!", Toast.LENGTH_SHORT).show();
    }

}

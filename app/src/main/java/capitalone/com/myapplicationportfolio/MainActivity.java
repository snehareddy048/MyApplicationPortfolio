package capitalone.com.myapplicationportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private static String displayMessage = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spoifyStreamer(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "spotify streamer!", Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "scores app!", Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "library app!", Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "build it bigger app!", Toast.LENGTH_SHORT).show();
    }

    public void xyzReader(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "xyz reader app!", Toast.LENGTH_SHORT).show();
    }

    public void capstoneMyOwnApp(View v) {
        Toast.makeText(getApplicationContext(), displayMessage + "my capstone app!", Toast.LENGTH_SHORT).show();
    }

}

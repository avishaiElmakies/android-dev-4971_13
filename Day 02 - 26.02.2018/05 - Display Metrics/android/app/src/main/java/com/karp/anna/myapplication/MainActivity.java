package com.karp.anna.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

// Metrics: a standard of measurement.

public class MainActivity extends AppCompatActivity {

    private TextView textViewDisplayMetrics;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewDisplayMetrics = (TextView)findViewById(R.id.textViewDisplayMetrics);
    }

    public void buttonDisplayMetrics_onClick(View view) {

        // Get the device's display metrics:
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();

        String displayMetricsInfo =
                "Dot Per Inch (dpi): " + displayMetrics.densityDpi + "\n" +
                        "X dpi: " + displayMetrics.xdpi + "\n" +
                        "Y dpi: " + displayMetrics.ydpi + "\n" +
                        "dp Factor: " + displayMetrics.density + "\n" +
                        "sp Factor: " + displayMetrics.scaledDensity + "\n" +
                        "Width Pixels: " + displayMetrics.widthPixels + "\n" +
                        "Height Pixels: " + displayMetrics.heightPixels;

        textViewDisplayMetrics.setText(displayMetricsInfo);

        // metrics.density = 1 for 160dpi, 2 for 320 dpi, 3 for 480dpi etc.
        // metrics.scaledDensity = same as metrics.density but including font size preferences.
    }
}
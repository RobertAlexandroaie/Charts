package com.fii.charts;

import java.util.ArrayList;

import model.Chart;
import model.PieChart;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    LinearLayout layout;
    private Chart chart;
    private ArrayList<Integer> values = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);

	layout = (LinearLayout) findViewById(R.id.chart_layout);

	values.add(200);
	values.add(300);
	values.add(150);
	values.add(400);

	chart = new PieChart(this, values);
	layout.addView(chart);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.main, menu);
	return true;
    }

}

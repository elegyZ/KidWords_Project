package com.example.kidapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private List<FruitItem> fruitlist = new ArrayList<FruitItem>();
	private FruitAdapter adapter;
    private ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFruitlist();
		listView = (ListView)findViewById(R.id.fruitlist);
		adapter = new FruitAdapter(this,R.layout.fruit_item,fruitlist);
		listView.setAdapter(adapter);
	}
	
	public void initFruitlist()
	{
		FruitItem apple = new FruitItem("apple",R.drawable.apple);
		FruitItem banana = new FruitItem("banana",R.drawable.banana);
		FruitItem blueberry = new FruitItem("blueberry",R.drawable.blueberry);
		FruitItem cherry = new FruitItem("cherry",R.drawable.cherry);
		FruitItem grape = new FruitItem("grape",R.drawable.grape);
		FruitItem grapefruit = new FruitItem("grapefruit",R.drawable.grapefruit);
		FruitItem lemon = new FruitItem("lemon",R.drawable.lemon);
		FruitItem orange = new FruitItem("orange",R.drawable.orange);
		FruitItem peach = new FruitItem("peach",R.drawable.peach);
		FruitItem pear = new FruitItem("pear",R.drawable.pear);
		FruitItem strawberry = new FruitItem("strawberry",R.drawable.strawberry);
		FruitItem watermelon = new FruitItem("watermelon",R.drawable.watermelon);
		fruitlist.add(apple);
		fruitlist.add(banana);
		fruitlist.add(blueberry);
		fruitlist.add(cherry);
		fruitlist.add(grape);
		fruitlist.add(grapefruit);
		fruitlist.add(lemon);
		fruitlist.add(orange);
		fruitlist.add(peach);
		fruitlist.add(pear);
		fruitlist.add(strawberry);
		fruitlist.add(watermelon);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

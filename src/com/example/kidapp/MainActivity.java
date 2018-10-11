package com.example.kidapp;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
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
		OnItemClickListener lst_fruit = new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) 
			{
				Intent fruit_intent = new Intent(MainActivity.this,ActivityFruitItem.class);
				startActivity(fruit_intent);
			}
		};
		listView.setOnItemClickListener(lst_fruit);
	}
	
	public void initFruitlist()
	{
		FruitItem apple = new FruitItem("Apple", R.drawable.apple, Color.parseColor("#a95d3b"));
		FruitItem banana = new FruitItem("Banana", R.drawable.banana, Color.parseColor("#db916a"));
		FruitItem blueberry = new FruitItem("Blueberry", R.drawable.blueberry, Color.parseColor("#ebc43b"));
		FruitItem cherry = new FruitItem("Cherry", R.drawable.cherry, Color.parseColor("#b3c259"));
		FruitItem grape = new FruitItem("Grape", R.drawable.grape, Color.parseColor("#b2d3e4"));
		FruitItem grapefruit = new FruitItem("Grapefruit", R.drawable.grapefruit, Color.parseColor("#ecc441"));
		FruitItem lemon = new FruitItem("Lemon", R.drawable.lemon, Color.parseColor("#90c6c8"));
		FruitItem orange = new FruitItem("Orange", R.drawable.orange, Color.parseColor("#f0d880"));
		FruitItem peach = new FruitItem("Peach", R.drawable.peach, Color.parseColor("#b6dbe3"));
		FruitItem pear = new FruitItem("Pear", R.drawable.pear, Color.parseColor("#dbe3b0"));
		FruitItem strawberry = new FruitItem("Strawberry", R.drawable.strawberry, Color.parseColor("#e4ab38"));
		FruitItem watermelon = new FruitItem("Watermelon", R.drawable.watermelon, Color.parseColor("#EBC43B"));
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

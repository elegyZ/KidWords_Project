package com.example.kidapp;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<FruitItem> {
	private final int resourceID;
	
	public FruitAdapter(Context context,int textViewResourceID,List<FruitItem> objects)
	{
		super(context,textViewResourceID,objects);
		resourceID = textViewResourceID;
	}
	
	@Override
	public View getView(int position,View convertView,ViewGroup parent)
	{
		FruitItem fruit = (FruitItem)getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceID, null);
		ImageView fruitImage = (ImageView)view.findViewById(R.id.fruit_image);
		TextView fruitName = (TextView)view.findViewById(R.id.fruit_name);
		LinearLayout fruitBackbround = (LinearLayout)view.findViewById(R.id.fruit_bg);
		fruitImage.setImageResource(fruit.getID());
		fruitName.setText(fruit.getName());
		fruitBackbround.setBackgroundColor(fruit.getColor());
		return view;
	}
}

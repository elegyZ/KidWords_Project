package com.example.kidapp;

import android.app.Activity;
import android.os.Bundle;

public class ActivityFruitItem extends Activity 
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fuit);
		setTitle("Strawberry");
	}
}

package com.example.kidapp;

public class FruitItem {
	private String fruitName;
	private int imageID;
	
	public FruitItem(String s,int i)
	{
		this.fruitName = s;
		this.imageID = i;
	}
	
	public String getName()
	{
		return fruitName;
	}
	
	public int getID()
	{
		return imageID;
	}
}

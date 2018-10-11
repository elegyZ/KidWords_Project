package com.example.kidapp;

public class FruitItem {
	private String fruitName;
	private int imageID;
	private int color;
	
	public FruitItem(String s,int i,int c)
	{
		this.fruitName = s;
		this.imageID = i;
		this.color = c;
	}
	
	public String getName()
	{
		return fruitName;
	}
	
	public int getID()
	{
		return imageID;
	}
	
	public int getColor()
	{
		return color;
	}
}

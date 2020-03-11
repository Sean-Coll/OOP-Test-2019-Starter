package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	

	ArrayList<Colour> colours = new ArrayList<Colour>();

	public void loadColours()
	{
		Table t = loadTable("colours.csv", "header");
		for(TableRow tr : t.rows())
		{
			Colour c = new Colour(tr);
			colours.add(c);
		}
	}

	public void printColours()
	{
		for(Colour c : colours)
		{
			println(c);
		}
	}

	public Colour findColour(int value)
	{
		for(Colour c : colours)
		{
			if(value == c.getValue())
			{
				return c;
			}
		}
		return null;
	}
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{			
	}
}

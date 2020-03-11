package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class Resistor
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value)
    {
        this.hundreds = (value / 100);
        this.tens = (value - (this.hundreds * 100)) / 10;
        this.ones = value - ((this.hundreds * 100)  + (this.tens * 10));
        System.out.println(hundreds + ",");
        System.out.println(tens + ",");
        System.out.println(ones);
    }
}
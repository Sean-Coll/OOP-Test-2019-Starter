package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    private int redVal;
    private int greenVal;
    private int blueVal;
    private int value;
    

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getRedVal()
    {
        return this.redVal;
    }

    public void setRedVal(int redVal)
    {
        this.redVal = redVal;
    }

    public int getGreenVal() {
        return greenVal;
    }

    public void setGreenVal(int greenVal) {
        this.greenVal = greenVal;
    }

    public int getBlueVal() {
        return blueVal;
    }

    public void setBlueVal(int blueVal) {
        this.blueVal = blueVal;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Colour(String colour, int redVal, int greenVal, int blueVal, int value)
    {
        this.colour = colour;
        this.redVal = redVal;
        this.greenVal = greenVal;
        this.blueVal = blueVal;
        this.value = value;
    }

    public Colour(TableRow tr)
    {
        this(
        tr.getString("colour"),
        tr.getInt("r"),
        tr.getInt("g"),
        tr.getInt("b"),
        tr.getInt("value")
        );

    }

    public Colour()
    {
        this("",0,0,0,0);
    }

    public String toString()
    {
        return colour + "\t" + redVal + "\t" + greenVal + "\t" + blueVal;
    }
} 
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
        this.value = value;
        this.hundreds = (value / 100);
        this.tens = (value - (this.hundreds * 100)) / 10;
        this.ones = value - ((this.hundreds * 100)  + (this.tens * 10));
        System.out.println(hundreds + ",");
        System.out.println(tens + ",");
        System.out.println(ones);
    }

    public void render(PApplet pa)
    {
        pa.background(125);
        pa.stroke(0);
        pa.noFill();
        int cx = pa.width / 2;
        int cy = pa.height /2;
        int resistorX = cx - 250;
        int resistorY = cy - 250;
        int colourGap = 30;
        int resistorWidth = 100;
        int lineLength = 150;
        int resistorGap = 150;
        int lineX = resistorX - lineLength;
        int lineY = cy + 50;
        int textX = 400;
        int textY = resistorY;

        pa.text(this.value, textX, textY);
        switch(value)
        {
            case 618:
            {
                pa.rect(resistorX, resistorY, resistorWidth, resistorWidth);
                pa.line(lineX, lineY, resistorX, lineY);
                pa.line(lineX + resistorGap, lineY, resistorX + resistorGap + lineLength, lineY);
                pa.text(this.value, textX, textY);
                break;
            }

            case 27:
            {
                break;
            }

            case 195:
            {
                break;
            }

            case 93:
            {
                break;
            }
        }
    }
}
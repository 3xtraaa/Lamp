// This program is copyright VUW.
// You are granted permission to use it to construct your answer
// to a Wellington Girls' College 13DTC assignment.
// You may not distribute it in any other way without permission.

/* Exercise for WGC 13DT
 * Name: Esha Anwar
 * Email: anwares@wgc.school.nz
 * Date: 31/03/2025
 */

import ecs100.*;
import java.awt.Color;

/** A Lamp object is a simple object that stores information about a graphical representation of a table lamp. 
 * It has methods to draw the lamp, to report whether a mouse position (x, y) is on the bulb of the lamp or 
 * on the stem of the lamp, and methods that change the state of the lamp (turn it off, and turn it on/change its colour).
 * 
 * declare fields to hold the position (x, y) of the lamp, its current Colour, and whether it is on or off.
    define a constructor that copies its parameters (the position of the lamp) into the fields.

    define methods:

        draw(), draw the lamp: a filled circle (the bulb) on a dark grey stem.

            If the light is off, the bulb should be black;

            If the light is on, the bulb should be the current colour of the lamp.

        onBulb(x,y), return true if the point (x, y) is on the bulb of the lamp.

        onStem(x,y), return true if the point (x, y) is on the stem of the lamp (the off switch).

        turnOff(), turn the light off

        changeColor(), if the lamp is off, turn the light on; if the light is on, change its colour to a random bright colour.
 
 * A lamp consists of a colored bulb and a stem.
 *   It remembers its current position, its color and whether it is on or off.
 *   Its initial position and its color are set when it is constructed.
 *   The diameter of a bulb should be 80.
 *   The height of the stem should be 80.
 *   The width of the stem should be 20.
 *   It has three methods:
 *     draw(),        which draws the lamp at its current position.
 *     onBulb(x,y),   which reports whether the point(x,y) is on the bulb.
 *     onStem(x,y),   which reports whether the point(x,y) is on the stem.
 *     turnOff(),     which turns the light off.
 *     changeColor(), which turns the light on if it is off; changes its color 
 *     to a random bright colour if it is already on. 
 *     
 *     Note: Color.getHSBColor((float)(Math.random()), 1.0f, 1.0f) will return a random bright Colour.
 */

public class Lamp{

    public static final double LAMP_SIZE = 80;  // diameter of the bulb
    public static final double STEM_WIDTH = LAMP_SIZE/4; // width of the stem is LAMP_SIZE/4 (20)
    public static final double LAMP_HEIGHT = 80; // height of the stem
    
    //fields
    private double lampX; // lamp's x pos
    private double lampY; // lamp's y pos
    
    private Color color; // current colour of lamp (will be seen when on)
    
    private boolean lampOn = false; // Sets lamp as 'off' using boolean
    
//    private double left;
//    private double top;
//    private double bottom;

    /** Constructor: passed the initial position.
     * Initialises the fields/instance variables
     */
    public Lamp(double x, double y, Color col)
    {
        this.lampX = x;
        this.lampY = y;
        this.color = col;     
    }

    /**
     * draws the lamp at its current position:
     * - the bulb of the right colour.
     * - the stem darkGray
     * The height of the stem is the same as the diameter of the bulb
     * The width of the stem is a quarter of its height
     */
    public void draw()
    {
        /*# YOUR CODE HERE */
        // draw the stem (darkGrey rectangle)
        double stemX = lampX - STEM_WIDTH / 2; // X position for the stem to center it
        double stemY = lampY; // Y posiiton of stem
        
        // set colour of stem to dark grey, draw stem
        UI.setColor(Color.darkGray);
        UI.fillRect(stemX, stemY, STEM_WIDTH, LAMP_HEIGHT);
        
        // draw the bulb of the lamp
        double bulbX = lampX - LAMP_SIZE / 2; // X pos of bulb
        double bulbY = lampY - LAMP_HEIGHT; // Y pos of bulb
        
        // checks boolean to set colour
         if (lampOn) {
            UI.setColor(color);
        } else {
            UI.setColor(Color.BLACK);
        }
    
        // draw the bulb
        UI.fillOval(bulbX, bulbY, LAMP_SIZE, LAMP_SIZE); // last two are width and height of circle
    }   

    /** 
     * Reports whether the point (x,y) is on the bulb.
     * (x and y represent the position where the mouse was released):
     */
    public boolean onBulb(double x, double y)
    {
        // an easy approximation is to pretend it is the enclosing rectangle.
        // It is nicer to do a little bit of geometry and get it right
        /*# YOUR CODE HERE */
        
        
    }   

    /**
     * Reports whether the point (x,y) is on the stem.
     * (x and y represent the position where the mouse was released):
     */
    public boolean onStem(double x, double y){
        /*# YOUR CODE HERE */
 
    }   

    /**
     * Turns the light off.
     * Does not redraw
     */
    public void turnOff(){
        /*# YOUR CODE HERE */

    }   

    /** changeColor method (no parameters):
     * Turns the light on (if it is off)
     * Changes its color to a random bright colour (if it is already on).
     * Does not redraw
     */
    public void changeColor(){
        /*# YOUR CODE HERE */

    }   
}
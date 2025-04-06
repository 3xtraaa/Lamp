import ecs100.*;
import java.awt.Color;
/**
 * Creates a Lamp and handles user input (mouse clicks)
 *
 * @author Esha Anwar
 * @version 06/04/25
 */
public class LampController
{
    // instance variables
    private Lamp lamp;

    /**
     * Constructor for objects of class LampController
     */
    public LampController()
    {
        // initialise instance variables
        UI.initialise();
        UI.addButton("Quit", UI::quit);
        
        Color randomCol = Color.getHSBColor((float)(Math.random()), 1.0f, 1.0f);
        lamp = new Lamp(300, 250, randomCol);
        
        lamp.draw();
        
        // set up mouse listener
        UI.setMouseListener(this::doMouse);
    }
    
    private void doMouse(String action, double x, double y)
    {
        if (action.equals("clicked"))
        {
            if (lamp.onBulb(x, y))
            {
                lamp.changeColor();
            }
            else if (lamp.onStem(x, y))
            {
                lamp.turnOff();
            }
            lamp.draw();
        }
    }  
}

package studio5;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import studio5.debug.DrawBullsEyes;
import support.cse131.DialogBoxes;
import support.cse131.DrawCase;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class DrawBullsEyesDebugApp {
	public static void main(String[] args) {
		StdDraw.clear();
		Methods.drawBullsEye(.5,.5, .4);
	}
}

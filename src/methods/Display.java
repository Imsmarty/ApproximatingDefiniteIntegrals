package methods;

import javax.swing.*;

 /*
 * Created by marta on 9/20/16.
 */
public class Display extends JFrame{

    private static JFrame myFrame;
    private static JPanel myPanel;

    private static void createAndShowGUI()
    {
        myFrame = new JFrame("Approximating Definite Integrals");
        myFrame.setLocationRelativeTo(null);
        myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        myPanel = new JPanel();
        JLabel x2 = new JLabel("x^2");
        JLabel steps5X2 = new JLabel("5 Steps:");
        myPanel.add(x2);
        myPanel.add(steps5X2);
        myFrame.add(myPanel);
        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        createAndShowGUI();
    }




}

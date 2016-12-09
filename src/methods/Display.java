package methods;

import com.sun.corba.se.spi.orbutil.fsm.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

 /*
 * Created by marta on 9/20/16.
 */
public class Display{

     private static double a, b;
     private static JList step, midpoint, simpsons, trapezoidal;
     private static DefaultListModel stepModel, midpointModel, simpsonsModel, trapezoidalModel;
     private static Function myFunction;
     private static JButton calculate;
     private static JFrame myFrame;
     private static JPanel myPanel;
     private static JTextField inputA, inputB;
     private static JLabel aName, bName;
     private static int numSteps;
     private static JComboBox<String> functionNameList;
     private static String[] functionNames = {"x", "x^2", "x^3", "sin(x)", "cos(x)", "tan(x)", "ln(x)", "1/x", "x^(1/2)", "e^x"};

     private static void createAndShowGUI()
     {
         stepModel = new DefaultListModel();
         stepModel.addElement("Steps");
         midpointModel = new DefaultListModel();
         midpointModel.addElement("Midpoint");
         simpsonsModel = new DefaultListModel();
         simpsonsModel.addElement("Simpson's");
         trapezoidalModel = new DefaultListModel();
         trapezoidalModel.addElement("Trapezoidal");
         myFrame = new JFrame("Approximating Definite Integrals");
         myFrame.setLocationRelativeTo(null);
         //myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
         myFrame.setSize(900,800);
         myPanel = new JPanel();
         calculate = new JButton("Calculate!");
         calculate.addActionListener(new CalculationListener());
         aName = new JLabel("A: ");
         bName = new JLabel("B: ");
         inputA = new JTextField(5);
         inputB = new JTextField(5);
         functionNameList = new JComboBox(functionNames);
         functionNameList.setSelectedIndex(0);
         step = new JList(stepModel);
         midpoint = new JList(midpointModel);
         simpsons = new JList(simpsonsModel);
         trapezoidal = new JList(trapezoidalModel);
         myPanel.add(functionNameList);
         myPanel.add(aName);
         myPanel.add(inputA);
         myPanel.add(bName);
         myPanel.add(inputB);
         myPanel.add(calculate);

         myPanel.add(step);
         myPanel.add(midpoint);
         myPanel.add(simpsons);
         myPanel.add(trapezoidal);

         myFrame.add(myPanel);
         myFrame.setVisible(true);
         myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public static void main(String[] args)
    {
        createAndShowGUI();
    }

     private static class CalculationListener implements ActionListener {
         public void actionPerformed(ActionEvent event) {
             String name = (String) functionNameList.getSelectedItem();
             switch (name) {
                 case "x":
                     myFunction = new X();
                     break;
                 case "x^2":
                     myFunction = new X2();
                     break;
                 case "x^3":
                     myFunction = new X3();
                     break;
                 case "sin(x)":
                     myFunction = new SinX();
                     break;
                 case "cos(x)":
                     myFunction = new CosX();
                     break;
                 case "tan(x)":
                     myFunction = new TanX();
                     break;
                 case "ln(x)":
                     myFunction = new LnX();
                     break;
                 case "1/x":
                     myFunction = new OneOverX();
                     break;
                 case "x^(1/2)":
                     myFunction = new SqrtX();
                     break;
                 case "e^x":
                     myFunction = new EToTheX();
                     break;
             }
             stepModel.clear();
             midpointModel.clear();
             trapezoidalModel.clear();
             simpsonsModel.clear();
             stepModel.addElement("Steps");
             midpointModel.addElement("Midpoint");
             simpsonsModel.addElement("Simpson's");
             trapezoidalModel.addElement("Trapezoidal");
             a = Double.parseDouble(inputA.getText());
             //System.out.println(a);
             b = Double.parseDouble(inputB.getText());
             //System.out.println(b);
             for (int i = 1; i <= 20; i++) {
                 stepModel.addElement("n = " + i);
                 double val = Methods.getMidpoint(a, b, i, myFunction);
                 midpointModel.addElement(String.format("%.6f", val));
                 val = Methods.getTrapezoidal(a, b, i, myFunction);
                 trapezoidalModel.addElement(String.format("%.6f", val));
                 val = Methods.getSimpsons(a, b, i, myFunction);
                 simpsonsModel.addElement(String.format("%.6f", val));
             }


         }
     }




}

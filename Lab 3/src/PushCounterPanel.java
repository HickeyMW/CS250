//********************************************************************
//  PushCounterPanel.java       Authors: Lewis/Loftus
//
//  Demonstrates a graphical user interface and an event listener.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel
{
   private int count;
   private JButton push, pull;
   private JLabel label;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the GUI.
   //-----------------------------------------------------------------
   public PushCounterPanel()
   {
      count = 0;

      push = new JButton("Push Me!");
      pull = new JButton("Pull Me!");
      push.addActionListener(new ButtonListener());
      pull.addActionListener(new ButtonListener());

      label = new JLabel("Count: " + count);

      add(push);
      add(pull);
      add(label);

      setPreferredSize(new Dimension(300, 40));
      setBackground(Color.cyan);
   }

   //*****************************************************************
   //  Represents a listener for button push (action) events.
   //*****************************************************************
   private class ButtonListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the counter and label when the button is pushed.
      //--------------------------------------------------------------
      public void actionPerformed(ActionEvent event)
      {
    	  JButton clicked = (JButton) event.getSource();
          System.out.println(clicked.getText());
          
          if (clicked.getText().equals("Push Me!")) {
        	  count++;
		} else {
			count--;
		}
         
         label.setText("Count: " + count);
      }
   }
}

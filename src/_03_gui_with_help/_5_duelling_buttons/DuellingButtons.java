package _03_gui_with_help._5_duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void run() {

		// 1. Add the panel to the frame

		// 2. Make the frame visible

		// 3. Set the text of the leftButton to "Click me!"

		// 4. Set the text of the rightButton to "Click me!"

		// 5. Add an action listener to the leftButtonfdsfsfds

		// 6. Add an action listener to the rightButton

		// 7. Add the leftButton to the panel

		// 8. Add the rightButton to the panel

		// 9. Pack the frame

		// 10. Set the title of the frame to "Demanding Buttons"
		frame.add(panel);
		frame.setVisible(true);
		leftButton.setText("Click meee!");
		rightButton.setText("Click meee");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL
		if(buttonPressed.equals(leftButton))
		{
			rightButton.setText("No, click meee!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click meee!");
			leftButton.setPreferredSize(SMALL);
		}
		else if (buttonPressed.equals(rightButton))
		{
			leftButton.setText("Hey pick mee instead!!!");
			leftButton.setPreferredSize(BIG);
			rightButton.setPreferredSize(SMALL);
			rightButton.setText("Hey! Why did you make me smaller?");
		}

		
		
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}

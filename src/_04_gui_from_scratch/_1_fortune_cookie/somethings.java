package _04_gui_from_scratch._1_fortune_cookie;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;

public class somethings implements ActionListener{
	JButton button = new JButton("I am a button");
	JFrame frame = new JFrame("I am a frame");
	JPanel panel = new JPanel();

	public void showButton() {
	System.out.println("Button clicked");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.setVisible(true);
		button.addActionListener(this);
		frame.pack();
		int rand = new Random().nextInt(5);
		if(rand == 0)
		{
			JOptionPane.showMessageDialog(panel, "You will step on dog poop");
		}
		else if (rand == 1)
		{
			JOptionPane.showMessageDialog(panel, "A bird will poop on you");
		}
		else if (rand == 2)
		{
			JOptionPane.showMessageDialog(panel, "You will die soon");
		}
		else if (rand == 3)
		{
			JOptionPane.showMessageDialog(panel, "You will have a test today");
		}
		else if (rand == 4)
		{
			JOptionPane.showMessageDialog(panel, "You will fail a test today");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button))
		{
			JOptionPane.showMessageDialog(panel, "Woohoo!");
		}
	}
}

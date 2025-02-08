package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class SoundEffectsMachine implements ActionListener {
	JButton button1 = new JButton("");
	JButton button2 = new JButton("");
	JButton button3 = new JButton("");
	JFrame frame = new JFrame("");
	JPanel panel = new JPanel();
	public void running() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}


public void actionPerformed(ActionEvent arg0)
{
	JButton buttonPressed = (JButton) arg0.getSource();

}
}
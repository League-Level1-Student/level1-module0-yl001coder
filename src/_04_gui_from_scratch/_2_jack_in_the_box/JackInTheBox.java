package _04_gui_from_scratch._2_jack_in_the_box;

import java.util.*;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class JackInTheBox implements ActionListener{
	JButton button = new JButton();
	JFrame frame = new JFrame();
	Random rand = new Random();
	JPanel panel = new JPanel();;
	int random = rand.nextInt(4);

	public void running() {
		button.setText("click meh");
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(800,600);
		button.addActionListener(this);
		if (random == 4) {

		} else {
		}
	}

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = new JLabel();
			imageLabel = createLabelImage(fileName);

			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon();
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
	}

	private void playSound(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton ButtonPressed = (JButton) arg0.getSource();
		if (ButtonPressed.equals(button)) {
			random = rand.nextInt(4);
			if (random == 4) {
				JOptionPane.showMessageDialog(panel, "...");
				createLabelImage("jackInTheBox.png");
				showPicture("jackInTheBox.png");
				JOptionPane.showMessageDialog(panel, "BOOOOO!");
				playSound("homer-woohoo.wav");
			} else {
				JOptionPane.showMessageDialog(panel, "don't worry, you're safe, for now...");
			}
		}
	}

}

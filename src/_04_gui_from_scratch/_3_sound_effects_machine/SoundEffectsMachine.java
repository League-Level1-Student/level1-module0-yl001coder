package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.applet.AudioClip;

import java.util.Random;

import javax.swing.JFrame;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
		frame.setSize(800,500);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.setText("sound");
		button2.setText("sound");
		button3.setText("sound");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

public void actionPerformed(ActionEvent arg0)
{
	JButton buttonPressed = (JButton) arg0.getSource();
	if(buttonPressed.equals(button1))
	{
		playSound("sawing-wood-daniel_simon.wav");
	}
	if(buttonPressed.equals(button2))
	{
		playSound("meow.wav");
	}
	if(buttonPressed.equals(button3))
	{
		playSound("drum.wav");
	}
}
private void playSound(String soundFile) {
	String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}


}
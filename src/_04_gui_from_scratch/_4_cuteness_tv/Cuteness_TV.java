package _04_gui_from_scratch._4_cuteness_tv;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.net.URI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cuteness_TV implements ActionListener{
	JButton button1 = new JButton("");
	JButton button2 = new JButton("");
	JButton button3 = new JButton("");
	JFrame frame = new JFrame("I am a frame");
	JPanel panel = new JPanel();
	JLabel label = new JLabel("I am a label");
	public void run()
	{
		button1.setText("meeep i am a button");
		button2.setText("meeeep i am a button");
		button3.setText("meeeeep i am a button");
		button1.setSize(667,334);
		button2.setSize(667,334);
		button3.setSize(667,334);
		
		frame.setSize(2001,1002);
		frame.setVisible(true);
		button1.setVisible(true);
		button2.setVisible(true);
		button3.setVisible(true);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
	}
	
	void showDucks() {
	     playVideo("https://youtu.be/n2JwA4Ngbf4?si=3vtP4Y-mlhtADoni");
	}

	void showFrog() {
	     playVideo("https://youtu.be/8lhEd25F1aQ?si=uul9_hSfJUg_peuN");
	}

	void showFelt() {
	     playVideo("https://youtu.be/EbSqjO-_nXs?si=6j65OZYZtwRXc4Qg");
	}
	
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	public void actionPerformed(ActionEvent arg0)
	{
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button1))
		{
			showDucks();
		}
		if(buttonPressed.equals(button2))
		{
			showFrog();
		}
		if(buttonPressed.equals(button3))
		{
			showFelt();
		}
	}
}

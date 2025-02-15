package _04_gui_from_scratch._4_cuteness_tv;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Cuteness_TV implements ActionListener{
	JButton button1 = new JButton("");
	JButton button2 = new JButton("");
	JButton button3 = new JButton("");
	JFrame frame = new JFrame("I am a frame");
	JPanel panel = new JPanel();
	public void run()
	{
		button1.setText("random vid");
		button2.setText("another random vid");
		button3.setText("yet ANOTHER random video");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
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
			showFluffyUnicorns();
		}
	}
}

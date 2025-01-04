package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		JFrame quizImage = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )

		// 2. create a variable of type "Component" that will hold your image

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window

		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)

		// 10. find another image and create it (might take more than one line
		// of code)

		// 11. add the second image to the quiz window

		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.
		JFrame frame = new JFrame();
		String image = "https://i.guim.co.uk/img/media/f7147d82d84a63ac0789e5f9a2b1ccfde8297bb0/586_631_2661_1597/master/2661.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=1cea14681e667a4555eea7d8249e28d3";
		Component component = createImage("https://i.guim.co.uk/img/media/f7147d82d84a63ac0789e5f9a2b1ccfde8297bb0/586_631_2661_1597/master/2661.jpg?width=1200&height=1200&quality=85&auto=format&fit=crop&s=1cea14681e667a4555eea7d8249e28d3");
		quizWindow.add(component);
		quizWindow.pack();
		String ask = "";
		ask = JOptionPane.showInputDialog("What is that picture?");
		if(ask.equalsIgnoreCase("a banana")||(ask.equalsIgnoreCase("banana"))||(ask.equalsIgnoreCase("banana ductaped to a wall"))||(ask.equalsIgnoreCASE))
		{
			JOptionPane.showMessageDialog(frame,"CORRECT! You may proceed");
			quizWindow.setVisible(false);
			Component component2 = createImage("https://kens-nursery.com/wp-content/uploads/2019/02/HYL-POU-600x800.jpg");
			quizImage.setVisible(true);
			quizImage.add(component2);
			quizImage.pack();
			String askagain = "";
			askagain = JOptionPane.showInputDialog("What is that fruit?");
			if(askagain.equalsIgnoreCase("dragonfruit")||(askagain.equalsIgnoreCase("pink dragonfruit"))||(askagain.equalsIgnoreCase("dragon fruit"))||(askagain.equalsIgnoreCase("a pink dragon fruit"))||(askagain.equalsIgnoreCase("a pink dragonfruit"))||(askagain.equalsIgnoreCase("pink dragon fruit"))||(askagain.equalsIgnoreCase("dragon fruit"))||(askagain.equalsIgnoreCase("a dragon fruit")))
			{
				JOptionPane.showMessageDialog(frame, "Congratulations! You finished!!");
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "you lost. AND ON THE LAST QUEStion");
			}
		}
		else
		{
			JOptionPane.showMessageDialog(frame, "INCORRECT :( sorry you cannot continue.");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}

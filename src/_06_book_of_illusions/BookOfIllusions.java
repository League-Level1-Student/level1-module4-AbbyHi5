package book_of_illusion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Book_of_illusion extends MouseAdapter {
	// 1. Make a JFrame variable and initialize it using "new JFrame()"
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	public void run() {
		// 2. make the frame visible
		frame.setVisible(true);
		// 3. set the size of the frame
		frame.setSize(500, 500);
		// 4. find 2 images and save them to your project’s default package!
		// 5. make a variable to hold the location of your image. e.g. "illusion.jpg"
		String fire = "fire.jpg";
		// 6. create a variable of type "JLabel" but don’t initialize it yet
		JLabel label;
		// 7. use the "loadImage..." methods below to initialize your JLabel
		label = loadImageFromComputer(fire);
		// 8. add your JLabel to the frame
		frame.add(label);
		// 9. call the pack() method on the frame
		frame.pack();
		// 10. add a mouse listener to your frame (hint: use *this*)
		frame.addMouseListener(this);
	}
	public void mousePressed(MouseEvent e) {
		// 11. Print "clicked!" to the console when the mouse is pressed
		System.out.println("clicked!");
		// 12. remove everything from the frame that was added earlier
		frame.removeAll();
		// 13. load a new image like before (this is more than one line of code)
		String ice = "ice.png";
		JLabel label2;
		label2 = loadImageFromComputer(ice);
		panel.add(label2);
		frame.add(panel);
		// 14. pack the frame
		frame.pack();
	}
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}

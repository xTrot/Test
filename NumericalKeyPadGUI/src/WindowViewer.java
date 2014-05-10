import javax.swing.JFrame;


public class WindowViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame(); 
		frame.setSize(200,225); 
		frame.setTitle("Numerical Keypad");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		frame.add(new WindowMainPanel());
		frame.setVisible(true); 

	}

}

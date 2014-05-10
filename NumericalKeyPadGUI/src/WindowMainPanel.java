import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class WindowMainPanel extends JPanel { 
 
	public WindowMainPanel() { 
 
		display = new JTextField(""); 
		for(int i=0; i<KEYPAD_CAPTION.length;i++){
			button[i] = new JButton(KEYPAD_CAPTION[i]);
			button[i].addMouseListener(mListener);
			button[i].addKeyListener(kListener);
		}
		statusBar = new JLabel("Ready");
		display.addKeyListener(kListener);
		
		this.drawGUI();

	} 
	
	public static String getDisplayText() { 
		 return display.getText(); 
		 } 
		 
		 public static void setDisplayText(String s) { 
		 display.setText(s); 
		 } 
		 
		 public static String getStatusBarText() { 
		 return statusBar.getText(); 
		 } 
		 
		 public static void setStatusBarText(String s) { 
		 statusBar.setText(s); 
		 } 

	private void drawGUI() { 
		// WindowMainPanel is a panel as it extends JPanel 
		// set its layout here. 
		
		this.setLayout(new BorderLayout());
		
		// As Figure 2 shows, the second layer of the panels 
		// has a CentralPanel 
		// Create central panel here and set its layout. 
		
		JPanel central = new JPanel();
		central.setLayout(new BoxLayout(central,BoxLayout.Y_AXIS));
		
		// As Figure 2 shows, the third layer of the panels include a 
		// diplay panel and a grid panel 
		// define the display panel here, set its layout, 
		// and add component display (that is a textbox) to it. 
		
		JPanel displayPanel = new JPanel();
		displayPanel.setLayout(new BoxLayout(displayPanel,BoxLayout.PAGE_AXIS));
		displayPanel.add(display);
		
		
 		// define the keypad panel here, set its layout; note that 
 		// the GridLayout must have 4 rows and 4 columns 
 		// and add component buttons (which is an array of buttons) to it 
 		// so far, you have 4 panels. BUT, the real hierarchy between 
		
		JPanel kb = new JPanel(new GridLayout(4,4,5,5));
		for(int i = 0;i<KEYPAD_CAPTION.length;i++) kb.add(button[i]);
		
		// them has not defined yet.
		// to define the hierarchy according to Figure 2, add the central 
		// panel to your main window panel 
		// and add the display panel as well as the keypad panel to 
		// your central panel 
		
		this.add(central);
		central.add(displayPanel);
		central.add(Box.createVerticalStrut(10));
		central.add(kb);
		
		// add the component status bar to the south of your main 
		// window panel 
		this.add(statusBar, BorderLayout.SOUTH); 
 
		//polishing the GUI a little bit 
		display.setFont(new Font(display.getFont().getFontName(), Font.PLAIN, 20));
		display.setPreferredSize(new Dimension(180, 40));
		display.setHorizontalAlignment(JTextField.RIGHT);
		display.setEditable(false);
		
		statusBar.setPreferredSize(new Dimension(180,20));
 
		} 
	
	// define instance and static variables here 
	private static JTextField display; 
	private static JLabel statusBar; 
	public static final String[] KEYPAD_CAPTION = {	"7", "8", "9", "C", 
													"6", "5", "4", "<", 
													"1", "2", "3", "-", 
													".", "0", ",", "#"};
	private JButton[] button = new JButton[KEYPAD_CAPTION.length];
	
	// When you are in Part B of the Lab, add two listener variables here: 
	// one from PanelMouseListener type 
	// the other from PanelKeyListener type 
	private static PanelMouseListener mListener = new PanelMouseListener(); 
	private static PanelKeyListener kListener = new PanelKeyListener();
	// then go to WindowMainPanel constructor and add 
	// these two listener variables to the buttons. 
} 

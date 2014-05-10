import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;


public class PanelMouseListener implements MouseListener {

	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton temp = (JButton) arg0.getSource();
		if (temp.getText().equals("C")) { 
			 // Your code here 
			WindowMainPanel.setDisplayText("");
			}
			else if (temp.getText().equals("<")) { 
			// Your code here 
				if (WindowMainPanel.getDisplayText().length()>0){
					WindowMainPanel.setDisplayText(WindowMainPanel.getDisplayText().substring(0,WindowMainPanel.getDisplayText().length()-1));
				} 
			}
			else {
				WindowMainPanel.setDisplayText(WindowMainPanel.getDisplayText()+ temp.getText());
			} 
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		JButton temp = (JButton) arg0.getSource();
		if (temp.getText().equals("C")) { 
			// Your code here 
			WindowMainPanel.setStatusBarText("Clear.");
			}
			else if (temp.getText().equals("<")) { 
			// Your code here 
			WindowMainPanel.setStatusBarText("Backspace.");
			} 
			else {
				WindowMainPanel.setStatusBarText(temp.getText());
			} 
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

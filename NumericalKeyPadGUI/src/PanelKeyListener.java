import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class PanelKeyListener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_DELETE) {
			WindowMainPanel.setDisplayText("");
		}
		else if (arg0.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			   if (WindowMainPanel.getDisplayText().length()>0){
				WindowMainPanel.setDisplayText(WindowMainPanel.getDisplayText().substring(0,WindowMainPanel.getDisplayText().length()-1));
			}
		}

		}

		@Override
		public void keyReleased(KeyEvent arg0) {

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			for (int i = 0; i < 16; i++) {
				if (arg0.getKeyChar() == WindowMainPanel.KEYPAD_CAPTION[i].charAt(0)) {
					WindowMainPanel.setDisplayText(WindowMainPanel.getDisplayText() + WindowMainPanel.KEYPAD_CAPTION[i]);
				}
			}


		}

	}

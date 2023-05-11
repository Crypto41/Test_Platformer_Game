package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener{
	
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
		
	}

	
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_COMMA:
			gamePanel.changeYDelta(-10);
			break;
		case KeyEvent.VK_A:
			gamePanel.changeXDelta(-10);
			break;
		case KeyEvent.VK_E:
			gamePanel.changeXDelta(10);
			break;
		case KeyEvent.VK_O:
			gamePanel.changeYDelta(10);
			break;
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
	
		
	}

}

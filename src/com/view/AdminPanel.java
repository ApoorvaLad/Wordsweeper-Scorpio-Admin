package com.view;


import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.BorderFactory;
import javax.swing.JPanel;


public class AdminPanel extends JPanel{
	
	//GUI widgets for displaying the information.
	GamePanel gamePanel = null;
	GameListPanel gameListPanel = null;
	
	public AdminPanel() {
		initialise();
	}

	
	void initialise() {
		/*Label headerLabel = new Label();
		headerLabel.setBounds(new Rectangle(388, 260, 102, 23));
		headerLabel.setText("Game Manager");*/
		setLayout(null);
		setSize(633, 490);
		
		//add(getGamePanel());
		add(getGameListPanel());
		//add(headerLabel);
	}
	
	public GamePanel getGamePanel() {
		if(gamePanel == null) {
			gamePanel  = new GamePanel();
			gamePanel.setBounds(new Rectangle(15, 290, 256, 490));
		}
		return gamePanel;
	}
	
	public GameListPanel getGameListPanel() {
		if(gameListPanel == null) {
			gameListPanel = new GameListPanel();
			gameListPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			gameListPanel.setBounds(new Rectangle(0, 0, 150, 450));
		}
		return gameListPanel;
	}
	
	
	
	
}

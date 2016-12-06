package com.view;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import com.admin.controller.GameListController;

/**
 * The Outer panel
 * 
 * @author Apoorva
 *
 */
public class AdminPanel extends JPanel {

	// GUI widgets for displaying the information.
	GamePanel gamePanel = null;
	GameListPanel gameListPanel = null;
	JButton getGames;

	public AdminPanel() {
		initialise();
	}

	void initialise() {
		/*
		 * Label headerLabel = new Label(); headerLabel.setBounds(new
		 * Rectangle(388, 260, 102, 23)); headerLabel.setText("Game Manager");
		 */
		setLayout(null);
		setSize(633, 510);
		getGames = new JButton("Get Games");
		getGames.setBounds(new Rectangle(0, 0, 150, 30));
		getGames.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GameListController(Application.instance).process();

			}
		});
		add(getGames);
		add(getGameListPanel());
//<<<<<<< HEAD
//		
//		 add(getGamePanel());
//		
//		// add(headerLabel);
//	}
//
//	
//	  public GamePanel getGamePanel() { 
//		  if(gamePanel == null) {
//			  gamePanel = new GamePanel(); 
//			  gameListPanel.setBorder(BorderFactory.createLineBorder(Color.black));
//			  gamePanel.setBounds(new Rectangle(15, 290, 256, 600));
//			  }
//		  	return gamePanel; 
//		  	}
//	 
//=======
		add(getGamePanel());

		// add(getGamePanel());

		// add(headerLabel);
	}

	public GamePanel getGamePanel() {
		if (gamePanel == null) {
			gamePanel = new GamePanel();
			gamePanel.setVisible(false);
			gamePanel.setBounds(new Rectangle(50, 50, 650, 700));
			//gamePanel.setBounds(new Rectangle(200, 70, 256, 400));
		}
		return gamePanel;
	}

	public GameListPanel getGameListPanel() {
		if (gameListPanel == null) {
			gameListPanel = new GameListPanel();
			gameListPanel.setBorder(BorderFactory.createLineBorder(Color.black));
			gameListPanel.setBounds(new Rectangle(0, 30, 150, 480));
		}
		return gameListPanel;
	}

}

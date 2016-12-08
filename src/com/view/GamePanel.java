package com.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.admin.controller.GameController;
import com.model.Game;

/**
 * 
 * 
 * @author Apoorva
 *
 */
public class GamePanel extends JPanel {

	JScrollPane gamesListPanel = null;
	JLabel gameDetails;
	JLabel playerName;
	JScrollPane gameInfo;
	int rows;
	int columns;
	BoardPanel boardPanel;
	JPanel detailsPanel;
	JList jList;
	DefaultListModel model;
	JList list;


	public GamePanel(JList list) {
		this.list = list;
		initialize();
	}

	void initialize() {
		//setLayout(new GridLayout(0, 1));
		JButton updateButton = new JButton("Update Game");
		add(updateButton);
		updateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list.getSelectedValue();
				
				Game game = new Game(); 
				new GameController(Application.instance)
						.process(game.getGameDetails().get(list.getSelectedValue().toString()));

			}
		});
		boardPanel = new BoardPanel();
		add(boardPanel);
	
	}

	public BoardPanel getBoardPanel() {
		return boardPanel;
	}
}

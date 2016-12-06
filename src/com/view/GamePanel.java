package com.view;

import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 
 * 
 * @author Apoorva
 *
 */
public class GamePanel extends JPanel {

	JScrollPane gamesListPanel = null;
/*<<<<<<< HEAD
	JList list;
	DefaultListModel model;
	
	private void initialise() {
		setLayout(new BorderLayout());	
		JLabel label1;
		label1=new JLabel("GAME BOARD");
		
		JLabel label2;
		label2=new JLabel("SCORE BOARD");
		model = new DefaultListModel();
		list = new JList(model);

		JScrollPane jScrollPane = new JScrollPane(list);
		
		add(label1,BorderLayout.PAGE_START);
		add(new JSeparator(JSeparator.HORIZONTAL));
		add(label2,BorderLayout.SOUTH);
		add(jScrollPane, BorderLayout.SOUTH);
	}
	
	public DefaultListModel getModel() {
		return model;
	} 
=======*/
	int rows;
	int columns;
	BoardPanel boardPanel;
	public GamePanel() {
		 boardPanel = new BoardPanel();
		
		initialize();
	}

	void initialize() {
		Label header = new Label();
		rows = 2;
		columns = 2;
		
		//setBounds(new Rectangle(100, 50, 650, 700));
		add(boardPanel);
		/*
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("3"));
		add(new Button("4"));*/
	}
	public BoardPanel getBoardPanel() {
		return boardPanel;
	}
}

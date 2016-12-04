package com.view;

import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

/**
 * Game State
 * @author Rishitha
 *
 */
public class GamePanel extends JPanel {

	JScrollPane gamesListPanel = null;
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
}

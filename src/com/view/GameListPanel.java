package com.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import sun.text.normalizer.CharTrie.FriendAgent;

public class GameListPanel extends JPanel {

	JList list;
	DefaultListModel model;

	public GameListPanel() {
		initilise();
	}

	private void initilise() {
		setLayout(new BorderLayout());
		model = new DefaultListModel();
		list = new JList(model);

		JScrollPane jScrollPane = new JScrollPane(list);
		//jScrollPane.setBounds(new Rectangle(7, 50, 100, 435));
		JButton showGame = new JButton("Show Game");
		
		

		// showGame.setBounds(new Rectangle(7, 490, 50, 10));
		/*for (int i = 0; i < 150; i++)
			model.addElement("Element " + i);*/

		add(jScrollPane, BorderLayout.CENTER);
		
		add(showGame, BorderLayout.PAGE_END);
		

	}

}

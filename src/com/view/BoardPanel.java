package com.view;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Scrollbar;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Board Panel
 * 
 * @author Apoorva
 *
 */
public class BoardPanel extends JPanel {
	JPanel jPanel;
	Scrollbar scrollbarH = null;
	Scrollbar scrollbarV = null;
	int rowCount = 7;
	int columncount = 7;

	public BoardPanel() {
		initialize(7, 7);

	}

	private void initialize(int row, int col) {

		jPanel = new JPanel();
		// addComponents(row, col);
		/*
		 * int size = rowCount*columncount; GridLayout gridLayout = new
		 * GridLayout(row, col); Dimension dimension = new Dimension(100, 100);
		 * jPanel.setSize(dimension); jPanel.setLayout(gridLayout);
		 */
		/*
		 * for (int i = 0; i < columncount; i++) { for (int j = 0; j < rowCount;
		 * j++) {
		 * 
		 * Button button = new Button(Integer.toString(j)); jPanel.add(button);
		 * }
		 * 
		 * 
		 * }
		 */
		JScrollPane jScrollPane = new JScrollPane(jPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// new JScrollPane(jPanel);
		add(jScrollPane);
		// setVisible(false);
	}

	public void addComponents(int row, int col) {

		int size = rowCount * columncount;
		GridLayout gridLayout = new GridLayout(row, col);
		Dimension dimension = new Dimension(100, 100);
		jPanel.setSize(dimension);
		jPanel.setLayout(gridLayout);
		
	}

	public JPanel getPanel() {
		return jPanel;
	}

}

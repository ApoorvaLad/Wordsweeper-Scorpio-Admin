package com.view;

import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/**
 * Board Panel
 * @author Apoorva
 *
 */
public class BoardPanel extends JPanel{

	Scrollbar scrollbarH = null;
	Scrollbar scrollbarV = null;
	int rowCount = 4;
	int columncount = 5;
	
	List<Rectangle> cells;
	
	public BoardPanel() {
		cells = new ArrayList<>(columncount * rowCount);
		
	}
	 
}

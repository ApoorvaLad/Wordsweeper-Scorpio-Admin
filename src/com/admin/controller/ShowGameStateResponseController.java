package com.admin.controller;

import java.awt.Button;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.admin.xml.Message;
import com.model.Model;
import com.view.Application;

/**

 * 
 * @author Apoorva
 *
 */
public class ShowGameStateResponseController extends ControllerChain {

	Application app;
	Model model;

	public ShowGameStateResponseController(Application app, Model model) {
		this.app = app;
		this.model = model;
	}

	@Override
	public boolean process(Message response) {

		String type = response.contents.getFirstChild().getLocalName();
		if (!type.equals("boardResponse")) {
			return next.process(response);
		}
		/*Node listResponse = response.contents.getFirstChild();
		Game game = new Game();
		ArrayList<Player> players = null;
		NodeList list = listResponse.getChildNodes();
		for (int i = 0; i < list.getLength(); i++) {
			Player player=new Player();
			Node n = list.item(i);
			String name = n.getAttributes().getNamedItem("name").getNodeValue();
			player.setName(name);
			String score = n.getAttributes().getNamedItem("score").getNodeValue();
			player.setScore(score);
			players.add(player);
			game.setPlayer(players);

		app.getAdminPanel().getGamePanel().getModel().addElement("Name: " + player.getname());
		app.getAdminPanel().getGamePanel().getModel().addElement("Score: " + player.getScore());
		}*/
		

		Node listResponse = response.contents.getFirstChild();
		NodeList list = listResponse.getChildNodes();
		int columncount = Integer.parseInt(listResponse.getAttributes().getNamedItem("size").getNodeValue());
		int rowCount = Integer.parseInt(listResponse.getAttributes().getNamedItem("size").getNodeValue());
		listResponse.getNodeValue();

		int listIndex = 0;
		app.getAdminPanel().getGamePanel().getBoardPanel().addComponents(rowCount, columncount);

		JButton[][] buttons = new JButton[rowCount][columncount];
		Button button = new Button("");
		/*
		 * for (int i = 0; i < list.getLength(); i++) { listIndex = 0;
		 */
		for (int row = 0; row < rowCount; row++) {
			for (int col = 0; col < columncount; col++) {
				buttons[row][col] = new JButton("");

				// Button button = new Button(items.get(listIndex++));
				// button = new Button("");

				/*
				 * if ((row < (pos_x + 3)) && (col < (pos_y + 3))) {
				 * button.setLabel("A"); //
				 * button.setLabel(items.get(listIndex++));
				 * 
				 * }
				 */
				// Button button = new Button(Integer.toString(col));
				// boardPanel.add(button);
				app.getAdminPanel().getGamePanel().getBoardPanel().getPanel().add(buttons[row][col]);
			}

		}
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			createPlayerBoard(n, buttons);

		}

		/*
		 * for (int pos_row = pos_y; pos_row < 4; pos_row++) { for (int pos_col
		 * = pos_x; pos_col < 4; pos_col++) {
		 * button.setLabel(items.get(listIndex++)); } }
		 */
		// Button button = new Button(Integer.toString());
		/*
		 * app.getAdminPanel().getGamePanel().getBoardPanel().
		 * getPanel().add(button);
		 * app.getAdminPanel().getGamePanel().setBounds(new Rectangle(100, 50,
		 * 650, 700)); app.getAdminPanel().getGamePanel().setVisible(true);
		 */

		// */
		// String gameID =
		// n.getAttributes().getNamedItem("gameId").getNodeValue();

		// }
		// boardPanel.setBounds(new Rectangle(100, 50, 650, 700));
		//app.getAdminPanel().getGamePanel().setBounds(new Rectangle(70, 50, 650, 700));
		app.getAdminPanel().getGamePanel().setVisible(true);

		return true;
	}

	private void createPlayerBoard(Node n, JButton[][] buttons) {
		// Node n = list.item(0);
		int listCounter = 0;
		String position = n.getAttributes().getNamedItem("position").getNodeValue();
		List<String> positions = Arrays.asList(position.split("\\s*,\\s*"));
		String content = n.getAttributes().getNamedItem("board").getNodeValue();
		int pos_x = Integer.parseInt(positions.get(0));
		int pos_y = Integer.parseInt(positions.get(1));
		List<String> items = Arrays.asList(content.split("\\s*,\\s*"));
		for (int row = pos_x; row <= (pos_x + 3); row++) {
			for (int col = pos_y; col <= (pos_y + 3); col++) {
				buttons[row][col].setText(items.get(listCounter++));
			}
		}

		// TODO Auto-generated method stub

	}

}

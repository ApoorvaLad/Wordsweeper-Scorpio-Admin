package com.admin.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.admin.xml.Message;
import com.model.Game;
import com.model.Model;
import com.model.Player;
import com.view.Application;

/**
 * Controller to display the current state of the game
 * @author Rishitha
 *
 */
public class ShowGameStateResponseController extends ControllerChain{

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
		Node listResponse = response.contents.getFirstChild();
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
		}
		
		return true;
	}

}

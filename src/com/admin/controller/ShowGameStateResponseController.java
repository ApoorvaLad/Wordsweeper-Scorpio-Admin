package com.admin.controller;

import com.admin.xml.Message;
import com.model.Model;
import com.view.Application;

/**
 * Controller to display the current state of the game
 * @author Apoorva
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
		return true;
	}

}

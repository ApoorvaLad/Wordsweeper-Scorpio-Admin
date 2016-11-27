package com.admin.controller;

import com.admin.xml.Message;
import com.model.Model;
import com.util.XMLUtil;
import com.view.Application;

/**
 * Controller for requesting the state of a particular game
 * 
 * @author Apoorva
 *
 */
public class GameController implements IAdminController {

	Application application;
	private XMLUtil xml = new XMLUtil();

	public GameController(Application application) {
		this.application = application;
	}

	public void process(String gameId) {
		String xmlString = Message.requestHeader() + "<showGameStateRequest gameId = '" + gameId + "'/></request>";
		Message m = new Message(xmlString);

		application.getServerAccess().sendRequest(m);
	}

	@Override
	public boolean process(Message request) {
		// TODO Auto-generated method stub
		return false;
	}

}

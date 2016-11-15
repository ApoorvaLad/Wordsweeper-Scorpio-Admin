package com.admin.controller;

import com.admin.xml.Message;
import com.util.XMLUtil;
import com.view.Application;

public class GameListController {
	
	Application application;

	private XMLUtil xml = new XMLUtil();

	public GameListController(Application application) {
		this.application = application;
	}

	/**
	 * Make the request to the server and wait
	 */
	public void process() {
		String xmlString = Message.requestHeader() + "<listGamesRequest/></request>";
		Message m = new Message (xmlString);
		
		application.getServerAccess().sendRequest(m);
	}
}

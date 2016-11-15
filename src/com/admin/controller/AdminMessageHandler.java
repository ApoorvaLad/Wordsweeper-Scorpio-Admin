package com.admin.controller;

import com.admin.IMessageHandler;
import com.admin.xml.Message;
import com.view.Application;


public class AdminMessageHandler implements IMessageHandler {

	Application app;

	public AdminMessageHandler(Application app) {
		this.app = app;
	}

	@Override
	public void process(Message response) {
		// TODO Auto-generated method stub

	}

}

package com.admin.controller;

import com.admin.IMessageHandler;
import com.admin.xml.Message;
import com.view.Application;


public class AdminMessageHandler implements IMessageHandler {

	Application app;

	// by default is the empty handler...
	ControllerChain chain = new EmptyHandler();

	/**
	 * Register new controller chain as occuring before existing chain.
	 */
	public void registerHandler(ControllerChain handler) {
		handler.next = chain;
		chain = handler;
	}

	public AdminMessageHandler(Application app) {
		this.app = app;
	}

	@Override
	public void process(Message response) {
		// TODO Auto-generated method stub

	}

}

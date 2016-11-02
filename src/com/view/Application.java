package com.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.admin.ServerAccess;
import com.model.Model;

public class Application extends JFrame {

	ServerAccess serverAccess;
	

	public Application(Model model) {

	}

	/** Record the means to communicate with server. */
	public void setServerAccess(ServerAccess access) {
		this.serverAccess = access;
	}

	/** Get the server access object. */
	public ServerAccess getServerAccess() {
		return serverAccess;
	}

	
	
}

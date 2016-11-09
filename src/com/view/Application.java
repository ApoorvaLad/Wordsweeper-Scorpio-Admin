package com.view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.admin.ServerAccess;
import com.model.Model;


public class Application extends JFrame {

	ServerAccess serverAccess;
	AdminPanel adminPanel;
	
	static Application instance = null;
	

	public static Application getInstance() {  
		if (instance == null) {
			instance = new Application();
		}
		
		return instance;
	}
	
	
	Application() {
		super();
		setTitle("Game Manager");
		setSize(633, 490);
		adminPanel = new AdminPanel();
		add(adminPanel);
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

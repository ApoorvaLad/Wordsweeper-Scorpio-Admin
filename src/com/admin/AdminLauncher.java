package com.admin;

import com.admin.controller.AdminMessageHandler;
import com.admin.xml.Message;
import com.model.Model;
import com.view.Application;

/** Code to launch the Admin */
public class AdminLauncher {

	public static final String serverHost = "localhost";

	public static void main(String[] args) {
		// Register the protocol
		if (!Message.configure("wordsweeper.xsd")) {
			System.exit(0);
		}

		// select dedicated server with '-server' options
		String host = "localhost";
		if (args.length > 0 && args[0].equals("-server")) {
			host = serverHost;
		}

		// Initialize the client application and its corresponding model
		/*
		 * Model model = new Model(); Application app = new Application();
		 */
		final Application app = Application.getInstance();

		/*
		 * // set up the chain of responsibility
		 * 
		 * SampleClientMessageHandler handler = new
		 * SampleClientMessageHandler(app); handler.registerHandler(new
		 * BoardResponseController(app, model)); handler.registerHandler(new
		 * ConnectResponseController(app, model));
		 */

		AdminMessageHandler handler = new AdminMessageHandler(app);

		// try to connect to the server. Once connected, messages are going to
		// be processed by
		// SampleClientMessageHandler. For now we just continue on with the
		// initialization because
		// no message is actually sent by the connect method.
		ServerAccess sa = new ServerAccess(host, 11425);
		if (!sa.connect(handler)) {
			System.out.println("Unable to connect to server (" + host + "). Exiting.");
			System.exit(0);
		}
		System.out.println("Connected to " + host);

		// Should we on the client ever need to communicate with the server, we
		// need this ServerAccess
		// object.
		app.setServerAccess(sa);

		// at this point, we need to make app visible, otherwise we would
		// terminate application
		app.setVisible(true);

	}
}

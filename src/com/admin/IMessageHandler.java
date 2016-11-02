package com.admin;

import com.admin.xml.Message;

public interface IMessageHandler {

	/** Process's the protocol response */
	void process(Message response);
}

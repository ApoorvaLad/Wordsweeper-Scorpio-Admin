package com.admin.controller;

import com.admin.xml.Message;

public interface IAdminController {

	/**
	 * Return TRUE if accept the response; false otherwise.
	 * 
	 * If unable to process a valid response, then must thrown a
	 * RuntimeException
	 */
	public boolean process(Message response);
}

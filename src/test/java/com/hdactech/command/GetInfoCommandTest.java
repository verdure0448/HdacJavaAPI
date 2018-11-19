/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import com.hdactech.command.HdacCommand;
import com.hdactech.command.HdacException;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class GetInfoCommandTest {
	static HdacCommand hdacCommand;

	/**
	 *
	 */
	public GetInfoCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testgetInfo() {
		String result = "";
		try {
			result = hdacCommand.getChainCommand().getInfo();
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result :" + result);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of AddressCommandTest ---");

		// BlockChain TestCommand has to be created and started before
		hdacCommand = new HdacCommand("localhost", "6824", "hdacrpc",
				"73oYQWzx45hossFPPWUgicpLvHhsD8PempYxnSF6bnY9");

		testgetInfo();

		System.out.println("--- End of AddressCommandTest ---");
	}

}

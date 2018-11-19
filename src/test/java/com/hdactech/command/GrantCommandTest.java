/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import java.util.List;

import com.hdactech.command.HdacCommand;
import com.hdactech.command.HdacException;
import com.hdactech.object.Permission;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class GrantCommandTest {
	static HdacCommand hdacCommand;

	/**
	 *
	 */
	public GrantCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testlistPermissions() {
		List<Permission> result = null;
		try {
			result = hdacCommand.getGrantCommand().listPermissions(hdacCommand.getGrantCommand().WALLET);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (result == null || result.size() == 0) {
			System.err.println("testlistPermissions (WALLET) - result list is empty");
		} else {
			System.out.println("testlistPermissions (WALLET) - Result :");
			for (Permission res : result) {
				System.out.println(res);
			}
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of AddressCommandTest ---");

		// BlockChain TestCommand has to be created and started before
		hdacCommand = new HdacCommand("localhost", "6824", "hdacrpc",
				"73oYQWzx45hossFPPWUgicpLvHhsD8PempYxnSF6bnY9");
		
		int value1 = hdacCommand.getGrantCommand().CREATE;
		int value2 = hdacCommand.getGrantCommand().CONNECT;
		int value3 = hdacCommand.getGrantCommand().ADMIN;
		
		System.out.println("---");
		int value = value1;
		System.out.println(value);
		System.out.println(value & value1);
		System.out.println(value & value2);
		System.out.println(value & value3);
		value = value | value2;
		System.out.println("---");
		System.out.println(value);
		System.out.println(value & value1);
		System.out.println(value & value2);
		System.out.println(value & value3);
		value = value | value3;
		System.out.println("---");
		System.out.println(value);
		System.out.println(value & value1);
		System.out.println(value & value2);
		System.out.println(value & value3);
		System.out.println("---");
		
		testlistPermissions();

		System.out.println("--- End of AddressCommandTest ---");
	}

}

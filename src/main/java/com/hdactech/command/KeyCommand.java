/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import com.hdactech.command.builders.QueryBuilderKey;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class KeyCommand extends QueryBuilderKey {
	public KeyCommand(String ip, String port, String login, String password, RuntimeParameters runtimeparameters) {
		initialize(ip, port, login, password, runtimeparameters);
	}

	public Object getPrivkey(String privkey) throws HdacException {
		return executeDumpPrivkey(privkey);
	}
	
	public Object importPrivkey(String privkey) throws HdacException {
		return executeImportPrivkey(privkey);
	}

}

/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import com.hdactech.command.builders.QueryBuilderChain;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class ChainCommand extends QueryBuilderChain {

	public ChainCommand(String ip, String port, String login, String password, RuntimeParameters runtimeparameters) {
		initialize(ip, port, login, password, runtimeparameters);
	}

	/**
	 * getinfo
	 * Returns an object containing various state info.
	 * 
	 * Result:
	 * {
	 * "version": xxxxx, (numeric) the server version
	 * "protocolversion": xxxxx, (numeric) the protocol version
	 * "chainname": "xxxx", (string) hdac network name
	 * "description": "xxxx", (string) network desctription
	 * "protocol": "xxxx", (string) protocol - hdac or bitcoin
	 * "port": xxxx, (numeric) network port
	 * "setupblocks": "xxxx", (string) number of network setup blocks
	 * "walletversion": xxxxx, (numeric) the wallet version
	 * "balance": xxxxxxx, (numeric) the total native currency balance of the wallet
	 * "walletdbversion": xxxxx, (numeric) the wallet database version
	 * "blocks": xxxxxx, (numeric) the current number of blocks processed in the server
	 * "timeoffset": xxxxx, (numeric) the time offset
	 * "connections": xxxxx, (numeric) the number of connections
	 * "proxy": "host:port", (string, optional) the proxy used by the server
	 * "difficulty": xxxxxx, (numeric) the current difficulty
	 * "testnet": true|false, (boolean) if the server is using testnet or not
	 * "keypoololdest": xxxxxx, (numeric) the timestamp (seconds since GMT epoch) of the oldest pre-generated key in the
	 * key pool
	 * "keypoolsize": xxxx, (numeric) how many new keys are pre-generated
	 * "unlocked_until": ttt, (numeric) the timestamp in seconds since epoch (midnight Jan 1 1970 GMT) that the wallet
	 * is unlocked for transfers, or 0
	 * if the wallet is locked
	 * "paytxfee": x.xxxx, (numeric) the transaction fee set in btc/kb
	 * "relayfee": x.xxxx, (numeric) minimum relay fee for non-free transactions in btc/kb
	 * "errors": "..." (string) any error messages
	 * }
	 * 
	 * @return
	 * @throws HdacException
	 */
	public String getInfo() throws HdacException {
		return executeGetInfo();
	}
	
	/**
	 * help ( command )
	 * 
	 * List all commands, or get help for a specified command.
	 * 
	 * Arguments:
	 * 1. "command"                        (string, optional) The command to get help on
	 * 
	 * Result:
	 * "text"                              (string) The help text
	 * @return
	 * @throws HdacException
	 */
	public String help() throws HdacException {
		return executeHelp(null);
	}
	
	public String help(String command) throws HdacException {
		return executeHelp(command);
	}
}

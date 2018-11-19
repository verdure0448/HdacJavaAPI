/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */

package com.hdactech.command.builders;

import com.hdactech.command.HdacException;
import com.hdactech.command.builders.QueryBuilderCommon.CommandEnum;
import com.hdactech.command.tools.HdacTestParameter;
/**
 * @author Hdac Technology
 * @version 1.0
 */
public class QueryBuilderMining extends QueryBuilderCommon {
	protected Object executePauseMining() throws HdacException {
		return execute(CommandEnum.PAUSE, "mining");
	}
	
	protected Object executeResumeMining() throws HdacException {
		return execute(CommandEnum.RESUME, "mining");
	}
	
}

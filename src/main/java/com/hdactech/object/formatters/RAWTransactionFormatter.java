/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.object.formatters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.LinkedTreeMap;
import com.hdactech.object.SignedTransactionRAW;
import com.hdactech.object.TransactionRAW;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class RAWTransactionFormatter {
	public final static TransactionRAW formatTransactionRAW(Object objectTransactionRAW) {
		TransactionRAW transactionRAW = new TransactionRAW();

		if (objectTransactionRAW != null && LinkedTreeMap.class.isInstance(objectTransactionRAW)) {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();

			String jsonValue = gson.toJson(objectTransactionRAW);
			transactionRAW = gson.fromJson(jsonValue, TransactionRAW.class);
		}

		return transactionRAW;
	}

	public final static SignedTransactionRAW formatSignedTransactionRAW(Object objectSignedTransactionRAW) {
		SignedTransactionRAW signedTransactionRAW = new SignedTransactionRAW();

		if (objectSignedTransactionRAW != null && LinkedTreeMap.class.isInstance(objectSignedTransactionRAW)) {
			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();

			String jsonValue = gson.toJson(objectSignedTransactionRAW);
			signedTransactionRAW = gson.fromJson(jsonValue, SignedTransactionRAW.class);
		}

		return signedTransactionRAW;
	}

}

/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.hdactech.command.HdacCommand;
import com.hdactech.command.HdacException;
import com.hdactech.object.BalanceAsset;
import com.hdactech.object.queryobjects.AssetParams;
import com.hdactech.object.queryobjects.CustomParamString;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class IssueCommandTest {
	static HdacCommand hdacCommand;

	static String assetName = "";

	/**
	 *
	 */
	public IssueCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testissue() {
		String resultClosed = "";
		String resultOpened = "";
		try {
			List<String> addresses = hdacCommand.getAddressCommand().getAddresses();
			if (addresses != null && addresses.size() > 0) {
				String address = addresses.get(0);

				List<CustomParamString> customFields = new ArrayList<CustomParamString>();
				customFields.add(new CustomParamString("name1", "value1"));
				customFields.add(new CustomParamString("name2", "value2"));
				customFields.add(new CustomParamString("name3", "value3"));

				// Closed Asset
				System.out.println("Creation of the asset : " + assetName + "Closed");
				resultClosed = hdacCommand.getIssueCommand().issue(address, assetName + "Closed", 100, 1, 0,
						customFields);

				// Opened Asset
				AssetParams params = new AssetParams(assetName + "Opened", true);
				System.out.println("Creation of the asset : " + assetName + "Opened");
				resultOpened = hdacCommand.getIssueCommand().issue(address, params, 100, 1, 0, customFields);

			}
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (resultClosed == null || "".equals(resultClosed) || resultOpened == null || "".equals(resultOpened)) {
			System.err.println("testissue - resultClosed or resultOpened is empty");
		} else {
			System.out.println("testissue");
			System.out.println("Result for asset " + assetName + "Closed :");
			System.out.println(resultClosed);
			System.out.println("Result for asset " + assetName + "Opened :");
			System.out.println(resultOpened);
		}
	}

	private static void testlistAssets() {
		List<BalanceAsset> result = null;
		try {
			result = hdacCommand.getIssueCommand().listAssets(assetName + "Closed");
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() != 1) {
			System.err.println("testlistAssets - result is empty");
		} else {
			BalanceAsset balanceAsset = result.get(0);
			System.out.println("testlistAssets");
			System.out.println("Result :");
			System.out.println(balanceAsset.toString());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of IssueCommandTest ---");

		// BlockChain TestCommand has to be created and started before
		hdacCommand = new HdacCommand("localhost", "6824", "hdacrpc",
				"73oYQWzx45hossFPPWUgicpLvHhsD8PempYxnSF6bnY9");

		SimpleDateFormat formater = new SimpleDateFormat("ddMMyyhhmmss");
		assetName = "TestAPI1" + formater.format(new Date());
		testissue();
		testlistAssets();

		System.out.println("--- End of IssueCommandTest ---");
	}

}

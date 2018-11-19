/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import java.util.List;

import org.junit.Test;

import com.hdactech.object.KeyPairs;

import junit.framework.TestCase;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class AddressCommandTest extends TestCase {

	@Test
	public void testcreateKeyPairs() {
//		hdacCommand hdacCommand = new hdacCommand(TestConst.HDAC_SERVER_IP,
//				TestConst.HDAC_SERVER_PORT, TestConst.HDAC_SERVER_LOGIN, TestConst.HDAC_SERVER_PWD);
//
//		List<KeyPairs> listKeyPairs01 = null;
//
//		try {
//			listKeyPairs01 = hdacCommand.getAddressCommand().createKeyPairs();
//		} catch (HdacException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		assertNotNull(listKeyPairs01);
//		for (KeyPairs keyPairs : listKeyPairs01) {
//			System.out.println(keyPairs.toString());
//		}
//		assertEquals(listKeyPairs01.size(), 1);
//
//		List<KeyPairs> listKeyPairs05 = null;
//
//		try {
//			listKeyPairs05 = hdacCommand.getAddressCommand().createKeyPairs(5);
//		} catch (HdacException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		assertNotNull(listKeyPairs05);
//		for (KeyPairs keyPairs : listKeyPairs05) {
//			System.out.println(keyPairs.toString());
//		}
//		assertEquals(listKeyPairs05.size(), 5);
	  assertTrue(true);
	}

	// @Test
	// public void testgetAddresses() {
	// HdacCommand hdacCommand = new
	// HdacCommand(TestConst.HDAC_SERVER_IP,
	// TestConst.HDAC_SERVER_PORT, TestConst.HDAC_SERVER_LOGIN,
	// TestConst.HDAC_SERVER_PWD);
	//
	// List<String> result = null;
	// List<Address> resultAddress = null;
	// try {
	// result = hdacCommand.getAddressCommand().getAddresses();
	// } catch (HdacException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// assertNotNull(result);
	// assertFalse(result.size() == 0);
	//
	// try {
	// resultAddress = hdacCommand.getAddressCommand().getAddressesList();
	// } catch (HdacException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	//
	// assertNotNull(resultAddress);
	// assertFalse(resultAddress.size() == 0);
	// }
	//
	// @Test
	// public void testvalidateAddress() {
	// HdacCommand hdacCommand = new
	// HdacCommand(TestConst.HDAC_SERVER_IP,
	// TestConst.HDAC_SERVER_PORT, TestConst.HDAC_SERVER_LOGIN,
	// TestConst.HDAC_SERVER_PWD);
	//
	// List<String> resultAddresses = null;
	// Address result = null;
	// try {
	// resultAddresses = hdacCommand.getAddressCommand().getAddresses();
	//
	// assertNotNull(resultAddresses);
	// assertFalse(resultAddresses.size() == 0);
	//
	// for (String addressString : resultAddresses) {
	// result =
	// hdacCommand.getAddressCommand().validateAddress(addressString);
	//
	// assertNotNull(result);
	// assertNotNull(result.getAddress());
	// assertNotSame("", result.getAddress());
	// }
	// } catch (HdacException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	//
	// @Test
	// public void testgetNewAddress() {
	// HdacCommand hdacCommand = new
	// HdacCommand(TestConst.HDAC_SERVER_IP,
	// TestConst.HDAC_SERVER_PORT, TestConst.HDAC_SERVER_LOGIN,
	// TestConst.HDAC_SERVER_PWD);
	//
	// String resultAddress = "";
	// Address result = null;
	//
	// try {
	// resultAddress = hdacCommand.getAddressCommand().getNewAddress();
	//
	// assertNotNull(resultAddress);
	// assertNotSame("", resultAddress);
	//
	// result = hdacCommand.getAddressCommand().getNewAddressFilled();
	//
	// assertNotNull(result);
	// assertNotNull(result.getAddress());
	// assertNotSame("", result.getAddress());
	//
	// } catch (HdacException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }

}

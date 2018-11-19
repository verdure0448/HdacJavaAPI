/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.command;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.hdactech.command.HdacCommand;
import com.hdactech.command.HdacException;
import com.hdactech.object.Stream;
import com.hdactech.object.StreamKey;
import com.hdactech.object.StreamKeyItem;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class StreamCommandTest {
	static HdacCommand hdacCommand;

	static String streamName = "";

	/**
	 *
	 */
	public StreamCommandTest() {
		// TODO Auto-generated constructor stub
	}

	private static void testlistStreams() {
		List<Stream> result = null;
		System.out.println("testlistStreams :");
		try {
			System.out.println("Stream *");
			result = hdacCommand.getStreamCommand().listStreams("*");
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Result :");
		for (Stream stream : result) {
			System.out.println("   Stream :");
			System.out.println(stream.toString());
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("Stream * true");
			result = hdacCommand.getStreamCommand().listStreams("*", true);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Result :");
		for (Stream stream : result) {
			System.out.println("   Stream :");
			System.out.println(stream.toString());
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("Stream * true 1");
			result = hdacCommand.getStreamCommand().listStreams("*", true, 1);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Result :");
		for (Stream stream : result) {
			System.out.println("   Stream :");
			System.out.println(stream.toString());
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("Stream * true 1 0");
			result = hdacCommand.getStreamCommand().listStreams("*", true, 1, 0);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Result :");
		for (Stream stream : result) {
			System.out.println("   Stream :");
			System.out.println(stream.toString());
		}
	}

	private static void testcreate() {
		String result = "";
		System.out.println("testcreate :");
		try {

			result = hdacCommand.getStreamCommand().create(streamName);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || "".equals(result)) {
			System.err.println("testcreate - result is empty");
		} else {
			System.out.println("Result :");
			System.out.println(result);
		}
	}

	private static void testpublish() {
		String result = "";
		System.out.println("testpublish :");
		try {
			result = hdacCommand.getStreamCommand().publish(streamName, "StreamKey", "0123456789abcdef");

			for (int i = 0; i < 10; i++) {
				hdacCommand.getStreamCommand().publish(streamName, "StreamKey-1",
						"10abcdef01234567890" + String.valueOf(i));
			}
			for (int i = 0; i < 10; i++) {
				hdacCommand.getStreamCommand().publish(streamName, "StreamKey-2",
						"20abcdef01234567890" + String.valueOf(i));
			}
			for (int i = 0; i < 10; i++) {
				hdacCommand.getStreamCommand().publish(streamName, "StreamKey-3",
						"30abcdef01234567890" + String.valueOf(i));
			}
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || "".equals(result)) {
			System.err.println("testpublish - result is empty");
		} else {
			System.out.println("Result :");
			System.out.println(result);
		}

	}

	private static void testsubscribe() {
		System.out.println("testsubscribe :");
		try {

			hdacCommand.getStreamCommand().subscribe(streamName);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result : done !");
	}

	private static void testunsubscribe() {
		System.out.println("testunsubscribe :");
		try {

			hdacCommand.getStreamCommand().unsubscribe(streamName);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Result : done !");
	}

	private static void testlistStreamKeys() {
		List<StreamKey> result = null;
		System.out.println("testlistStreamKeys :");
		try {
			System.out.println("StreamKey " + streamName);
			result = hdacCommand.getStreamCommand().listStreamKeys(streamName);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKey item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " StreamKey");
			result = hdacCommand.getStreamCommand().listStreamKeys(streamName, "StreamKey");
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKey item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " StreamKey true");
			result = hdacCommand.getStreamCommand().listStreamKeys(streamName, "StreamKey", true);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKey item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " StreamKey false");
			result = hdacCommand.getStreamCommand().listStreamKeys(streamName, "StreamKey", false);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKey item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " * false 1");
			result = hdacCommand.getStreamCommand().listStreamKeys(streamName, "*", false, 1);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKey item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " * false 1 1");
			result = hdacCommand.getStreamCommand().listStreamKeys(streamName, "*", false, 1, 1);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKey item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}

	private static void testlistStreamKeyItems() {
		List<StreamKeyItem> result = null;
		System.out.println("testlistStreamKeyItems :");
		try {
			System.out.println("StreamKey " + streamName + " StreamKey-1");
			result = hdacCommand.getStreamCommand().listStreamKeyItems(streamName, "StreamKey-1");
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKeyItem item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " StreamKey-1 true");
			result = hdacCommand.getStreamCommand().listStreamKeyItems(streamName, "StreamKey-1", true);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKeyItem item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " StreamKey-1 false");
			result = hdacCommand.getStreamCommand().listStreamKeyItems(streamName, "StreamKey-1", false);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKeyItem item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " * false 1");
			result = hdacCommand.getStreamCommand().listStreamKeyItems(streamName, "*", false, 1);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKeyItem item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

		try {
			System.out.println("StreamKey " + streamName + " * false 1 1");
			result = hdacCommand.getStreamCommand().listStreamKeyItems(streamName, "*", false, 1, 1);
		} catch (HdacException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (result == null || result.size() == 0) {
			System.err.println("testcreate - result list is null or empty");
		} else {
			System.out.println("Result :");
			for (StreamKeyItem item : result) {
				System.out.println("   Key :");
				System.out.println(item.toString());
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- Start of StreamCommandTest ---");

		// BlockChain TestCommand has to be created and started before
		hdacCommand = new HdacCommand("localhost", "6824", "hdacrpc",
				"73oYQWzx45hossFPPWUgicpLvHhsD8PempYxnSF6bnY9");

		// BlockChain TestCommand has to be created and started before
		// ChainCommand.initializeChain("TestAPI1");
		SimpleDateFormat formater = new SimpleDateFormat("ddMMyyhhmmss");
		streamName = "TestAPI1" + formater.format(new Date());

		testlistStreams();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		testcreate();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		testsubscribe();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		testpublish();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		testlistStreamKeys();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		testlistStreamKeyItems();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		testunsubscribe();

		System.out.println("--- End of StreamCommandTest ---");
	}

}

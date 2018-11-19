/*
 * Copyright (C) 2017 Worldline, Inc.
 * MultiChainJavaAPI code distributed under the GPLv3 license, see COPYING file.
 * Copyright (c) 2018 Hdac Technology AG
 * HdacJavaAPI code distributed under the GPLv3 license, see COPYING file.
 *
 */
package com.hdactech.object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hdactech.command.HdacException;
import com.hdactech.command.tools.HdacTestParameter;

/**
 * @author Hdac Technology
 * @version 1.0
 */
public class AddressBalanceAsset implements AddressBalance {
	String address = null;
	List<BalanceAssetGeneral> assets;

	public AddressBalanceAsset() {
		assets = new ArrayList<BalanceAssetGeneral>();
	}

	public void isFilled() throws HdacException {
		HdacTestParameter.isNotNullOrEmpty("address", address);
		for (BalanceAssetGeneral asset : assets) {
			asset.isFilled();
		}
	}
	
	public Map<String, Double> getValue() throws HdacException {
		Map<String, Double> mapAssets = new HashMap<String, Double>();
		for (BalanceAssetGeneral asset : assets) {
			asset.isFilled();
			mapAssets.put(asset.getName(), new Double(asset.getQty()));
		}
		return mapAssets;
	}
	

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the assets
	 */
	public List<BalanceAssetGeneral> getAssets() {
		return assets;
	}

	/**
	 * @param assets the assets to set
	 */
	public void setAssets(List<BalanceAssetGeneral> assets) {
		this.assets = assets;
	}

	public void addAsset(BalanceAssetGeneral asset) {
		if (asset != null) {
			this.assets.add(asset);
		}
	}


}

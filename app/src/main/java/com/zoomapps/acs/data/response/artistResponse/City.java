package com.zoomapps.acs.data.response.artistResponse;

import com.google.gson.annotations.SerializedName;

public class City{

	@SerializedName("name")
	private String name;

	@SerializedName("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}
}
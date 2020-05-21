package com.zoomapps.acs.data.response.artistResponse;

import com.google.gson.annotations.SerializedName;

public class Country{

	@SerializedName("image")
	private String image;

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("currency")
	private String currency;

	@SerializedName("number_count")
	private String numberCount;

	@SerializedName("id")
	private int id;

	@SerializedName("start_with")
	private String startWith;

	public String getImage(){
		return image;
	}

	public String getCode(){
		return code;
	}

	public String getName(){
		return name;
	}

	public String getCurrency(){
		return currency;
	}

	public String getNumberCount(){
		return numberCount;
	}

	public int getId(){
		return id;
	}

	public String getStartWith(){
		return startWith;
	}
}
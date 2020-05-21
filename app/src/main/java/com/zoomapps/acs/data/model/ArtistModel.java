package com.zoomapps.acs.data.model;

import com.google.gson.annotations.SerializedName;
import com.zoomapps.acs.data.response.artistResponse.City;
import com.zoomapps.acs.data.response.artistResponse.Country;

public class ArtistModel {

	@SerializedName("image")
	private String image;

	@SerializedName("created_time")
	private int createdTime;

	@SerializedName("country")
	private Country country;

	@SerializedName("working_out_salon")
	private boolean workingOutSalon;

	@SerializedName("address")
	private Object address;

	@SerializedName("lng")
	private String lng;

	@SerializedName("city")
	private City city;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("bio")
	private Object bio;

	@SerializedName("is_favourite")
	private boolean isFavourite;

	@SerializedName("type")
	private String type;

	@SerializedName("userVerify")
	private boolean userVerify;

	@SerializedName("rate")
	private int rate;

	@SerializedName("fire_base_token")
	private Object fireBaseToken;

	@SerializedName("name")
	private String name;

	@SerializedName("logo")
	private Object logo;

	@SerializedName("user_type_id")
	private String userTypeId;

	@SerializedName("id")
	private int id;

	@SerializedName("email")
	private String email;

	@SerializedName("lat")
	private String lat;

	public String getImage(){
		return image;
	}

	public int getCreatedTime(){
		return createdTime;
	}

	public Country getCountry(){
		return country;
	}

	public boolean isWorkingOutSalon(){
		return workingOutSalon;
	}

	public Object getAddress(){
		return address;
	}

	public String getLng(){
		return lng;
	}

	public City getCity(){
		return city;
	}

	public String getMobile(){
		return mobile;
	}

	public Object getBio(){
		return bio;
	}

	public boolean isIsFavourite(){
		return isFavourite;
	}

	public String getType(){
		return type;
	}

	public boolean isUserVerify(){
		return userVerify;
	}

	public int getRate(){
		return rate;
	}

	public Object getFireBaseToken(){
		return fireBaseToken;
	}

	public String getName(){
		return name;
	}

	public Object getLogo(){
		return logo;
	}

	public String getUserTypeId(){
		return userTypeId;
	}

	public int getId(){
		return id;
	}

	public String getEmail(){
		return email;
	}

	public String getLat(){
		return lat;
	}
}
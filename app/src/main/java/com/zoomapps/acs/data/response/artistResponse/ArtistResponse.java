package com.zoomapps.acs.data.response.artistResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;
import com.zoomapps.acs.data.model.ArtistModel;

public class ArtistResponse{

	@SerializedName("data")
	private List<ArtistModel> data;

	@SerializedName("success")
	private boolean success;

	@SerializedName("message")
	private String message;

	@SerializedName("statusCode")
	private int statusCode;

	public List<ArtistModel> getData(){
		return data;
	}

	public boolean isSuccess(){
		return success;
	}

	public String getMessage(){
		return message;
	}

	public int getStatusCode(){
		return statusCode;
	}

	class City{

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
	class Country{

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
}
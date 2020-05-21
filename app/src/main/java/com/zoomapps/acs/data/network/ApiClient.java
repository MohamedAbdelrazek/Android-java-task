package com.zoomapps.acs.data.network;

import com.zoomapps.acs.data.response.artistResponse.ArtistResponse;

import io.reactivex.Observable;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiClient {

    @POST("salonArtists")
    Observable<ArtistResponse> getArtist(@Header("lang") String lang, @Query("salon_id") int salon_id);

}
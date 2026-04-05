package com.iris.toiletfinderwellington.netWork;

import com.iris.toiletfinderwellington.model.ToiletResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ToiletApiService {

        @GET("arcgis/rest/services/Parks/Parks_Toilet/MapServer/5/query?where=1=1&outFields=*&f=geojson&outSR=4326")
        Call<ToiletResponse> getFeatures();

}

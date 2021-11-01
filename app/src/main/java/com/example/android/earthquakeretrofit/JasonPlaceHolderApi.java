package com.example.android.earthquakeretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface JasonPlaceHolderApi {
    @GET("api/?key=11778875-bd18dbcb72c8cc6ad02f06b46&q=animal+love&image_type=photo")
    Call<Root> getProperties();

    //https://pixabay.com/api/?key=11778875-bd18dbcb72c8cc6ad02f06b46&q=animal+love&image_type=photo
/*    @GET("fdsnws/event/1/query")
    Call<Root> getProperties(
            @Query("format")String format,
            @Query("starttime")String startTime,
            @Query("endtime")String endTime
    );*/
    @GET
    Call<Root> getProperties(@Url String url);
    @GET("https://pixabay.com/api/?key=11778875-bd18dbcb72c8cc6ad02f06b46&q=animal+love&image_type=photo")
    Call<Root> getData();
}

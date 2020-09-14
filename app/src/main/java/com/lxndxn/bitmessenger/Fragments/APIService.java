package com.lxndxn.bitmessenger.Fragments;

import com.lxndxn.bitmessenger.Notifications.MyResponse;
import com.lxndxn.bitmessenger.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=// Add your own Authorization key from firebase"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

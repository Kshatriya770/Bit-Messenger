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
                    "Authorization:key=AAAAgu0UxD0:APA91bEmsVNwqg3R20Lxsh9uy8KNqCZuPgywSXnEG7jSkFmBfw9vc1jquBRzngB463KXlJhS_VmlY9fekCb1BC0l3AMaadMz3RCSMBSktok5Q3TccIwM7hsRRY1Qr8EzTUfKWlKitk4L"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}

package a3embed.example.com.loginapi.Helper;

import a3embed.example.com.loginapi.Model.LoginDataModelRetro;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RetroEndPoints {

    @Headers("language: en")
    @POST("signIn")
    @FormUrlEncoded
    Observable<LoginDataModelRetro> signIn(@Field("countryCode")String countryCode,
                                           @Field("mobile") String mobile,
                                           @Field("password") String password,
                                           @Field("deviceId") String deviceId,
                                           @Field("pushToken") String pushToken,
                                           @Field("appVersion") String version,
                                           @Field("deviceMake") String deviceMake,
                                           @Field("deviceModel") String deviceModel,
                                           @Field("deviceType") int deviceType,
                                           @Field("deviceTime") String deviceTime,
                                           @Field("deviceOsVersion") int deviceOsVersion);

}

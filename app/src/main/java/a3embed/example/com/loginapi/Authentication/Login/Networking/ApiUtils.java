package a3embed.example.com.loginapi.Authentication.Login.Networking;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "https://api.flexyapp.com/driver/";               // URL

    public static RetroEndPoints getAPIService() {
        return RetrofitInstance.getClient(BASE_URL).create(RetroEndPoints.class);
    }

}

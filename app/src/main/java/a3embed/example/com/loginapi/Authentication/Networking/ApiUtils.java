package a3embed.example.com.loginapi.Authentication.Networking;

public class ApiUtils {

    private ApiUtils() {}

    public static final String BASE_URL = "<<WRITE API HERE>>";               // URL

    public static RetroEndPoints getAPIService() {
        return RetrofitInstance.getClient(BASE_URL).create(RetroEndPoints.class);
    }

}

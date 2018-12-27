package a3embed.example.com.loginapi.Authentication.Login.Presenter;

public interface LoginIPresenter {

    /**
     * <h>getData()</h>
     * <p>Get the credentials entered by the user</p>
     * */
    void getData(String phoneNumber, String password);

    /**
     * <h>returnData()</h>
     * <p>Return the response</p>
     * */
    void returnData();

}

package a3embed.example.com.loginapi.Authentication.Login.Model;

import com.google.gson.annotations.SerializedName;

public class LoginDataModelRetro {

    @SerializedName("message")
    private String message;                                                                         // Message data

    @SerializedName("data")
    private LoginSuccessDataModel data;                                                             // Data When Successful

    /**
     * <h>getMessage()</h>
     * <p>Get the message</p>
     * */
    public String getMessage() {
        return message;
    }

    /**
     * <h>setMessage()</h>
     * <p>Set the message</p>
     * */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <h>getData()</h>
     * <p>Get the data when login successful</p>
     * */
    public LoginSuccessDataModel getData() {
        return data;
    }

    /**
     * <h>setData()</h>
     * <p>Set the data when successful</p>
     * */
    public void setData(LoginSuccessDataModel data) {
        this.data = data;
    }
}

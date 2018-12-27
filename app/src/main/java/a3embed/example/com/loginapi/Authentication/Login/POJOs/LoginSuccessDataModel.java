package a3embed.example.com.loginapi.Authentication.Login.POJOs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginSuccessDataModel {

    @SerializedName("chn")
    @Expose
    private String chn;

    @SerializedName("driverId")
    @Expose
    private String driverId;

    @SerializedName("token")
    @Expose
    private String token;

    @SerializedName("presence_chn")
    @Expose
    private String presence_chn;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("countryCode")
    @Expose
    private String countryCode;

    @SerializedName("profilePic")
    @Expose
    private String profilePic;

    @SerializedName("pushTopic")
    @Expose
    private String pushTopic;

    public LoginSuccessDataModel(String chn, String driverId, String token, String presence_chn, String name, String email, String countryCode, String profilePic, String pushTopic) {
        this.chn = chn;
        this.driverId = driverId;
        this.token = token;
        this.presence_chn = presence_chn;
        this.name = name;
        this.email = email;
        this.countryCode = countryCode;
        this.profilePic = profilePic;
        this.pushTopic = pushTopic;
    }

    /**
     * <h>Getter/Setter</h>
     * <p>Get/Set the data</p>
     * */

    public String getChn() {
        return chn;
    }

    public void setChn(String chn) {
        this.chn = chn;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPresence_chn() {
        return presence_chn;
    }

    public void setPresence_chn(String presence_chn) {
        this.presence_chn = presence_chn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getPushTopic() {
        return pushTopic;
    }

    public void setPushTopic(String pushTopic) {
        this.pushTopic = pushTopic;
    }

}

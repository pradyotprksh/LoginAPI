package a3embed.example.com.loginapi.Model;

public class LoginModelSend {

    private String countryCode;                                                                     // Country code
    private String mobile;                                                                          // Mobile
    private String password;                                                                        //Password
    private String deviceId;                                                                        // Device Id
    private String pushToken;                                                                       // Push token
    private String version;                                                                         // Version
    private String deviceMake;                                                                      // Device Make
    private String deviceModel;                                                                     // Device Model
    private int deviceType;                                                                         // Device type
    private String deviceTime;                                                                      // Device time
    private int deviceOsVersion;                                                                    // Device Os Version

    public LoginModelSend(String countryCode, String mobile, String password, String deviceId, String pushToken, String version, String deviceMake, String deviceModel, int deviceType, String deviceTime, int deviceOsVersion) {
        this.countryCode = countryCode;
        this.mobile = mobile;
        this.password = password;
        this.deviceId = deviceId;
        this.pushToken = pushToken;
        this.version = version;
        this.deviceMake = deviceMake;
        this.deviceModel = deviceModel;
        this.deviceType = deviceType;
        this.deviceTime = deviceTime;
        this.deviceOsVersion = deviceOsVersion;
    }

    /**
     * <h>Getter/Setter</h>
     * <p>Get/Set the data</p>
     * */

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDeviceMake() {
        return deviceMake;
    }

    public void setDeviceMake(String deviceMake) {
        this.deviceMake = deviceMake;
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public String getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(String deviceTime) {
        this.deviceTime = deviceTime;
    }

    public int getDeviceOsVersion() {
        return deviceOsVersion;
    }

    public void setDeviceOsVersion(int deviceOsVersion) {
        this.deviceOsVersion = deviceOsVersion;
    }

}

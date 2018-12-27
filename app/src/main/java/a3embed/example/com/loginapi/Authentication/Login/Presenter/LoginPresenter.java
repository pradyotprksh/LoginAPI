package a3embed.example.com.loginapi.Authentication.Login.Presenter;

import a3embed.example.com.loginapi.Authentication.Login.Model.LoginDataModelRetro;
import a3embed.example.com.loginapi.Authentication.Login.Model.LoginModelSend;
import a3embed.example.com.loginapi.Authentication.Login.Model.LoginSuccessDataModel;
import a3embed.example.com.loginapi.Authentication.Login.Networking.ApiUtils;
import a3embed.example.com.loginapi.Authentication.Login.Networking.RetroEndPoints;
import a3embed.example.com.loginapi.Authentication.Login.View.LoginInterface;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.HttpException;

public class LoginPresenter implements LoginIPresenter {

    private LoginModelSend loginModelSend;                                                          // LoginModelSend variable
    private LoginInterface loginInterface;                                                          // Login Interface for the view

    public LoginPresenter(LoginInterface loginInterface) {
        this.loginInterface = loginInterface;
    }

    @Override
    public void getData(String phoneNumber, String password) {
        loginModelSend = new LoginModelSend("+91", phoneNumber, password, "1", "1", "1", "1", "1", 1, "1", 1);
    }

    @Override
    public void returnData() {
        RetroEndPoints mAPIService = ApiUtils.getAPIService();

        Observable<LoginDataModelRetro> btcObservable = mAPIService.signIn(loginModelSend.getCountryCode(), loginModelSend.getMobile(), loginModelSend.getPassword(), loginModelSend.getDeviceId(), loginModelSend.getPushToken(), loginModelSend.getVersion(), loginModelSend.getDeviceMake(), loginModelSend.getDeviceModel(), loginModelSend.getDeviceType(), loginModelSend.getDeviceTime(), loginModelSend.getDeviceOsVersion());

        Observer<LoginDataModelRetro> observer = new Observer<LoginDataModelRetro>() {

            @Override
            public void onSubscribe(Disposable d) { }

            @Override
            public void onNext(LoginDataModelRetro messageDataModelRetro) {
                String status = "Status: " + messageDataModelRetro.getMessage();
                LoginSuccessDataModel loginSuccessDataModel = messageDataModelRetro.getData();
                String chn = "CHN: " + loginSuccessDataModel.getChn();
                String driverId = "DriverId: " + loginSuccessDataModel.getDriverId();
                String token = "Token: " + loginSuccessDataModel.getToken();
                String presenceChn = "Presence CHN: " + loginSuccessDataModel.getPresence_chn();
                String name = "Name: " + loginSuccessDataModel.getName();
                String email = "Email: " + loginSuccessDataModel.getEmail();
                String code = "Country Code: " + loginSuccessDataModel.getCountryCode();
                String url = "Image URL: " + loginSuccessDataModel.getProfilePic();
                String push = "Push Topic: " + loginSuccessDataModel.getPushTopic();
//                responseValue[0] = "FCM Topics: " + loginSuccessDataModel8754664616.getFcmTopics() + "\n";

                String message = status + "\n" + chn + "\n" + driverId + "\n" + name + "\n" + email + "\n" + code;

                loginInterface.setData(message);
                loginInterface.dismissProgress();
            }

            @Override
            public void onError(Throwable e) {
                String errorMessage = String.valueOf(((HttpException) e).code());

                if (errorMessage.equals("400")) {
                    loginInterface.setData("Phone Number or Email is Wrong.");
                } else if (errorMessage.equals("401")) {
                    loginInterface.setData("Incorrect password, please try again.");
                }
                loginInterface.dismissProgress();
            }

            @Override
            public void onComplete() {
                loginInterface.dismissProgress();
            }
        };

        btcObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(observer);
    }

}

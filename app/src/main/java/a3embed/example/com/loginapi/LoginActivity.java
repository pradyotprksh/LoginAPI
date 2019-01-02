package a3embed.example.com.loginapi;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

import a3embed.example.com.loginapi.Authentication.Login.Presenter.LoginIPresenter;
import a3embed.example.com.loginapi.Authentication.Login.LoginInterface;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.support.DaggerAppCompatActivity;

public class LoginActivity extends DaggerAppCompatActivity implements LoginInterface {

    @BindView(R.id.phoneEt) EditText phoneEt;                                                       // Phone number et
    @BindView(R.id.passwordEt) EditText passwordEt;                                                 // Password Et
    @BindView(R.id.apiResponse) TextView apiResponse;                                               // Api response text view

    @Inject
    LoginIPresenter loginIPresenter;                                                                // Login Presenter interface
    private ProgressDialog progressDialog;                                                          // Progress dialog

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        apiResponse.setMovementMethod(new ScrollingMovementMethod());
    }

    @OnClick(R.id.signInB)
    void getValue() {
        if (TextUtils.isEmpty(phoneEt.getText().toString()) || TextUtils.isEmpty(passwordEt.getText().toString())) {
            apiResponse.setText(getString(R.string.enter_data_error));
        } else {
            progressDialog = ProgressDialog.show(LoginActivity.this, "Loading...", "Getting Details. Please Wait.");
            loginIPresenter.getData(phoneEt.getText().toString(), passwordEt.getText().toString());
            loginIPresenter.returnData();
        }
    }

    @Override
    public void setData(String message) {
        apiResponse.setText(message);
    }

    @Override
    public void dismissProgress() {
        progressDialog.dismiss();
    }

}

package a3embed.example.com.loginapi;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import a3embed.example.com.loginapi.Authentication.Login.Presenter.LoginIPresenter;
import a3embed.example.com.loginapi.Authentication.Login.Presenter.LoginPresenter;
import a3embed.example.com.loginapi.Authentication.Login.View.LoginInterface;
import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginActivity extends AppCompatActivity implements LoginInterface {

    @BindView(R.id.phoneEt) EditText phoneEt;                                                       // Phone number et
    @BindView(R.id.passwordEt) EditText passwordEt;                                                 // Password Et
    @BindView(R.id.signInB) Button signInB;                                                         // Sign in button
    @BindView(R.id.apiResponse) TextView apiResponse;                                               // Api response text view

    private LoginIPresenter loginIPresenter;                                                        // Login Presenter interface
    private ProgressDialog progressDialog;                                                          // Progress dialog

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ButterKnife.bind(this);

        loginIPresenter = new LoginPresenter(this);

        apiResponse.setMovementMethod(new ScrollingMovementMethod());

        signInB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValue();
            }
        });
    }

    private void getValue() {

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

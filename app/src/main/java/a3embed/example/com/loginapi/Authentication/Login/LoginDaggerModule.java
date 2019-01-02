package a3embed.example.com.loginapi.Authentication.Login;

import android.app.Activity;

import a3embed.example.com.loginapi.Authentication.Login.Presenter.LoginIPresenter;
import a3embed.example.com.loginapi.Authentication.Login.Presenter.LoginPresenter;
import a3embed.example.com.loginapi.Authentication.dagger.ActivityScoped;
import a3embed.example.com.loginapi.LoginActivity;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginDaggerModule {

    @ActivityScoped
    @Binds
    abstract Activity getActivity(LoginActivity activity);

    @ActivityScoped
    @Binds
    abstract LoginIPresenter getPresenter(LoginPresenter presenter);

    @ActivityScoped
    @Binds
    abstract LoginInterface getView(LoginActivity view);

}

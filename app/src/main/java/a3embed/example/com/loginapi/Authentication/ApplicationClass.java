package a3embed.example.com.loginapi.Authentication;

import a3embed.example.com.loginapi.Authentication.dagger.AppComponent;
import a3embed.example.com.loginapi.Authentication.dagger.DaggerAppComponent;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class ApplicationClass  extends DaggerApplication
{
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }

}

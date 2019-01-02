package a3embed.example.com.loginapi.Authentication.dagger;

import a3embed.example.com.loginapi.Authentication.Login.LoginDaggerModule;
import a3embed.example.com.loginapi.LoginActivity;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBindingModule {

    @ActivityScoped
    @ContributesAndroidInjector(modules = LoginDaggerModule.class)
    abstract LoginActivity loginActivity();

}

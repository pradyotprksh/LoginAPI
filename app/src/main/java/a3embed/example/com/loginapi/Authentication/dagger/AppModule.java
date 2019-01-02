package a3embed.example.com.loginapi.Authentication.dagger;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

@Module
abstract class AppModule {

    @Binds
    abstract Context bindContext(Application application);

}

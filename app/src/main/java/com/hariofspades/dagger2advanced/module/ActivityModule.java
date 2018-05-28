package com.hariofspades.dagger2advanced.module;

import android.app.Activity;
import android.content.Context;

import com.hariofspades.dagger2advanced.interfaces.RandomUserAppScope;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
@Module
public class ActivityModule {

    private final Context context;

    ActivityModule(Activity context){
        this.context = context;
    }

    @Named("activity_context")
    @RandomUserAppScope
    @Provides
    public Context context(){ return context; }
}
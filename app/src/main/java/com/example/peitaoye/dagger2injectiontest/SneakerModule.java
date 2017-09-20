package com.example.peitaoye.dagger2injectiontest;

import javax.inject.Named;

import dagger.BindsOptionalOf;
import dagger.Module;
import dagger.Provides;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@Module
public class SneakerModule {
    @perActivity
    @Named("1")
    @Provides
    public Sneaker provideNike(){
        return new NIke();
    }
    @perActivity
    @Named("2")
    @Provides
    public Sneaker provideJordan(){
        return new Jordan();
    }

    @BindsOptionalOf
    @Provides
    Slipper provideSlipper(){
        return new Slipper();
    }
}

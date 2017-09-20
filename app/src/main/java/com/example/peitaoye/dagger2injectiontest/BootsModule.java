package com.example.peitaoye.dagger2injectiontest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@Module
public class BootsModule {
    @secPerActivity
    @Provides
    public Boots provideBoots(){
        return new Boots();
    }
}

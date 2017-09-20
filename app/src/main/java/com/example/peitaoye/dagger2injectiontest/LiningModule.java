package com.example.peitaoye.dagger2injectiontest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@Module
public class LiningModule {
    @secPerActivity
    @Provides
    public Lining providesLining(){
        return new Lining();
    }
}

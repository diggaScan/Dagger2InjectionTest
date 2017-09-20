package com.example.peitaoye.dagger2injectiontest;

import dagger.Component;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@secPerActivity
@Component(dependencies=SneakerComponent.class,modules = BootsModule.class)
public interface  BootsComponents {
    void inject(MainActivity mainActivity);
}

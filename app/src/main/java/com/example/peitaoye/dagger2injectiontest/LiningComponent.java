package com.example.peitaoye.dagger2injectiontest;

import dagger.Subcomponent;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@secPerActivity
@Subcomponent(modules = LiningModule.class)
public interface LiningComponent {
    void inject(MainActivity mainActivity);
}

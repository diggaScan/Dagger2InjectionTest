package com.example.peitaoye.dagger2injectiontest;

import dagger.BindsInstance;
import dagger.Component;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@perActivity
@Component(modules = SneakerModule.class)
public interface SneakerComponent {
    void inject(MainActivity mainActivity);
    LiningComponent liningComponents();
    @Component.Builder
   interface Builder{
        @BindsInstance
        Builder getBuilder(MainActivity mainActivity);
        SneakerComponent builde();
    }
}

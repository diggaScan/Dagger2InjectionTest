package com.example.peitaoye.dagger2injectiontest;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by PeitaoYe on 2017/9/20.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface secPerActivity {
}

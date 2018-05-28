package com.hariofspades.dagger2advanced.mainactivity;

import com.hariofspades.dagger2advanced.component.RandomUserComponent;

import dagger.Component;

@Component(modules = MainActivityModule.class,dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {

    void injectMainActivity(MainActivity mainActivity);

}

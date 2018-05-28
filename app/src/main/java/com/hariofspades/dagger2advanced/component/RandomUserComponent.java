package com.hariofspades.dagger2advanced.component;

import com.hariofspades.dagger2advanced.interfaces.RandomUserAppScope;
import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;
import com.hariofspades.dagger2advanced.module.PicassoModule;
import com.hariofspades.dagger2advanced.module.RandomUserModule;
import com.squareup.picasso.Picasso;

import dagger.Component;

@RandomUserAppScope
@Component(modules = {RandomUserModule.class, PicassoModule.class})
public interface RandomUserComponent {

    RandomUsersApi getRandomuseApi();

    Picasso getpicasso();


}

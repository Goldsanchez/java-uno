package com.example.javauno.di;


import com.example.javauno.data.service.PokemonService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Singleton
    @Provides
    Retrofit providesRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("#")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    PokemonService providesApiPokemon(Retrofit retrofit){
        return retrofit.create(PokemonService.class);
    }
}

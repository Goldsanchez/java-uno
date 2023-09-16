package com.example.javauno.data.service;

import com.example.javauno.data.dto.PokemonDto;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PokemonService {

    @GET("{id}")
    Response<PokemonDto> getPokemons(@Path("id") String id);
}

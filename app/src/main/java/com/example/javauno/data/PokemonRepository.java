package com.example.javauno.data;

import android.util.Log;

import com.example.javauno.data.dto.PokemonDto;
import com.example.javauno.data.service.PokemonService;

import java.util.List;
import java.util.Random;

import javax.inject.Inject;

import retrofit2.Response;


public class PokemonRepository {

    private final PokemonService pokemonService;

    Random random = new Random();

    @Inject
    public PokemonRepository(PokemonService pokemonService){
        this.pokemonService = pokemonService;
    }

        // https://pokeapi.co/api/v2/pokemon/3
    PokemonDto getPokemons(){
        int randomNumber = random.nextInt(100);
        Response<PokemonDto> response = pokemonService.getPokemons(Integer.toString(randomNumber));

        if(response.isSuccessful()){
            Log.i("jejeje", response.toString());
            return response.body();
        }

        return null;
    }
}

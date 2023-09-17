package com.example.javauno;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.javauno.data.PokemonRepository;
import com.example.javauno.data.dto.PokemonDto;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class MainViewModel extends ViewModel {

    PokemonRepository pokemonRepository;
    MutableLiveData<PokemonDto> pokemon = new MutableLiveData<>();



    @Inject
    public MainViewModel(PokemonRepository pokemonRepository){

        this.pokemonRepository = pokemonRepository;
    }


}

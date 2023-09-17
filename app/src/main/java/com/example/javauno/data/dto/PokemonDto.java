package com.example.javauno.data.dto;

public class PokemonDto {


    int id;

    String name;

    int weight;
    boolean is_default;

    public PokemonDto(int id, String name, int weight, boolean is_default) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.is_default = is_default;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isIs_default() {
        return is_default;
    }

    public void setIs_default(boolean is_default) {
        this.is_default = is_default;
    }


}

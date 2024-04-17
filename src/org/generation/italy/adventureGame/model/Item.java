package org.generation.italy.adventureGame.model;

import java.util.Optional;

public class Item {

    private int id;
    private String name;
    private String description;
    private double weight;
    private int value;
    
    public Item(int id, String name, String description, double weight, int value){
        this.id = id;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.value = value;
    }

    @Override
    public boolean equals(Object other){
        if(other == null){
            return false;
        }
        if(this == other){
            return true;
        }
        if(other.getClass() != this.getClass()){
            return false;
        }

        Item otherItem = (Item)other;
        // if(this.name.equals(otherItem.name)){
        //     return true;
        // } else {
        //     return false;
        // }
        return this.name.equals(otherItem.name);
    }

    // public Optional<String> getName(){
    //     if(name == null){
    //         return Optional.empty();
    //     }
    //     return Optional.of(name);
    // }

    public String getName(){
        return name;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }

    public double getWeight(){
        return weight;
    }

}

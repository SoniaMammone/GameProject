package org.generation.italy.adventureGame.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inventory {

    private List <Item> itemList = new ArrayList<>();

    public Inventory(){
        this.itemList = new ArrayList<>();
    }

    public Inventory(Item... items){
        itemList = new ArrayList<>(Arrays.asList(items)); //dato un array ritorna una lista
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public String getItemNameList(){
        StringBuilder sb = new StringBuilder();
        for(Item item : itemList){
            sb.append(item.getName()).append(getItemNameList())
        }
    }

    

}

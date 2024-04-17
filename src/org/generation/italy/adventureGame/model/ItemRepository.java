package org.generation.italy.adventureGame.model;

import java.util.HashMap;
import java.util.Map;

public class ItemRepository {

    private static Map <Item, Room> itemRoom = new HashMap<>();

    static{
        RoomRepository rooms = new RoomRepository();
        Item apple = new Item("apple");
        itemRoom.put(apple, rooms.)
    }

}

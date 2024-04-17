package org.generation.italy.adventureGame.model;

import java.util.HashMap;

public class Room {

    private int id;
    private String name;
    private Inventory inventory;
    private String description;
    private RoomConnection connection;

    public Room(int id, String name, String description, Item... objects) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.inventory = new Inventory(objects);
        this.connection = new RoomConnection();
    }

    public boolean connect(Room other, Cardinal direction){
        if(isBusyAt(direction) || other.isBusyAt(direction.opposite())){
            return false;
        }else{
            connection.connectAt(direction, other);
            other.connection.connectAt(direction.opposite(), this);
            return true;
        }
    }

    public Optional<Room> exitAt(Cardinal c){
        
    }

    public boolean isBusyAt(Cardinal direction){
        return connection.getRoomAt(direction).isPresent();
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString(){
        return """
                                %s
                %s                
                """.stripTrailing().formatted(name, description);
    }

    


}

package org.generation.italy.adventureGame.model;

import java.util.Observable;
import java.util.Optional;

public class RoomConnection {

    private int id;
    private Room exitAtNorth;
    private Room exitAtSouth;
    private Room exitAtEst;
    private Room exitAtWest;
    private Room source;

    public RoomConnection(){}

    public RoomConnection(int id, Room exitAtNorth, Room exitAtSouth, Room exitAtEst, Room exitAtWest, Room source){
        this.id = id;
        this.exitAtNorth = exitAtNorth;
        this.exitAtSouth = exitAtSouth;
        this.exitAtEst = exitAtEst;
        this.exitAtWest = exitAtWest;
        this.source = source;
    }

    public Optional<Room> getRoomAt(Cardinal c){
        return switch(c){
            case NORTH -> exitAtNorth != null ? Optional.of(exitAtNorth) : Optional.empty();
            case SOUTH -> exitAtSouth != null ? Optional.of(exitAtSouth) : Optional.empty();
            case EAST -> exitAtEst != null ? Optional.of(exitAtEst) : Optional.empty();
            case WEST -> exitAtWest != null ? Optional.of(exitAtWest) : Optional.empty();
        };
    }

    public boolean connectAt(Cardinal c, Room destination){

        // in questo caso il default non c'è perchè non è possibile avere un altro dipo cardinal, sono 4 e li ho usari tutti e 4
        switch (c) {
            case NORTH:
                exitAtNorth = destination;
                break;
            case SOUTH:
                exitAtSouth = destination;
                break;
            case EAST:
                exitAtEst = destination;
                break;
            case WEST:
                exitAtWest = destination;
                break;
        }
        return true;
    }

}

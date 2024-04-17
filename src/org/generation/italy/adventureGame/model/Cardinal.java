package org.generation.italy.adventureGame.model;

import java.security.InvalidParameterException;

public enum Cardinal {
    
    EAST, NORTH, SOUTH, WEST;

    public Cardinal opposite(){
        return switch (this) {
            case EAST -> WEST;
            case WEST -> EAST;
            case NORTH -> SOUTH;
            case SOUTH -> NORTH;
        };
    }

    public static Cardinal directionFor(String command){
        return switch (command){
            case "e" -> EAST;
            case "w" -> WEST;
            case "s" -> SOUTH;
            case "n" -> NORTH;
            default -> throw new InvalidParameterException(command);
        }
    }

}

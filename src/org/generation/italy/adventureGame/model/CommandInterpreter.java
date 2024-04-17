package org.generation.italy.adventureGame.model;

public class CommandInterpreter {
    private Player p;

    public CommandInterpreter(Player p){
        this.p = p;
    }

    public Command commandFor(String input){
        return switch (input) {
            case "n", "s", "w", "e" -> new MoveCommand(p, Cardinal.directionFor(input));
            default -> new NoCommand(input);
        }
    }

}

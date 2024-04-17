package org.generation.italy.adventureGame.model;

public class NoCommand implements Command{
    private String command;

    public NoCommand(String command){
        this.command = command;
    }

    @Override
    public String execute() {
        return String.format("Il comando %s non esiste", command);
    }

}

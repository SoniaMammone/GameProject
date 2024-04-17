package org.generation.italy.adventureGame.model;

public class World {

    private Room start;
    private MemoryRoomRepository roomRepo;
    private Player player;
    private UserInterface ui;
    private Command interpreter;

    public World(){
        this.roomRepo = new MemoryRoomRepository();
        this.start = roomRepo.getStartRoom();
        this.player = new Player("Dink SmallWood", start, new Item (10, "Straccio", "Un vecchio pezzo di tela che possiamo usare per vestirci",
        0.4, 0));
        this.interpreter = new CommandInterpreter(player);
    }

    private void  start(){
        while(true){
            ui.showMessage(player.getActualRoom().toString());
            ui.showMessage(player.getActualRoom().getRoomContent());
            ui.showPrompt();
            String c = ui.readCommand();
            if("exit".equals(c)){
                break;
            }
            Command command = interpreter.commandFor(c);
            String result = command.execute();
            ui.showMessage(result);  
        }
        

        System.out.println("Fine gioco");
    }

}

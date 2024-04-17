package org.generation.italy.adventureGame.model;

import java.util.HashMap;
import java.util.Map;

public class MemoryRoomRepository {
    
    private static Map <Integer, Room> roomMap = new HashMap<>();
    
    static{

        Room marketPlace = new Room(1, "Piazza del Mercato", "Sei nella piazza centrale dove si svolge un mercato molto vivace",
        new Item (1, "Tozzo di pane", "Un pezzo di pane mezzo secco", 0.1, 0),
        new Item (1, "Bastone", "Bastone di legno", 0.3, 0));
        Room park = new Room(2,"Parco", "Sei nel parco, un'area tranquilla piena di uccellini che cinguettano", 
        new Item(3, "Topo morto", "Un roditore morto da tempo", 0.2, 0));
        Room bakery = new Room(3,"Panetteria", "Un profumo di baguette ti accoglie nella panetteria più chic della città", 
        new Item (4, "Baguette", "Una fragrante baguette appena sfornata", 0.5, 1));
        Room bookShop = new Room(4,"Libreria", "Luogo di incontro di tutti i sapienti della città",
        new Item (5, "New java", "LIbro di programmazione di java", 2, 2));
        Room restaurnt = new Room(5,"Ristorante", "Un lussuoso ristorante per i nobili della città",
        new Item ("Carbonara", "Un bel piatto della cucina tradizionale", ));
        Room museum = new Room(6,);
        Room arena = new Room(7, "Arena");

        roomMap.put(marketPlace.getId(), marketPlace);
        roomMap.put(1, marketPlace);

        marketPlace.connect(park, Cardinal.SOUTH);
        marketPlace.connect(bookShop, Cardinal.NORTH);
        marketPlace.connect(restaurnt, Cardinal.EAST);
        marketPlace.connect(museum, Cardinal.WEST);

        museum.connect(arena, Cardinal.WEST);

        park.connect(bakery, Cardinal.EAST);

    }

    public Room getStartRoom(){
        return roomMap.get(1);
    }




}

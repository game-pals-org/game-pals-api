package org.gamepals.gamepalsapi.annoucment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnocumentRepository {
    List<Annoucment> allAnnoucment = new ArrayList<>(
            Arrays.asList(new Annoucment("nick1","LOL","discord1","..."),
                    new Annoucment("nick2","WOT","discord2","info"),
                    new Annoucment("nick3","BFV","discord3","info"),
                    new Annoucment("nick4","CSGO","discord4","info"),
                    new Annoucment("nick5","DOTA","discord5","info"))
    );


}

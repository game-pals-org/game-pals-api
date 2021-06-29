package org.gamepals.gamepalsapi.annoucment;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class AnnocumentService {

    AnnocumentRepository annocumentRepository = new AnnocumentRepository();



    public List<Annoucment> getAllAnnoucments(){
        return annocumentRepository.allAnnoucment;
    }



}

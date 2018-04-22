package com.dex.services;

import com.dex.model.OpisPromene;

import java.util.List;

public interface OpisPromeneService {
    List<OpisPromene> vratiListuOpisaPromena();
    OpisPromene vratiOpisPromenePoId(Long l);
    void kreirajNovi(OpisPromene opisPromene);
    void izmeniOpisPromene(Long id, OpisPromene opisPromene);
    void obrisiPoId(Long izZaBrisanje);
}

package com.dex.services;

import com.dex.model.KontniOkvir;
import java.util.List;


public interface KontniOkvirService {
    List<KontniOkvir> vratiListuKontnihOkvira();
    KontniOkvir vratiKontniOkvirPoId(Long l);
    void kreirajNoviKO(KontniOkvir kontniOkvir);
    void izmeniKontniOkvir(Long id, KontniOkvir kontniOkvir);
    void obrisiPoId(Long izZaBrisanje);
}

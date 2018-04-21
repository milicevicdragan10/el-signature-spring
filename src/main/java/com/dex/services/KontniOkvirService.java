package com.dex.services;

import com.dex.model.KontniOkvir;
import java.util.List;


public interface KontniOkvirService {
    List<KontniOkvir> vratiListuKontnihOkvira();

    void deleteById(Long idToDelete);

    KontniOkvir findById(Long l);
}

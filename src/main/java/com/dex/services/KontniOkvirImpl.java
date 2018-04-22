package com.dex.services;

import com.dex.model.KontniOkvir;
import com.dex.repositories.KontniOkvirRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KontniOkvirImpl implements KontniOkvirService {

    private final KontniOkvirRepository kontniOkvirRepository;

    public KontniOkvirImpl(KontniOkvirRepository kontniOkvirRepository) {
        this.kontniOkvirRepository = kontniOkvirRepository;
    }

    @Override
    public List<KontniOkvir> vratiListuKontnihOkvira() {
        return kontniOkvirRepository.findAll();
    }

    @Override
    public KontniOkvir vratiKontniOkvirPoId(Long l) {
        return null;
    }

    @Override
    public void kreirajNoviKO(KontniOkvir kontniOkvir) {
        kontniOkvirRepository.save(kontniOkvir);
    }

    @Override
    public void izmeniKontniOkvir(Long id, KontniOkvir kontniOkvir) {

    }

    @Override
    public void obrisiPoId(Long izZaBrisanje) {

    }
}


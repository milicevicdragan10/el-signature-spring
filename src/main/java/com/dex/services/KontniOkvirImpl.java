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
    public void deleteById(Long idToDelete) {

    }

    @Override
    public KontniOkvir findById(Long l) {
        return null;
    }
}


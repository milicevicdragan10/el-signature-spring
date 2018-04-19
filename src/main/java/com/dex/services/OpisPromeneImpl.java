package com.dex.services;

import com.dex.model.OpisPromene;
import com.dex.repositories.OpisPromeneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OpisPromeneImpl implements OpisPromeneService {

    private final OpisPromeneRepository opisPromeneRepository;

    public OpisPromeneImpl(OpisPromeneRepository opisPromeneRepository) {
        this.opisPromeneRepository = opisPromeneRepository;
    }

    @Override
    public List<OpisPromene> vratiListuOpisaPromena() {
        return opisPromeneRepository.findAll();
    }
}

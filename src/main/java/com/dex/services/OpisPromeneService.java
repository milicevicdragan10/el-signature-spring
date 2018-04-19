package com.dex.services;

import com.dex.model.OpisPromene;

import java.util.List;

public interface OpisPromeneService {
    List<OpisPromene> vratiListuOpisaPromena();

    void deleteById(Long idToDelete);
}

package com.ppc.core.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ppc.core.repository.RetoRepository;

@Service
public class RetoService implements RetoServiceInterface {

    @Autowired
    RetoRepository retoRepository;

    @Override
    public String get() {
        return retoRepository.get();
    }

}

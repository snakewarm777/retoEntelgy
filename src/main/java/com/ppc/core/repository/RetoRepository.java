package com.ppc.core.repository;

import org.springframework.stereotype.Repository;

@Repository
public class RetoRepository implements RetoRepositoryInterface {
    @Override
    public String get() {
        return "Entelgy el mejor";
    }
}

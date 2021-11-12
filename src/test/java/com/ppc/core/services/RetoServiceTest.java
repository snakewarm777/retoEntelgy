package com.ppc.core.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ppc.core.services.RetoService;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class RetoServiceTest {

    @Autowired
    RetoService retoService;

    @DisplayName("Primera prueba unitaria")
    @Test
    void testGet() {
        assertEquals("Entelgy el mejor", retoService.get());
    }

}
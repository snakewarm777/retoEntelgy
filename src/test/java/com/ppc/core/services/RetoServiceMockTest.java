package com.ppc.core.services;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ppc.core.repository.RetoRepository;
import com.ppc.core.services.RetoService;
import com.ppc.core.services.RetoServiceInterface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
public class RetoServiceMockTest {

    @Mock
    private RetoRepository retoRepository;

    
    @InjectMocks
    private RetoServiceInterface retoService = new RetoService();

    @BeforeEach
    void setMockOutput() {
        //
        when(retoRepository.get()).thenReturn("Entelgy el mejor en lo mejor");
    }

    @DisplayName("Probando retoService + retoRepository")
    @Test
    void testGet() {
        assertEquals("Entelgy el mejor en lo mejor", retoService.get());
    }

}
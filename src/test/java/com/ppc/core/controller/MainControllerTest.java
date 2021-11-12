package com.ppc.core.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.ppc.bean.UserResponse;
import com.ppc.bean.UserResponseDetail;

import java.net.URL;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class MainControllerTest {

    
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void chkDatosUsuarios() throws Exception {

        ResponseEntity<UserResponse> response = restTemplate.postForEntity(new URL("http://localhost:" + port + "/getData").toString(),null, UserResponse.class);
        //total de registros
        int gg=response.getBody().getData().size();
        assertEquals(6, response.getBody().getData().size());
        // comparando datos
        assertEquals("charles.morris@reqres.in", response.getBody().getData().get(4).getEmail());
	    assertEquals("Morris", response.getBody().getData().get(4).getLast_name());
	     
        
        
    }

}

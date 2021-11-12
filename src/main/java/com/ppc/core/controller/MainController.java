package com.ppc.core.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.ppc.bean.UserDetail;
import com.ppc.bean.UserResponse;
import com.ppc.bean.UserResponseDetail;
import com.ppc.bean.Users;



@Controller
public class MainController {

	 @Value("${urltest}")
	 private String urltest;
	
	 @Autowired
	 RestTemplate restTemplate;
	 
	 @Autowired
	 UserResponse userResponse;	
	
    @ResponseBody
    @PostMapping("/getData")
    public ResponseEntity<UserResponse>  postData() {
    	
		try {
			HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.add("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
            ResponseEntity<Users> responses = restTemplate.exchange(urltest, HttpMethod.GET,entity,Users.class);
            
            for (UserDetail userDetail : responses.getBody().getData()) {
            	userResponse.getData().add(new UserResponseDetail(userDetail.getId(),userDetail.getLast_name(),userDetail.getEmail()));
            	
			}
            
		}catch (Exception ex) {
			  System.out.println(ex.getMessage());
			  return new ResponseEntity<>(userResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
        
    }

}

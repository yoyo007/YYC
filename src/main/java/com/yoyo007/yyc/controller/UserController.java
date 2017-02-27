package com.yoyo007.yyc.controller;

import com.yoyo007.yyc.model.User;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author derrek
 */
@RestController
public class UserController {
    
    @RequestMapping(value="/user/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        System.out.println("test get user");
        ResponseEntity<Object> response;
        Map<String, Object> message = new HashMap<>();
        //get requested data
        //test data
        User user = new User();
        user.setFirstName("test");
        user.setLastName("Testing");
        user.setMiddleInitial("T");
        response = new ResponseEntity<>(user, HttpStatus.OK);
        return response;
    }

}

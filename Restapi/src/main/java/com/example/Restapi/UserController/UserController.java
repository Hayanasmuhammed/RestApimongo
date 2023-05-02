package com.example.Restapi.UserController;


import java.util.List;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Restapi.Model.User;
import com.example.Restapi.UserReq.UserReq;
import com.example.Restapi.UserService.UserService;
  
@RestController
public class UserController {
      
    @Autowired 
    private UserService userService;
      
   
    @PostMapping("/addUser")
    public String addUser(@RequestBody UserReq user) {
    	
    	userService.add(user);
    	return "added";
        
    }
      
   
    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userService.disp(); 
    }
    @DeleteMapping("/{userId}")
    public String delUser(@PathVariable String userId) {
    	userService.del(userId);
    	return "deleted";
    	
    }
    @PutMapping("/addUser/{userId}")
    public String updateUser(@RequestBody UserReq user,@PathVariable String userId) {
    	
    	userService.update(userId,user);
    	return "added";
        
    }
}

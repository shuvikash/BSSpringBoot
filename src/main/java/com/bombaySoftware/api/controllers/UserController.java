package com.bombaySoftware.api.controllers;
import com.bombaySoftware.api.repositories.UserRepository;
import com.bombaySoftware.api.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    @RequestMapping(method=RequestMethod.GET , path="/users")
    @CrossOrigin(origins = "http://localhost:8080")
    public Iterable getUser()
    {
        return repository.findAll();

    }
   @RequestMapping(method=RequestMethod.POST , path="/users")
   @CrossOrigin(origins = "http://localhost:8080")
    public String postUser(@RequestBody User user){
       repository.save(user);
       return "inserted";
    }

}
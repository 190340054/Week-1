package com.dbconnect.connectdb.resource;

import com.dbconnect.connectdb.model.Users;
import com.dbconnect.connectdb.respository.Userrespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class Userresource {

    @Autowired
    Userrespository userrespository;

    @GetMapping(value ="/all")
    public List<Users> getAll(){
        return userrespository.findAll();
    }

    @PostMapping(value ="/load}")
    public List<Users> persist(@RequestBody final Users users){
        userrespository.save(users);
        return userrespository.findAll();
    }
}

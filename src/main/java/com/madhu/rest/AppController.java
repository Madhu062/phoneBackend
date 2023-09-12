package com.madhu.rest;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {

    private UserServiceImpl userService;
    
    
    @Autowired
    public AppController(UserServiceImpl userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<User> getAll() {
    return userService.getAll();
    }
//    public User getUser(@RequestParam Integer id){
//        Optional<User> user = userService.getUser(id);
//        return (User) user.orElse(null);
//    }
    
    
}

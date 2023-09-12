package com.madhu.rest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList;

    public UserServiceImpl() {
        userList = new ArrayList<>();

        User user1 = new User(1,"Ida", 32, "ida@mail.com");
        User user2 = new User(2,"Hans", 26, "hans@mail.com");
        User user3 = new User(3,"Lars", 45, "lars@mail.com");
        User user4 = new User(4,"Ben", 32, "ben@mail.com");
        User user5 = new User(5,"Eva", 59, "eva@mail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for (User user: userList) {
            if(id == user.getId()){
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
    
    public List<User> getAll() {
    	return userList;
    }
}

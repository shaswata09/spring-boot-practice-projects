package com.leonardo.example.restfulwebservices.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {
    private static final List<User> users = new ArrayList<>();
    private static int userCount = 3;

    static {
        users.add(new User(1, "Adam", new Date()));
        users.add(new User(2, "Eve", new Date()));
        users.add(new User(3, "Jack", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User saveUser(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public User deleteUserByID (int id) {
        User deletableUser = null;
        for (User user : users) {
            if (user.getId() == id) {
                deletableUser = user;
                break;
            }
        }
        if(null != deletableUser){
            users.remove(deletableUser);
            return deletableUser;
        } else {
            return null;
        }
    }
}

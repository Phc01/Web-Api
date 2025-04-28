package com.web.api.repository;

import com.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void save(User user) {
        if (user.getId()==null){
            System.out.println("Save");
        } else {
            System.out.println("Update");
        }
        System.out.println(user);
    }

    public List<User> findAll() {
        List<User> user = new ArrayList<>();
        user.add(new User("pedro", "123123123"));
        user.add(new User("ordep", "098098098"));
        return user;
    }

    public User findByUsername(String username) {
        System.out.println("Find/username");
        return new User("pedro", "123123123");
    }

    public User findById(Integer id) {
        System.out.println("Find/id");
        return new User("pedro", "123123123");
    }

    public void deleteById(Integer id) {
        System.out.println("Delete/id");
        System.out.println(id);
    }


}

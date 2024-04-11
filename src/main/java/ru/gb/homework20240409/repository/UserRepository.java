package ru.gb.homework20240409.repository;


import org.springframework.stereotype.Repository;
import ru.gb.homework20240409.model.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    public void addUser(User user)
    {
        users.add(user);
    }

    public List<User> getUsers()
    {
        return users;
    }

}

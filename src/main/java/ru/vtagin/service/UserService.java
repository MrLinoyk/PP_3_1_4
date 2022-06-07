package ru.vtagin.service;

import ru.vtagin.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll ();
    User getById(long id);
    void save(User user);
    void deleteById(long id);
    User findByUsername(String username);
    void addDefaultUser();
    void update(User user);
    User passwordCoder(User user);
}

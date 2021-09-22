package rybakov.locality.service.Service;

import rybakov.locality.service.Entity.User;

import java.util.List;

public interface UserSerivce {
    boolean create(User user);
    User getById(int id);
    void update(User user);
    void delete(int id);
    List<User> getAll();
    User getByUsername(String username);
}

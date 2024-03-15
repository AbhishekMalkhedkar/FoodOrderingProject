package com.fop.dao;

import com.fop.models.User;

public interface UserDAO {

    void addUser(User user);
    User getUser(int id);
    void updateUser(User user);


}

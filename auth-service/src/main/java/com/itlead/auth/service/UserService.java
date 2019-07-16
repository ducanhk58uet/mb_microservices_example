package com.itlead.auth.service;


import com.itlead.auth.domain.User;

public interface UserService {

    /**
     * To create new user
     * @param user
     */
    void create(User user);

}

package com.example.test2mvp.repo;

import com.example.test2mvp.model.User;

public interface LoginRepository {
    User getUser();
    void saveUser(User user);
}

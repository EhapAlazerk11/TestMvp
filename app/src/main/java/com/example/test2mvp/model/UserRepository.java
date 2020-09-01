package com.example.test2mvp.model;

import com.example.test2mvp.repo.LoginRepository;

public class UserRepository implements LoginRepository {

    private User user ;
    @Override
    public User getUser() {
        if (user == null){
            User user = new User("Ehap" ,"Alazerk");
            user.setId(0);
            return user ;
        }else {
            return user ;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null){
            user = getUser();
        }
        this.user = user ;
    }


}

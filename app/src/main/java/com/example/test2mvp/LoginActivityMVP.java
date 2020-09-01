package com.example.test2mvp;

import com.example.test2mvp.model.User;

public interface LoginActivityMVP {
    interface View{
        String getFirstName() ;
        String getLastName();
        void setFirstName(String firstName);
        void setLastName(String lastName);
        void showInputError();
        void showUserSavedMessage();
    }
   interface  Presenter{
        void setView(View view);
        void loginButtonClicked();
        void getCurrentUser();
    }

    interface  Model{
        void createUser(String name, String lastName);
        User getUser();
    }

}

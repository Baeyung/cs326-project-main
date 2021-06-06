package com.example.cs326_project.Models;

import com.google.firebase.auth.FirebaseUser;
import com.stfalcon.chatkit.commons.models.IUser;

public class Author implements IUser {

    /*...*/
    private String id;
    private String name;
    private String avatar;

    public Author(String id, String name, String avatar) {
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAvatar() {
        return avatar;
    }

    public static Author author(FirebaseUser firebaseUser){
        Author user = new Author(firebaseUser.getUid(),firebaseUser.getDisplayName(),"");
        return user;
    }
}
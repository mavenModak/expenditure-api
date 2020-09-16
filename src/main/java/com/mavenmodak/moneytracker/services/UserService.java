package com.mavenmodak.moneytracker.services;

import com.mavenmodak.moneytracker.exceptions.MtAuthException;
import com.mavenmodak.moneytracker.model.User;

public interface UserService {


    User validateUser(String email, String password) throws MtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws MtAuthException;
}

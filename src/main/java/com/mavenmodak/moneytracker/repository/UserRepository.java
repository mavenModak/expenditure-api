package com.mavenmodak.moneytracker.repository;

import com.mavenmodak.moneytracker.exceptions.MtAuthException;
import com.mavenmodak.moneytracker.model.User;

public interface UserRepository {


    Integer create(String firstName, String lastName, String email, String password) throws MtAuthException;

    User findByEmailAndPassword(String email, String password) throws MtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);


}



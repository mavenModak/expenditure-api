package com.mavenmodak.moneytracker.repository;

import com.mavenmodak.moneytracker.exceptions.MtBadRequestException;
import com.mavenmodak.moneytracker.exceptions.MtResourceNotFoundException;
import com.mavenmodak.moneytracker.model.Transaction;

import java.util.List;

public interface TransactionRepository {

    List<Transaction> findAll(Integer userId, Integer categoryId);

    Transaction findById(Integer userId, Integer categoryId, Integer transactionId) throws MtResourceNotFoundException;

    Integer create(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws MtBadRequestException;

    void update(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws MtBadRequestException;

    void removeById(Integer userId, Integer categoryId, Integer transactionId) throws MtResourceNotFoundException;
}

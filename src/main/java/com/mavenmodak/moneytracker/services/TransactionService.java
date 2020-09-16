package com.mavenmodak.moneytracker.services;

import com.mavenmodak.moneytracker.exceptions.MtBadRequestException;
import com.mavenmodak.moneytracker.exceptions.MtResourceNotFoundException;
import com.mavenmodak.moneytracker.model.Transaction;

import java.util.List;

public interface TransactionService {


    List<Transaction> fetchAllTransactions(Integer userId, Integer categoryId);

    Transaction fetchTransactionById(Integer userId, Integer categoryId, Integer transactionId) throws MtResourceNotFoundException;

    Transaction addTransaction(Integer userId, Integer categoryId, Double amount, String note, Long transactionDate) throws MtBadRequestException;

    void updateTransaction(Integer userId, Integer categoryId, Integer transactionId, Transaction transaction) throws MtBadRequestException;

    void removeTransaction(Integer userId, Integer categoryId, Integer transactionId) throws MtResourceNotFoundException;
}

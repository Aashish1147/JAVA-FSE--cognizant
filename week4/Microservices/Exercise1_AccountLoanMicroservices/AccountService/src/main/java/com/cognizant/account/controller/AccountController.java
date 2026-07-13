package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
@RequestMapping("/account")
public class AccountController {
    @GetMapping
    public Account getAccount() {
        return new Account("SB1001", "Savings", 5000.0);
    }
}
package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;

@RestController
public class LoanController {

    @GetMapping("/loan")
    public Loan getLoan() {

        return new Loan(
                "LN1001",
                "Home Loan",
                2500000.00
        );
    }
}
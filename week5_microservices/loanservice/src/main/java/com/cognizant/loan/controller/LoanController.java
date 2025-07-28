
package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    @GetMapping("/loan/message")
    public String getLoanMessage() {
        return "Hello from Loan Service!";
    }
}

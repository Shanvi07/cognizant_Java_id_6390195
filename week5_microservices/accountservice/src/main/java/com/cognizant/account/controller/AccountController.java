
package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping
    public List<Map<String, Object>> getAllAccounts() {
        return List.of(
                Map.of("accountId", 101, "accountHolder", "Shanvi Pandey", "balance", 5000),
                Map.of("accountId", 102, "accountHolder", "Poonam singh", "balance", 7200)
        );
    }
}

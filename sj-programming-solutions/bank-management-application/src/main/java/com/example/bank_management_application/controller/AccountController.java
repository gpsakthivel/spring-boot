package com.example.bank_management_application.controller;

import com.example.bank_management_application.entity.Account;
import com.example.bank_management_application.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService service;
    
    // Create the account
    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account createAccount = service.createAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(createAccount);
    }

    @GetMapping("/{accountNumber}")
    public Account getAccountByAccountNumber(@PathVariable Long accountNumber) {
        Account account = service.getAccountDetailsByAccountNumber(accountNumber);
        return account;
    }

    @GetMapping("/getallaccounts")
    public List<Account> getAllAccountDetails() {
        List<Account> allAccountDetails = service.getAllAccountDetails();
        return allAccountDetails;
    }

    @PutMapping("/deposit/{accountNumber}/{amount}")
    public Account depositAccount(@PathVariable Long accountNumber,
                                  @PathVariable Double amount) {
        Account account = service.depositAmount(accountNumber, amount);
        return account;
    }

    @PutMapping("/withdraw/{accountNumber}/{amount}")
    public Account withdrawAccount(@PathVariable Long accountNumber,
                                  @PathVariable Double amount) {
        Account account = service.withdrawAmount(accountNumber, amount);
        return account;
    }

    @DeleteMapping("/delete/{accountNumber}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long accountNumber) {
        service.closeAccount(accountNumber);
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Account Closed");
        return ResponseEntity.ok("Account Closed");

    }
}

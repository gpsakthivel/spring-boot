package com.example.bank_management_application.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long account_number;
    @Column
    private String account_holder_name;
    @Column
    private Double account_balance;

    public Account() {
    }

    public Account(String account_holder_name, Double account_balance) {
        super();
        this.account_holder_name = account_holder_name;
        this.account_balance = account_balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_number=" + account_number +
                ", account_holder_name='" + account_holder_name + '\'' +
                ", account_balance=" + account_balance +
                '}';
    }
}

package io.gps.migration.banking_app.mapper;

import io.gps.migration.banking_app.dto.AccountDto;
import io.gps.migration.banking_app.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
//        Account account = new Account(
//                accountDto.getId(),
//                accountDto.getAccountHolderName(),
//                accountDto.getBalance()
//        );

        // For Record
        Account account = new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}

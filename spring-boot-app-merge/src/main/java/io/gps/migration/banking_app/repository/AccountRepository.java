package io.gps.migration.banking_app.repository;

import io.gps.migration.banking_app.entity.Account;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}

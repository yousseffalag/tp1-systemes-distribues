package com.falag.youssef.tp1implementationmicroservice.repositories;

import com.falag.youssef.tp1implementationmicroservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Youssef Falag
 * @created 22/09/2026
 * @time 00:18
 */
public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {

}

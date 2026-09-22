package com.falag.youssef.tp1implementationmicroservice.repositories;

import com.falag.youssef.tp1implementationmicroservice.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

/**
 * @author Youssef Falag
 * @created 22/09/2026
 * @time 00:18
 */
@RepositoryRestResource
public interface BankAccountRepository extends JpaRepository<BankAccount, UUID> {

}

package com.falag.youssef.tp1implementationmicroservice.service;

import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountResponseDTO;

import java.util.UUID;



public interface BankAccountService {

    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);

    public BankAccountResponseDTO updateAccount(UUID id,BankAccountRequestDTO bankAccountDTO);
}

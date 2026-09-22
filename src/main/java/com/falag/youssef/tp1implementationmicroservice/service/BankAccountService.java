package com.falag.youssef.tp1implementationmicroservice.service;

import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountResponseDTO;


/**
 * @author Youssef Falag
 * @created 22/09/2026
 * @time 12:57
 */
public interface BankAccountService {

    public BankAccountResponseDTO addAcount(BankAccountRequestDTO bankAccountDTO);
}

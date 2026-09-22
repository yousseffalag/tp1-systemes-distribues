package com.falag.youssef.tp1implementationmicroservice.service;

import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountResponseDTO;
import com.falag.youssef.tp1implementationmicroservice.entities.BankAccount;
import com.falag.youssef.tp1implementationmicroservice.mapper.BankAccountMapper;
import com.falag.youssef.tp1implementationmicroservice.repositories.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

/**
 * @author Youssef Falag
 * @created 22/09/2026
 * @time 13:04
 */

@Service
@Transactional
@RequiredArgsConstructor
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountMapper bankAccountMapper;

    @Override
    public BankAccountResponseDTO addAcount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=bankAccountMapper.toEntity(bankAccountDTO);
        bankAccount.setCreatedAt(LocalDate.now());
        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);

        return bankAccountMapper.toResponseDTO(savedBankAccount);
    }
}

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
import java.util.UUID;



@Service
@Transactional
@RequiredArgsConstructor
public class BankAccountServiceImpl implements BankAccountService {

    private final BankAccountRepository bankAccountRepository;
    private final BankAccountMapper bankAccountMapper;

    @Override
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=bankAccountMapper.toEntity(bankAccountDTO);
        bankAccount.setCreatedAt(LocalDate.now());
        BankAccount savedBankAccount = bankAccountRepository.save(bankAccount);

        return bankAccountMapper.toResponseDTO(savedBankAccount);
    }

    @Override
    public BankAccountResponseDTO updateAccount(UUID id, BankAccountRequestDTO bankAccountDTO) {
        BankAccount bankAccount=bankAccountRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("BankAccount %s not found",id)));
        bankAccountMapper.updateEntity(bankAccountDTO,bankAccount);
        return bankAccountMapper.toResponseDTO(bankAccountRepository.save(bankAccount));
    }


}

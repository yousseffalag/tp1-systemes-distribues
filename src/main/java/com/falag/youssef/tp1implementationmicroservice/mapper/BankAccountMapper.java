package com.falag.youssef.tp1implementationmicroservice.mapper;

import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountRequestDTO;
import com.falag.youssef.tp1implementationmicroservice.dtos.BankAccountResponseDTO;
import com.falag.youssef.tp1implementationmicroservice.entities.BankAccount;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

import java.lang.annotation.Target;

/**
 * @author Youssef Falag
 * @created 22/09/2026
 * @time 13:13
 */

@Mapper(componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BankAccountMapper {
    BankAccount toEntity(BankAccountRequestDTO bankAccountRequestDTO);
    BankAccountResponseDTO toResponseDTO(BankAccount bankAccount);
    void updateEntity(BankAccountRequestDTO bankAccountRequestDTO,@MappingTarget BankAccount bankAccount);
}

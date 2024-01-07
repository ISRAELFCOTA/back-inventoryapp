package com.example.springboot.dtos;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;
import java.sql.Date;

public record ProductRecordDto(
        @NotBlank String name,
        @NotBlank String code,
        @NotNull Date dateVal,
        @NotNull Date dateRegister,
        @Positive @NotNull BigDecimal value,
        @Positive @NotNull Integer amount
        ) {
}


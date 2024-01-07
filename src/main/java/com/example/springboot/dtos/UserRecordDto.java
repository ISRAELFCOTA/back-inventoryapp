package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;

public record UserRecordDto(@NotBlank String nameUser, @NotBlank String email, @NotBlank String password, @NotBlank String tell) {
}

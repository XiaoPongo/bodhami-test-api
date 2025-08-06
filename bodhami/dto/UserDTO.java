package com.bodhami.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDTO {

    @NotBlank(message = "Name is required")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Minimum age is 18")
    @Max(value = 100, message = "Maximum age is 100")
    private Integer age;
}
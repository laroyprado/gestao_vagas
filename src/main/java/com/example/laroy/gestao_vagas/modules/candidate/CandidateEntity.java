package com.example.laroy.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;


@Entity
@Data
public class CandidateEntity {

    @Id
    private UUID id;
    private String name;

    @Pattern(regexp = "\\S+", message = "Username should not be empty")
    private String username;

    @Email(message = "Email should be valid")
    private String email;

    @Length(min = 10, max = 100)
    private String password;
    private String description;
    private String curriculum;

    
}


package com.example.laroy.gestao_vagas.exceptions;

public class UserFoundException extends RuntimeException {
    
        public UserFoundException( ) {
            super("User not found");
        }
    
}

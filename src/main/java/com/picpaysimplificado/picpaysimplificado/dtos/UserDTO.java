package com.picpaysimplificado.picpaysimplificado.dtos;

import com.picpaysimplificado.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO (String firstName, String email, String password , String document , String lastName , BigDecimal balance , UserType userType) {

}

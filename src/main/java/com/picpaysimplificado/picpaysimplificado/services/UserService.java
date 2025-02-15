package com.picpaysimplificado.picpaysimplificado.services;


import com.picpaysimplificado.picpaysimplificado.domain.user.User;
import com.picpaysimplificado.picpaysimplificado.domain.user.UserType;
import com.picpaysimplificado.picpaysimplificado.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender , BigDecimal amount) throws Exception{

        if(sender.getUserType() == UserType.MERCHANT)
            throw new Exception("Usuario do tipo logista nao esta autorizado a realizar transacao");

        if(sender.getBalance().compareTo(amount) < 0)
            throw new Exception("Saldo suficiente para realizar transacao");

    }

    public User findUserById(Long id) throws Exception{
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuario nao encontrado"));
    }

    public void saveUser(User user) throws Exception{
        this.repository.save(user);
    }
}

package br.com.bicko.lavanderiaonline.application.services;

import br.com.bicko.lavanderiaonline.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public User saveUser(User user){
        return repository.save(user);
    }

}

package br.com.bicko.lavanderiaonline.services;

import br.com.bicko.lavanderiaonline.persistence.domain.User;
import br.com.bicko.lavanderiaonline.persistence.repositories.UserRepository;
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

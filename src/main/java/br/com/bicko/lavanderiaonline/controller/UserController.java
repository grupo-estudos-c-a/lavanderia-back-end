package br.com.bicko.lavanderiaonline.controller;

import br.com.bicko.lavanderiaonline.controller.dto.UserRequest;
import br.com.bicko.lavanderiaonline.services.UserService;
import br.com.bicko.lavanderiaonline.persistence.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping
    public UserReponse saveUser(UserRequest request) {
        User user = request.toUser();
        //logs
        return service.saveUser(user);
    }
}

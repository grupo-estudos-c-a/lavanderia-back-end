package br.com.bicko.lavanderiaonline.controller.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRequest {

    @NotBlank(message = "O nome do usário não pode estar em branco.")
    private String nameUser;

    @NotBlank(message = "O email do usuário não pode estar em branco.")
    private String userEmail;

    @NotBlank(message = "O")



}

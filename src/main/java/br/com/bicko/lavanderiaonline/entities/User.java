package br.com.bicko.lavanderiaonline.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Builder
@Table(name = "usuario")
@RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Integer id;

    @JoinColumn(name = "cpf_usuario")
    private String CPF;

    @Column(name = "login_usuario", nullable = false)
    private String login;

    @Column(name = "senha_usuario", nullable = false)
    private String password;
    @Column(name = "nome_usuario", nullable = false)
    private String nameUser;

    @Column(name = "cep_usuario", nullable = false)
    private String CEP;

    @Column(name = "numero_endereco", nullable = false)
    private String number;

    @Column(name = "telefone_usuario", nullable = false)
    private String phone;
    @Column(name = "data_nascimento", nullable = false)
    private Date dateOfBirth;
    @Column(name = "is_funcionario", nullable = false)
    private Boolean isEmployee;

}

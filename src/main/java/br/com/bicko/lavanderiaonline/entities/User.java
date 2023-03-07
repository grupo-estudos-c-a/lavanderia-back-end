package br.com.bicko.lavanderiaonline.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
    private LocalDateTime nameUser;

    @Column(name = "cep_usuario", nullable = false)
    private LocalDate CEP;

    @Column(name = "numero_endereco", nullable = false)
    private String number;

    @Column(name = "telefone_usuario", nullable = false)
    private String phone;
    @Column(name = "data_nascimento", nullable = false)
    private Date dateOfBirth;
    @Column(name = "is_funcionario")
    private Boolean employee;

}

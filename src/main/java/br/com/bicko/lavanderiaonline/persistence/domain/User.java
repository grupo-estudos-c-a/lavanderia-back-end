package br.com.bicko.lavanderiaonline.persistence.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario", schema = "${database.name}")
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
    private String userName;
    @Column(name = "telefone_usuario", nullable = false)
    private String phoneNumber;

    @Column(name = "data_nascimento", nullable = false)
    private Date birthDate;

    @Column(name = "is_funcionario", nullable = false)
    private Boolean isEmployee;
    @OneToOne
    @JoinColumn(name = "id_endereco", nullable = false)
    private Address address;
}

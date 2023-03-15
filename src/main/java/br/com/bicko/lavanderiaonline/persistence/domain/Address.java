package br.com.bicko.lavanderiaonline.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "endereco_usuario", schema = "${database.name}")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "rua", nullable = false)
    private String street;
    @Column(name = "numero", nullable = false)
    private Integer number;
    @Column(name = "bairro", nullable = false)
    private String district;
    @Column (name = "cidade", nullable = false)
    private String city;
    @Column(name = "estado", nullable = false)
    private String state;
    @Column(name = "pais", nullable = false)
    private String country;
    @Column(name = "complemento", nullable = false)
    private String complement;
    @OneToOne(mappedBy = "address")
    private User user;
}

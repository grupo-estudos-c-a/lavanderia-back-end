package br.com.bicko.lavanderiaonline.persistence.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roupa", schema = "${database.name}")
public class Outfit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_roupa", nullable = false)
    private Integer id;

    @Column(name = "nome_roupa", nullable = false)
    private String name;

    @Column(name = "preco_roupa", nullable = false)
    private BigDecimal price;

    @Column(name = "prazo_roupa", nullable = false)
    private LocalTime deliveryTime;
}

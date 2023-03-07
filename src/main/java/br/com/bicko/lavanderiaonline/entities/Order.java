package br.com.bicko.lavanderiaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedido", schema = "${database.name}")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pedido", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private User user;

    @Column(name = "valor_pedido", nullable = false)
    private BigDecimal amount;

    @Column(name = "data_pedido", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "data_pagamento")
    private LocalDate payDate;

    @Column(name = "situacao_pedido", nullable = false)
    private String status;
    
}

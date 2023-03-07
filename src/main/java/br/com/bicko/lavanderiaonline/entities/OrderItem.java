package br.com.bicko.lavanderiaonline.entities;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@Table(name = "itens_pedido")
@RequiredArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itens_pedido")
    private Integer id;

    @Column(name = "quantidade", nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_roupa", nullable = false)
    private Outfit outfit;

}

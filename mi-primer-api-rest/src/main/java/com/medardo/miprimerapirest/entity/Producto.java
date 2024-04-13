package com.medardo.miprimerapirest.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="producto") //cuando se levante el proyecto crea esta tabla
public class Producto {
    @ManyToOne
    @JoinColumn(name = "id_fabricante", nullable = false)
    private Maker maker;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private BigDecimal price;
}

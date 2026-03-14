package com.taller.costura.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "costurera_id")
    private Costurera costurera;
}
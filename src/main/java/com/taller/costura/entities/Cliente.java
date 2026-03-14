package com.taller.costura.entities;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToMany(mappedBy = "cliente")
    private List<Prenda> prendas;
}
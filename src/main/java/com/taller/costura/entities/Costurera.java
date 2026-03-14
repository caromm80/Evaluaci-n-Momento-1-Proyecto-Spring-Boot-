package com.taller.costura.entities;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Costurera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
}
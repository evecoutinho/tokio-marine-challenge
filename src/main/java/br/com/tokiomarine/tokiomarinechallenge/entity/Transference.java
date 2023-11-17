package br.com.tokiomarine.tokiomarinechallenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "transferences")
public class Transference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originAccount;
    private String targetAccount;
    private Double transferenceValue;
    private Double fee;
    private LocalDate transferenceDate;
    private LocalDate schedulingDate;
}

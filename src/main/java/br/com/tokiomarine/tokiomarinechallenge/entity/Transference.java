package br.com.tokiomarine.tokiomarinechallenge.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "transferences")
public class Transference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 10, max = 10)
    private String originAccount;

    @Size(min = 10, max = 10)
    private String targetAccount;

    private Double transferenceValue;

    private Double fee;

    private LocalDate transferenceDate;

    private LocalDate schedulingDate;
}

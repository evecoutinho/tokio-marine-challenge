package br.com.tokiomarine.tokiomarinechallenge.entities;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@Getter
@Setter
public class Transference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String originAccount;
    private String targetAccount;
    private BigDecimal transferenceValue;
    private BigDecimal tax;
    private LocalDate transferenceDate = LocalDate.now();
    private LocalDate schedulingDate;
}

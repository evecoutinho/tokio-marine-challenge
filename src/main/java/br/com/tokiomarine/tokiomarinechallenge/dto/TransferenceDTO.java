package br.com.tokiomarine.tokiomarinechallenge.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TransferenceDTO implements Serializable {
    private Double transferenceValue;
    private LocalDate schedulingDate;
    private LocalDate transferenceDate = LocalDate.now();
    private String originAccount;
    private String targetAccount;
}




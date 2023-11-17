package br.com.tokiomarine.tokiomarinechallenge.dto;

import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class TransferenceDTO implements Serializable {

    private Double transferenceValue;

    private LocalDate schedulingDate;

    private LocalDate transferenceDate = LocalDate.now();

    @Size(min = 10, max = 10, message = "origin account format is invalid")
    private String originAccount;

    @Size(min = 10, max = 10, message = "target account format is invalid")
    private String targetAccount;
}




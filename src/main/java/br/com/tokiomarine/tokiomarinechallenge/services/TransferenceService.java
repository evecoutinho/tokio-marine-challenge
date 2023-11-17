package br.com.tokiomarine.tokiomarinechallenge.services;

import br.com.tokiomarine.tokiomarinechallenge.entities.Transference;
import br.com.tokiomarine.tokiomarinechallenge.repositories.TransferenceRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class TransferenceService {
    private final TransferenceRepository transferenceRepository;

    public TransferenceService(TransferenceRepository transferenceRepository) {
        this.transferenceRepository = transferenceRepository;
    }

    public Transference save(Transference transference) {
        return transferenceRepository.save(transference);
    }

    public List<Transference> findAll() {
        return transferenceRepository.findAll();
    }

    public BigDecimal calculateTax(LocalDate transferenceDate) {
    //TODO Implemente a lógica para calcular a taxa com base na data de transferência
        return null;
    }
}

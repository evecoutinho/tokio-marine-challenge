package br.com.tokiomarine.tokiomarinechallenge.services;

import br.com.tokiomarine.tokiomarinechallenge.entities.Transferencia;
import br.com.tokiomarine.tokiomarinechallenge.repositories.TransferenciaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Service
public class TransferenciaService {
    private final TransferenciaRepository transferenciaRepository;

    public TransferenciaService(TransferenciaRepository transferenciaRepository) {
        this.transferenciaRepository = transferenciaRepository;
    }

    public Transferencia save(Transferencia transferencia) {
        return transferenciaRepository.save(transferencia);
    }

    public List<Transferencia> findAll() {
        return transferenciaRepository.findAll();
    }

    public BigDecimal calcularTaxa(LocalDate dataTransferencia) {
    //TODO Implemente a lógica para calcular a taxa com base na data de transferência
        return null;
    }
}

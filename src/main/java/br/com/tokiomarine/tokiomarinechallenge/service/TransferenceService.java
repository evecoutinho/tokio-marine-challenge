package br.com.tokiomarine.tokiomarinechallenge.service;

import br.com.tokiomarine.tokiomarinechallenge.dto.TransferenceDTO;
import br.com.tokiomarine.tokiomarinechallenge.entity.Transference;
import br.com.tokiomarine.tokiomarinechallenge.repository.TransferenceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TransferenceService {


    private final TransferenceRepository transferenceRepository;

    private final ModelMapper mapper;

    @Autowired
    public TransferenceService(TransferenceRepository transferenceRepository, ModelMapper mapper) {
        this.transferenceRepository = transferenceRepository;
        this.mapper = mapper;

    }

    public Transference save(Transference transference) {
        return transferenceRepository.save(transference);
    }

    public List<Transference> findAll() {
        return transferenceRepository.findAll();
    }

    public Transference calculateDaysOfTransference(TransferenceDTO transference){
        long days = ChronoUnit.DAYS.between(LocalDate.now(), transference.getSchedulingDate());
        return determineFee(days, transference);
    }

    public Transference determineFee(Long days, TransferenceDTO transferenceDTO) {
        double fixedFee;
        double percentage;

        Transference transference = mapper.map(transferenceDTO, Transference.class);

        if (days == 0) {
            fixedFee = 3.00;
            percentage = 0.025;
            transference.setFee(((transference.getTransferenceValue() + fixedFee) * percentage) - transference.getTransferenceValue());
        } else if (days <= 10) {
            fixedFee = 12.00;
            transference.setFee(fixedFee);
        } else if (days <= 20) {
            percentage = 0.082;
            applyFee(percentage, transference);
        } else if (days <= 30) {
            percentage = 0.069;
            applyFee(percentage, transference);
        } else if (days <= 40) {
            percentage = 0.047;
            applyFee(percentage, transference);
        } else if (days <= 50) {
            percentage = 0.017;
            applyFee(percentage, transference);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error, the date of schedulling is not valid");
        }
        return transference;
    }
    private void applyFee(Double percentage, Transference transference) {
        transference.setFee(transference.getTransferenceValue() * percentage);
    }
}

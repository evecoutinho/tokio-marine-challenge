package br.com.tokiomarine.tokiomarinechallenge.service;

import br.com.tokiomarine.tokiomarinechallenge.entity.Transference;
import br.com.tokiomarine.tokiomarinechallenge.repository.TransferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class TransferenceService {

    @Autowired
    private TransferenceRepository transferenceRepository;


    public Transference save(Transference transference) {
        return transferenceRepository.save(transference);
    }

    public List<Transference> findAll() {
        return transferenceRepository.findAll();
    }

    public Transference calculateDaysOfTransference(Transference transference){
        long days = ChronoUnit.DAYS.between(transference.getTransferenceDate(), transference.getSchedulingDate());
        return determineFee(days, transference);
    }

    public Transference determineFee(Long days, Transference transference) {
        double fixedFee;
        double percentage;

        if (days == 0) {
            fixedFee = 3.00;
            percentage = 0.025;
            transference.setFee((transference.getTransferenceValue() + fixedFee) * percentage);
        } else if (days <= 10) {
            fixedFee = 12.00;
            transference.setFee(transference.getTransferenceValue() + fixedFee);
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
        }
        return transference;
    }
    private void applyFee(Double percentage, Transference transference) {
        transference.setFee(transference.getTransferenceValue() * percentage);
    }
}

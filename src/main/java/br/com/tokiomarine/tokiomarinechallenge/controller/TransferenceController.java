package br.com.tokiomarine.tokiomarinechallenge.controller;

import br.com.tokiomarine.tokiomarinechallenge.dto.TransferenceDTO;
import br.com.tokiomarine.tokiomarinechallenge.entity.Transference;
import br.com.tokiomarine.tokiomarinechallenge.service.TransferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/transference")
public class TransferenceController {
    @Autowired
    private TransferenceService transferenceService;

    @PostMapping("/scheduling")
    public ResponseEntity<Transference> save(@RequestBody TransferenceDTO transferenceDTO) {
        Transference transference = transferenceService.calculateDaysOfTransference(transferenceDTO);
        transferenceService.save(transference);
        return ResponseEntity.status(HttpStatus.CREATED).body(transference);
    }

    @GetMapping("/statement")
    public List<Transference> findAll() {
        return transferenceService.findAll();
    }
}

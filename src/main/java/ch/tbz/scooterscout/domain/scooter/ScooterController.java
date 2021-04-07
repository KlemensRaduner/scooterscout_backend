package ch.tbz.scooterscout.domain.scooter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/scooters")
public class ScooterController {

    private ScooterService scooterService;

    @Autowired
    public ScooterController(ScooterService scooterService) {
        this.scooterService = scooterService;
    }

    @GetMapping("")
    @PreAuthorize("hasAuthority('SCOOTER_SEE')")
    public ResponseEntity<List<Scooter>> getAll() {
        List<Scooter> scooters = scooterService.findAll();
        return new ResponseEntity<>(scooters, HttpStatus.OK);
    }

    @GetMapping("/top10")
    @PreAuthorize("hasAuthority('SCOOTER_SEE')")
    public ResponseEntity<List<Scooter>> getTop10() {
        List<Scooter> scooters = scooterService.findTop10();
        return new ResponseEntity<>(scooters, HttpStatus.OK);
    }


}

package ch.tbz.scooterscout.domain.scooter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/scooters")
public class ScooterController {

    private ScooterService scooterService;

    @Autowired
    public ScooterController(ScooterService scooterService) {
        this.scooterService = scooterService;
    }

    @GetMapping({"", "/"})
    @PreAuthorize("hasAuthority('SCOOTER_SEE')")
    public ResponseEntity<List<Scooter>> getAll(@RequestParam(value = "brand", required = false) String brand,
                                                @RequestParam(value = "model", required = false) String model,
                                                @RequestParam(value = "price", required = false) Integer price) {

        List<Scooter> scooters = scooterService.findAll().stream()
                .filter(scooter -> (price == null || scooter.getPrice() < price))
                .filter(scooter -> (model == null || model.equals("") || scooter.getModel().getName().equals(model)))
                .filter(scooter -> (brand == null || brand.equals("") || scooter.getModel().getBrand().getName().equals(brand)))
                .collect(Collectors.toList());

        return new ResponseEntity<>(scooters, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('SCOOTER_SEE')")
    public ResponseEntity<Scooter> getById(@PathVariable String id) {
        Scooter scooter = scooterService.findById(id);
        return new ResponseEntity<>(scooter, HttpStatus.OK);
    }

    @GetMapping("/top10")
    @PreAuthorize("hasAuthority('SCOOTER_SEE')")
    public ResponseEntity<List<Scooter>> getTop10() {
        List<Scooter> scooters = scooterService.findTop10();
        return new ResponseEntity<>(scooters, HttpStatus.OK);
    }

    @GetMapping("/count")
    @PreAuthorize("hasAuthority('SCOOTER_SEE')")
    public ResponseEntity<Long> getCount() {
        long total = scooterService.getTotalCount();
        return new ResponseEntity<>(total, HttpStatus.OK);
    }

}

package ch.tbz.scooterscout.domain.scooter;

import ch.tbz.scooterscout.core.ExtendedService;

import java.util.List;

public interface ScooterService extends ExtendedService<Scooter> {

    public List<Scooter> findTop10();
}

package ch.tbz.scooterscout.domain.model;

import ch.tbz.scooterscout.core.ExtendedJpaRepository;
import ch.tbz.scooterscout.core.ExtendedServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl extends ExtendedServiceImpl<Model> implements ModelService {
    public ModelServiceImpl(ExtendedJpaRepository<Model> repository) {
        super(repository);
    }
}

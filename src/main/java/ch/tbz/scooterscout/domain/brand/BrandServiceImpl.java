package ch.tbz.scooterscout.domain.brand;

import ch.tbz.scooterscout.core.ExtendedJpaRepository;
import ch.tbz.scooterscout.core.ExtendedServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends ExtendedServiceImpl<Brand> implements BrandService{
    public BrandServiceImpl(ExtendedJpaRepository<Brand> repository) {
        super(repository);
    }
}

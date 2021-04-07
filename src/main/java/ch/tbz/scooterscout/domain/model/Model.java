package ch.tbz.scooterscout.domain.model;

import ch.tbz.scooterscout.core.ExtendedEntity;
import ch.tbz.scooterscout.domain.brand.Brand;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "model")
public class Model extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="brand_id", nullable=false)
    private Brand brand;

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }
}

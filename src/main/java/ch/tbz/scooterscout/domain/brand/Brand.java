package ch.tbz.scooterscout.domain.brand;

import ch.tbz.scooterscout.core.ExtendedEntity;
import ch.tbz.scooterscout.domain.model.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "brand")
public class Brand extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy="brand")
    private Set<Model> models;

    public String getName() {
        return name;
    }

    public Set<Model> getModels() {
        return models;
    }
}

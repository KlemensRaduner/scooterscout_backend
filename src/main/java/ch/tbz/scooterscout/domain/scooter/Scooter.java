package ch.tbz.scooterscout.domain.scooter;

import ch.tbz.scooterscout.core.ExtendedEntity;
import ch.tbz.scooterscout.domain.model.Model;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

import javax.persistence.*;

@Entity
@Table(name = "scooter")
public class Scooter extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "image", columnDefinition = "TEXT")
    private String image;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "model")
    @JsonIdentityReference(alwaysAsId = true)
    private Model model;

    public Scooter() {
    }

    public Scooter(String id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public Scooter setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Scooter setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Scooter setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getImage() {
        return image;
    }

    public Scooter setImage(String image) {
        this.image = image;
        return this;
    }
}

package ch.tbz.scooterscout.domain.scooter;

import ch.tbz.scooterscout.core.ExtendedEntity;
import ch.tbz.scooterscout.core.user.User;
import ch.tbz.scooterscout.domain.brand.Brand;
import ch.tbz.scooterscout.domain.model.Model;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "scooter")
public class Scooter extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "price")
    private double price;

    @Column(name = "image", columnDefinition = "TEXT")
    private String image;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "model_id")
    @JsonIdentityReference(alwaysAsId = true)
    private Model model;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

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

    public Model getModel() {
        return model;
    }

    public Scooter setModel(Model model) {
        this.model = model;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Scooter setUser(User user) {
        this.user = user;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public Scooter setStreet(String street) {
        this.street = street;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Scooter setCity(String city) {
        this.city = city;
        return this;
    }

    @Override public String toString() {
        return "Scooter{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", model=" + model +
                ", user=" + user +
                '}';
    }
}

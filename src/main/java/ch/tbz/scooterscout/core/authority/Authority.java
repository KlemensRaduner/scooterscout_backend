package ch.tbz.scooterscout.core.authority;

import ch.tbz.scooterscout.core.ExtendedEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "authority")
public class Authority extends ExtendedEntity {

  @Column(name = "name", nullable = false)
  private String name;

  public Authority() {
    super();
  }

  public String getName() {
    return name;
  }

  public Authority setName(String name) {
    this.name = name;
    return this;
  }
}

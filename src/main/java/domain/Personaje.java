package domain;

import persistence.PersistenceObject;

import javax.persistence.*;
import java.util.List;

@Entity
public class Personaje extends PersistenceObject {

  private String nombre;
  private int moneda;

  @OneToMany
  @JoinColumn(name="item_id")
  private List<Item> items;

  @Enumerated
  private TipoPersonaje tipo;

  public Personaje(){

  }

}
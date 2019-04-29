package models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "avtos")
public class Avto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private int id;

    @Getter @Setter private String model;

    @Getter @Setter private String color;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "creater_id")
    @Getter @Setter private Creater creater;

    public Avto() {
    }

    public Avto(String model, String color) {
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return color + " " + model;
    }
}

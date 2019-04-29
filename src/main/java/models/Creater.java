package models;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table (name = "creaters")

public class Creater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private int id;
    @Column(name = "name")
    @Getter @Setter private String name;

    @Getter @Setter private String vocation;

    @OneToMany(mappedBy = "creater", cascade = CascadeType.ALL, orphanRemoval = true)
    @Getter @Setter private List<Avto> avtos;

    public Creater() {
    }

    public Creater(String name, String vocation) {
        this.name = name;
        this.vocation = vocation;
        avtos = new ArrayList<>();
    }

    public void addAvto(Avto avto) {
        avto.setCreater(this);
        avtos.add(avto);
    }

    public void removeAvto(Avto avto) {
        avtos.remove(avto);
    }

    @Override
    public String toString() {
        return "models.User{" +
                "id=" + id +
                ", Имя (name)='" + name + '\'' +
                ", Специальность (vocation)=" + vocation +
                '}';
    }

}


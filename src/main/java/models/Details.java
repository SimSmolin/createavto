package models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "details", schema = "DBAvto", catalog = "")
public class Details {
    private int id;
    private String color;
    private Integer dimension;
    private String material;
    private Integer includedToDetails;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Basic
    @Column(name = "dimension")
    public Integer getDimension() {
        return dimension;
    }

    public void setDimension(Integer dimension) {
        this.dimension = dimension;
    }

    @Basic
    @Column(name = "material")
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Basic
    @Column(name = "included_to_details")
    public Integer getIncludedToDetails() {
        return includedToDetails;
    }

    public void setIncludedToDetails(Integer includedToDetails) {
        this.includedToDetails = includedToDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Details that = (Details) o;
        return id == that.id &&
                Objects.equals(color, that.color) &&
                Objects.equals(dimension, that.dimension) &&
                Objects.equals(material, that.material) &&
                Objects.equals(includedToDetails, that.includedToDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, color, dimension, material, includedToDetails);
    }
}

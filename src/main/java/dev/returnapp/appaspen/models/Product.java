package dev.returnapp.appaspen.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "AP_PRODUCTS")
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID codId;
    private String name;
    private String description;
    private BigDecimal price;

    public Product(UUID codId, String name, String description, BigDecimal price) {
        this.codId = codId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public UUID getCodId() {
        return codId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

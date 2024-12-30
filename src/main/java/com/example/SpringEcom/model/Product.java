package com.example.SpringEcom.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.transform.sax.SAXTransformerFactory;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

    public Product(int i) {
    }
    /* {
  "name": "Colgate Toothpaste",
  "description": "A fluoride toothpaste that helps fight cavities and freshens breath.",
  "brand": "Colgate",
  "price": 289,
  "category": "Mobile",
  "stockQuantity": 200,
  "releaseDate": "2024-04-17",
  "productAvailable": true
}*/


}

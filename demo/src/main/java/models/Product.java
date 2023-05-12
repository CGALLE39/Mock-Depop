package models;

import java.time.DateTimeException;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getFull_description() {
        return full_description;
    }

    public void setFull_description(String full_description) {
        this.full_description = full_description;
    }



    private String short_description;
    private String full_description;
    private String main_image;
    private DateTimeException created_time;
    private DateTimeException update_time;
    private Integer enabled;
    private Integer in_stock;
    private float list_PRICE;
    private float discount_percent;

    private Integer brand_id;
    private Integer category_id;
    private float length;
    private float width;
    private float weight;
    private float average_rating;
    private Integer review_count;



    public Product() {

    }
}
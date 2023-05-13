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

    public String getMain_image() {
        return main_image;
    }

    public void setMain_image(String main_image) {
        this.main_image = main_image;
    }

    public DateTimeException getCreated_time() {
        return created_time;
    }

    public void setCreated_time(DateTimeException created_time) {
        this.created_time = created_time;
    }

    public DateTimeException getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(DateTimeException update_time) {
        this.update_time = update_time;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getIn_stock() {
        return in_stock;
    }

    public void setIn_stock(Integer in_stock) {
        this.in_stock = in_stock;
    }

    public float getList_PRICE() {
        return list_PRICE;
    }

    public void setList_PRICE(float list_PRICE) {
        this.list_PRICE = list_PRICE;
    }


    public float getDiscount_percent() {
        return discount_percent;
    }

    public void setDiscount_percent(float discount_percent) {
        this.discount_percent = discount_percent;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }


    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(float average_rating) {
        this.average_rating = average_rating;
    }

    public Integer getReview_count() {
        return review_count;
    }

    public void setReview_count(Integer review_count) {
        this.review_count = review_count;
    }


    public Product(Integer id) {
        this.id = id;
    }

    public Product() {

    }
}
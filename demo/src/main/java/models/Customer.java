package models;

import java.sql.Timestamp;
import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer(Integer id) {
        this.id = id;
    }

    private String email;
    private String password;

    private String first_name;
    private String last_name;
    private String address_Line;
    private String address_Line2;
    private String city;
    private String state;
    private Integer country_id;
    private Timestamp created_time;
    private String postal_code;
    private String verification_code;
    private String reset_password_token;
    private String auth_provider;
    private Integer enabled;

    public Customer(String auth_provider) {
        this.auth_provider = auth_provider;
    }


    public Customer(){

    }

    public String getPassword() {
        return password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getAddress_Line() {
        return address_Line;
    }

    public void setAddress_Line(String address_Line) {
        this.address_Line = address_Line;
    }

    public String getAddress_Line2() {
        return address_Line2;
    }

    public void setAddress_Line2(String address_Line2) {
        this.address_Line2 = address_Line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public Timestamp getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Timestamp created_time) {
        this.created_time = created_time;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(String verification_code) {
        this.verification_code = verification_code;
    }

    public String getReset_password_token() {
        return reset_password_token;
    }

    public void setReset_password_token(String reset_password_token) {
        this.reset_password_token = reset_password_token;
    }

    public String getAuth_provider() {
        return auth_provider;
    }

    public void setAuth_provider(String auth_provider) {
        this.auth_provider = auth_provider;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
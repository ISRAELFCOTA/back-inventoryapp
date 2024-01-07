package com.example.springboot.models;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.*;

import org.springframework.hateoas.RepresentationModel;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;

    private String name;
    private String code;

    @Temporal(TemporalType.DATE)
    private java.util.Date dateRegister;

    @Temporal(TemporalType.DATE)
    private java.util.Date dateVal;

    private BigDecimal value;

    private Integer amount;
    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public java.util.Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(java.util.Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public java.util.Date getDateVal() {
        return dateVal;
    }

    public void setDateVal(java.util.Date dateVal) {
        this.dateVal = dateVal;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
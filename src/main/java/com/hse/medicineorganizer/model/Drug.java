package com.hse.medicineorganizer.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "drugs")
@Data
public class Drug extends BaseEntity {


    @Column(name = "name")
    String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "group")
    DrugGroup drugGroup;

    // Цена
    @Column(name = "price")
    Double price;

    // Дата производства
    @Column(name = "prod_date")
    Date prodDate;

    // Дата окончания срока годности
    @Column(name = "exp_date")
    Date expDate;

    // Нужен ли рецепт
    @Column(name = "recipe")
    Boolean needRecipe;

    // Дата и время начала приема
    @Column(name = "start_take_date")
    Date startTake;

    // Частота приема в день
    @Column(name = "reciving_frec")
    Integer recivingFrec;

    // Кол-во пилюль в упаковке
    @Column(name = "num_of_pills")
    Integer numberOfPills;

//  TODO:  List<User>

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DrugGroup getDrugGroup() {
        return drugGroup;
    }

    public void setDrugGroup(DrugGroup drugGroup) {
        this.drugGroup = drugGroup;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Boolean getNeedRecipe() {
        return needRecipe;
    }

    public void setNeedRecipe(Boolean needRecipe) {
        this.needRecipe = needRecipe;
    }

    public Date getStartTake() {
        return startTake;
    }

    public void setStartTake(Date startTake) {
        this.startTake = startTake;
    }

    public Integer getRecivingFrec() {
        return recivingFrec;
    }

    public void setRecivingFrec(Integer recivingFrec) {
        this.recivingFrec = recivingFrec;
    }

    public Integer getNumberOfPills() {
        return numberOfPills;
    }

    public void setNumberOfPills(Integer numberOfPills) {
        this.numberOfPills = numberOfPills;
    }
}

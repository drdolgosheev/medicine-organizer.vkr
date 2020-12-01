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
}

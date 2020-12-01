package com.hse.medicineorganizer.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "diagnosis")
@Data
public class Diagnosis extends BaseEntity{

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_fmembers",
    joinColumns = {@JoinColumn(name= "diagnosis_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "fmember_id", referencedColumnName = "id")})
    private List<FamilyMembers> familyMembers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FamilyMembers> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(List<FamilyMembers> familyMembers) {
        this.familyMembers = familyMembers;
    }
}

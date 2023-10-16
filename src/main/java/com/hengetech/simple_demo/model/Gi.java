package com.hengetech.simple_demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "GI")
public class Gi {
    @Id @Column(name = "JobNo") private String jobNo;
    @Column(name = "CustomerCode") private String customerCode;
    @Column(name = "WHSCode") private String whsCode;
    @Column(name = "DeliveryDate") 
    @Temporal(TemporalType.TIMESTAMP) private Date deliveryDate;
    @Column(name = "SystemDate") 
    @Temporal(TemporalType.TIMESTAMP) private Date systemDate;
    @Column(name = "Remark") private String remark;
    @Column(name = "CreatedDate")
    @Temporal(TemporalType.TIMESTAMP) private Date createdDate;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "gi") private List<GiDetail> items = new ArrayList<>();
}

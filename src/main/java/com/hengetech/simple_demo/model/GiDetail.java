package com.hengetech.simple_demo.model;

import java.io.Serializable;

import org.hibernate.engine.profile.Fetch;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "GIDetail")
public class GiDetail {
    @Id @Column(name = "JobNo") private String jobNo;    
    @Id @Column(name = "LineItem") private int lineItem;
    @Column(name = "BusinessType") private String businessType;
    @Column(name = "CPONo") private String cpoNo;
    @Column(name = "InvoiceNo") private String InvoiceNo;
    @Column(name = "PartNo") private String PartNo;
    @Column(name = "Qty") private double quantity;
    @Column(name = "BilledQty") private double billedQuantity;
    @Column(name = "Billed", columnDefinition = "TinyInt") private boolean billed;

    @ManyToOne @JsonIgnore
    @JoinColumn(name = "JobNo") private Gi gi;
}

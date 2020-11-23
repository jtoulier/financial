package com.bcp.bootcamp2020.financial.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "tasa_de_intereses")
@Data
public class TasaDeIntereses implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "interes_code")
    private String interesCode;

    @Column(name = "interes_monto")
    public Integer interesMonto;

}

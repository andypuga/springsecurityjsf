/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andy.servidor.dtos;

import lombok.Data;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Programador3
 */
@Entity
@Table(name = "egreso")
@Data
public class Egreso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_EGRESOS")
    private Integer idEgresos;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "VALOR")
    private Long valor;
    @Column(name = "MEMO")
    private String memo;
    private TipoValor idTipovalor;
    private Banco idBanco;
    private Tipovalor_1 idTipovalor1;
    public Egreso() {
    }


    
}

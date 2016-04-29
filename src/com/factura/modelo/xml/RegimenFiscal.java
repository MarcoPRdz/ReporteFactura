/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factura.modelo.xml;

import javax.xml.bind.annotation.*;

/**
 *
 * @author Hilario
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RegimenFiscal {
    @XmlAttribute(name="Regimen")
    private String Regimen;

    public String getRegimenFiscal() {
        return Regimen;
    }

    public void setRegimenFiscal(String regimen) {
        this.Regimen = regimen;
    }
    
}

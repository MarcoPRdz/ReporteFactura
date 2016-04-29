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
public class CFDIRegistroFiscal {
    @XmlAttribute(name="Version")
    private String version;
    @XmlAttribute(name="Folio")
    private String folio;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }
    
}

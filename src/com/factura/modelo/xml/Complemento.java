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
public class Complemento {
    @XmlElement(namespace = "http://www.sat.gob.mx/registrofiscal", name = "CFDIRegistroFiscal")
    private CFDIRegistroFiscal cfdiRegistroFiscal;
    @XmlElement(namespace = "http://www.sat.gob.mx/TimbreFiscalDigital", name = "TimbreFiscalDigital")
    private TimbreFiscalDigital timbreFiscalDigital;

    public TimbreFiscalDigital getTimbreFiscalDigital() {
        return timbreFiscalDigital;
    }

    public void setTimbreFiscalDigital(TimbreFiscalDigital timbreFiscalDigital) {
        this.timbreFiscalDigital = timbreFiscalDigital;
    }

    public CFDIRegistroFiscal getCfdiRegistroFiscal() {
        return cfdiRegistroFiscal;
    }

    public void setCfdiRegistroFiscal(CFDIRegistroFiscal cfdiRegistroFiscal) {
        this.cfdiRegistroFiscal = cfdiRegistroFiscal;
    }
    
}

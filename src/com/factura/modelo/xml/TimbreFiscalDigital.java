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
@XmlRootElement(namespace = "http://www.sat.gob.mx/TimbreFiscalDigital")
@XmlAccessorType(XmlAccessType.FIELD)
public class TimbreFiscalDigital {
    @XmlAttribute
    private String version;
    @XmlAttribute(name="UUID")
    private String UUID;
    @XmlAttribute(name="FechaTimbrado")
    private String FechaTimbrado;
    @XmlAttribute
    private String selloCFD;
    @XmlAttribute
    private String noCertificadoSAT;
    @XmlAttribute
    private String selloSAT;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getFechaTimbrado() {
        return FechaTimbrado;
    }

    public void setFechaTimbrado(String FechaTimbrado) {
        this.FechaTimbrado = FechaTimbrado;
    }

    public String getSelloCFD() {
        return selloCFD;
    }

    public void setSelloCFD(String selloCFD) {
        this.selloCFD = selloCFD;
    }

    public String getNoCertificadoSAT() {
        return noCertificadoSAT;
    }

    public void setNoCertificadoSAT(String noCertificadoSAT) {
        this.noCertificadoSAT = noCertificadoSAT;
    }

    public String getSelloSAT() {
        return selloSAT;
    }

    public void setSelloSAT(String selloSAT) {
        this.selloSAT = selloSAT;
    }
    
}

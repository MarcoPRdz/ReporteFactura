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
@XmlType(propOrder = {"rfc", "nombre", "domicilioFiscal", "expedidoEn", "regimenFiscal"})
public class Emisor {
    @XmlAttribute
    private String rfc;
    @XmlAttribute
    private String nombre;    
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "DomicilioFiscal")
    private DomicilioFiscal domicilioFiscal;
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "RegimenFiscal")
    private RegimenFiscal regimenFiscal;
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "ExpedidoEn")
    private ExpedidoEn expedidoEn;

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public DomicilioFiscal getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(DomicilioFiscal domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
    }

    public RegimenFiscal getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setRegimenFiscal(RegimenFiscal regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public ExpedidoEn getExpedidoEn() {
        return expedidoEn;
    }

    public void setExpedidoEn(ExpedidoEn expedidoEn) {
        this.expedidoEn = expedidoEn;
    }    
}

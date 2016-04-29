/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factura.modelo.xml;

import java.util.List;
import javax.xml.bind.annotation.*;

/**
 *
 * @author Hilario
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Impuestos {
    @XmlAttribute
    private String totalImpuestosTrasladados;
    @XmlElementWrapper(namespace = "http://www.sat.gob.mx/cfd/3", name="Traslados")
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name="Traslado")
    private List<Traslado> traslados;
    @XmlElementWrapper(namespace = "http://www.sat.gob.mx/cfd/3", name="Retenciones")
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name="Retencion")
    private List<Retencion> retenciones;

    public String getTotalImpuestosTrasladados() {
        return totalImpuestosTrasladados;
    }

    public void setTotalImpuestosTrasladados(String totalImpuestosTrasladados) {
        this.totalImpuestosTrasladados = totalImpuestosTrasladados;
    }

    public List<Traslado> getTraslados() {
        return traslados;
    }

    public void setTraslados(List<Traslado> traslados) {
        this.traslados = traslados;
    }

    public List<Retencion> getRetenciones() {
        return retenciones;
    }

    public void setRetenciones(List<Retencion> retenciones) {
        this.retenciones = retenciones;
    }
    
}

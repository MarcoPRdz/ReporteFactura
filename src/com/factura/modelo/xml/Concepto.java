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
public class Concepto {
    @XmlAttribute
    private String cantidad;
    @XmlAttribute
    private String unidad;
    @XmlAttribute
    private String noIdentificacion;
    @XmlAttribute
    private String descripcion;
    @XmlAttribute
    private String valorUnitario;
    @XmlAttribute
    private String importe;

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getNoIdentificacion() {
        return noIdentificacion;
    }

    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    @Override
    public String toString() {
        return "Concepto{" + "cantidad=" + cantidad + ", unidad=" + unidad + ", noIdentificacion=" + noIdentificacion + ", descripcion=" + descripcion + ", valorUnitario=" + valorUnitario + ", importe=" + importe + '}';
    }
    
}

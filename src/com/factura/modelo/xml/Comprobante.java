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
@XmlRootElement(namespace = "http://www.sat.gob.mx/cfd/3", name="Comprobante")
@XmlAccessorType(XmlAccessType.FIELD)
public class Comprobante {
    @XmlAttribute
    private String version;
    @XmlAttribute
    private String serie;
    @XmlAttribute
    private String folio;
    @XmlAttribute
    private String fecha;
    @XmlAttribute
    private String tipoDeComprobante;
    @XmlAttribute
    private String formaDePago;
    @XmlAttribute
    private String condicionesDePago;
    @XmlAttribute
    private String metodoDePago;
    @XmlAttribute
    private String noCertificado;
    @XmlAttribute
    private String certificado;
    @XmlAttribute
    private String subTotal;
    @XmlAttribute
    private String descuento;
    @XmlAttribute
    private String motivoDescuento;
    @XmlAttribute
    private String tipoCambio;
    @XmlAttribute(name="Moneda")
    private String Moneda;
    @XmlAttribute
    private String total;
    @XmlAttribute(name="LugarExpedicion")
    private String LugarExpedicion;
    @XmlAttribute
    private String sello;
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "Emisor")
    private Emisor emisor;
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "Receptor")
    private Receptor receptor;
    @XmlElementWrapper(namespace = "http://www.sat.gob.mx/cfd/3", name="Conceptos")
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name="Concepto")
    private List<Concepto> conceptos;
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "Impuestos")
    private Impuestos impuestos;
    @XmlElement(namespace = "http://www.sat.gob.mx/cfd/3", name = "Complemento")
    private Complemento complemento;
    
    
    public Comprobante(){
        
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipoDeComprobante() {
        return tipoDeComprobante;
    }

    public void setTipoDeComprobante(String tipoDeComprobante) {
        this.tipoDeComprobante = tipoDeComprobante;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getCondicionesDePago() {
        return condicionesDePago;
    }

    public void setCondicionesDePago(String condicionesDePago) {
        this.condicionesDePago = condicionesDePago;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public String getNoCertificado() {
        return noCertificado;
    }

    public void setNoCertificado(String noCertificado) {
        this.noCertificado = noCertificado;
    }

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getMotivoDescuento() {
        return motivoDescuento;
    }

    public void setMotivoDescuento(String motivoDescuento) {
        this.motivoDescuento = motivoDescuento;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public String getMoneda() {
        return Moneda;
    }

    public void setMoneda(String Moneda) {
        this.Moneda = Moneda;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getLugarExpedicion() {
        return LugarExpedicion;
    }

    public void setLugarExpedicion(String LugarExpedicion) {
        this.LugarExpedicion = LugarExpedicion;
    }

    public String getSello() {
        return sello;
    }

    public void setSello(String sello) {
        this.sello = sello;
    }

    public Emisor getEmisor() {
        return emisor;
    }

    public void setEmisor(Emisor emisor) {
        this.emisor = emisor;
    }

    public Receptor getReceptor() {
        return receptor;
    }

    public void setReceptor(Receptor receptor) {
        this.receptor = receptor;
    }

    public List<Concepto> getConceptos() {
        return conceptos;
    }

    public void setConceptos(List<Concepto> conceptos) {
        this.conceptos = conceptos;
    }

    public Impuestos getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Impuestos impuestos) {
        this.impuestos = impuestos;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
    }
    
}

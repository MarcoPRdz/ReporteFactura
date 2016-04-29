/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
@XmlSchema(namespace = "default",
        elementFormDefault = XmlNsForm.QUALIFIED,
    xmlns = {
        @XmlNs(prefix = "", namespaceURI = "default"),
        @XmlNs(prefix = "cfdi", namespaceURI = "http://www.sat.gob.mx/cfd/3"),            
        @XmlNs(prefix = "xsi", namespaceURI = "http://www.w3.org/2001/XMLSchema-instance"),
        @XmlNs(prefix = "tfd", namespaceURI = "http://www.sat.gob.mx/TimbreFiscalDigital"),
        @XmlNs(prefix = "registrofiscal", namespaceURI = "http://www.sat.gob.mx/registrofiscal")
    })
    
  
package com.factura.modelo.xml;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;


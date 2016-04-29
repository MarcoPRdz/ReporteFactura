/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factura.gui;
import com.factura.modelo.xml.Comprobante;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.*;
/**
 *
 * @author Hilario
 */
public class Principal {
    
    public static void main(String[] args) {
        JAXBContext jc;
        try {
            jc = JAXBContext.newInstance(Comprobante.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            Comprobante comprobante = (Comprobante) unmarshaller.unmarshal(new File("AAA17C76-4A42-4BCF-9090-F1833F52EC3A.xml"));
            //System.out.println("Conceptos : " + comprobante.getConceptos().size());
            System.out.println("RFC Emisor: " + comprobante.getEmisor().getRfc());
            System.out.println("RFC Receptor: " + comprobante.getReceptor().getRfc());
            System.out.println("Total: " + comprobante.getTotal());
            System.out.println("ID: " + comprobante.getComplemento().getTimbreFiscalDigital().getUUID());
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(comprobante, System.out);
            //marshaller.marshal(comprobante, new File("ejemplo.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

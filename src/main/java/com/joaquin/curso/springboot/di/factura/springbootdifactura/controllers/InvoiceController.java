package com.joaquin.curso.springboot.di.factura.springbootdifactura.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaquin.curso.springboot.di.factura.springbootdifactura.models.Client;
import com.joaquin.curso.springboot.di.factura.springbootdifactura.models.Invoice;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    
    @Autowired
    private Invoice invoice;
    
    @GetMapping("/show")
    public Invoice show(){
        Invoice i = new Invoice(); //Se crean unas copias porque son componentes del requestScope ya que al json le agrega varios atributos que no interesan pasar
        Client c = new Client();
        c.setLastaname(invoice.getClient().getLastaname());
        c.setName(invoice.getClient().getName());
        
        i.setClient(c);
        i.setDescription(invoice.getDescription());
        i.setItems(invoice.getItems());
        return i;
    }
}

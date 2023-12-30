package com.joaquin.curso.springboot.di.factura.springbootdifactura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
@RequestScope
//@SessionScope
@JsonIgnoreProperties({"targetSource", "advisors"})
public class Client {
        
    @Value("${value.client.name}")
    private String name;
    @Value("${value.client.lastname}")
    private String lastaname;
    
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastaname() {
        return lastaname;
    }
    public void setLastaname(String lastaname) {
        this.lastaname = lastaname;
    }

    
}

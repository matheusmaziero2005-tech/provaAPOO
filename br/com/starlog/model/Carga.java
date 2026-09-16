package br.com.starlog.model;

import java.util.Objects;

public class Carga {
    private final String CodigoRastreio;
    private String categoria;
    private Double pesoKg;
    private double valorSeguro;

    public Carga(String codigoRastreio,String categoria,double pesoKg,double valorSeguro) {
        if (codigoRastreio == null || codigoRastreio.trim().isEmpty());{
            throw new IllegalArgumentException("Codigo de rastreio da carga nao pode ser nulo ou vazio");
        }

        this.CodigoRastreio = CodigoRastreio;
        this.categoria = categoria;
        this.pesoKg = pesoKg;
        this.valorSeguro = valorSeguro;

         
    }

    public String getCodigoRastreio(){
        return this.CodigoRastreio;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public Double getPesoKg(){
        return this.pesoKg;
    }

    public void setPesoKg(Double pesoKg){
        this.pesoKg = pesoKg;
    }

    public double getValorSeguro(){
        return this.valorSeguro;
    }


    public void setValorSeguro(double valorSeguro){
        this.valorSeguro = valorSeguro;
    }

    @Override
    public boolean equals(Object objeto){
        if (this == objeto) return true;
        if (objeto == null || getClass()!=objeto.getClass()) return false;
        Carga outra = Carga objeto;
        return Objects.equals(this.CodigoRastreio, outra.CodigoRastreio);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.CodigoRastreio);
    }

    @Override 
    public String toString(){
        return "Carga[rastreio=<codigoRastreio>, categoria=<categoria>, peso=<pesoKg>kg, segurp=R$<valorSeguro>]";
    }

}

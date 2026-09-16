package br.com.starlog.model;

import java.util.ArrayList;
import java.util.List;

public class ModuloCarga {
    private String codigoModulo;
    private int capacidadeMaxima;
    private List<Carga> cargas = new ArrayList<>();

    public void CarregarCarga(){
        if (codigoModulo == null || codigoModulo.trim().isEmpty())
            throw new IllegalArgumentException("Codigo nulo");

        this.capacidadeMaxima = capacidadeMaxima;
        this.codigoModulo = codigoModulo;
        this.cargas = new ArrayList<>();
    }

    public double calcularSeguroTotal(){

        return this.cargas.stream()
        .mapToDouble(Carga::getValorSeguro)
        .sum();
    }
    
    public long contarCargasPorCategoria(String categoria){
        return this.cargas.stream()
        .filter(c -> c.getCategoria() == categoria)
        .count();
    }

    public double contarSeguroCargasPesadas(String categoria, double pesoMinimo){
        return this.cargas.stream()
        .filter(c -> c.getPesoKg() > pesoMinimo)
        .mapToDouble(Carga::getPesoKg)
        .sum();
    }
}
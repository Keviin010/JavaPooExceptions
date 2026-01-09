package org.app.pooexcepciones.ejemplo.model;

public class MetricResult {

    private String nombre;
    private double valor;

    public MetricResult(String nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Métrica: " + nombre + " | Valor: " + valor;
    }
}

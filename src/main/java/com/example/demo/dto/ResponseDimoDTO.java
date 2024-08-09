package com.example.demo.dto;

public class ResponseDimoDTO {
    public String getTipoPeticion() {
        return tipoPeticion;
    }

    public void setTipoPeticion(String tipoPeticion) {
        this.tipoPeticion = tipoPeticion;
    }

    public String getFolioPet() {
        return folioPet;
    }

    public void setFolioPet(String folioPet) {
        this.folioPet = folioPet;
    }

    public String getEdoPet() {
        return edoPet;
    }

    public void setEdoPet(String edoPet) {
        this.edoPet = edoPet;
    }

    public String getEstadoRegistro() {
        return estadoRegistro;
    }

    public void setEstadoRegistro(String estadoRegistro) {
        this.estadoRegistro = estadoRegistro;
    }

    private String tipoPeticion;
    private String folioPet;
    private String edoPet;
    private String estadoRegistro;

    @Override
    public String toString() {
        return "Response" + tipoPeticion + "DimoDTO {" +
                "folioPet='" + folioPet + '\'' +
                ", edoPet=" + edoPet +
                ", estadoRegistro='" + estadoRegistro + '\''+
                '}';
    }
}

package com.example.entities;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Evento {

    private Integer eventoId;

    private String descripcion;

    private Date fechaDeInicio;

    private Date fechaDeFin;

    public Evento(Integer eventoId, String descripcion, Date fechaDeInicio, Date fechaDeFin) {
        this.eventoId = eventoId;
        this.descripcion = descripcion;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
    }

    public Integer getEventoId() {
        return eventoId;
    }

    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(Date fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public Date getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(Date fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "eventoId=" + eventoId +
                ", descripcion='" + descripcion + '\'' +
                ", fechaDeInicio=" + fechaDeInicio +
                ", fechaDeFin=" + fechaDeFin +
                '}';
    }
}

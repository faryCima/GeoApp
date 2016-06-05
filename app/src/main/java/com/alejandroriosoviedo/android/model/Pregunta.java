package com.alejandroriosoviedo.android.model;

import com.alejandroriosoviedo.android.geoapp.R;

public class Pregunta {
    private Integer idResTexto;
    private boolean RespuestaVerdadera;

    //Constructor
    public Pregunta(Integer idResTexto ,boolean RespuestaVerdadera){
        this.idResTexto = idResTexto;
        this.RespuestaVerdadera = RespuestaVerdadera;
    }


    public void setidResTexto(Integer idResTexto){
        this.idResTexto = idResTexto;
    }
    public Integer getidResTexto(){
        return this.idResTexto;
    }
    public void setRespuestaVerdadera(boolean RespuestaVerdadera){
        this.RespuestaVerdadera = RespuestaVerdadera;
    }
    public boolean isRespuestaVerdadera(){
        return this.RespuestaVerdadera;
    }

}

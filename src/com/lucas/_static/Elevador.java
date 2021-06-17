package com.lucas._static;

public class Elevador {

    private int pisoActual;

    public Elevador(int pisoActual ) {
        this.pisoActual = pisoActual;
    }

    public int getPisoActual() {
        return pisoActual;
    }

    public void setPisoActual(int pisoActual) {
        this.pisoActual = pisoActual;
    }

    //RETORNA LA DIFERENCIA DE PISOS ENTRE LA PERSONA Y UN ELEVADOR EN PARTICULAR
    public int diferenciaPisos(int pisoPersona)
    {
        int difPiso = this.getPisoActual() - pisoPersona;

        //SIEMPRE DEVUELVE UN VALOR POSITIVO
        if (difPiso < 0) {
            difPiso = difPiso * -1;
        }
        return difPiso;
    }

}
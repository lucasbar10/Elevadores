package com.lucas._static;

public class Edificio {

    private final int pisos = 20;
    private final int cantidadElevadores = 3;
    private Elevador[] elevadores = new Elevador[cantidadElevadores];

    //CONSTRUCTOR CON UN PARAMETRO
    public Edificio(Elevador[] elevadores)
    {
        this.elevadores = elevadores;
    }

    //CONSTRUCTOR DEFAULT
    public Edificio()
    {
        for (int i = 0 ; i < elevadores.length ; i++)
        {
            elevadores[i] = new Elevador(0);
        }
    }

    //MUESTRA EN QUE PISO SE ENCUENTRA LA PERSONA Y CADA UNO DE LOS ELEVADORES MAS LA DISTANCIA QUE TIENEN CADA ELEVADOR CON LA PERSONA
    public void llamarElevador(int pisoPersona)
    {
        if (pisoPersona <= pisos && pisoPersona >= 0)
        {
            //MUESTRA EL PISO DONDE SE ENCUENTRA LA PERSONA
            System.out.println("-------------------------------------------------------");
            System.out.println("La persona se encuentra en el piso nº " + pisoPersona);
            System.out.println("-------------------------------------------------------");

            //MUESTRA POSICION DE CADA UNO DE LOS ELEVADORES Y A CAUNTOS PISOS SE ENCUENTRA DE LA PERSONA
            for (int e = 0; e < elevadores.length; e++)
            {
            System.out.print("Elevador nº " + (e + 1) + " se encuentra en el piso nº " + elevadores[e].getPisoActual());
            System.out.println(" Y se encuentra " + elevadores[e].diferenciaPisos(pisoPersona) + " pisos de la persona");
            }
        //LLAMADA AL METODO elevadorMasCercano()
        elevadorMasCercano(pisoPersona, elevadores);
        }
        else
            {
            System.out.println(pisoPersona + " No es un numero de Piso valido!");
            }
    }

    //VERIFICA LA POSICION DE TODOS LOS ELEVADORES Y SELECCIONA AL ELEVADOR MAS CERCANO
    private void elevadorMasCercano(int pisoPersona, Elevador[] listaElev){

        int difMin = 20; //
        int numElevador = 0; // NUMERO DEL ELEVADOR QUE SERA ELEGIDO
        boolean stop = false;

        for (int i = 0; i < listaElev.length; i++)
        {
            //VERIFICA SI ALGUN ELEVADOR YA SE ENCUENTRA EN EL MISMO PISO QUE LA PERSONA
            if (pisoPersona == listaElev[i].getPisoActual()){
                System.out.println("El elevador nº " + (i+1) + " ya se encuentra en este piso " );
                System.out.println("-------------------------------------------------------");
                stop = true; // EN EL CASO DE QUE UN ELEVADOR YA SE ENCUENTRE EN EL PISO IMPIDE QUE EJECUTE EL CODIGO DE ABAJO
                break;
            }
            //CALCULA CUAL DE LOS ELEVADORES SE ENCUENTRE MAS CERCA
           else if ( listaElev[i].diferenciaPisos(pisoPersona) <= difMin)
           {
                numElevador = (i + 1);
                difMin = listaElev[i].diferenciaPisos(pisoPersona);

           }
        }
        //MUESTRA EL ELEVADOR SELECCIONADO Y ACTUALIZA SU POSISCION
        if (!stop )
        {
            System.out.println("-------------------------------------------------------");
            System.out.println("El Elevador nº " + numElevador + " es el mas cercano y comenzo a dirigirse hacia el piso nº " + pisoPersona + " para recoger a la persona");

            elevadores[numElevador - 1].setPisoActual(pisoPersona);
        }
    }
}




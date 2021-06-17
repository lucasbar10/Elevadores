package com.lucas._static;

public class Main
{

    public static void main(String[] args)
    {
        //CONSTRUCTOR POR DEFECTO CREA 3 ELEVADORES EN EL PISO 1
        //Edificio edificio = new Edificio();

        //CONSTRUCOTR CON CON PARAMETROS RECIVE UNA LISTA DE ELEVADORES COMO PARAMETRO

        Elevador[] listaElevadores = new Elevador[3];
        listaElevadores[0] = new Elevador(4);
        listaElevadores[1] = new Elevador(14);
        listaElevadores[2] = new Elevador(7);

        Edificio edificio = new Edificio(listaElevadores);


        //INGRESAR EL NUMERO DEL PISO EN QUE SE LLAMA AL ELEVADOR

        edificio.llamarElevador(0);
        edificio.llamarElevador(20);
        edificio.llamarElevador(11);




    }
}

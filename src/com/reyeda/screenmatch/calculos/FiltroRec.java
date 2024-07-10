package com.reyeda.screenmatch.calculos;

public class FiltroRec {
    //variable
    //metodo
    public void filtrar(Clasificable clasificable){
        if (clasificable.getClasificable() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificable.getClasificable() >= 2) {
            System.out.println("popular en el momento");
        }else{
            System.out.println("Colocalo en tu lista para verlo despues");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arbolesbinarios;


/**
 *
 * @author leona
 */
public class Ejecutable {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar("/Abuelos");
        arbol.insertar("/Juan/Maria");
        arbol.insertar("/Joaquin");
        
        System.out.println(arbol.busqueda("/Abuelo/Fredy/Elsa/Leonardo"));
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreOrden();
        System.out.println("\n\nRecorrido InOrden");
        arbol.recorridoInorden();
        System.out.println("\n\nRecorrido Post Orden");
        arbol.recorridoPostOrden();
    }
}

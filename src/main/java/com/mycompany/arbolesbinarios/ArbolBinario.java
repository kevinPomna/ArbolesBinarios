/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolesbinarios;

/**
 *
 * @author leona
 */
public class ArbolBinario {

    private NodoArbol raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public void insertar(String pathDirectorio) {
        raiz = insertarRecursivo(raiz, pathDirectorio);
    }

    public NodoArbol insertarRecursivo(NodoArbol actual, String pathDirectorio) {
        if (actual == null) {
            return new NodoArbol(pathDirectorio);
        }
        if (pathDirectorio.compareTo(actual.datos) < 0) {
            actual.izquierda = insertarRecursivo(actual.izquierda, pathDirectorio);
        } else {
            actual.derecha = insertarRecursivo(actual.derecha, pathDirectorio);
        }
        return actual;
    }

    public boolean busqueda(String pathDirectorio) {
        return busquedaRecursiva(raiz, pathDirectorio);
    }

    public boolean busquedaRecursiva(NodoArbol actual, String pathDirectorio) {
        if (actual == null) {
            return false;
        }
        if (pathDirectorio.equals(actual.datos)) {
            return true;
        }
        if (pathDirectorio.compareTo(actual.datos) < 0) {
            return busquedaRecursiva(actual.izquierda, pathDirectorio);
        } else {
            return busquedaRecursiva(actual.derecha, pathDirectorio);
        }
    }

    private void ayudantePreOrden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.datos + " ");
        ayudantePreOrden(nodo.izquierda);
        ayudantePreOrden(nodo.derecha);
    }

    private void ayudanteInorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        ayudanteInorden(nodo.izquierda);
        System.out.println(nodo.datos + " ");
        ayudanteInorden(nodo.derecha);
    }

    private void ayudantePosOrden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        ayudantePosOrden(nodo.izquierda);
        ayudantePosOrden(nodo.derecha);
        System.out.println(nodo.datos + " ");
    }

    public void recorridoPreOrden() {
        ayudantePreOrden(raiz);
    }

    public void recorridoInorden() {
        ayudanteInorden(raiz);
    }

    public void recorridoPostOrden() {
        ayudantePosOrden(raiz);
    }
}

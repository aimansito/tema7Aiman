/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author aiman
 */
public class Nodo<T> {
    private T elemento;
    private Nodo<T> siguiente;

    public Nodo(T elemento, Nodo<T> siguiente) {
        this.elemento = elemento;
        this.siguiente = siguiente;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nodo{");
        sb.append("elemento=").append(elemento);
        sb.append(", siguiente=").append(siguiente);
        sb.append('}');
        return sb.toString();
    }
    
     
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

/**
 *
 * @author aiman
 */
public class PilaDinamica<T> {
    private Nodo<T> top;
    private int tamanio ;

    public PilaDinamica() {
        this.top = null;
        this.tamanio = 0;
    }
    public boolean isEmpty(){
        return top == null;
    }
    public int size(){
        return this.tamanio;
    }
    public T pop(){
        if(isEmpty()){
            return null;
        }else{
            T elemento = top.getElemento();
            Nodo<T> aux = top.getSiguiente();
            top = null;
            top = aux;
            this.tamanio--;
            return elemento;
        }
    }
    public void push(T elemento){
        Nodo<T> aux = new Nodo<>(elemento,top);
        top = aux;
        this.tamanio++;
    }
    public T top(){
        if(isEmpty()){
            return null;
        }else{
            return top.getElemento();
        }
    }
    public String toString(){
        String resultado = "";
         if(isEmpty()){
             System.out.println("Esta vacía");
        }else{
             Nodo<T> aux = top;
             while(aux!=null){
                 resultado += aux.toString();
                aux = aux.getSiguiente();
             }
        }
        return resultado;
    }
}

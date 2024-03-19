/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pila;

import java.util.Stack;

/**
 *
 * @author aiman
 */
public class Main {
    public static void main(String[] args) {
        //primer ejemplo
        PilaDinamica<Integer> pilaNumeros = new PilaDinamica<>();
        
        pilaNumeros.push(10);
        pilaNumeros.push(3);
        pilaNumeros.push(4);
        System.out.println("¿Esta vacía?: "+pilaNumeros.isEmpty());
        System.out.println("Tamaño: "+pilaNumeros.size());
        System.out.println("Top: "+pilaNumeros.top());
        int elemento = pilaNumeros.pop();
        
        System.out.println("He sacado el número "+elemento);
        System.out.println(pilaNumeros);
        System.out.println("----------------------");
        System.out.println("Stack de java");
        Stack<Integer> pilaStack = new Stack<>();
        
        pilaStack.push(4);
        pilaStack.push(5);
        pilaStack.push(6);
        
        System.out.println("Top "+pilaStack.peek());
    }
}

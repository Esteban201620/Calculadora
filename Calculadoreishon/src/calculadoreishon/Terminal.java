/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoreishon;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Terminal {
    Scanner miEscaner = new Scanner(System.in);
    Calculadora terminalCalculadora; 
    
    int op;
    public void Escaner(){
        System.out.print("Seleccione operación\n1.Suma\n2.Resta\n2.Multiplicación\n4.División");
        op = miEscaner.nextInt();
        System.out.println("Inserte primer número");
        terminalCalculadora.numero1 = miEscaner.nextDouble();
        System.out.println("Inserte primer número");
        terminalCalculadora.numero2 = miEscaner.nextDouble();
        
        imprimir();
    }
    public void imprimir(){
        if(op==1){
            System.out.println(terminalCalculadora.suma());
        }
        if(op==2){
            System.out.println(terminalCalculadora.resta());
        }
        if(op==3){
            System.out.println(terminalCalculadora.multiplicacion());
        }
        if(op==4){
            System.out.println(terminalCalculadora.division());
        }
    }    
} 

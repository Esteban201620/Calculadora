/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoreishon;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    double numero1;
    double numero2;
    
    public double suma(){
        return numero1+numero2;
    }
    public double resta(){
        return numero1-numero2;
    }
    public double multiplicacion(){
        return numero1*numero2;
    }
    public double division(){
        if (numero2!=0){
            return numero1/numero2;
        }else{
            return 0;
        }
    }
    
}

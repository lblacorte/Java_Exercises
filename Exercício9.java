/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício9;

import javax.swing.JOptionPane;
import java.lang.Math.*;

/**
 *
 * @author Admin
 */
public class Exercício9 {
    
    public static void volumeEsfera(double raio){
        
        double volume;
        
        volume = (4.0/3.0) * Math.PI * Math.pow(raio,3);
        
        JOptionPane.showMessageDialog(null,"O volume da esfera é: " + volume + " metros cúbicos."); 
    }
    
    public static void main(String[] args) {
        
    double raio;
    
    raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da esfera (em metros): "));
    
    volumeEsfera(raio);
}
}

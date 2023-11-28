/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício3;

import javax.swing.JOptionPane;

/**
 *
 * @author alunolab
 */
public class Exercício3 {
    public static void main (String args[]){
        
    int temperatura;
    
    temperatura = Integer.parseInt(JOptionPane.showInputDialog("Informe a temperatura:\n(em graus célsius)"));
    
    if(temperatura <= 18){
        JOptionPane.showMessageDialog(null,"CLIMA: Frio.");
    }
    if(temperatura >= 19 && temperatura <= 23){
        JOptionPane.showMessageDialog(null,"CLIMA: Agradável.");
    }
    if(temperatura >= 24 && temperatura <= 35){
        JOptionPane.showMessageDialog(null,"CLIMA: Quente.");
    }
    if(temperatura > 35){
        JOptionPane.showMessageDialog(null,"CLIMA: Muito quente.");
    }
}
}
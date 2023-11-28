/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício1;

import javax.swing.JOptionPane;
import java.lang.NumberFormatException;

/**
 *
 * @author alunolab
 */
public class Exercício1 {
    
    public static void main(String[] args){
        
        Double salario1, salario2;
        
        //String str = Double.toString(salario2);
        
        //if(str.isEmpty()){
        //    str = null;
        //}
        
        try{
    salario1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário:"));
    salario2 = salario1 * 1.07;
    JOptionPane.showMessageDialog(null,"O novo salário é " + String.format("%.02f", salario2) + ".");
}
    catch (NumberFormatException e){
    JOptionPane.showMessageDialog(null,"Operação inválida! Nenhum valor foi digitado para o salário!\nDetalhes do erro: " + e.getMessage());
}
    }
}

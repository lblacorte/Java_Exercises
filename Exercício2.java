/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício2;

import javax.swing.JOptionPane;

/**
 *
 * @author alunolab
 */
public class Exercício2 {
    
    public static void main (String args[]){
        
    String sexo;
    
    sexo = JOptionPane.showInputDialog("Informe o sexo:\n(M para masculino e F para feminino)");
    
    if("M".equals(sexo)){
        JOptionPane.showMessageDialog(null,"Seja bem-vindo, senhor!");
    }
    if("F".equals(sexo)){
        JOptionPane.showMessageDialog(null,"Seja bem-vinda, senhora!");
    }
    if(!"F".equals(sexo) && !"M".equals(sexo)){
        JOptionPane.showMessageDialog(null,"Opção inválida!");
    }
}
}
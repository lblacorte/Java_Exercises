/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício5;

import javax.swing.JOptionPane;

/**
 *
 * @author alunolab
 */
public class Exercício5 {
    
    public static void main(String args[]){
    String nomes[] = new String[5];
    
    for(int contador=0 ; contador < 5; contador++){
        
    int num = contador + 1;
    
        nomes[contador] = JOptionPane.showInputDialog("Informe o nome " + num + ":");
    }
    
    String pesquisa;
    
     int inexist = 0;
    
    pesquisa = JOptionPane.showInputDialog("Informe o nome para pesquisa:");
    
    for(int contador=0 ; contador < 5; contador++){
    
        if(pesquisa.equals(nomes[contador])){
            JOptionPane.showMessageDialog(null,"Nome encontrado em \"nomes[" + contador + "]\" = " + nomes[contador]);
            
            inexist = inexist+1;
        }
    }
    
    if(inexist == 0){
        JOptionPane.showMessageDialog(null,"Elemento não encontrado.", "", JOptionPane.WARNING_MESSAGE);
    }
}
}

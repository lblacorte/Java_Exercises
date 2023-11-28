/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercícionúm10;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
class Exercício10 {
    
    public static String nome;
    public static float nota1, nota2, nota3, nota4;
    public static float média;
    private static int sala;

    public int getSala() {
        return sala;
    }

    public static void setSala(int sala) {
        Exercício10.sala = sala;
    }
    
    public static void main (String args[]){
        
        nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 1: "));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 2: "));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 3: "));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota 4: "));
        sala = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da sala: "));
        
        setSala(sala);
        
        média = (nota1 + nota2 + nota3 + nota4) / 4;
        
        JOptionPane.showMessageDialog(null,"Aluno(a): " + nome + "\nSala: " + sala + "\nMédia: " + média); 
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício7;

import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Principal {
	public static void main(String[] args) {
	
            String sons[] = new String[10];
            int escolha;
            String saída = null;

            for(int i=0; i<10; i++){
                
            int num = i + 1;
            
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha o animal " + num + ":"
                        + "\n\nESCOLHAS:\n1- Homem;\n2- Cão;\n3- Gato."));
                
                switch(escolha){
                    case 1:
                        Animal homem = new Homem();
                        sons[i] = homem.fala();
                        break;
                    case 2:
                        Animal cachorro = new Cão();
                        sons[i] = cachorro.fala();
                        break;
                    case 3:
                        Animal gato = new Gato();
                        sons[i] = gato.fala();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente!");
                        i--;
                        break;
                }
            }
                
                for(int i=0; i<10; i++){
                    if(i==0){
                    saída = sons[i];
                    }
                    else{
                    saída = saída + "\n" + sons[i];
                    }
                }
                
               JOptionPane.showMessageDialog(null,"LOOP DE SONS:\n" + saída); 
            }
	}
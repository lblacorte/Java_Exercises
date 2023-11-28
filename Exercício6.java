/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Exercício6 {
    public static void main (String args[]){
        
    Scanner input = new Scanner(System.in);
    
    String nomes[] = new String[5];
    
    int votos[] = new int[5];
    
    int maior = 0;
    int quant = 0;
    
    int x;
    
    String y;
    
    for(int contador=0 ; contador < 5; contador++){
    
    System.out.printf("\nEntre com o nome do candidato(a) %d: ", contador+1);
    nomes[contador] = input.next();
    
    System.out.printf("Entre com o número de votos do candidato(a) %d: ", contador+1);
    votos[contador] = input.nextInt();
    
    //Colocar em ordem decrescente:
    
    if(contador > 0 && votos[contador] > votos[contador-1]){
        x = votos[contador];
        votos[contador] = votos[contador-1];
        votos[contador-1] = x;
        
        y = nomes[contador];
        nomes[contador] = nomes[contador-1];
        nomes[contador-1] = y;
    }
    }
    
    System.out.printf("\n\nTOTAL DE VOTOS EM ORDEM DECRESCENTE:\n");
    
    for(int contador=0 ; contador < 5; contador++){
        
        if(contador == 0 || votos[contador] > votos[contador-1]){
            maior = votos[contador];
        }
        if(contador<4){
        System.out.printf("--> Candidato(a) %s = %d votos;\n", nomes[contador], votos[contador]);
        }
        else{
        System.out.printf("--> Candidato(a) %s = %d votos.", nomes[contador], votos[contador]);
        }
    }
    
    //Verificar se há mais algum igual o maior, e quantos:
    for(int contador=0 ; contador < 5; contador++){
        if(votos[contador] == maior){
            quant++;
        }
    }
    
    String nomesMaior[] = new String[quant];
    int votosMaior[] = new int[quant];
    int cont =0;
    
    for(int contador=0 ; contador < 5; contador++){
        if(votos[contador] == maior){
            nomesMaior[cont] = nomes[contador];
            votosMaior[cont] = votos[contador];
            cont++;
        }
    }
    
    System.out.printf("\n\nMAIS VOTADO(A)(S):\n");
    
    for(int contador=0 ; contador < quant; contador++){
        if(contador<quant-1 || contador == 0){
        System.out.printf("--> Candidato(a) %s = %d votos;\n", nomesMaior[contador], votosMaior[contador]);
        }
        else{
        System.out.printf("--> Candidato(a) %s = %d votos.\n", nomesMaior[contador], votosMaior[contador]);
        }
    }
    }
}

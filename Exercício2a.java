//2. Construa uma aplicação GUI que exiba uma janela (JFRAME) sem qualquer contéudo, mas capaz de ser fechada?

package Exercícios;

import javax.swing.*;

public class Exercício2 {
    public static void main(String args[]){
        JFrame frame = new JFrame("JFrame fechável");//frame
        JPanel painel = new JPanel();//painel
        frame.getContentPane().add(painel);//add painel no frame
        frame.setVisible(true);///visibilidade do frame
        frame.setLocation(500, 200);//localização do frame na tela
        frame.setSize(400, 500);//tamanho do frame
    }
}
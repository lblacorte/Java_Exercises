/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício5;

/**
 *
 * @author Admin
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventoAction extends JFrame implements ActionListener {
    
JButton b1, b2, b3;
JPanel p1;
final String desabilita = "desabilita";
final String habilita = "habilita";
public EventoAction() {
p1 = new JPanel();
b1 = new JButton("Desativa o botão do meio");
b1.setActionCommand(desabilita);
b2 = new JButton("Botão do meio");
b3 = new JButton("Ativa botão do meio");
b3.setActionCommand(habilita);
b1.addActionListener(this);
//O this indica que a classe atual é a receptora do evento, ou seja é a ouvinte
b3.addActionListener(this);
b3.addActionListener(this);
p1.add(b1);//adiciona no painel os botões
p1.add(b2);
p1.add(b3);
getContentPane().add(p1);
/*ContentPane é o painel de conteúdo(container),onde vamos inserir os demais componentes*/
}
public void actionPerformed(ActionEvent e) {
String command = e.getActionCommand();
System.out.println(command);
//retorna o string associado com a ação.
if (command.equalsIgnoreCase("desabilita")) {
b2.setEnabled(false);
} else {
b2.setEnabled(true);
}
}
public void executa(){
EventoAction j = new EventoAction();
j.setTitle("Vários Botões");
j.pack();
j.setVisible(true);
}
} //Fim
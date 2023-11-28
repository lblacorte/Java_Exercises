/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício5;

/**
 *
 * @author Admin
 */
import java.awt.event.*;
import javax.swing.*;
public class EventoLimpa {
JButton botaoLimpa;
JTextField campoTexto;
JFrame janela;
public EventoLimpa() {
botaoLimpa = new JButton("Limpa");
campoTexto = new JTextField(10);
janela = new JFrame("Exemplo 1 de Listener");
janela.setSize(300, 100);
janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
JPanel painel = new JPanel();;
painel.add(botaoLimpa);
painel.add(campoTexto);
janela.getContentPane().add(painel);
botaoLimpa.addActionListener(new LimpaCampoListener(campoTexto));
janela.setVisible(true);
janela.setLocation(600, 400);//posição na tela x e y
}
public void executa(){
new EventoLimpa();
}
}
class LimpaCampoListener implements ActionListener {
JTextField campo;
LimpaCampoListener(JTextField campo) {
this.campo = campo;
}
public void actionPerformed(ActionEvent e) {
campo.setText("");
}
}
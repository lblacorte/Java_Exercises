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
public class EventoItem extends JFrame {
private JComboBox cbb = new JComboBox();
//Configurando a GUI
public EventoItem() {
super("Testando JComboBox");
// Cria um container e define o modelo de layout (FlowLayout)
Container container = getContentPane();
container.setLayout(new FlowLayout());
// Adiciona os elementos para o primeiro Combo cbb.addItem("Disciplina 1");
cbb.addItem("Disciplina 2");
cbb.addItem("Disciplina 3");
//Define o item que estará selecionado
cbb.setSelectedItem("Disciplina 2");
//Adiciona para o container
container.add(cbb);
// registra os tratadores de evento
GerenciadorComboBox gerenteCB = new GerenciadorComboBox();
cbb.addItemListener(gerenteCB);
setSize(300, 170);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);//fecha janela
}
private class GerenciadorComboBox implements ItemListener { //processa eventos associados aos objetos ComboBox
public void itemStateChanged(ItemEvent evento) {
String texto = "";
if ((evento.getSource() == cbb) && (evento.getStateChange() == ItemEvent.SELECTED)) {
JOptionPane.showMessageDialog(null, "O elemento selecionado foi"+cbb.getSelectedItem()); } }
} // fim da classe interna
// Método principal da aplicação
public void executa() {
EventoItem combobox = new EventoItem();
}
} // final da classe
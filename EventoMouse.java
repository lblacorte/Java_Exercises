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
public class EventoMouse extends JFrame{
private Canvas areaDesenho;
public EventoMouse(){
super("desenho livre!");
areaDesenho=new Canvas();
}
public void init(){
areaDesenho.setForeground(Color.BLACK);
areaDesenho.setBackground(Color.WHITE);
areaDesenho.setSize(400,400);
areaDesenho.addMouseMotionListener(new MouseMovimento());
getContentPane().add(areaDesenho);
setSize(410,410);
setVisible(true);
setLocation(400, 100);//posição na tela
}
class MouseMovimento implements MouseMotionListener{
public void mouseMoved(MouseEvent me)
{//método obrigatorio da MouseMotionListener
//sem implementação
}
public void mouseDragged(MouseEvent me){
//método obrigatorio da MouseMotionListener
//recupera o obj Graphics e desenha no canva
//de acordo com a posição do mouse
areaDesenho.getGraphics().drawString("*", me.getX(), me.getY());
}
}
public void executa(){
new EventoMouse().init();
}
}//fim classe
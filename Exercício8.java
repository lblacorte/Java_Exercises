/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício8;

import javax.swing.JOptionPane;
import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class Exercício8 {
    
   public static int diaSemana(){
        
       Calendar calendário = Calendar.getInstance();
       int dia = calendário.get(Calendar.DAY_OF_WEEK);
       return dia;
    }
    
    public static void main(String[] args) {
       
    switch (diaSemana()){
        case 1:
            JOptionPane.showMessageDialog(null,"Carro 0 km agora com 10% de desconto!");
            break;
        case 2:
            JOptionPane.showMessageDialog(null,"Aproveite a promoção de laranjas do tio Zé!");
            break;
        case 3:
            JOptionPane.showMessageDialog(null,"Televisões parceladas em 12x no cartão da loja!");
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Promoção de chocolate: leve 3 e pague 2!");
            break;
        case 5:
            JOptionPane.showMessageDialog(null,"Todos os perfumes com 30% de desconto (à vista)!");
            break;
        case 6:
            JOptionPane.showMessageDialog(null,"Celulares de última geração estão em promoção!");
            break;
        case 7:
            JOptionPane.showMessageDialog(null,"Leve 3 produtos de limpeza e concorra a uma moto!");
            break;
    }
}
}

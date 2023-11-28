/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios.Exercício4;

import javax.swing.JOptionPane;
import java.text.DecimalFormat; 

/**
 *
 * @author alunolab
 */
public class ContaCorrente {
    
    private float númeroConta;
    private double saldoConta;

    public float getNúmeroConta() {
        return númeroConta;
    }

    public void setNúmeroConta(float númeroConta) {
        this.númeroConta = númeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
    
    DecimalFormat df = new DecimalFormat("#,###.00");
    
    public void Depositar(){
        setSaldoConta(getSaldoConta() + getNúmeroConta());
        JOptionPane.showMessageDialog(null,"Sucesso ao depositar. Novo saldo: " + df.format(getSaldoConta()));
    }
    
    public void Sacar(){
        setSaldoConta(getSaldoConta() - getNúmeroConta());
        JOptionPane.showMessageDialog(null,"Sucesso ao sacar. Novo saldo: " + df.format(getSaldoConta()));
    }
}

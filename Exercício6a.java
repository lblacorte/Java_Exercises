/*
6. Atividade Aplicativo de Conversão: Elaborar uma classe em java que contenha uma
tela inicial com um frame que possibilite ao usuário duas possibilidades: Converter real
para dólar e converter real para Euro, conforme protótipo na figura abaixo.
Orientações: Cada botão irá disparar um evento para uma janela que calcula as respectivas conversões. É necessário informar o valor
do Dólar comercial e Euro para realizar as conversões e o valor desejado pelo usuário. Mostrar os resultados em um rótulo,
considerando duas casas decimais depois da vírgula como resultado. Exemplo: O usuário deseja saber quanto
custa R$ 55,78 em dólar ou em Euro. Dispare um alerta de erro, caso o valor que o usuário digite não seja um número. Faça as
adaptações que forem necessárias para que o aplicativo seja o mais prático possível ao usuário.
*/

package Exercícios;

import java.beans.XMLEncoder;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.io.IOException;
import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.lang.NumberFormatException;
import javax.swing.JOptionPane;

public class Exercício6 extends javax.swing.JFrame {

    /**
     * Creates new form Exercício6
     */
    public Exercício6() {
        initComponents();
        setLocation(300, 200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        String dolarHoje = "";

        try{
            Document doc = Jsoup.connect("https://dolarhoje.com/").get();
            Element newsHeadlines = doc.select("#nacional").first();
            dolarHoje = newsHeadlines.attr("value");
        }

        catch(IOException e) {
            e.printStackTrace();
        }
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        String euroHoje = "";

        try{
            Document doc = Jsoup.connect("https://dolarhoje.com/euro-hoje").get();
            Element newsHeadlines = doc.select("#nacional").first();
            euroHoje = newsHeadlines.attr("value");
        }

        catch(IOException e) {
            e.printStackTrace();
        }
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        dólar = new javax.swing.JButton();
        euro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        convertido = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Aplicativo de conversão de moeda comercial");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Valor do dólar atualmente: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("R$ " + dolarHoje);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Valor do euro atualmente: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("R$ " + euroHoje);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("VALOR PARA CONVERTER");

        valor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        dólar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        dólar.setText("Real para dólar");
        dólar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dólarActionPerformed(evt);
            }
        });

        euro.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        euro.setText("Real para euro");
        euro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                euroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("VALOR CONVERTIDO");

        convertido.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        convertido.setForeground(new java.awt.Color(255, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setText("R$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(convertido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valor))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(138, 138, 138))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(dólar)
                .addGap(97, 97, 97)
                .addComponent(euro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dólar)
                    .addComponent(euro))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(convertido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dólarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dólarActionPerformed

        String dolarHoje = "";
        
        try{
        try{
            Document doc = Jsoup.connect("https://dolarhoje.com/").get();
            Element newsHeadlines = doc.select("#nacional").first();
            dolarHoje = newsHeadlines.attr("value");
        }

        catch(IOException e) {
            e.printStackTrace();
        }
        
        dolarHoje = dolarHoje.replaceAll(",", ".");
        double dolar = Double.parseDouble(dolarHoje);
        
        double real = Double.parseDouble(valor.getText().replaceAll(",", ".")); 
        
        double dolarConvertido = real / dolar;
       
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');
        DecimalFormat df1 = new DecimalFormat("$ ###,###.00", symbols);
        String dolarFormat = df1.format(dolarConvertido);
        
        convertido.setText(dolarFormat);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "DIGITE UM NÚMERO!",
                "ERRO",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_dólarActionPerformed

    private void euroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_euroActionPerformed
        String euroHoje = "";
        
        try{
        try{
            Document doc = Jsoup.connect("https://dolarhoje.com/euro-hoje").get();
            Element newsHeadlines = doc.select("#nacional").first();
            euroHoje = newsHeadlines.attr("value");
        }

        catch(IOException e) {
            e.printStackTrace();
        }
        
        euroHoje = euroHoje.replaceAll(",", ".");
        double euro = Double.parseDouble(euroHoje);
        
        double real = Double.parseDouble(valor.getText().replaceAll(",", ".")); 
        
        double euroConvertido = real / euro;
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator(',');
        symbols.setGroupingSeparator('.');
        DecimalFormat df2 = new DecimalFormat("€ ###,###.00", symbols);
        String dolarFormat = df2.format(euroConvertido);
        
        convertido.setText(dolarFormat);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,
                "DIGITE UM NÚMERO!",
                "ERRO",
                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_euroActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercício6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercício6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercício6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercício6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercício6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel convertido;
    private javax.swing.JButton dólar;
    private javax.swing.JButton euro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}

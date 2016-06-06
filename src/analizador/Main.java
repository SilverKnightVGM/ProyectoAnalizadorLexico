/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import jdk.internal.org.objectweb.asm.tree.analysis.Interpreter;
/**
 *
 * @author bogar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */

    public Main() {
        initComponents();
        HideComponents();
        setSize(242,356);
        
    }

    public void HideComponents (){
    
        //Elemento 1
        txt_val1.setVisible(false);
        txt_areaComp1.setVisible(false);
        jScrollPane2.setVisible(false);
        txt_areaComp1.setText("");
        
        //Elemento 2
        txt_val2.setVisible(false);
        txt_areaComp2.setVisible(false);
        jScrollPane3.setVisible(false);
        txt_areaComp2.setText("");
        
        //Elemento 3
        txt_val3.setVisible(false);
        txt_areaComp3.setVisible(false);
        jScrollPane4.setVisible(false);
        txt_areaComp3.setText("");
        
        //Elemento 4
        txt_val4.setVisible(false);
        txt_areaComp4.setVisible(false);
        jScrollPane5.setVisible(false);
        txt_areaComp4.setText("");
        
        //Elemento 5
        txt_val5.setVisible(false);
        txt_areaComp5.setVisible(false);
        jScrollPane6.setVisible(false);
        txt_areaComp5.setText("");
        
        //Elemento 6
        txt_val6.setVisible(false);
        txt_areaComp6.setVisible(false);
        jScrollPane6.setVisible(false);
        
        //Elemento 7
        txt_val7.setVisible(false);
        txt_areaComp7.setVisible(false);
        jScrollPane8.setVisible(false);
        txt_areaComp7.setText("");
        
        //Elemento 8
        txt_val8.setVisible(false);
        txt_areaComp8.setVisible(false);
        jScrollPane9.setVisible(false);
        txt_areaComp8.setText("");
        
        //Elemento 9
        txt_val9.setVisible(false);
        txt_areaComp9.setVisible(false);
        jScrollPane10.setVisible(false);
        txt_areaComp9.setText("");
        
        //Elemento 10
        txt_val10.setVisible(false);
        txt_areaComp10.setVisible(false);
        jScrollPane11.setVisible(false);
        txt_areaComp10.setText("");
    } 
    
    
    public void ShowComponent1 (){
        txt_val1.setVisible(true);
        txt_areaComp1.setVisible(true);
        jScrollPane2.setVisible(true);
        txt_areaComp1.setText("");
    }
    
    public void ShowComponent2 (){
        txt_val2.setVisible(true);
        txt_areaComp2.setVisible(true);
        jScrollPane3.setVisible(true);
        txt_areaComp2.setText("");
    }
    
    public void ShowComponent3 (){
        txt_val3.setVisible(true);
        txt_areaComp3.setVisible(true);
        jScrollPane4.setVisible(true);
        txt_areaComp3.setText("");
    }
    
    public void ShowComponent4 (){
        txt_val4.setVisible(true);
        txt_areaComp4.setVisible(true);
        jScrollPane5.setVisible(true);
        txt_areaComp4.setText("");
    }
    
    public void ShowComponent5 (){
        txt_val5.setVisible(true);
        txt_areaComp5.setVisible(true);
        jScrollPane6.setVisible(true);
        txt_areaComp5.setText("");
    }
    
    public void ShowComponent6 (){
        txt_val6.setVisible(true);
        txt_areaComp6.setVisible(true);
        jScrollPane7.setVisible(true);
        txt_areaComp6.setText("");
    }
    
    public void ShowComponent7 (){
        txt_val7.setVisible(true);
        txt_areaComp7.setVisible(true);
        jScrollPane8.setVisible(true);
        txt_areaComp7.setText("");
    }
    
    
    public void ShowComponent8 (){
        txt_val8.setVisible(true);
        txt_areaComp8.setVisible(true);
        jScrollPane9.setVisible(true);
        txt_areaComp8.setText("");
    }
    
    public void ShowComponent9 (){
        txt_val9.setVisible(true);
        txt_areaComp9.setVisible(true);
        jScrollPane10.setVisible(true);
        txt_areaComp9.setText("");
    }
    
    public void ShowComponent10 (){
        txt_val10.setVisible(true);
        txt_areaComp10.setVisible(true);
        jScrollPane11.setVisible(true);
        txt_areaComp10.setText("");
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txt_areaExp = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btn_ing = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_limpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_areaComp3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_areaComp1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_areaComp2 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt_areaComp9 = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        txt_areaComp10 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt_areaComp5 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt_areaComp6 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt_areaComp7 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt_areaComp8 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_areaComp4 = new javax.swing.JTextArea();
        txt_val1 = new javax.swing.JLabel();
        txt_val2 = new javax.swing.JLabel();
        txt_val3 = new javax.swing.JLabel();
        txt_val4 = new javax.swing.JLabel();
        txt_val5 = new javax.swing.JLabel();
        txt_val6 = new javax.swing.JLabel();
        txt_val7 = new javax.swing.JLabel();
        txt_val8 = new javax.swing.JLabel();
        txt_val9 = new javax.swing.JLabel();
        txt_val10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txt_areaExp.setColumns(20);
        txt_areaExp.setRows(5);
        jScrollPane1.setViewportView(txt_areaExp);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Ingrese las Expresiones  ");

        btn_ing.setText("Ingresar");
        btn_ing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        txt_areaComp3.setEditable(false);
        txt_areaComp3.setColumns(20);
        txt_areaComp3.setRows(5);
        jScrollPane4.setViewportView(txt_areaComp3);

        txt_areaComp1.setEditable(false);
        txt_areaComp1.setColumns(20);
        txt_areaComp1.setRows(5);
        jScrollPane2.setViewportView(txt_areaComp1);

        txt_areaComp2.setEditable(false);
        txt_areaComp2.setColumns(20);
        txt_areaComp2.setRows(5);
        jScrollPane3.setViewportView(txt_areaComp2);

        txt_areaComp9.setEditable(false);
        txt_areaComp9.setColumns(20);
        txt_areaComp9.setRows(5);
        jScrollPane10.setViewportView(txt_areaComp9);

        txt_areaComp10.setEditable(false);
        txt_areaComp10.setColumns(20);
        txt_areaComp10.setRows(5);
        jScrollPane11.setViewportView(txt_areaComp10);

        txt_areaComp5.setEditable(false);
        txt_areaComp5.setColumns(20);
        txt_areaComp5.setRows(5);
        jScrollPane6.setViewportView(txt_areaComp5);

        txt_areaComp6.setEditable(false);
        txt_areaComp6.setColumns(20);
        txt_areaComp6.setRows(5);
        jScrollPane7.setViewportView(txt_areaComp6);

        txt_areaComp7.setEditable(false);
        txt_areaComp7.setColumns(20);
        txt_areaComp7.setRows(5);
        jScrollPane8.setViewportView(txt_areaComp7);

        txt_areaComp8.setEditable(false);
        txt_areaComp8.setColumns(20);
        txt_areaComp8.setRows(5);
        jScrollPane9.setViewportView(txt_areaComp8);

        txt_areaComp4.setEditable(false);
        txt_areaComp4.setColumns(20);
        txt_areaComp4.setRows(5);
        jScrollPane5.setViewportView(txt_areaComp4);

        txt_val1.setText("txt_val1");

        txt_val2.setText("txt_val2");

        txt_val3.setText("txt_val3");

        txt_val4.setText("txt_val4");

        txt_val5.setText("txt_val5");

        txt_val6.setText("txt_val6");

        txt_val7.setText("txt_val7");

        txt_val8.setText("txt_val8");

        txt_val9.setText("txt_val9");

        txt_val10.setText("txt_val10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_val1)
                    .addComponent(txt_val2)
                    .addComponent(txt_val3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_val4)
                            .addComponent(txt_val5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_val8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_val7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_val10)
                                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_val6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_val9)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_val1)
                        .addComponent(txt_val4)
                        .addComponent(txt_val7))
                    .addComponent(txt_val10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_val2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_val5)
                        .addComponent(txt_val8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_val3)
                        .addComponent(txt_val6))
                    .addComponent(txt_val9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btn_ing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_limpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_ing)
                            .addComponent(btn_limpiar))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator1))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingActionPerformed
        // TODO add your handling code here:

        ArrayList<String> expresiones = new ArrayList<>();
        String noBlankExp = txt_areaExp.getText().trim();

        if (noBlankExp.equals("")) {
            JOptionPane.showMessageDialog(this, "Enter at least one expression! ", null, JOptionPane.WARNING_MESSAGE);
        } else {

            for (String line : noBlankExp.split("\\n")) {
                expresiones.add(line.replaceAll(" +", ""));
            }
            
            //Removes blank and null expressions from array
            expresiones.removeAll(Arrays.asList("", null));
            
            for (int i = 1; i <= expresiones.size(); i++) {

                switch (i) {
                    case 1:
                        HideComponents();
                        ShowComponent1();
                        setSize(476, 356);
                        checkExp(expresiones.get(i-1), txt_areaComp1);
                        break;
                    case 2:
                        ShowComponent2();
                        setSize(476, 356);
                        checkExp(expresiones.get(i-1), txt_areaComp2);
                        break;
                    case 3:
                        ShowComponent3();
                        setSize(476, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp3);
                        break;
                    case 4:
                        ShowComponent4();
                        setSize(670, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp4);
                        break;
                    case 5:
                        ShowComponent5();
                        setSize(670, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp5);
                        break;
                    case 6:
                        ShowComponent6();
                        setSize(670, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp6);
                        break;
                    case 7:
                        ShowComponent7();
                        setSize(850, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp7);
                        break;
                    case 8:
                        ShowComponent8();
                        setSize(850, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp8);
                        break;
                    case 9:
                        ShowComponent9();
                        setSize(850, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp9);
                        break;
                    case 10:
                        ShowComponent10();
                        setSize(1040, 465);
                        checkExp(expresiones.get(i-1), txt_areaComp10);
                        break;
                    default:
                        JOptionPane.showMessageDialog(this, "Too many expressions, max 10", null, JOptionPane.WARNING_MESSAGE);
                        break;
                }

            }
                
            
            
//            listAllComponentsIn(jPanel2);
        }

//        System.out.println(expresiones);
//        System.out.println(expresiones.isEmpty());
//        System.out.println(expresiones.size());
    }//GEN-LAST:event_btn_ingActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        HideComponents();
        setSize(242,356);
    }//GEN-LAST:event_btn_limpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    public boolean checkParentheses(String s) {
        int nesting = 0;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                    nesting++;
                    break;
                case ')':
                    nesting--;
                    if (nesting < 0) {
                        return false;
                    }
                    break;
            }
        }
        return nesting == 0;
    }
    
    //send expression to evaluate and textArea to set
    public void checkExp(String exp, JTextArea textArea) {
        try {

            int balanced = -1;

            //Set balanced to 1 if parenthesis are balanced, 0 if false, -1 otherwise
            if (checkParentheses(exp)) {
                balanced = 1;
            } else {
                balanced = 0;
            }

            String new_s = exp.toLowerCase().replaceAll("[()]", "");

            AnalizadorJFlex analizador = new AnalizadorJFlex(new StringReader(new_s));

            for (int i = 0; i < exp.length(); i++) {
                if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
                    AnalizadorJFlex analizer = new AnalizadorJFlex(new StringReader(String.valueOf(exp.charAt(i))));
                    textArea.append(analizer.yylex().toString() + "\n");
                }
                if (exp.charAt(i) == '+' || exp.charAt(i) == '-' || exp.charAt(i) == '*' || exp.charAt(i) == '/') {
                    AnalizadorJFlex analizer = new AnalizadorJFlex(new StringReader(String.valueOf(exp.charAt(i))));
                    textArea.append(analizer.yylex().toString() + "\n");
                }
                if (exp.charAt(i) == '(' || exp.charAt(i) == ')') {
                    AnalizadorJFlex analizer = new AnalizadorJFlex(new StringReader(String.valueOf(exp.charAt(i))));
                    textArea.append(analizer.yylex().toString() + "\n");
                }
            }
            
            if(new_s.matches("^-?\\d+$")){
                textArea.append("Expresion Regular= ERROR");
            }else{
                textArea.append("Expresion Regular=" + analizador.yylex().toString());
            }

//            System.out.println("Expresion Regular=" + analizador.yylex());
//            System.out.println("----------------");
//            System.out.println(exp + "|||" + new_s);
//            System.out.println("Balanced: " + balanced);

        } catch (Exception ex) {
//            System.out.println("ERROR LEXICO || " + ex);
            JOptionPane.showMessageDialog(rootPane, ex);
        }
    }
    
//    public void listAllComponentsIn(Container parent) {
//        for (Component c : parent.getComponents()) {
//            if(c instanceof JTextArea){    
//                JTextArea area = (JTextArea) c;
//                area.setText("TEST");
//            }
//
//            if (c instanceof Container) {
//                listAllComponentsIn((Container) c);
//            }
//        }
//    }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ing;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txt_areaComp1;
    private javax.swing.JTextArea txt_areaComp10;
    private javax.swing.JTextArea txt_areaComp2;
    private javax.swing.JTextArea txt_areaComp3;
    private javax.swing.JTextArea txt_areaComp4;
    private javax.swing.JTextArea txt_areaComp5;
    private javax.swing.JTextArea txt_areaComp6;
    private javax.swing.JTextArea txt_areaComp7;
    private javax.swing.JTextArea txt_areaComp8;
    private javax.swing.JTextArea txt_areaComp9;
    private javax.swing.JTextArea txt_areaExp;
    private javax.swing.JLabel txt_val1;
    private javax.swing.JLabel txt_val10;
    private javax.swing.JLabel txt_val2;
    private javax.swing.JLabel txt_val3;
    private javax.swing.JLabel txt_val4;
    private javax.swing.JLabel txt_val5;
    private javax.swing.JLabel txt_val6;
    private javax.swing.JLabel txt_val7;
    private javax.swing.JLabel txt_val8;
    private javax.swing.JLabel txt_val9;
    // End of variables declaration//GEN-END:variables
}

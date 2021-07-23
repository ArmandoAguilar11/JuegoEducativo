/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Clases.Easy;
import Fuentes.Fuentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando
 */
public class Facil extends javax.swing.JFrame {
    int index;
    /**
     * Creates new form Facil
     */
    //ArrayList<Integer> x;
    int i1, i2, i3;
    int puntos = 0;
    Fuentes tipoFuentes;
    ArrayList<Easy> lista = new ArrayList();
    public Facil() {       
        initComponents();
        tipoFuentes = new Fuentes();
        jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.honey, 0, 36));
        Easy obj = new Easy();
        obj.setPregunta("En que código está basado java");
        obj.setCorrecta("C++");
        obj.setA("C++");
        obj.setB("C#");
        obj.setC("PHP");
        obj.setD("JavaScrip");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Cuál es el significado de POO en el tema de programación?");
        obj.setCorrecta("Programación Orientada a Objetos");
        obj.setA("Paradigma Organizado en Objetos");
        obj.setB("Programación Orientada a Objetos");
        obj.setC("Programación Obtenida de Objetos");
        obj.setD("Pantallas Organizadas en Objetos");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Cuando una clase adquiere la propiedad de otra clase, se conoce cómo?");
        obj.setCorrecta("Herencia");
        obj.setA("Constante");
        obj.setB("Encapsulamiento");
        obj.setC("Herencia");
        obj.setD("Interfaz grafica");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("Si un vector es declarado para almacenar 10 valores qué numeración tienen las casillas del vector");
        obj.setCorrecta("0..9");
        obj.setA("0..9");
        obj.setB("1..10");
        obj.setC("1..9");
        obj.setD("Ninguna es correcta");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Que se escribe para ver el contenido de la casilla 5 de un vector?");
        obj.setCorrecta("Vector[4]");
        obj.setA("Vector[5]");
        obj.setB("Vector[4]");
        obj.setC("Vector[1..5]");
        obj.setD("Ninguna es correcta");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿En que año se creó java?");
        obj.setCorrecta("1995");
        obj.setA("1992");
        obj.setB("2000");
        obj.setC("1997");
        obj.setD("1995");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Cuál de estos son operadores de java?");
        obj.setCorrecta("*=/");
        obj.setA("/** * /");
        obj.setB("%/");
        obj.setC("*=/");
        obj.setD("().;");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Cómo se llama la clase que termina una cadena de herencia?");
        obj.setCorrecta("Final");
        obj.setA("Final");
        obj.setB("Public");
        obj.setC("Abstract");
        obj.setD("Extends");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Cuáles son las variables de objeto en java?");
        obj.setCorrecta("Encapsulamiento y herencia");
        obj.setA("Encapsulamiento y herencia");
        obj.setB("Es un conjunto de declaraciones de funciones");
        obj.setC("Agrupación de datos y de funciones");
        obj.setD("Implements Public Extends");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Cómo deben estar las clases public para acceder a ellas desde otras clases?");
        obj.setCorrecta("Importadas");
        obj.setA("Directas");
        obj.setB("Importadas");
        obj.setC("Por herencia");
        obj.setD("Declaradas");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Que objeto utilizaremos para receptar un dato dentro de un formulario?");
        obj.setCorrecta("Textbox");
        obj.setA("Button");
        obj.setB("Radiobutton");
        obj.setC("Label");
        obj.setD("Textbox");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿En que lenguaje está basado c#?");
        obj.setCorrecta("C/C++");
        obj.setA("Java");
        obj.setB("C/C++");
        obj.setC("PHP");
        obj.setD("Python");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿En qué año se creó C#?");
        obj.setCorrecta("2000");
        obj.setA("2000");
        obj.setB("2003");
        obj.setC("1997");
        obj.setD("1995");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Quién fue el creador de C#?");
        obj.setCorrecta("Andrés Hejlsberg");
        obj.setA("Harrison Smitherd");
        obj.setB("Andrés Hejlsberg");
        obj.setC("Arthuras Johnson");
        obj.setD("Conan Hejlsberg");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Quién fue el creador de java?");
        obj.setCorrecta("James Gosling");
        obj.setA("James Gosling");
        obj.setB("Bill Joy");
        obj.setC("Gilad Bracha");
        obj.setD("Larry Wall");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Qué estructura repetitiva se utiliza cuando se sabe el número de veces que se\n" +
        "repetirá un proceso?");
        obj.setCorrecta("For");
        obj.setA("Switch");
        obj.setB("While");
        obj.setC("If");
        obj.setD("For");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿La aplicación Windows forms me permite?");
        obj.setCorrecta("Crear un formulario en blanco para agregar objetos");
        obj.setA("Crear un formulario en blanco para agregar objetos");
        obj.setB("Crear un contenedor de objetos");
        obj.setC("Crear una forma con varios objetos");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿Si ponemos a una variable un nombre reservado, que cáracter debemos poner para\n" +
        "que no lo sea?");
        obj.setCorrecta("@");
        obj.setA("/");
        obj.setB("2003");
        obj.setC("@");
        obj.setD("#");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("La variable instancia");
        obj.setCorrecta("Representa un atributo de un objeto");
        obj.setA("Es el objeto de la clase");
        obj.setB("Representa un atributo de un objeto");
        obj.setC("Es el método de una clase");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj = null;
        obj = new Easy();
        obj.setPregunta("¿ Cuál es el símbolo del operador AND?");
        obj.setCorrecta("&&");
        obj.setA("AND");
        obj.setB("||");
        obj.setC("!");
        obj.setD("&&");
        lista.add(obj);
        obj = null;
        obj = new Easy();          
        index = (int)(Math.random()*lista.size());
        i1 = index;
        jLabel1.setText(lista.get(index).getPregunta());
        jBRespuestaA.setText(lista.get(index).getA());
        jBRespuestaB.setText(lista.get(index).getB());
        jBRespuestaC.setText(lista.get(index).getC());
        jBRespuestaD.setText(lista.get(index).getD()); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jBRespuestaC = new javax.swing.JButton();
        jBRespuestaA = new javax.swing.JButton();
        jBRespuestaB = new javax.swing.JButton();
        jBRespuestaD = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        kGradientPanel1.setkEndColor(new java.awt.Color(247, 217, 206));
        kGradientPanel1.setkGradientFocus(60);
        kGradientPanel1.setkStartColor(new java.awt.Color(247, 177, 197));

        jLabel1.setText("jLabel1");

        jBRespuestaC.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBRespuestaC.setText("jButton1");
        jBRespuestaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaCActionPerformed(evt);
            }
        });

        jBRespuestaA.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBRespuestaA.setText("jButton1");
        jBRespuestaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaAActionPerformed(evt);
            }
        });

        jBRespuestaB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBRespuestaB.setText("jButton1");
        jBRespuestaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaBActionPerformed(evt);
            }
        });

        jBRespuestaD.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jBRespuestaD.setText("jButton1");
        jBRespuestaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaDActionPerformed(evt);
            }
        });

        jButton1.setText("50/50");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Llamada");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jBRespuestaC, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addComponent(jBRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRespuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(98, 98, 98))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jBRespuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(748, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(jBRespuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRespuestaC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(365, Short.MAX_VALUE)
                    .addComponent(jBRespuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(131, 131, 131)))
        );

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRespuestaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaAActionPerformed
        String selected = jBRespuestaA.getText();
        String correcta = lista.get(index).getCorrecta();
        if (selected.equals(correcta)) {
            JOptionPane.showMessageDialog(null, "Correcto");           
                index = (int)(Math.random()*lista.size());
                if (puntos == 0) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 1) {
                    i3 = index;
                    if (i2 == i3) {
                        while(i2 == i3){
                        index = (int)(Math.random()*lista.size());
                        i3 = index;
                        }
                    }
                }
                jLabel1.setText(lista.get(index).getPregunta());
                jBRespuestaA.setText(lista.get(index).getA());
                jBRespuestaB.setText(lista.get(index).getB());
                jBRespuestaC.setText(lista.get(index).getC());
                jBRespuestaD.setText(lista.get(index).getD());
                puntos++;
                jBRespuestaA.setEnabled(true);
                jBRespuestaB.setEnabled(true);
                jBRespuestaC.setEnabled(true);
                jBRespuestaD.setEnabled(true);
                if (puntos >= 3) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Faciles");
                    Intermedio p1 = new Intermedio();
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final();
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaAActionPerformed

    private void jBRespuestaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaBActionPerformed
        String selected = jBRespuestaB.getText(); 
        String correcta = lista.get(index).getCorrecta();
        if (selected.equals(correcta)) {
            JOptionPane.showMessageDialog(null, "Correcto");          
                index = (int)(Math.random()*lista.size());
                if (puntos == 0) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 1) {
                    i3 = index;
                    if (i2 == i3) {
                        while(i2 == i3){
                        index = (int)(Math.random()*lista.size());
                        i3 = index;
                        }
                    }
                }
                jLabel1.setText(lista.get(index).getPregunta());
                jBRespuestaA.setText(lista.get(index).getA());
                jBRespuestaB.setText(lista.get(index).getB());
                jBRespuestaC.setText(lista.get(index).getC());
                jBRespuestaD.setText(lista.get(index).getD());
                puntos++;
                jBRespuestaA.setEnabled(true);
                jBRespuestaB.setEnabled(true);
                jBRespuestaC.setEnabled(true);
                jBRespuestaD.setEnabled(true);
                if (puntos >= 3) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Faciles");
                    Intermedio p1 = new Intermedio();
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final();
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaBActionPerformed

    private void jBRespuestaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaCActionPerformed
        String selected = jBRespuestaC.getText();
        String correcta = lista.get(index).getCorrecta();
        if (selected.equals(correcta)) {
            JOptionPane.showMessageDialog(null, "Correcto");           
                index = (int)(Math.random()*lista.size());
                if (puntos == 0) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 1) {
                    i3 = index;
                    if (i2 == i3) {
                        while(i2 == i3){
                        index = (int)(Math.random()*lista.size());
                        i3 = index;
                        }
                    }
                }
                jLabel1.setText(lista.get(index).getPregunta());
                jBRespuestaA.setText(lista.get(index).getA());
                jBRespuestaB.setText(lista.get(index).getB());
                jBRespuestaC.setText(lista.get(index).getC());
                jBRespuestaD.setText(lista.get(index).getD());
                puntos++;
                jBRespuestaA.setEnabled(true);
                jBRespuestaB.setEnabled(true);
                jBRespuestaC.setEnabled(true);
                jBRespuestaD.setEnabled(true);
                if (puntos >= 3) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Faciles");
                    Intermedio p1 = new Intermedio();
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final();
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaCActionPerformed

    private void jBRespuestaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaDActionPerformed
        String selected = jBRespuestaD.getText();   
        String correcta = lista.get(index).getCorrecta();
        if (selected.equals(correcta)) {
            JOptionPane.showMessageDialog(null, "Correcto");            
                index = (int)(Math.random()*lista.size());
                if (puntos == 0) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 1) {
                    i3 = index;
                    if (i2 == i3) {
                        while(i2 == i3){
                        index = (int)(Math.random()*lista.size());
                        i3 = index;
                        }
                    }
                }
                jLabel1.setText(lista.get(index).getPregunta());
                jBRespuestaA.setText(lista.get(index).getA());
                jBRespuestaB.setText(lista.get(index).getB());
                jBRespuestaC.setText(lista.get(index).getC());
                jBRespuestaD.setText(lista.get(index).getD());
                puntos++;
                jBRespuestaA.setEnabled(true);
                jBRespuestaB.setEnabled(true);
                jBRespuestaC.setEnabled(true);
                jBRespuestaD.setEnabled(true);
                if (puntos >= 3) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Faciles");
                    Intermedio p1 = new Intermedio();
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final();
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String correcta = lista.get(index).getCorrecta();
        Llamada p1 = new Llamada(correcta);
        p1.setVisible(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String correcta = lista.get(index).getCorrecta();
        if (!jBRespuestaA.getText().equals(correcta) &&!jBRespuestaB.getText().equals(correcta)) {
            jBRespuestaA.setEnabled(false);
            jBRespuestaB.setEnabled(false);
        }
        else if (!jBRespuestaA.getText().equals(correcta) &&!jBRespuestaC.getText().equals(correcta)) {
            jBRespuestaA.setEnabled(false);
            jBRespuestaC.setEnabled(false);
        }
        else if (!jBRespuestaA.getText().equals(correcta) &&!jBRespuestaD.getText().equals(correcta)) {
            jBRespuestaA.setEnabled(false);
            jBRespuestaD.setEnabled(false);
        }
        else if (!jBRespuestaB.getText().equals(correcta) &&!jBRespuestaC.getText().equals(correcta)) {
            jBRespuestaB.setEnabled(false);
            jBRespuestaC.setEnabled(false);
        }
        else if (!jBRespuestaB.getText().equals(correcta) &&!jBRespuestaD.getText().equals(correcta)) {
            jBRespuestaB.setEnabled(false);
            jBRespuestaD.setEnabled(false);
        }
        else if (!jBRespuestaC.getText().equals(correcta) &&!jBRespuestaD.getText().equals(correcta)) {
            jBRespuestaC.setEnabled(false);
            jBRespuestaD.setEnabled(false);
        }
        jButton1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRespuestaA;
    private javax.swing.JButton jBRespuestaB;
    private javax.swing.JButton jBRespuestaC;
    private javax.swing.JButton jBRespuestaD;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}

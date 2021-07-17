/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Clases.Easy;
import Clases.EasyList;
import Fuentes.Fuentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Armando
 */
public class Facil extends javax.swing.JFrame {

    /**
     * Creates new form Facil
     */
    Fuentes tipoFuentes;
    ArrayList<Easy> lista = new ArrayList();
    public Facil() {       
        initComponents();
        tipoFuentes = new Fuentes();
        jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.honey, 0, 24));
        Easy obj = new Easy();
        obj.setPregunta("En que código está basado java");
        obj.setCorrecta("C++");
        obj.setA("C++");
        obj.setB("C#");
        obj.setC("PHP");
        obj.setD("JavaScrip");
        lista.add(obj);
        obj.setPregunta("¿Cuál es el significado de POO en el tema de programación?");
        obj.setCorrecta("Programación Orientada a Objetos");
        obj.setA("Paradigma Organizado en Objetos");
        obj.setB("Programación Orientada a Objetos");
        obj.setC("Programación Obtenida de Objetos");
        obj.setD("Pantallas Organizadas en Objetos");
        lista.add(obj);
        obj.setPregunta("¿Cuando una clase adquiere la propiedad de otra clase, se conoce cómo?");
        obj.setCorrecta("Herencia");
        obj.setA("Constante");
        obj.setB("Encapsulamiento");
        obj.setC("Herencia");
        obj.setD("Interfaz grafica");
        lista.add(obj);
        obj.setPregunta("Si un vector es declarado para almacenar 10 valores qué numeración tienen las casillas del vector");
        obj.setCorrecta("0..9");
        obj.setA("0..9");
        obj.setB("1..10");
        obj.setC("1..9");
        obj.setD("Ninguna es correcta");
        lista.add(obj);
        obj.setPregunta("¿Que se escribe para ver el contenido de la casilla 5 de un vector?");
        obj.setCorrecta("Vector[4]");
        obj.setA("Vector[5]");
        obj.setB("Vector[4]");
        obj.setC("Vector[1..5]");
        obj.setD("Ninguna es correcta");
        lista.add(obj);
        obj.setPregunta("¿En que año se creó java?");
        obj.setCorrecta("1995");
        obj.setA("1992");
        obj.setB("2000");
        obj.setC("1997");
        obj.setD("1995");
        lista.add(obj);
        obj.setPregunta("¿Cuál de estos son operadores de java?");
        obj.setCorrecta("*=/");
        obj.setA("/** * /");
        obj.setB("%/");
        obj.setC("*=/");
        obj.setD("().;");
        lista.add(obj);
        obj.setPregunta("¿Cómo se llama la clase que termina una cadena de herencia?");
        obj.setCorrecta("Final");
        obj.setA("Final");
        obj.setB("Public");
        obj.setC("Abstract");
        obj.setD("Extends");
        lista.add(obj);
        obj.setPregunta("¿Cuáles son las variables de objeto en java?");
        obj.setCorrecta("Encapsulamiento y herencia");
        obj.setA("Encapsulamiento y herencia");
        obj.setB("Es un conjunto de declaraciones de funciones");
        obj.setC("Agrupación de datos y de funciones");
        obj.setD("Implements Public Extends");
        lista.add(obj);
        obj.setPregunta("¿Cómo deben estar las clases public para acceder a ellas desde otras clases?");
        obj.setCorrecta("Importadas");
        obj.setA("Directas");
        obj.setB("Importadas");
        obj.setC("Por herencia");
        obj.setD("Declaradas");
        lista.add(obj);
        obj.setPregunta("¿Que objeto utilizaremos para receptar un dato dentro de un formulario?");
        obj.setCorrecta("Textbox");
        obj.setA("Button");
        obj.setB("Radiobutton");
        obj.setC("Label");
        obj.setD("Textbox");
        lista.add(obj);
        obj.setPregunta("¿En que lenguaje está basado c#?");
        obj.setCorrecta("C/C++");
        obj.setA("Java");
        obj.setB("C/C++");
        obj.setC("PHP");
        obj.setD("Python");
        lista.add(obj);
        obj.setPregunta("¿En qué año se creó C#?");
        obj.setCorrecta("2000");
        obj.setA("2000");
        obj.setB("2003");
        obj.setC("1997");
        obj.setD("1995");
        lista.add(obj);
        obj.setPregunta("¿Quién fue el creador de C#?");
        obj.setCorrecta("Andrés Hejlsberg");
        obj.setA("Harrison Smitherd");
        obj.setB("Andrés Hejlsberg");
        obj.setC("Arthuras Johnson");
        obj.setD("Conan Hejlsberg");
        lista.add(obj);
        obj.setPregunta("¿Quién fue el creador de java?");
        obj.setCorrecta("James Gosling");
        obj.setA("James Gosling");
        obj.setB("Bill Joy");
        obj.setC("Gilad Bracha");
        obj.setD("Larry Wall");
        lista.add(obj);
        obj.setPregunta("¿Qué estructura repetitiva se utiliza cuando se sabe el número de veces que se\n" +
    "repetirá un proceso?");
        obj.setCorrecta("For");
        obj.setA("Switch");
        obj.setB("While");
        obj.setC("If");
        obj.setD("For");
        lista.add(obj);
        obj.setPregunta("¿La aplicación Windows forms me permite?");
        obj.setCorrecta("Crear un formulario en blanco para agregar objetos");
        obj.setA("Crear un formulario en blanco para agregar objetos");
        obj.setB("Crear un contenedor de objetos");
        obj.setC("Crear una forma con varios objetos");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj.setPregunta("¿Si ponemos a una variable un nombre reservado, que cáracter debemos poner para\n" +
        "que no lo sea?");
        obj.setCorrecta("@");
        obj.setA("/");
        obj.setB("2003");
        obj.setC("@");
        obj.setD("#");
        lista.add(obj);
        obj.setPregunta("La variable instancia");
        obj.setCorrecta("Representa un atributo de un objeto");
        obj.setA("Es el objeto de la clase");
        obj.setB("Representa un atributo de un objeto");
        obj.setC("Es el método de una clase");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj.setPregunta("¿ Cuál es el símbolo del operador AND?");
        obj.setCorrecta("&&");
        obj.setA("AND");
        obj.setB("||");
        obj.setC("!");
        obj.setD("&&");
        lista.add(obj);
        jLabel1.setText(lista.get(1).getPregunta());
        jBRespuestaA.setText(lista.get(1).getA());
        jBRespuestaB.setText(lista.get(1).getB());
        jBRespuestaC.setText(lista.get(1).getC());
        jBRespuestaD.setText(lista.get(1).getD());
    }
    void comparar(String param){
        String correcta = lista.get(1).getCorrecta();
        if (correcta == param) {
            JOptionPane.showMessageDialog(null, "Correcto");
        }
        else{
            JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final();
            p.setVisible(true);
            this.setVisible(false);
        }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        kGradientPanel1.setkEndColor(new java.awt.Color(247, 217, 206));
        kGradientPanel1.setkGradientFocus(60);
        kGradientPanel1.setkStartColor(new java.awt.Color(247, 177, 197));

        jLabel1.setText("jLabel1");

        jBRespuestaC.setText("jButton1");
        jBRespuestaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaCActionPerformed(evt);
            }
        });

        jBRespuestaA.setText("jButton1");
        jBRespuestaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaAActionPerformed(evt);
            }
        });

        jBRespuestaB.setText("jButton1");
        jBRespuestaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaBActionPerformed(evt);
            }
        });

        jBRespuestaD.setText("jButton1");
        jBRespuestaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespuestaDActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(jBRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRespuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(628, 628, 628))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jBRespuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(738, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
                .addComponent(jBRespuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRespuestaC, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                    .addContainerGap(338, Short.MAX_VALUE)
                    .addComponent(jBRespuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(131, 131, 131)))
        );

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRespuestaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaAActionPerformed
        String selected = jBRespuestaA.getText();
        comparar(selected);
    }//GEN-LAST:event_jBRespuestaAActionPerformed

    private void jBRespuestaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaBActionPerformed
        String selected = jBRespuestaB.getText();
        comparar(selected);
    }//GEN-LAST:event_jBRespuestaBActionPerformed

    private void jBRespuestaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaCActionPerformed
        String selected = jBRespuestaC.getText();
        comparar(selected);
    }//GEN-LAST:event_jBRespuestaCActionPerformed

    private void jBRespuestaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaDActionPerformed
        String selected = jBRespuestaD.getText();
        comparar(selected);
    }//GEN-LAST:event_jBRespuestaDActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}

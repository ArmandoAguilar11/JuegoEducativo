/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Clases.Difficult;
import Fuentes.Fuentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer
 */
public class Dificil extends javax.swing.JFrame {
    int index;
    /**
     * Creates new form Dificil
     */
    //ArrayList<Integer> x;
    int i1, i2, i3;
    int puntos = 0;
    Fuentes tipoFuentes;
    ArrayList<Difficult> lista = new ArrayList();
    public Dificil() {
        initComponents();
        tipoFuentes = new Fuentes();
        jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.honey, 0, 24));
        Difficult obj = new Difficult();
        obj.setPregunta("Del siguiente código podemos decir que:");
        obj.setCorrecta("Imprime la matriz de 3x3 con sus respectivos valores");
        obj.setA("Imprime una matriz cuadrada de 2x2");
        obj.setB("Imprime los valores de los arreglos");
        obj.setC("Imprime la matriz de 3x3 con sus respectivos valores");
        obj.setD("No imprime la matriz debido a que tiene un error en el código");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Que aparecerá al ejecutar este código?");
        obj.setCorrecta("43");
        obj.setA("42.72");
        obj.setB("42");
        obj.setC("No se ejecutará, producirá error");
        obj.setD("43");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("Una clase por sí sola no sirve de nada, pues no es más que un concepto,/n" +
        "sin entidad real. Para poder utilizar una clase en un programa/n" +
        "lo que hay que hacer es:");
        obj.setCorrecta("Instanciarla");
        obj.setA("Insertarla");
        obj.setB("Instanciarla");
        obj.setC("Ejecutarla");
        obj.setD("Crearla nuevamente");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("A que hace referencia el siguiente enunciado./n" +
        "“Representan una entidad concreta o abstracta del mundo real, en programación/n" +
        "básicamente se le conoce como la instancia de una clase en si es/n" +
        "lo que da el sentido a estas.”");
        obj.setCorrecta("Objeto");
        obj.setA("Objeto");
        obj.setB("Atributo");
        obj.setC("Funciones");
        obj.setD("Librería");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Cuál  es  el  significado  en español  de las  siglas del patrón  de arquitectura de  software MVC?");
        obj.setCorrecta("Modelo Vista y Controlador");
        obj.setA("Manejo Vectorial de Clases");
        obj.setB("Manejo Volátil de Clases");
        obj.setC("Material Vectorial de Clases");
        obj.setD("Modelo Vista y Controlador");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("“Se refiere al grado en que una clase sabe acerca de otra clase”./n" +
        "¿A qué concepto hace referencia el enunciado anterior?");
        obj.setCorrecta("Acoplamiento");
        obj.setA("Acoplamiento");
        obj.setB("Rango");
        obj.setC("Modelo MVC");
        obj.setD("Login");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("“Es una asociación que representa una parte de una relación completa donde/n" +
        "una parte no puede existir sin un todo”, el enunciado anterior hace referencia a:");
        obj.setCorrecta("Composición");
        obj.setA("Herencia");
        obj.setB("Matriz Unidimensional");
        obj.setC("Composición");
        obj.setD("POO");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("Se refiere a la combinación de datos y funciones asociadas como una sola unidad./n" +
        "En la POO, los datos y las funciones que operan con estos datos se combinan/n" +
        "para tomar una sola unidad, lo que se conoce como una clase.");
        obj.setCorrecta("Encapsulación");
        obj.setA("Encapsulación");
        obj.setB("Foreach");
        obj.setC("Programación Modular");
        obj.setD("Polimorfismo");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("Del siguiente código podemos decirque:");
        obj.setCorrecta("Imprime solo los valores que están debajo de la diagonal de la/n"+
        "matriz incluyendo la diagonal");
        obj.setA("Imprime la matriz de 3x3 haciendo un recorrido total");
        obj.setB("Imprime la matriz 3x3 haciendo un recorrido parcial");
        obj.setC("Imprime la diagonal de la matriz haciendo un recorrido parcial");
        obj.setD("Imprime solo los valores que están debajo de la diagonal de la/n"+
        "matriz incluyendo la diagonal");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("El resultado que muestra en pantalla el código anterior es:");
        obj.setCorrecta("123/n" +
        "456");
        obj.setA("123/n" +
        "456");
        obj.setB("1 2 3 4 5 6");
        obj.setC("No imprime nada");
        obj.setD("142/n" +
        "536");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("La propiedad que me permite presentar el formulario en la pantalla/n" +
        "y que debe estar por defecto en true es:");
        obj.setCorrecta("Key Preview");
        obj.setA("Visible");
        obj.setB("Key Preview");
        obj.setC("Enabled");
        obj.setD("Opacity");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("En C# la función PRINTF permite:");
        obj.setCorrecta("Visualizar un mensaje");
        obj.setA("Visualizar un mensaje");
        obj.setB("Leer un valor");
        obj.setC("Leer y visualizar");
        obj.setD("Inicializar");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("Si deseamos cerrar un formulario en C#se utiliza la orden:");
        obj.setCorrecta("This.Close()");
        obj.setA("Thisfor.Close()");
        obj.setB("This.Close()");
        obj.setC("Close()");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Cuáles de las siguientes librerías se utilizan en programación C#?");
        obj.setCorrecta("using System; using System.Collections.Generic; using System.Linq; using System.Text;");
        obj.setA("using System; using System.Collections.Generic;");
        obj.setB("using System.Lin; using System.Tex; using System.Collections");
        obj.setC("using System; using System.Collections.Generic; using System.Linq; using System.Text;");
        obj.setD("using System; using System.Collections.");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Qué elementos crees que definen a un objeto?");
        obj.setCorrecta("Sus atributos y sus métodos");
        obj.setA("La forma en que establece comunicación e intercambiar mensajes.");
        obj.setB("Sus atributos y sus métodos");
        obj.setC("Su interfaz y los eventos asociado");
        obj.setD("Sus cardinalidad y su tipo");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Qué significa sobrecargar (overload) un método?");
        obj.setCorrecta("Crear un método con el mismo nombre pero diferentes argumentos o tipo de parametros");
        obj.setA("Añadirle funcionalidades a un método");
        obj.setB("Editarlo para modificar su comportamiento");
        obj.setC("Crear un método con el mismo nombre pero diferentes argumentos o tipo de parametros");
        obj.setD("Cambiarle el nombre dejándolo con la misma funcionalidad");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Qué opción define mejor el concepto de 'herencia' en Java?");
        obj.setCorrecta("Permite crear una clase (subclase) basada en otra clase (superclase)");
        obj.setA("Permite crear una clase (subclase) basada en otra clase (superclase)");
        obj.setB("Propiedad que permite crear múltiples objetos a partir de una sola clase");
        obj.setC("Es la compatibilidad que presenta Java entre versiones");
        obj.setD("Ejecutar aplicaciones creadas en una versión antigua en una más moderna");
        lista.add(obj);
        obj = null;
        obj = new Difficult();
        obj.setPregunta("¿Qué significa instanciar una clase?");
        obj.setCorrecta("Crear un objeto a partir de la clase");
        obj.setA("Conectar dos clases entre sí");
        obj.setB("Duplicar una clase");
        obj.setC("Crear un objeto a partir de la clase");
        obj.setD("Eliminar una clase");
        lista.add(obj);
        obj = null;
        obj = new Difficult();          
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
        jLabel2 = new javax.swing.JLabel();
        jBRespuestaA = new javax.swing.JButton();
        jBRespuestaB = new javax.swing.JButton();
        jBRespuestaD = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel2.setText("jLabel2");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                        .addComponent(jBRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBRespuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(303, 303, 303)
                .addComponent(jButton2)
                .addGap(76, 76, 76)
                .addComponent(jButton1)
                .addGap(63, 63, 63))
            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(kGradientPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jBRespuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(738, Short.MAX_VALUE)))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1309, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRespuestaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaAActionPerformed
        // TODO add your handling code here:
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
                    if (i2 == i3 || i1 == i3) {
                        while(i2 == i3 || i1 == i3){
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
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Difíciles");
                    Final p1 = new Final();
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
        // TODO add your handling code here:
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
                    if (i2 == i3 || i1 == i3) {
                        while(i2 == i3 || i1 == i3){
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
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Difíciles");
                    Final p1 = new Final();
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
        // TODO add your handling code here:
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
                    if (i2 == i3 || i1 == i3) {
                        while(i2 == i3 || i1 == i3){
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
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Difíciles");
                    Final p1 = new Final();
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
        // TODO add your handling code here:
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
                    if (i2 == i3 || i1 == i3) {
                        while(i2 == i3 || i1 == i3){
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
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Difíciles");
                    Final p1 = new Final();
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
        // TODO add your handling code here:
        String correcta = lista.get(index).getCorrecta();
        Llamada p1 = new Llamada(correcta);
        p1.setVisible(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dificil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dificil().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}

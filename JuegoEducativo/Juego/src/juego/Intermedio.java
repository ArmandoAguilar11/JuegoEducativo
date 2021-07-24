/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Clases.Intermediate;
import Fuentes.Fuentes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jennifer
 */
public class Intermedio extends javax.swing.JFrame {
    int index;
    /**
     * Creates new form Intermedio
     */
    Fuentes tipoFuentes;
    int i1, i2, i3;
    int puntos;
    String name;
    ArrayList<Intermediate> lista = new ArrayList();
    public Intermedio(String nameparam, int points, boolean com1, boolean com2) {
        initComponents();
        name = nameparam;
        if (com1 == false && com2 == false) {
            jButton2.setEnabled(false);
            jButton1.setEnabled(false);
        }
        else if (com1 == false && com2 == true) {
            jButton2.setEnabled(false);
            jButton1.setEnabled(true);
        }
        else if (com1 == true && com2 == false) {
            jButton2.setEnabled(true);
            jButton1.setEnabled(false);
        }
        else if (com1 == true && com2 == true) {
            jButton2.setEnabled(true);
            jButton1.setEnabled(true);
        }
        puntos = points;
        tipoFuentes = new Fuentes();
        jLabel1.setFont(tipoFuentes.fuente(tipoFuentes.honey, 0, 24));
        Intermediate obj = new Intermediate();
        obj.setPregunta("Al arreglo bidimensional se le conoce con el nombre de:");
        obj.setCorrecta("Matriz");
        obj.setA("Vector");
        obj.setB("Contador");
        obj.setC("Matriz");
        obj.setD("Ninguna es correcta");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("“Es la capacidad que tienen los objetos de una clase en ofrecer respuesta  distinta\n" +
        "e independiente  en  función  de  los  parámetros  (diferentes  implementaciones)\n" +
        "utilizados durante su invocación.”. El concepto anterior pertenece a:");
        obj.setCorrecta("Polimorfismo");
        obj.setA("Polimorfismo");
        obj.setB("Array");
        obj.setC("Herencia");
        obj.setD("Constante");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Se utiliza para describir un fichero o un campo de datos con más detalle.\n" +
        "En la programación orientada a objetos, estos son una propiedad o característica\n" +
        "que se puede asignar a un objeto (elemento)");
        obj.setCorrecta("Atributo");
        obj.setA("Variable");
        obj.setB("Parámetro");
        obj.setC("Atributo");
        obj.setD("Array");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Qué tipo de ciclo se adapta fácilmente para el manejo de loselementos de un vector:");
        obj.setCorrecta("For");
        obj.setA("While");
        obj.setB("For");
        obj.setC("While do");
        obj.setD("Ninguna es correcta");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Cuál de estas inicializaciones espara números enteros:");
        obj.setCorrecta("int[ ] edad = {45, 23, 11, 9}");
        obj.setA("int[ ] edad = {45, 23, 11, 9}");
        obj.setB("double[ ] estatura = {1.73, 1.67, 1.56};");
        obj.setC("char[ ] sexo = {'m', 'f'};");
        obj.setD("boolean[ ] = {true,false};");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("En una estructura de control, es una variable cuyo valor incrementa o decrementa una cantidad.");
        obj.setCorrecta("Contador");
        obj.setA("Centinela");
        obj.setB("Bucle");
        obj.setC("Bandera");
        obj.setD("Contador");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Cuál de las siguientes no es un tipo de estructura selectiva?");
        obj.setCorrecta("While");
        obj.setA("If");
        obj.setB("While");
        obj.setC("Else-if");
        obj.setD("Switch");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿De qué tipo de dato es el resultado de cualquier estructura selectiva?");
        obj.setCorrecta("Boolean");
        obj.setA("Int");
        obj.setB("String");
        obj.setC("Boolean");
        obj.setD("Double");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Cuál de estas inicializaciones es para caracteres:");
        obj.setCorrecta("char[ ] sexo = {'m', 'f'};");
        obj.setA("int[ ] edad = {45, 23, 11, 9};");
        obj.setB("double[ ] estatura = {1.73, 1.67, 1.56};");
        obj.setC("char[ ] sexo = {'m', 'f'};");
        obj.setD("boolean[ ] = {true,false};");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Es una relación entre dos clases separadas que se establece a través de sus objetos.");
        obj.setCorrecta("Asociación");
        obj.setA("Polimorfismo");
        obj.setB("Encapsulamiento");
        obj.setC("Herencia");
        obj.setD("Asociación");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Para qué se utiliza el operador aritmético MOD?");
        obj.setCorrecta("Se utiliza para sustraer el residuo de una división");
        obj.setA("Se utiliza para sustraer el residuo de una división");
        obj.setB("Se utiliza para tomar la parte entera del cociente de una división");
        obj.setC("Se utiliza para obtener la potencia de la base elevada al exponente");
        obj.setD("Se utiliza para obtener el producto entre los operandos");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Elige la opción que contiene operadores relacionales.");
        obj.setCorrecta(">, <, >=, <=, !=, ==");
        obj.setA("=, +, *, !=");
        obj.setB("!!, ||, >=, <=");
        obj.setC(">, <, ++, --");
        obj.setD(">, <, >=, <=, !=, ==");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Qué tipo de operadores solo puede tener de resultados “verdadero” o “falso”?");
        obj.setCorrecta("Operadores lógicos");
        obj.setA("Operadores aritméticos");
        obj.setB("Operadores de asignación");
        obj.setC("Operadores lógicos");
        obj.setD("Operadores relacionales");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Qué significa este ejemplo “If (test1)&&(test2)” en relación al operador “&&”?");
        obj.setCorrecta("Solo evalua test2 si test1 es cierto");
        obj.setA("Solo evalua test2 si test1 es cierto");
        obj.setB("Cierto si ambos son ciertos");
        obj.setC("Cierto si alguno de los dos es cierto");
        obj.setD("Ninguna respuesta es correcta");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Es la descripción de un conjunto de objetos similares; consta de métodos y de datos\n" +
        "que resumen las características comunes de dicho conjunto, estamos hablando de:");
        obj.setCorrecta("Clase");
        obj.setA("Ciclo Do While");
        obj.setB("Objeto");
        obj.setC("Clase");
        obj.setD("Archivo");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Cuál de estas opciones no es un paradigma de programación?");
        obj.setCorrecta("Programación Cuadrada");
        obj.setA("Programación Orientada a Objetos");
        obj.setB("Programación Secuencial");
        obj.setC("Programación Cuadrada");
        obj.setD("Programación Imperativa");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Dónde y cuándo surgió el paradigma de Programación Orientada a objetos (POO)?");
        obj.setCorrecta("Noruega en 1967");
        obj.setA("Alemania en 1965");
        obj.setB("Estados Unidos en 1982");
        obj.setC("Japón en 1979");
        obj.setD("Noruega en 1967");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿En caso de que no se le de valor a un tipo bolean el valor por defecto es?");
        obj.setCorrecta("False");
        obj.setA("True");
        obj.setB("False");
        obj.setC("Null");
        obj.setD("Hay que darle un valor");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();         
        index = (int)(Math.random()*lista.size());
        i1 = index;
        jLabel1.setText(lista.get(index).getPregunta());
        jBRespuestaA.setText(lista.get(index).getA());
        jBRespuestaB.setText(lista.get(index).getB());
        jBRespuestaC.setText(lista.get(index).getC());
        jBRespuestaD.setText(lista.get(index).getD()); 
    }

    private Intermedio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        setExtendedState(6);
        setState(6);

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
                .addGap(291, 291, 291)
                .addComponent(jButton2)
                .addGap(87, 87, 87)
                .addComponent(jButton1)
                .addGap(64, 64, 64))
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

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRespuestaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaAActionPerformed
        String selected = jBRespuestaA.getText();
        String correcta = lista.get(index).getCorrecta();
        if (selected == correcta) {
            JOptionPane.showMessageDialog(null, "Correcto");           
                index = (int)(Math.random()*lista.size());
                if (puntos == 3) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 4) {
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
                if (puntos >= 6) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Intermedias");
                    Dificil p1 = new Dificil(name, puntos);
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final(name, puntos);
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaAActionPerformed

    private void jBRespuestaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaBActionPerformed
        String selected = jBRespuestaB.getText();
        String correcta = lista.get(index).getCorrecta();
        if (selected == correcta) {
            JOptionPane.showMessageDialog(null, "Correcto");           
                index = (int)(Math.random()*lista.size());
                if (puntos == 3) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 4) {
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
                if (puntos >= 6) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Intermedias");
                    Dificil p1 = new Dificil(name, puntos);
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final(name, puntos);
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaBActionPerformed

    private void jBRespuestaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaCActionPerformed
        String selected = jBRespuestaC.getText();
        String correcta = lista.get(index).getCorrecta();
        if (selected == correcta) {
            JOptionPane.showMessageDialog(null, "Correcto");           
                index = (int)(Math.random()*lista.size());
                if (puntos == 3) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 4) {
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
                if (puntos >= 6) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Intermedias");
                    Dificil p1 = new Dificil(name, puntos);
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final(name, puntos);
            p.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jBRespuestaCActionPerformed

    private void jBRespuestaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespuestaDActionPerformed
        String selected = jBRespuestaD.getText();
        String correcta = lista.get(index).getCorrecta();
        if (selected == correcta) {
            JOptionPane.showMessageDialog(null, "Correcto");           
                index = (int)(Math.random()*lista.size());
                if (puntos == 3) {
                i2 = index;
                if (i1 == i2) {
                while(i1 == i2){
                    index = (int)(Math.random()*lista.size());
                    i2 = index;
                    }
                  }
                }
                if (puntos == 4) {
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
                if (puntos >= 6) {
                    JOptionPane.showMessageDialog(null, "Felicidades, terminastes las preguntas Intermedias");
                    Dificil p1 = new Dificil(name, puntos);
                    p1.setVisible(true);
                    this.setVisible(false);
                } 
        }
        else{
        JOptionPane.showMessageDialog(null, "Incorrecto");
            Final p = new Final(name, puntos);
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
        if (jBRespuestaA.getText() != correcta &&jBRespuestaB.getText() != correcta) {
            jBRespuestaA.setEnabled(false);
            jBRespuestaB.setEnabled(false);
        }
        else if (jBRespuestaA.getText() != correcta &&jBRespuestaC.getText() != correcta) {
            jBRespuestaA.setEnabled(false);
            jBRespuestaC.setEnabled(false);
        }
        else if (jBRespuestaA.getText() != correcta &&jBRespuestaD.getText() != correcta) {
            jBRespuestaA.setEnabled(false);
            jBRespuestaD.setEnabled(false);
        }
        else if (jBRespuestaB.getText() != correcta &&jBRespuestaC.getText() != correcta) {
            jBRespuestaB.setEnabled(false);
            jBRespuestaC.setEnabled(false);
        }
        else if (jBRespuestaB.getText() != correcta &&jBRespuestaD.getText() != correcta) {
            jBRespuestaB.setEnabled(false);
            jBRespuestaD.setEnabled(false);
        }
        else if (jBRespuestaC.getText() != correcta &&jBRespuestaD.getText() != correcta) {
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
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intermedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intermedio().setVisible(true);
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

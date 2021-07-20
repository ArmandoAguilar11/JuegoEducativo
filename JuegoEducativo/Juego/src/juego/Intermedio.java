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
 * @author Armando
 */
public class Intermedio extends javax.swing.JFrame {
    int index;
    /**
     * Creates new form Intermedio
     */
    Fuentes tipoFuentes;
    int puntos = 0;
    ArrayList<Intermediate> lista = new ArrayList();
    public Intermedio() {
        initComponents();
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
        obj.setPregunta("“Es la capacidad que tienen los objetos de una clase en ofrecer respuesta  distinta  e independiente  en  función  de  los  parámetros  (diferentes  implementaciones)  utilizados durante su invocación.”. El concepto anterior pertenece a:");
        obj.setCorrecta("Polimorfismo");
        obj.setA("Polimorfismo");
        obj.setB("Array");
        obj.setC("Herencia");
        obj.setD("Constante");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("Se utiliza para describir un fichero o un campo de datos con más detalle. En la programación orientada a objetos, estos son una propiedad o característica que se puede asignar a un objeto (elemento)");
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
        
        /*Aqui me quede   --- Pregunta 11*/
        
        
        
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Cómo deben estar las clases public para acceder a ellas desde otras clases?");
        obj.setCorrecta("Importadas");
        obj.setA("Directas");
        obj.setB("Importadas");
        obj.setC("Por herencia");
        obj.setD("Declaradas");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Que objeto utilizaremos para receptar un dato dentro de un formulario?");
        obj.setCorrecta("Textbox");
        obj.setA("Button");
        obj.setB("Radiobutton");
        obj.setC("Label");
        obj.setD("Textbox");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿En que lenguaje está basado c#?");
        obj.setCorrecta("C/C++");
        obj.setA("Java");
        obj.setB("C/C++");
        obj.setC("PHP");
        obj.setD("Python");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿En qué año se creó C#?");
        obj.setCorrecta("2000");
        obj.setA("2000");
        obj.setB("2003");
        obj.setC("1997");
        obj.setD("1995");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Quién fue el creador de C#?");
        obj.setCorrecta("Andrés Hejlsberg");
        obj.setA("Harrison Smitherd");
        obj.setB("Andrés Hejlsberg");
        obj.setC("Arthuras Johnson");
        obj.setD("Conan Hejlsberg");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Quién fue el creador de java?");
        obj.setCorrecta("James Gosling");
        obj.setA("James Gosling");
        obj.setB("Bill Joy");
        obj.setC("Gilad Bracha");
        obj.setD("Larry Wall");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Qué estructura repetitiva se utiliza cuando se sabe el número de veces que se\n" +
        "repetirá un proceso?");
        obj.setCorrecta("For");
        obj.setA("Switch");
        obj.setB("While");
        obj.setC("If");
        obj.setD("For");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿La aplicación Windows forms me permite?");
        obj.setCorrecta("Crear un formulario en blanco para agregar objetos");
        obj.setA("Crear un formulario en blanco para agregar objetos");
        obj.setB("Crear un contenedor de objetos");
        obj.setC("Crear una forma con varios objetos");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿Si ponemos a una variable un nombre reservado, que cáracter debemos poner para\n" +
        "que no lo sea?");
        obj.setCorrecta("@");
        obj.setA("/");
        obj.setB("2003");
        obj.setC("@");
        obj.setD("#");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("La variable instancia");
        obj.setCorrecta("Representa un atributo de un objeto");
        obj.setA("Es el objeto de la clase");
        obj.setB("Representa un atributo de un objeto");
        obj.setC("Es el método de una clase");
        obj.setD("Ninguna de las anteriores");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();
        obj.setPregunta("¿ Cuál es el símbolo del operador AND?");
        obj.setCorrecta("&&");
        obj.setA("AND");
        obj.setB("||");
        obj.setC("!");
        obj.setD("&&");
        lista.add(obj);
        obj = null;
        obj = new Intermediate();          
        index = (int)(Math.random()*lista.size());
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(247, 217, 206));
        kGradientPanel1.setkGradientFocus(60);
        kGradientPanel1.setkStartColor(new java.awt.Color(247, 177, 197));

        jLabel1.setText("jLabel1");

        jBRespuestaC.setText("jButton1");

        jLabel2.setText("jLabel2");

        jBRespuestaA.setText("jButton1");

        jBRespuestaB.setText("jButton1");

        jBRespuestaD.setText("jButton1");

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}

package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EasyList {
    ArrayList<Easy> lista = new ArrayList();
    
    public void pre(){
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
    }   
    
    public void getPre(){
        String space = "";
        for (int i = 0; i < lista.size(); i++) {
            space+="num"+(i+1)+"\n";
            space+="Pregunta: "+lista.get(i).getPregunta()+"\n";
            space+="Correcta: "+lista.get(i).getCorrecta()+"\n";
            space+="A: "+lista.get(i).getA()+"\n";
            space+="B: "+lista.get(i).getB()+"\n";
            space+="C: "+lista.get(i).getC()+"\n";
            space+="D: "+lista.get(i).getD()+"\n";
        }
        JOptionPane.showMessageDialog(null, space);
    }
}

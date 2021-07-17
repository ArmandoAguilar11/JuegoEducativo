package Clases;


import juego.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EasyList {
    public ArrayList<Easy> lista = new ArrayList();
    
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
    }   
    public ArrayList ver(){
    return lista;
    }
    /*public void getPre(){
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
    }*/
}

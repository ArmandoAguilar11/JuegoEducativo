/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;
import java.awt.Font;
import java.io.InputStream;
/**
 *
 * @author Armando
 */
public class Fuentes {
    private Font font = null;
    public String honey = "Gabelisa Font by Keithzo (7NTypes).otf";
    
    public Font fuente( String fontName, int estilo, float tamanio)
    {
         try {
            //Se carga la fuente
            InputStream es = getClass().getResourceAsStream(fontName);
            font = Font.createFont (Font.TRUETYPE_FONT, es);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font ("Arial", Font.PLAIN, 60);            
        }
        Font tfont = font.deriveFont (estilo, tamanio);
        return tfont;
    }
}

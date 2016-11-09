/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogui5;

import static java.lang.Character.toLowerCase;
import java.util.StringTokenizer;

/**
 *
 * @author Claudia
 */
public class Libro {
          private String clave;
          private String contenido;
          private String nuevaclave;
          
          public Libro(String c, String contenido){
                  this.clave = c;
                  this.contenido = contenido;
                  this.nuevaclave = "2016"+clave;
          }
          
          public String AsigClave(){
                  String au = contenido,palabra="";
                  StringTokenizer st = new StringTokenizer(au);
                  while(st.hasMoreTokens()){
                           palabra = st.nextToken();
                           if(palabra.length() > 2){
                                    nuevaclave += ""+toLowerCase(palabra.charAt(0));
                           }
                  }
                  return nuevaclave;
          }
          
          public String toString(){
                  return "Clave: "+clave+"\tContenido: "+contenido;
          }
}

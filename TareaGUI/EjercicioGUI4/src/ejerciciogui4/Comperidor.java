/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciogui4;

/**
 *
 * @author Claudia
 */
public class Comperidor {
         private int id;
         private int edad;
         private int mes;
         private int genero;
         private String cat;
         private int [][] catego = new int[2][12];
         
         Comperidor(int id, int e, int m, int g){
                  this.id = id;
                  this.edad = e ;
                  this.mes = m;
                  this.genero = g;
         }
         
         public int getid(){
             return id;
         }
         public int getcatego(int x, int y){
             return catego[x][y];
         }
         public int getMes(){
                  return mes;
         }
         
         public String toString(){
                   return "Id : "+id+" edad : "+edad+" mes : "+mes+" genero : "+genero;
         }
         
         public String Categoria(){
                  int x =0, y=0;
                  if(edad <=19 && edad >= 16){
                            cat = "A";
                            y=0;
                  }
                  if(edad <=24 && edad >= 20){
                            cat = "B";
                            y = 1;
                  }
                  if(edad <=29 && edad >= 25){
                            cat = "C";
                            y=2;
                  }
                  if(edad <=34 && edad >= 30){
                            cat = "D";
                            y = 3;
                  }
                  if(edad <=39 && edad >= 35){
                            cat = "E";
                             y = 4;
                  }
                  if(edad <=44 && edad >= 40){
                            cat = "F";
                             y = 5;
                  }
                  if(edad <=49 && edad >= 45){
                            cat = "G";
                            y = 6;
                  }
                  if(edad <=54 && edad >= 50){
                            cat = "H";
                             y = 7;
                  }
                  if(edad <=59 && edad >= 55){
                            cat = "I";
                             y = 8;
                  }
                  if(edad <=64 && edad >= 60){
                            cat = "J";
                             y = 9;
                  }
                  if(edad <=69 && edad >= 65){
                            cat = "K";
                            y = 10;
                  }
                  if( edad >= 70){
                            cat = "L";
                            y =11;
                  }
                  
                  if(genero == 0){
                           cat += "V";
                           x = 0;
                  }
                  else{
                           cat += "F";
                           x = 1;
                  }
                  catego[x][y]++;
                  
                  return cat;
         }
    
}

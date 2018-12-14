/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author bach
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        InputStreamReader flujo;
        flujo = new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        
        int aprobados=0, numeroalumnos=0;
        float nota=0, media=0, porcentaje;
        
        while(nota!=-1){
        System.out.println("introduce la nota del alumno");
            nota=Float.parseFloat(teclado.readLine());
            if (nota!=-1){
                if(nota>=5){
                    aprobados++;
                    numeroalumnos++;
                }else{
                    numeroalumnos++;
                }
                media=media+nota;
                
                }
            }
        media=media/numeroalumnos;
        porcentaje=((float)aprobados/numeroalumnos)*100;
        System.out.println("numero de alumnos:" +numeroalumnos);
        System.out.println("la media:"+media);
        System.out.println("el porcentaje de aprobados: "+porcentaje+"%");
        
            
        }
        
       
    }
    


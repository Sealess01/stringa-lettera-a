/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg20241116_4id_bolivar_stringa;
import java.util.Scanner;
/**
 *
 * @author Sergio
 */
public class stringa {
    
     public void stringa(){
         
         Scanner scan = new Scanner(System.in);
         System.out.println("inserire la frase ");
         String frase = scan.nextLine();
         
         
         int conteggio = 0;
         
         
         for(int i = 0; i < frase.length(); i++){
             
             
             if(frase.charAt(i) == 'a' || frase.charAt(i) == 'A'){
                 
                 conteggio++;
             }
             
         }
         
         System.out.println("ecco il numero di volte in cui è apparsa la lettera a: " +conteggio);
         
         for(int j = 0; j < conteggio; j++){
             
             
             System.out.println("A");
             
         }
         
         
     }
       
   }
    

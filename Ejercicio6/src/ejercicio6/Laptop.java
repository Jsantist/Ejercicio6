/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MICHELLE
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Laptop implements Smart, VideoGames{
    Scanner leer = new Scanner(System.in);
     @Override
    public void NavegarInternet() {
        String palabra = "";
        
        
        System.out.println("Buscar: ");
        palabra=leer.nextLine();
        System.out.println("usted está buscando" + palabra);
    }

    @Override
    public void ReproducirVideo() {
        String video = "";
        System.out.println("Video Buscador: ");
        video=leer.nextLine();
        System.out.println("usted está buscando" + video);
        
        
        
    }

    @Override
    public void Jugar() {
        int numero,aleatorio,contador=0;
        aleatorio = (int) Math.random()*100;
        System.out.println(aleatorio);
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número: "));
            if (aleatorio>numero){
               System.out.println("ingrese numero mayor: ");
            }
            else{
               System.out.println("ingrese numero menor: "); 
            }
            contador++;
                
                
        }while(numero!=aleatorio);
    }
}

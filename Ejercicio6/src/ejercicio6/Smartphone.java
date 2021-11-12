


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
public class Smartphone implements Foto, Tel,Smart{
    Scanner leer = new Scanner(System.in);

   @Override
    public void TomarFoto() {
       System.out.println("CLICK, la foto ha sido tomada correctamente"); 
       
    }

    @Override
    public void TomarVideo() {
        System.out.println("1...2...3...GRABANDO"); 
    }

    @Override
    public void TomarLlamada() {
        int num = 0;
        
        
        System.out.println("Ingrese número a llamar");
        num=leer.nextInt();
        System.out.println("usted está llamando a" + num);
        
    }

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
    
    
}

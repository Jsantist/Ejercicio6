package ejercicio6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MICHELLE
 */
public class Camara implements Foto{

    @Override
    public void TomarFoto() {
        System.out.println("CLICK, la foto ha sido tomada correctamente"); 
    }

    @Override
    public void TomarVideo() {
        System.out.println("1...2...3...GRABANDO");
    }
    
}

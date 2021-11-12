
import java.util.Scanner;

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
public class Celular implements Tel{
    Scanner leer = new Scanner(System.in);
    @Override
    public void TomarLlamada() {
        int num = 0;
        
        
        System.out.println("Ingrese número a llamar");
        num=leer.nextInt();
        System.out.println("usted está llamando a" + num);
        
    }
    
}

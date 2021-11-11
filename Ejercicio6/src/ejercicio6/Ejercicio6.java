/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Telus
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File Archivo;
        File publicaciones;
        Integer op1=0,op2=0,op3=0;
        boolean finalizar= false;
        
        
        Archivo = new File("usuarios.txt");
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        Datos dat = new Datos();
  
        
        System.out.println("Bienvenido a  Electronica Lainoamericana");
        
        if (!Archivo.exists()){
            try{
                Archivo.createNewFile();
                System.out.println("Al parecer no hay ningún usuario creado, por favor registrate");
                dat.registro(Archivo);
                
            }catch(IOException ex){
                System.out.println(ex);
            }
            
        }else {
            do{
                System.out.println("Ingrese una de las siguientes opciones: ");
                System.out.println("1. Regístrate ");
                System.out.println("2. inicia sesión");
                System.out.println("3. salir ");
                op1= Integer.parseInt(br.readLine());
                
                switch(op1){
                    case 1:
                        dat.registro(Archivo);
                        break;
                        
                    case 2:
                        String user="",contra="";
                        boolean intento = false;
                        
                        do{
                        System.out.println("----------INICIO DE SESIÓN -------------");
                        System.out.println("Ingrese su nombre de usuario");
                       
                        user= (br.readLine());
                        System.out.println("Ingrese su contraseña");
                        
                        contra=(br.readLine());
                        
                        if(dat.verificar(Archivo,user , contra)==true){
                            System.out.println("Ha ingresado exitosamente");
                            intento = true;
                        }else if ((dat.verificar(Archivo, user, contra)==false)){
                            System.out.println("Usuario y/o contraseña incorrectos");
                            System.out.println("Por favor, inténtelo de nuevo");
                        }
                        
                          }while(intento == false);
                        System.out.println("Ha iniciado sesión exitosamente");
                        System.out.println("por favor seleccione una de las siguentes opciones");
                        System.out.println("1. comprar productos");
                        System.out.println("2. simular productos ");
                        System.out.println("3. salir ");
                        op2=Integer.parseInt(br.readLine());
                        switch(op2){
                            case 1:
                                break;
                            case 2 :
                                break;
                            case 3 :
                                break;
                            
                        }
                        break;
                        
                    case 3 :
                        System.out.println("Ha salido exitosamente");
                        finalizar=true;
                }
            }while (finalizar != true);
            
        }
    }
    
}

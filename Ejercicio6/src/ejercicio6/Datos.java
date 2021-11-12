/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Telus
 */
public class Datos {
    
    FileReader leer;
    FileWriter escribir;
    PrintWriter linea;
    BufferedReader almacenamiento;
    
    public boolean verificar(File usuarios, String usuario, String contraseña)throws IOException{
        
        String us= usuario;
        String con = contraseña;
        boolean existe = false;
        String user="",contra="",caracter="";
        int n =0 ;
        usuarios = new File("usuarios.txt");
        leer = new FileReader(usuarios);
        almacenamiento = new BufferedReader(leer);
        
        while (caracter!= null){
            caracter=almacenamiento.readLine();
            user=caracter;
            if (user == null ? us == null : user.equals(us)){
                n=n+1;
            } else {
            }
            caracter=almacenamiento.readLine();
            contra = caracter;
            if (contra == null ? con == null : contra.equals(con)){
                n=n+1;
            }
        }
        
        if (n>0){
            existe =true;
        }
        
        almacenamiento.close();
        leer.close();
      return existe;
    }
    
    public void registro(File Usuarios) throws IOException {
        
        
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        escribir= new FileWriter(Usuarios,true);
        linea = new PrintWriter(escribir);
        
        boolean verificar = true ;
        String nombre ="";
        String contra="";
        String contra1="";
        
        System.out.println("------------------REGISTRO DE USUARIO ---------------");
        
        System.out.println("Ingrese su nombre");
        nombre=br.readLine();
        
        do {
            System.out.println("Ingrese su contraseña");
            contra= br.readLine();
            System.out.println("confirme su contraseña");
            contra1= br.readLine();
            
            if(!contra.equals(contra1)){
                System.out.println("las contraseñas no coinciden or favor inteénteo de nuevo");
                
            }else{
                verificar = false;
            }
        }while(verificar == true);
        
        linea.println(nombre);
        linea.println(contra);
        linea.close();
        escribir.close();
    }
    
    public void desplegar(File Posts) throws IOException{
        String caracter="";
        
        leer = new FileReader(Posts);
        almacenamiento = new BufferedReader(leer);
        try{
        while (caracter!= null){
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            caracter=almacenamiento.readLine();
            System.out.println(caracter);
            
        }
        }catch(IOException ex ){
            System.out.println(ex);
        }
        
    }
    
}

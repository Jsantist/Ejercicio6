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
    
    BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    
    
    public void factura(String nombre) throws IOException{
        
        String nit = "";
        double subtotal=0.0;
        double IVA;
        String recuento = "";
        double total=0 ;
        int op =0 ;
        int op2=0;
        boolean finalizar = false ;
        boolean finalizar2 = false ;
        String desicion ="";
        
        double smartphone = 699.0;
        double celular = 220.0 ;
        double telefono = 700.0;
        double camara = 1000.0;
        double computadora= 4800.0 ;
        double laptop = 4000.0;
        double smartwatch = 4500.0;
        double smarttv = 3999.0;
        double tablet = 4000.0;
        do{
        System.out.println("Ingrese una de las siguientes opciones");
        System.out.println("1. seleccionar productos");
        System.out.println("2. ver carrito ");
        System.out.println("3. pagar");
        op=Integer.parseInt(br.readLine());
        switch(op){
            case 1:
                do{
                System.out.println("Selecciones los productos a comprar");
                System.out.println("1. Smartphones ");
                System.out.println("2. Celular ");
                System.out.println("3. Telefono fijo ");
                System.out.println("4. camara fotográfica  ");
                System.out.println("5. Comutador de escritorio");
                System.out.println("6. Laptop");
                System.out.println("7. SmarTV");
                System.out.println("8. Tablet");
                System.out.println("9. smartwatch");
                System.out.println("10. salir");
                op2= Integer.parseInt(br.readLine());
                switch(op2){
                    case 1:
                        recuento = recuento + "\n Smartphone          Q699";
                        subtotal= subtotal + smartphone;
                        
                        break;
                    case 2:
                        recuento = recuento + "\n celular          Q220";
                        subtotal= subtotal + celular;
                        break;
                    case 3:
                        recuento = recuento + "\n Telefono fijo          Q700";
                        subtotal= subtotal + telefono;
                        break;
                    case 4:
                        recuento = recuento + "\n cámara fotográfica          Q1000";
                        subtotal= subtotal + smartphone;
                        break;
                    case 5:
                        recuento = recuento + "\n PC          Q4800";
                        subtotal= subtotal + computadora;
                        break;
                    case 6:
                        recuento = recuento + "\n Laptop          Q1000";
                        subtotal= subtotal + laptop;
                        break;
                    case 7:
                        recuento = recuento + "\n SmartTV          Q3999";
                        subtotal= subtotal + smarttv;
                        
                        break;
                    case 8:
                        recuento = recuento + "\n Tablet          Q4000";
                        subtotal= subtotal + tablet;
                        break;
                    case 9:
                        recuento = recuento + "\n SmartWatch          Q4500";
                        subtotal= subtotal + smartwatch;
                        break;
                    case 10:
                        System.out.println("Ha salido exitosamente");
                        finalizar2 = true ;
                        
                        break;
                    }
                }while(finalizar2 != true);
                break;
                
            case 2:
                System.out.println("---------------CARRITO-------------");
                System.out.println(recuento);
                System.out.println("Su subtotal es de: "+subtotal);
                break;
            case 3:
                System.out.println("Desea concluír con su selección de productos?");
                desicion= br.readLine();
                if ("si".equals(desicion)){
                    System.out.println("Ingrese su nit");
                    nit=br.readLine();
                    IVA= subtotal *0.12;
                    total=subtotal+IVA;
                    System.out.println("----------------FACTURA-------------");
                    System.out.println("Señor/a :         "+nombre);
                    System.out.println("NIT:           "+nit);
                    System.out.println("productos:");
                    System.out.println(recuento);
                    System.out.println("Subtotal:     Q"+subtotal);
                    System.out.println("IVA a pagar:       Q"+IVA);
                    System.out.println("Total a pagar:         Q"+total);
                    System.out.println("-------------------------------------");
                    System.out.println("Gracias por su compra, ¡regrese pronto!");
                    finalizar=true;
                    
                }else{
                    System.out.println("continúe con su compra");
                }
                break;
            
        }
        
        }while(finalizar != true );
        
        
        
        
        
    }
    
    
    public boolean buscar(File usuarios, String producto)throws IOException{
        
        String prod= producto;
        
        boolean existe = false;
        String p="",caracter="";
        int n =0 ;
        usuarios = new File("usuarios.txt");
        leer = new FileReader(usuarios);
        almacenamiento = new BufferedReader(leer);
        
        while (caracter!= null){
            caracter=almacenamiento.readLine();
            p=caracter;
            if (p == null ? prod == null : p.equals(prod)){
                n=n+1;
                System.out.println("el producto seleccionado es :"+p);
            }
            
            if (n>0){
                caracter=almacenamiento.readLine();
                System.out.println("su precio es: "+caracter);
                caracter=almacenamiento.readLine();
                System.out.println("Su modelo es :"+caracter);
                caracter=almacenamiento.readLine();
                System.out.println("Su marca es: "+caracter);
                caracter=almacenamiento.readLine();
                System.out.println("Su fecha de fabricación es: "+caracter);
                caracter=almacenamiento.readLine();
                System.out.println("Su marcador AR es: "+caracter);
                caracter=almacenamiento.readLine();
                System.out.println(caracter);
                
            
            }
            
            
        }
        
        
        
        almacenamiento.close();
        leer.close();
      return existe;
    }
    
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
          
        }
        }catch(IOException ex ){
            System.out.println(ex);
        }
        
    }
    
}

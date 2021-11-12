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
        File Productos;
        String producto ;
        Integer op1=0,op2=0,op3=0,op4=0;
        boolean finalizar= false;
        boolean finalizar2= false ;
        boolean finalizar3 = false;
        boolean finalizar4 = false;
        
        
        Productos = new File("producto.txt");
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
                        do{
                        System.out.println("por favor seleccione una de las siguentes opciones");
                        System.out.println("1. comprar productos");
                        System.out.println("2. simular productos ");
                        System.out.println("3. salir ");
                        op2=Integer.parseInt(br.readLine());
                        switch(op2){
                            case 1:
                                break;
                            case 2 :
                                do{
                                System.out.println("Ingrese uno de los siguientes dispositivos a simular ");
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
                                op3=Integer.parseInt(br.readLine());
                                switch(op3){
                                    case 1 :
                                            producto= "Smartphone";
                                            
                                            Smartphone smrt = new Smartphone();
                                            dat.buscar(Productos, producto);
                                            
                                            do{
                                            System.out.println("Ingrese una de las siguientes opciones");
                                            System.out.println("1. 1lamar");
                                            System.out.println("2. tomar foto ");
                                            System.out.println("3. navegar en internet");
                                            System.out.println("4. reroducir video");
                                            System.out.println("5. salir de simulación");
                                            op4=Integer.parseInt(br.readLine());
                                            switch(op4){
                                                case 1:
                                                    smrt.TomarLlamada();
                                                    break;
                                                case 2:
                                                    smrt.TomarFoto();
                                                    break;
                                                case 3:
                                                    smrt.NavegarInternet();
                                                    break;
                                                case 4:
                                                    smrt.ReproducirVideo();
                                                    break;
                                                case 5:
                                                    finalizar4 = true;
                                                    break;
                                                
                                                }
                                            }while(finalizar4 != true);
                                            
                                            
                                        break;
                                    case 2 :
                                        Celular cel = new Celular ();
                                        boolean continuar = false;
                                        Integer opc =0;
                                        do{
                                            producto="Celular";
                                            dat.buscar(Productos, producto);
                                            cel.TomarLlamada();
                                            System.out.println("Desea hacer otra llamada?, \n 1. si \n 2. no");
                                            opc= Integer.parseInt(br.readLine());
                                            if(opc == 2){
                                                continuar = true;
                                            }
                                        }while (continuar != true);
                                        break;
                                    case 3 :
                                        Telefono tel = new Telefono();
                                        producto="Telefono";
                                        boolean continuar1 = false;
                                        Integer opc1 =0;
                                        do{
                                        dat.buscar(Productos, producto);
                                            tel.TomarLlamada();
                                            System.out.println("Desea hacer otra llamada?, \n 1. si \n 2. no");
                                            opc= Integer.parseInt(br.readLine());
                                            if(opc1 == 2){
                                                continuar1 = true;
                                            }
                                        }while (continuar1 != true);
                                        
                                        break;
                                    case 4 :
                                        producto="Camara";
                                        Camara cam = new Camara();
                                        do{
                                        System.out.println("Ingrese una de las siguientes opciones ");
                                        System.out.println("1. tomar foto");
                                        System.out.println("2. tomar video");
                                        System.out.println("3. salir");
                                        op4=Integer.parseInt(br.readLine());
                                        switch(op4){
                                            case 1:
                                                cam.TomarFoto();
                                                break;
                                            case 2:
                                                cam.TomarVideo();
                                                break;
                                            case 3:
                                                finalizar4 = true;
                                                break;
                                                
                                        }
                                        }while (finalizar4 != true);
                                        break;
                                    case 5 :
                                        producto="Computadora";
                                        PC pc = new PC();
                                        do{
                                        System.out.println("Ingrese una de las siguientes opciones ");
                                        System.out.println("1. navegar en internet");
                                        System.out.println("2. reproducir video");
                                        System.out.println("3. jugar");
                                        System.out.println("4. salir ");
                                        op4=Integer.parseInt(br.readLine());
                                        switch(op4){
                                            case 1:
                                                pc.NavegarInternet();
                                                break;
                                            case 2:
                                                pc.ReproducirVideo();
                                                break;
                                            case 3:
                                                pc.Jugar();
                                                break;
                                            case 4:
                                                finalizar4 = true;
                                                  
                                            
                                        }
                                        }while(finalizar4 != true);
                                        
                                        break;
                                    case 6 :
                                        producto="Laptop";
                                        Laptop lp = new Laptop();
                                        do{
                                        System.out.println("Ingrese una de las siguientes opciones ");
                                        System.out.println("1. navegar en internet");
                                        System.out.println("2. reproducir video");
                                        System.out.println("3. jugar");
                                        System.out.println("4. salir ");
                                        op4=Integer.parseInt(br.readLine());
                                        switch(op4){
                                            case 1:
                                                lp.NavegarInternet();
                                                break;
                                            case 2:
                                                lp.ReproducirVideo();
                                                break;
                                            case 3:
                                                lp.Jugar();
                                                break;
                                            case 4:
                                                finalizar4 = true;
                                                  
                                            
                                        }
                                        }while(finalizar4 != true);
                                        break;
                                    case 7 :
                                        
                                        producto="Smart TV";
                                        SmartTV tv = new SmartTV();
                                        do{
                                        System.out.println("Ingrese una de las siguientes opciones ");
                                        System.out.println("1. navegar en internet");
                                        System.out.println("2. reproducir video");
                                        System.out.println("3. salir");
                                        op4=Integer.parseInt(br.readLine());
                                        switch(op4){
                                            case 1:
                                                tv.NavegarInternet();
                                                break;
                                            case 2:
                                                tv.ReproducirVideo();
                                                break;
                                            case 3:
                                                finalizar4 = true;
                                                break;
                                                
                                        }
                                        }while (finalizar4 != true);
                                        
                                        break;
                                    case 8 :
                                        
                                        producto="Tablet";
                                        Tablet tab = new Tablet();
                                        do{
                                        System.out.println("Ingrese una de las siguientes opciones ");
                                        System.out.println("1. navegar en internet");
                                        System.out.println("2. reproducir video");
                                        System.out.println("3. tomar fotografías");
                                        System.out.println("4. salir ");
                                        op4=Integer.parseInt(br.readLine());
                                        switch(op4){
                                            case 1:
                                                tab.NavegarInternet();
                                                break;
                                            case 2:
                                                tab.ReproducirVideo();
                                                break;
                                            case 3:
                                                tab.TomarFoto();
                                                break;
                                            case 4:
                                                finalizar4 = true;
                                                  
                                            
                                        }
                                        }while(finalizar4 != true);
                                        
                                        break;
                                    case 9 :
                                        producto="Smartwatch";
                                        Smartwatch wat = new Smartwatch();
                                        do{
                                        System.out.println("Ingrese una de las siguientes opciones ");
                                        System.out.println("1. tomar foto");
                                        System.out.println("2. reproducir video");
                                        System.out.println("3. salir");
                                        op4=Integer.parseInt(br.readLine());
                                        switch(op4){
                                            case 1:
                                                wat.TomarFoto();
                                                break;
                                            case 2:
                                                wat.NavegarInternet();
                                                break;
                                            case 3:
                                                finalizar4 = true;
                                                break;
                                                
                                        }
                                        }while (finalizar4 != true);
                                        break;
                                    case 10:
                                        finalizar3=true;
                                        break;
                                    
                                    }
                                }while (finalizar3 != true);
                                
                                break;
                            case 3 :
                                finalizar2=true;
                                break;
                            
                        }
                        }while(finalizar2 != true);
                        break;
                        
                    case 3 :
                        System.out.println("Ha salido exitosamente");
                        finalizar=true;
                        break;
                       
                }
            }while (finalizar != true);
            
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eluniversitario;


import eluniversitario.complemento.CuentaException;
import eluniversitario.complemento.CuentaException2;
import eluniversitario.complemento.CuentaException3;
import eluniversitario.complemento.Teclado;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DanielAquino
 */
public class ElUniversitario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CuentaException, NumberFormatException, IndexOutOfBoundsException, CuentaException2, CuentaException3 {
         
       Teclado tec = new Teclado();// Crear objeto de tipo Teclado
       ArrayList<String> banco = new ArrayList<>();//Se crea lista de arreglos
       int i=0, j=1, k=1;//Declaracion de la variables enteros
       
                   
                    
                    do{ //Do para ingresar cantidad de cuentas que se desea manejar
                    
                         try{
                             
                               System.out.print("Indique el numero de cuentas que quiere registrar: ");//Solicito el numero de cuentas que deseo organizar
			       i = tec.leerEntero();//Se lee el numero de cuentas que se quiere organizar  
                                if(i<1){System.out.println("El numero ingresado no cumple con el formato, por favor ingrese un numero positivo");System.out.println();}
                             }catch (NumberFormatException a){
                                  System.out.println("El caracter ingresado no cumple con el formato, por favor ingrese un numero");
                                  System.out.println();
                             }          
                    }while(i<1);         
       
                         
      
     
                do{ //Do para ingresar los numeros de cuentas
                         try{
                                 System.out.print("Ingrese el codigo de cuenta de la cuenta numero "+(j)+" siguiendo el formato (22 88888888 4444 4444 4444 4444): ");//Se solicita que ingrese el numero de la cuenta con el formato especificado      
                                 banco.add((j-1), tec.Compruebo());//Se llena la lista con los numeros de cuenta introducidos por el usuario
                                 System.out.println();
                                 j++;
                             }catch (CuentaException b){
                                  System.out.println(b.getMessage());
                                  System.out.println();
                                  
                             }catch (NumberFormatException c){
                                  System.out.println("Usted ha ingresado un caracter que no es un numero valido del codigo");
                                  System.out.println();
                                  
                             }catch (CuentaException2 d){
                                  System.out.println(d.getMessage());
                                  System.out.println();
                             }catch (CuentaException3 e){
                                 System.out.println(e.getMessage());
                                  System.out.println();
                             }          
                    }while(i>=j);      
          
                Collections.sort(banco);//Se ordena de forma ascendenta los elementos de la lista
                
                
       
                /*Este ciclo FOR imprime la lista de String"*/
                
                         for(i=0; i<banco.size(); i++){
                             if(i!=banco.size()-1){/*Esta iteracion evita que arroje una excepcion al final del FOR cuando compare
                                                     la ultima posicion de la lista con una posicion inexistente como podria ser (i+1)*/
                                                
                                if(banco.get(i).equals(banco.get(i+1))){ //Se compara una posicion i con su posicion siguiente para comprobar igualdad
                  
                                    k++;//Se aumenta contador en caso de que existe una igualdad entre i y la siguiente posicion
                                    banco.remove(i+1); //Se remueve la posicion siguiente de i de la lista
                                    i--;} else{
                                            
                                            System.out.println(banco.get(i)+" "+k);//En caso de no encontrar coincidencia se imprime String concatenado con contador
                                            k=1;//Se inicializa contador
                                               }
                                                 }else{
                                                      System.out.println(banco.get(i)+" "+k);//En caso de llegar al final del ciclo se imprime la ultima posicion con su contador
                                                      }
                                                      } 
                
                
        
         }
         
         
    }
    


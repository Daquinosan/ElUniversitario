/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eluniversitario.complemento;

import java.util.Scanner;
import java.lang.NumberFormatException;

/**
 *
 * 
 */
public class Teclado {
     private Scanner sc;
     private String cuenta, as, sr;
        
	
	public Teclado (){
		this.sc = new Scanner (System.in);
	}
	
	public String leerString (){//Metodo para capturar string
		return this.sc.nextLine();
	} 
        
        public int leerEntero() {
                return Integer.parseInt(this.sc.nextLine());//Metodo para capturar un int
        }
		
	public double leerDouble(){
		//return (this.sc.nextLine());
		return Double.parseDouble(this.sc.nextLine());//Metodo para capturar un double
	}	
        
        public String Compruebo () throws CuentaException, NumberFormatException, IndexOutOfBoundsException, CuentaException2, CuentaException3 {
        
        this.cuenta=this.sc.nextLine();    //Se capturan los numeros ingresados como un string
          if(this.cuenta.length()!=31) {throw new CuentaException ("La longitud de la cuenta es incorrecta");}//Se comprueba que el string tenga una longitud de 31
                  
          
          
              this.as=this.cuenta.substring(0,2);//Convertir primer patron de control a entero
              if(Integer.parseInt(this.as)<1){throw new CuentaException3 ("Usted ha ingresado un caracter que no es un numero valido del codigo");}
              
              this.as=this.cuenta.substring(3,11);//Convertir segundo patron de control a entero
              if(Integer.parseInt(this.as)<1){throw new CuentaException3 ("Usted ha ingresado un caracter que no es un numero valido del codigo");}
              
              this.as=this.cuenta.substring(12,16);//Convertir tercer patron de control a entero
              if(Integer.parseInt(this.as)<1){throw new CuentaException3 ("Usted ha ingresado un caracter que no es un numero valido del codigo");}
              
              this.as=this.cuenta.substring(17,21);//Convertir cuarto patron de control a entero
              if(Integer.parseInt(this.as)<1){throw new CuentaException3 ("Usted ha ingresado un caracter que no es un numero valido del codigo");}
              
              this.as=this.cuenta.substring(22,26);//Convertir quinto patron de control a entero
              if(Integer.parseInt(this.as)<1){throw new CuentaException3 ("Usted ha ingresado un caracter que no es un numero valido del codigo");}
              
              this.as=this.cuenta.substring(27,31);//Convertir sexo patron de control a entero
              if(Integer.parseInt(this.as)<1){throw new CuentaException3 ("Usted ha ingresado un caracter que no es un numero valido del codigo");}
              
              this.sr=this.cuenta;//Copiamos el string de la cuenta para comprobar que los separadores sean espacios en blanco
              
              /*En esta sentencia eliminamos todos los espacios y comparamos la longitud del string para ver si concuerda con 26,*/
              if(this.sr.replaceAll(" ","").length()!=26) {throw new CuentaException2 ("La separacion de los numeros debe ser realizada con BARRA ESPACIADORA o ESPACIO EN BLANCO");}
             
              
              return this.cuenta;
         }
        
        }

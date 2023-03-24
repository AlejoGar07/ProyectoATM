package atmproject;
    
import java.util.Scanner;

public class ATM {
    private Ranura ranuraObj;
    private Teclado tecladoObj;
    private Pantalla pantallaObj;
    private Dispensador dispensadorObj;
    
    public ATM(){
        this.ranuraObj= new Ranura();
        this.tecladoObj= new Teclado();
        this.pantallaObj= new Pantalla();
        this.dispensadorObj= new Dispensador();
       
        this.SolicitarDatos();
       } 
        private void SolicitarDatos(){
            Cuenta cuentaObj=new Cuenta("");
            System.out.println("___________________________  ");
            pantallaObj.mostrarMensaje("Bienvenido! ");
            pantallaObj.mostrarMensaje("Ingrese su Numero de Cuenta:  ");
            int numeroC=tecladoObj.capturarDatos();
            pantallaObj.mostrarMensaje("Ingresar NIP:  ");
            int numeroN=tecladoObj.capturarDatos();
        if(numeroC > 9999 && numeroC < 100000 && numeroN > 9999 && numeroN < 100000){
            System.out.println("Numero de Cuenta Valido \nNIP Correcto");
            this.MenuPrincipal();
        }else
            System.out.println("Numero de Cuenta Invalido \nNIP Incorrecto \n");
            this.SolicitarDatos();
        }    
        
        private void MenuPrincipal(){
            Scanner teclado = new Scanner(System.in);
            int opciones=0;
  do{
  System.out.println();
  System.out.println("_____________________________");
  System.out.println("MENU DE OPCIONES ");
  System.out.println("-----------------------------");
  System.out.println(" === 1. Ver mi Saldo     === ");
  System.out.println(" === 2. Retirar Efectivo === ");
  System.out.println(" === 3. Depositar Fondos === ");
  System.out.println(" === 4. Salir            === ");
  System.out.println("INGRESE UNA OPCION ");
  System.out.println("-----------------------------");
  opciones = tecladoObj.capturarDatos();
  switch (opciones){
  case 1:
           
   break;
  case 2:
             
   break;  
  case 3:
        
   break;
  case 4:
        this.SolicitarDatos();
   break;
  }
          }while(opciones!=5);
        }
    }
        
    


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
        public void SolicitarDatos(){
            Cuenta cuentaObj=new Cuenta();
            System.out.println("___________________________  ");
            pantallaObj.mostrarMensaje("Bienvenido! ");
            pantallaObj.mostrarMensaje("Ingrese su Numero de Cuenta:  ");
            cuentaObj.numeroC=tecladoObj.capturarDatos();
            pantallaObj.mostrarMensaje("Ingresar NIP:  ");
            int numeroN=tecladoObj.capturarDatos();
            
        if(cuentaObj.numeroC > 9999 && cuentaObj.numeroC < 100000 && numeroN > 9999 && numeroN < 100000){
            System.out.println("Numero de Cuenta Valido \nNIP Correcto");
            Cuenta cuenta=new Cuenta();
            Scanner teclado = new Scanner(System.in);
            int opcionees=0;
            
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
  opcionees = teclado.nextInt();
  switch (opcionees){
  case 1:
        System.out.println("___________________");
        System.out.println("VER SALDO DE CUENTA");
        System.out.println("Cuenta:  " + cuentaObj.numeroC);
        System.out.println("-------------------");
        System.out.println("Su Saldo es:  Q" + cuenta.saldo);
        teclado.nextInt();
   break;
  case 2:
            Retiro retiro = new Retiro();
            Dispensador dispensador= new Dispensador();
            int opciones=0;
  do{
  System.out.println();
  System.out.println("__________________________");
  System.out.println("MENU DE RETIRO            ");
  System.out.println("--------------------------");
  System.out.println(" 1. Q20       4. Q100     ");
  System.out.println(" 2. Q40       5. Q200     ");
  System.out.println(" 3. Q60       6. Cancelar ");
  System.out.println("ELIJA EL MONTO DE RETIRO: ");
  System.out.println("--------------------------");
  opciones = teclado.nextInt();
  switch (opciones){
  case 1:
        if(cuenta.saldo >= 20){
        System.out.println("___________________");
        System.out.println("MENU DE RETIRO     ");
        System.out.println();
        retiro.ejecutar(0);
        cuenta.saldo=cuenta.saldo-20;
        System.out.println("Su Retiro es de: Q20");
        System.out.println("-------------------");
        dispensador.entregarEfectivo(1);
        }else{
            System.out.println("Su Saldo es Insuficiente");
        }    
        teclado.nextInt();
    break;
  case 2:
        if(cuenta.saldo >= 40){
        System.out.println("___________________");
        System.out.println("MENU DE RETIRO     ");
        System.out.println();
        retiro.ejecutar(0);
        cuenta.saldo=cuenta.saldo-40;
        System.out.println("Su Retiro es de Q40");
        System.out.println("-------------------");
        dispensador.entregarEfectivo(1);
        }else{
            System.out.println("Su Saldo es Insuficiente");
        }
        teclado.nextInt();
        System.out.println("");
    break;  
  case 3:
        if(cuenta.saldo >= 60){
        System.out.println("___________________");
        System.out.println("MENU DE RETIRO     ");
        System.out.println();
        retiro.ejecutar(0);
        cuenta.saldo=cuenta.saldo-60;
        System.out.println("Su Retiro es de Q60");
        System.out.println("-------------------");
        dispensador.entregarEfectivo(1);
        }else{
            System.out.println("Su Saldo es Insuficiente");
        }
        teclado.nextInt();
        System.out.println("");
    break;
  case 4:
        if(cuenta.saldo >= 100){
        System.out.println("____________________");
        System.out.println("MENU DE RETIRO     ");
        System.out.println();
        retiro.ejecutar(0);
        cuenta.saldo=cuenta.saldo-100;
        System.out.println("Su Retiro es de Q100");
        System.out.println("--------------------");
        dispensador.entregarEfectivo(1);
        
        }else{
            System.out.println("Su Saldo es Insuficiente");
        }
        teclado.nextInt();
        System.out.println("");
    break;
   
  case 5:
        if(cuenta.saldo >= 200){
        System.out.println("____________________");
        System.out.println("MENU DE RETIRO     ");
        System.out.println();
        retiro.ejecutar(0);
        cuenta.saldo=cuenta.saldo-200;
        System.out.println("Su Retiro es de Q200");
        System.out.println("--------------------");
        dispensador.entregarEfectivo(1);
        
        }else{
            System.out.println("Su Saldo es Insuficiente");
        }
        teclado.nextInt();
        System.out.println("");
    break;
         
  case 6:
       teclado.nextInt();
    break; 
  default:
  }
          }while(opciones==7);
    break;  
  case 3:
        System.out.println("_______________________________");
        System.out.println("MENU DE DEPOSITO     ");
        System.out.println("Ingrese la Cantidad a Depositar");
        float cantidad=tecladoObj.capturarDatos();
        cuenta.saldo=cantidad+cuenta.saldo;
        System.out.println("-------------------------------");
        System.out.println("Cantidad Depositada es: Q"+ cantidad);
        teclado.nextInt();
   break;
  case 4:
        this.SolicitarDatos();
   break;
  }
          }while(opcionees!=5);
          
        }else
            System.out.println("Numero de Cuenta Invalido \nNIP Incorrecto \n");
            this.SolicitarDatos();
        }
     }
        
    


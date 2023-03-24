package atmproject;

import java.util.Scanner;

public class Teclado {
    private Scanner scan;
    
    public Teclado(){
        scan=new Scanner(System.in);
    }
    public int capturarDatos(){
        return scan.nextInt();
    }
}

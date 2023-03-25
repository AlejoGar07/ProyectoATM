package atmproject;

public class Cuenta {
float saldo=50;
private float saldoFlotante;
int numeroC;
private int nip;

public float getSaldo(){
    return saldo;
}

public void setSaldo(float saldo){}

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroC() {
        return numeroC;
    }

    public void setNumeroC(int numeroC) {
        if(numeroC > 9999 && numeroC < 100000){
        this.numeroC = numeroC;
        }else{
            System.out.println("Error");
        }
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        if(nip > 9999 && nip < 100000){
        this.nip = nip;   
        }
        
    }
    
    public int obtenersaldo(int numeroC){
        System.out.println("Cuenta.obtenersaldo(int)");
        return 0;
    }
    public void obtenersaldo(String s1, int i1){
        System.out.println("Cuenta.obtenersaldo(int, String)");
    }
    public void obtenersaldo(int i1, String s1){
        System.out.println("Cuenta.obtenersaldo(int, String)");
    }
    public void acreditar(int monto){}
    public void debitar(int monto){}
    
}

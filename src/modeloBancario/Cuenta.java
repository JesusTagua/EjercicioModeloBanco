/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloBancario;




/**
 *
 * @author jesta
 */
public abstract class Cuenta {
    protected int NumeroDeCuenta;
    protected float saldo;
    protected Cliente titular;

    //Constructores con parametros
    public Cuenta(int NumeroDeCuenta, float saldo, Cliente titular) {
        this.NumeroDeCuenta = NumeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
//Constructores sin parametros
    
    public Cuenta() {
        this.NumeroDeCuenta=0;
        this.saldo=0;
        this.titular=null;
        
    }

    public int getNumeroDeCuenta() {
        return NumeroDeCuenta;
    }

    public void setNumeroDeCuenta(int NumeroDeCuenta) {
        this.NumeroDeCuenta = NumeroDeCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

   public void ingresar(double cantidad){
       saldo += cantidad;
       
   }
    public abstract void retirar (double cantidad);
    public abstract void ActualizarSaldo ();
    

    
}

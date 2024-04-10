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
public  class CuentaCorriente extends Cuenta {

     private final double interesFijo = 0.015;

    public CuentaCorriente(int NumeroDeCuenta, float saldo, Cliente titular) {
        super(NumeroDeCuenta, saldo, titular);
        
    }

    
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void actualizarSaldo() {
        double intereses = saldo * interesFijo;
        saldo += intereses;
    }

    @Override
    public void ActualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
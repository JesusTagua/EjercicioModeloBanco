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
public class CuentaAhorro extends Cuenta {
    private double interesVariable;
    private double saldoMinimo;
    
    
    public CuentaAhorro(int NumeroDeCuenta, float saldo, Cliente titular, double interesVariable, double saldoMinimo) {
        super(NumeroDeCuenta, saldo, titular);
        this.interesVariable = interesVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public CuentaAhorro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void retirar(double cantidad) {
        if (saldo - cantidad >= saldoMinimo) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    
    public void actualizarSaldo() {
        double intereses = saldo * interesVariable;
        saldo += intereses;
    }

    @Override
    public void ActualizarSaldo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

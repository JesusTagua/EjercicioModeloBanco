/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;
import modeloBancario.*;
/**
 *
 * @author jesta
 */
public class CuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente cl = new Cliente (7809156, "jesus","calle larra","9877790");
        Cliente cl2 = new Cliente (909876,"jose","calle ganivet","00999");
        
        Cuenta ca=new CuentaAhorro(87878787,0,cl,1,1);
        Cuenta cc=new CuentaCorriente(98989898,1,cl2);       
    }
   
}

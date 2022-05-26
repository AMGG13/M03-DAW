/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public interface DAOInterface {
    public boolean añadirCuenta(Cuenta add);
    public boolean borrarCuenta(Cuenta del);
    public String encontrarCuenta(Cuenta find);
    public String listarCuentas();
}

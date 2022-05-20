/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.EnteroDAO;
import Vista.Ventana_Pulsacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author alumne
 */
public class MiControlador implements ActionListener{
    private Ventana_Pulsacion vista;
    private EnteroDAO modelo;

    public MiControlador(Ventana_Pulsacion vista, EnteroDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(vista.getBotonAumentar() == ae.getSource()){
            if(!vista.getCheck_mas_menos().isSelected()){
                aumentarUno();
            }else{
                if(vista.getLabelNum().getText().equalsIgnoreCase("0")){
                    reset();
                }
                else{
                   restarUno(); 
                }
            }
        }else if (vista.getBotonReset()== ae.getSource()){
            reset();
        }else if(vista.getCheck_mas_menos() == ae.getSource()){
            
        }
        //actualizo el numero en pantalla
        vista.getLabelNum().setText(String.valueOf(modelo.getNum()));
        
    }

    private void aumentarUno() {
        modelo.aumentarEnUno();
    }

    private void reset() {
        modelo.setNum(0);
    }

    /**
     * A todos los componentes de la pantalla les asociare el mismo listener que nuestro caso es la clase micontrolador
     */
    private void iniciarListener() {
        vista.getBotonAumentar().addActionListener(this);
        vista.getBotonReset().addActionListener(this);
    }

    private void restarUno() {
        modelo.restarEnUno();
    }

    
}

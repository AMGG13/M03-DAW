/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnosDAO;
import Modelo.Ciclos;
import Vista.App;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author alumne
 */
public class Controller implements ActionListener{
    private App vista;
    private AlumnosDAO modelo;

    public Controller(App vista, AlumnosDAO modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciarListener();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(vista.getBotonGuardar() == ae.getSource()){
            guardar();
        }else if(vista.getBotonBorrar() == ae.getSource()){
            borrar();
        }else if(vista.getBotonListar() == ae.getSource()){
            listar();
        }else if(vista.getBotonReset() == ae.getSource()){
            reset();
        }
    }
    
    private void reset(){
      vista.setTextNombre("");
      vista.setTextApellido("");
      vista.setTextEdad("0");
      vista.setLista(Ciclos.ASIX);
    }
    private void listar(){
        vista.setTextListar(modelo.pasarLista());
    }
    private void guardar(){
        Integer edad = Integer.parseInt(vista.getTextEdad().getText());
        Ciclos c = (Ciclos)vista.getLista().getSelectedItem();
        Alumno aux = new Alumno(vista.getTextNombre().getText(),vista.getTextApellido().getText(),c,edad);
        if(modelo.anyadirAlumno(aux)){
            vista.setLabelLista("añadido");
        }else{
            vista.setLabelLista("no añadido");
        }
    }
    private void borrar(){
        Integer edad = Integer.parseInt(vista.getTextEdad().getText());
        Ciclos c = (Ciclos)vista.getLista().getSelectedItem();
        Alumno aux = new Alumno(vista.getTextNombre().getText(),vista.getTextApellido().getText(),c,edad);
        if(modelo.borrarAlumno(aux)){
            vista.setLabelLista("borrado");
        }else{
            vista.setLabelLista("no existe este alumno");
        }
    }

    private void iniciarListener() {
        vista.getBotonGuardar().addActionListener(this);
        vista.getBotonBorrar().addActionListener(this);
        vista.getBotonListar().addActionListener(this);
        vista.getBotonReset().addActionListener(this);
    }
    
    
    
    
}

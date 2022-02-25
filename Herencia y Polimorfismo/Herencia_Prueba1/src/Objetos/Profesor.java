/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
//extends para identificar a la madre
public class Profesor extends Persona{
    private int cod_profesor;
    private String departamento;
    private String modulos;

    public Profesor(int cod_profesor, String departamento, String modulos, String nombre, String DNI, String direccion, String telefono) {
        super(nombre, DNI, direccion, telefono);//Llama al constructor de persona
        this.cod_profesor = cod_profesor;
        this.departamento = departamento;
        this.modulos = modulos;
    }
    

    public int getCod_profesor() {
        return cod_profesor;
    }

    public void setCod_profesor(int cod_profesor) {
        this.cod_profesor = cod_profesor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getModulos() {
        return modulos;
    }

    public void setModulos(String modulos) {
        this.modulos = modulos;
    }

    @Override
    public void saludarPorLaManyana() {
        System.out.println("Soy Profesor, Hola y Adios");
    }

    @Override
    public String toString() {
        String atributos_persona= super.toString();
        return "Profesor{" + "cod_profesor=" + cod_profesor + ", departamento=" + departamento + ", modulos=" + modulos + "-"+ atributos_persona ;
    }
    
    
}

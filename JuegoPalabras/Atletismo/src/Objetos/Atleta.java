/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Usuario
 */
public class Atleta extends Persona {
    private String disciplina;
    private int dorsal;

    public Atleta() {
    }

    public Atleta(String disciplina, int dorsal, String nombre, int edad) {
        super(nombre, edad);
        this.disciplina = disciplina;
        this.dorsal = dorsal;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    

    public void saltar(){
        System.out.println("Soy un atleta, mi nombre es "+nombre+" y estoy saltando");
    }
    
    @Override
    public void correr() {
        System.out.println("Soy un atleta, mi nombre es "+nombre+" y estoy corriendo");
    }

    @Override
    public void nadar() {
        System.out.println("Soy un atleta, mi nombre es "+nombre+" y estoy nadando");
    }

    @Override
    public String toString() {
        String persona = super.toString();
        return persona+" Disciplina:"+disciplina+", Dorsal:"+dorsal;
    }
    
    @Override
    public String irCalse() {
        return"Soy un atleta, mi nombre es "+nombre+" y voy a clase";
    }
    
}

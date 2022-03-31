package Main;

import DAO.Agenda;
import Exceptions.FullNoteException;
import Exceptions.LimitTurnPassedException;
import Objetos.Menu;
import Objetos.Turno;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static Main app = new Main();
    private LinkedList<Turno> lista = new LinkedList<>();
    private Agenda agenda = new Agenda(lista,15);
    private Menu menu = new Menu("CONTROL CITAS");
    public static void main(String[] args) throws LimitTurnPassedException, FullNoteException {
	    app.run();
    }

    private void run() throws LimitTurnPassedException, FullNoteException {
        int pacientes=pedirAgenda();
        agenda.setPacientes(pacientes);
        addOptionMenu();
        loadAgenda();
        int opcion;
        do{
            menu.showMenu();
            opcion = menu.giveOption();
            executeOption(opcion);
        }while(opcion != 6);
    }

    private int pedirAgenda() {
        System.out.print("Pacientes en agenda:");
        Scanner ent = new Scanner(System.in);
        return ent.nextInt();
    }

    private void executeOption(int option) throws LimitTurnPassedException, FullNoteException {
        switch (option){
            case 1:
                añadirTurno();
                break;
            case 2:
                eliminarTurno();
                break;
            case 3:
                modificarTurno();
                break;
            case 4:
                mostrarTurnos();
                break;
            case 5:
                numeroTurnos();
                break;
            case 6:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Opcion no implementada");
                break;
        }
    }

    private void numeroTurnos() {
        System.out.println("Hay un total de "+agenda.numOfTurn()+" turnos");
    }

    private void mostrarTurnos() {
        Iterator<Turno> it = lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next().toString());
        }
    }

    private void modificarTurno() throws LimitTurnPassedException {
        try {
            Scanner ent = new Scanner(System.in);
            System.out.print("Numero del turno:");
            int old = ent.nextInt();
            int condition = agenda.indexByTurno(old);
            if(condition>=0) {
                System.out.print("Numero del turno a cambiar:");
                int turno_cambiar = ent.nextInt();
                System.out.print("Numero de la puerta:");
                int puerta = ent.nextInt();
                Turno obj = agenda.updateTurno(new Turno(old,puerta),new Turno(turno_cambiar,puerta));
                if (obj!=null){
                    System.out.println("Actualizado correctamente");}
            }else{
                System.err.println("Este turno no existe");
            }
        }catch(LimitTurnPassedException e){
            e.getMessage();
        }


    }

    private void eliminarTurno() throws LimitTurnPassedException, FullNoteException {
        Scanner ent = new Scanner(System.in);
        System.out.print("Numero del turno:");
        int turno = ent.nextInt();
        ;
        if(agenda.removeTurno(new Turno(turno))!=null){
            System.out.println("Turno eliminado correctamente");
        }else
            System.err.println("Este turno no existe");
    }

    private void añadirTurno() throws LimitTurnPassedException, FullNoteException {
        try {
            Scanner ent = new Scanner(System.in);
            System.out.print("Numero del turno:");
            int turno = ent.nextInt();
            System.out.print("Numero de la puerta:");
            int puerta = ent.nextInt();
            ;
            if (agenda.addTurno(new Turno(turno, puerta)) != null) {
                System.out.println("Turno añadido correctamente");
            } else {
                System.err.println("Turno existente");
            }
        }catch(FullNoteException e){
            System.err.println("Agenda completa...");
        }catch(LimitTurnPassedException e){
            System.err.println("Turno no permitido 1-100...");
        }

    }

    private void loadAgenda() throws LimitTurnPassedException, FullNoteException {
        agenda.addTurno(new Turno(1,4));
        agenda.addTurno(new Turno(2,1));
        agenda.addTurno(new Turno(3,4));
    }

    private void addOptionMenu() {
        menu.addOption("Crear cita");
        menu.addOption("Eliminar cita");
        menu.addOption("Actualizar cita");
        menu.addOption("Mostrar citas");
        menu.addOption("Numero de citas");
        menu.addOption("Salir");
    }
}

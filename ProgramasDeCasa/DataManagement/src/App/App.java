package App;

import DAO.Inventory;
import Menu.Menu;
import Objetos.MinimumNumberOfCharactersException;
import Objetos.Pokemon;

import java.util.Scanner;

public class App {
    private static App App = new App();
    private Inventory stock = new Inventory();
    Menu menu = new Menu("MENU");
    Menu update = new Menu("UPDATE");
    public static void main(String[] args) throws MinimumNumberOfCharactersException {
        App.run();
    }

    private void run() throws MinimumNumberOfCharactersException {
        loadInventory();
        addOptionsMenu();
        addUpdatesMenu();
        int option;
        do{
            menu.showMenu();
            option=menu.giveOption();
            executeOption(option);
        }while(option!=6);
    }

    private void addUpdatesMenu() {
        update.addOption("ALL");
        update.addOption("TYPE");
        update.addOption("HP");
        update.addOption("ALIVE");
        update.addOption("NOTHING");
    }

    private void executeOption(int option) throws MinimumNumberOfCharactersException {
        switch (option){
            case 1:
                addPokemon();
                break;
            case 2:
                showPokemonData();
                break;
            case 3:
                deletePokemon();
                break;
            case 4:
                updatePokemon();
                break;
            case 5:
                showNumbersOfPokemons();
                break;
            case 6:
                System.out.println("Programa finalizado");
                break;
            default:
                System.err.println("Not implemented yet.");
                break;
        }
    }

    private void updatePokemon() throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        int option;
        System.out.print("Pokemon a actualizar :");
        String name = ent.nextLine();
        name=name.toUpperCase();
        if(stock.exist(name)){
            update.setTittle("UPDATE "+name);
            update.showMenu();
            option=menu.giveOption();
            executeUpdate(option,name);
        }else{
            System.err.println("Pokemon doesn't exist");
        }

    }

    private void executeUpdate(int option,String name) throws MinimumNumberOfCharactersException {
        switch (option){
            case 1:
                updateAll(name);
                break;
            case 2:
                updateType(name);
                break;
            case 3:
                updateHP(name);
                break;
            case 4:
                updateStatus(name);
                break;
            case 5:
                System.out.println("Retrocediando al menu");
                break;
            default:
                System.err.println("Not implemented yet.");
                break;
        }
    }

    private void updateStatus(String name) throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        System.out.print("Actualizar estado a(t/f):");
        String status = ent.nextLine();
        if(status.equalsIgnoreCase("t")){
            stock.updatePokemon(3,new Pokemon(name,"NORMAL",250,true));
        }
        else if(status.equalsIgnoreCase("f")){
            stock.updatePokemon(3,new Pokemon(name,"NORMAL",250,false));
        }else{
            System.err.println("No has introducido ni t(true), ni f(false), por defecto se pondra true");
            stock.updatePokemon(3,new Pokemon(name,"NORMAL",250,true));
        }
        System.out.println(name+" Ha cambiado su estado correctamente");
    }

    private void updateHP(String name) throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        System.out.print("Atualizar HP a: ");
        int hp = ent.nextInt();
        stock.updatePokemon(0,new Pokemon(name,"NORMAL",hp));
        System.out.println(name+ " Ha cambiado la vida correctamente");
    }

    private void updateType(String name) throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        System.out.print("Actualizar tipo a: ");
        String type = ent.nextLine();
        stock.updatePokemon(1,new Pokemon(name,type,250));
        System.out.println(name+ " Ha cambiado de tipo correctamente");
    }

    private void updateAll(String name) throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        System.out.print("Actualizar tipo a: ");
        String type = ent.nextLine();
        System.out.print("Actualizar estado a(t/f):");
        String status = ent.nextLine();
        System.out.print("Atualizar HP a: ");
        int hp = ent.nextInt();
        if(status.equalsIgnoreCase("t")){
            stock.updatePokemon(3,new Pokemon(name,type,hp,true));
        }
        else if(status.equalsIgnoreCase("f")){
            stock.updatePokemon(3,new Pokemon(name,type,hp,false));
        }else{
            System.err.println("No has introducido ni t(true), ni f(false), por defecto se pondra true");
            stock.updatePokemon(3,new Pokemon(name,type,hp,true));
        }
        System.out.println(name+" Se ha actualizado correctamente");


    }

    private void showNumbersOfPokemons() {
        System.out.println("Pokemons:"+stock.getNumPokemon());
    }

    private void deletePokemon() throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String name = ent.nextLine();
        name=name.toUpperCase();
        Pokemon deleted = new Pokemon(name,"NORMAL",250);
        if(stock.removePokemon(deleted)==null){
            System.err.println("Pokemon doesn't exist...");
        }else{
            System.out.println("[+]Pokemon deleted successfully");
            showNumbersOfPokemons();
        }
    }

    private void showPokemonData() {
        stock.showAllData();
    }

    private void addPokemon() throws MinimumNumberOfCharactersException {
        Scanner ent = new Scanner(System.in);
        System.out.print("NOMBRE: ");
        String name = ent.nextLine();
        name=name.toUpperCase();
        if(!stock.exist(name)){
            System.out.print("TIPO: ");
            String type=ent.nextLine();
            System.out.print("HP: ");
            int hp = ent.nextInt();
            stock.addPokemon(new Pokemon(name,type,hp));
            System.out.println("Pokemon added successfully");
        }else{
            System.err.println("Pokemon already exist");
        }

    }

    private void addOptionsMenu() {
        menu.addOption("Donar d’alta objecte (al donar d’alta informarà quants objectes tens guardats)");
        menu.addOption("Llistar tots els objectes");
        menu.addOption("Borrar objecte ( identificant objecte a borrar)");
        menu.addOption("Cambiar valor atribut d’un objecte");
        menu.addOption("Número d’objectes guardats.");
        menu.addOption("Salir");
    }

    private void loadInventory() throws MinimumNumberOfCharactersException {
        stock.addPokemon(new Pokemon("Squirtle","AGUA",250,true));
        stock.addPokemon(new Pokemon("Charmander","FUEGO",250,true));
        stock.addPokemon(new Pokemon("Bulbasur","PLANTA",250,true));
    }
}

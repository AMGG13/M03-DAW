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
    public static void main(String[] args) throws MinimumNumberOfCharactersException {
        App.run();
    }

    private void run() throws MinimumNumberOfCharactersException {
        loadInventory();
        addOptionsMenu();
        int option;
        do{
            menu.showMenu();
            option=menu.giveOption();
            executeOption(option);
        }while(option!=6);
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

    private void updatePokemon() {
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
            System.out.println("TIPO: ");
            String type=ent.nextLine();
            System.out.println("HP: ");
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

package Objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner ent = new Scanner(System.in);
    private String tittle;
    private ArrayList<String> OptionList = new ArrayList<>();
    private int decision;

    public Menu(String tittle) {
        this.tittle = tittle;
    }

    public int getDecision() {
        return decision;
    }

    public void setDecision(int decision) {
        this.decision = decision;
    }

    public String getTittle() {
        return "------" + tittle + "-----";
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void addOption(String option) {
        OptionList.add(option);
    }

    public void showMenu() {
        System.out.println(getTittle());
        for (int i = 0; i < OptionList.size(); i++) {
            System.out.println(i + "- " + OptionList.get(i));
        }
    }

    public int giveOption() {
        System.out.print("Option:");
        return this.decision = ent.nextInt();
    }

}

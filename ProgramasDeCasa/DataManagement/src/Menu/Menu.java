/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
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
            System.out.println((i+1) + "- " + OptionList.get(i));
        }
    }

    public int giveOption() {
        System.out.print("Option:");
        return this.decision = ent.nextInt();
    }
}

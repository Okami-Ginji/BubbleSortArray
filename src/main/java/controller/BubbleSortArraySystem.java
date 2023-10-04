/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import view.Menu;
import repository.BubbleSortRepository;

/**
 *
 * @author Administrator
 */
public class BubbleSortArraySystem extends Menu<String>{
    
    static String[] mc = {"Input Element", "Sort Ascending", "Sort Descending", "Exit"};
    List<Integer> a;
    BubbleSortRepository system;
    
    public BubbleSortArraySystem() {
        super("      Bubble Sort program", mc);
        system = new BubbleSortRepository();
        a = new ArrayList<>();
    }
    @Override
    public void execute(int n) {
        switch(n) {
            case 1:
                a = system.inputValueOfArray();
                break;
            case 2:
                system.sortArrayAscending(a);
                break;
            case 3:
                system.sortArrayDescending(a);
                break;
            case 4:
                System.exit(0);
        }
    }
    
}

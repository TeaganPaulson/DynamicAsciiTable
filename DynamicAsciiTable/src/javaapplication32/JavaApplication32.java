/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication32;

/**
 *
 * @author teaga
 */
public class JavaApplication32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TableClassResizableHeaders table = new TableClassResizableHeaders();
        String[] x = {""+1000,""+2,""+3,""+4};
        String[] x2 = {""+5,""+6,""+7,""+8};
        table.addColumn(x);
        table.addColumn(x2);
        table.addHeaders();
        table.addTableHeadder("Test for the longest header");
        table.setAlignment(1);
        table.setMoneySymbol(true);
        table.setCommas(true);
        System.out.println(table.asciiTable());
    }
    
}

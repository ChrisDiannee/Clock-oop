/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author Acer
 */
public class ClockDemo {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock c= new Clock(2,2,2);
        System.out.println("\tCLOCK\n");
        c.printTime();
        System.out.println("\nIncrement Hours");
        c.incrementHours();
        c.printTime();
        System.out.println("\nDecrement Hours");
        c.decrementHours();
        c.printTime();
        c.toString();
        
        WallClock wc= new WallClock();
        wc.toString();
        wc.room();
        
        
        AlarmClock ac= new AlarmClock();
        ac.setalarm(2, 0, 0);
        ac.toString();
        ac.room();

        

    }
}

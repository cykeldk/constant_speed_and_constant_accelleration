/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constantaccelleration;

/**
 *
 * @author Michael
 */
public class ConstantAccelleration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double time = 10;
        double distance = 55;
        Accel accel = new Accel(distance, time);
        Constant constant = new Constant(distance, time);
        
        for (int i = 0; i < time; i++) {
            System.out.println(accel.increment());
            System.out.println(constant.increment());
            System.out.println("");
        }
        
    }
    
}
